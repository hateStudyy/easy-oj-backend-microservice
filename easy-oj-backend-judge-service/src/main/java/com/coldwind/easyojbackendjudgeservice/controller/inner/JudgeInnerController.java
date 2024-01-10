package com.coldwind.easyojbackendjudgeservice.controller.inner;


import com.coldwind.easyojbackendjudgeservice.judge.JudgeService;
import com.coldwind.easyojbackendmodel.model.entity.QuestionSubmit;
import com.coldwind.easyojbackendserviceclient.service.JudgeFeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * 该服务仅提供给内部调用，不提供给前端
 * @author ckl
 * @since 2024/1/10 1:49
 */
@RestController
@RequestMapping("/inner")
public class JudgeInnerController implements JudgeFeignClient {

    @Resource
    private JudgeService judgeService;

    /**
     * 判题
     * @param questionSubmitId
     * @return
     */
    @PostMapping("/do")
    public QuestionSubmit doJudge(@RequestParam("questionSubmitId") long questionSubmitId){
        return judgeService.doJudge(questionSubmitId);
    }
}
