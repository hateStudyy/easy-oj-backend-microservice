package com.coldwind.easyojbackendquestionservice.controller.inner;


import com.coldwind.easyojbackendmodel.model.entity.Question;
import com.coldwind.easyojbackendmodel.model.entity.QuestionSubmit;
import com.coldwind.easyojbackendquestionservice.service.QuestionService;
import com.coldwind.easyojbackendquestionservice.service.QuestionSubmitService;
import com.coldwind.easyojbackendserviceclient.service.QuestionFeignClient;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * 该服务仅提供给内部调用，不提供给前端
 * @author ckl
 * @since 2024/1/10 1:49
 */
@RestController
@RequestMapping("/inner")
public class QuestionInnerController implements QuestionFeignClient {

    @Resource
    private QuestionService questionService;

    @Resource
    private QuestionSubmitService questionSubmitService;

    @GetMapping("/get/id")
    public Question getQuestionById(@RequestParam("questionId") long questionId){
        return questionService.getById(questionId);
    }

    @GetMapping("/question_submit/get/id")
    public QuestionSubmit getQuestionSubmitById(@RequestParam("questionSubmitId") long questionSubmitId){
        return questionSubmitService.getById(questionSubmitId);
    }

    @PostMapping("question_submit/update")
    public boolean updateQuestionSubmitById(@RequestBody QuestionSubmit questionSubmit){
        return questionSubmitService.updateById(questionSubmit);
    }

}
