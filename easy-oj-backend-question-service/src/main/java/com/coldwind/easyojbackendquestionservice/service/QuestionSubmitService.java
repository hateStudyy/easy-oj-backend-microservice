package com.coldwind.easyojbackendquestionservice.service;


import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.IService;
import com.coldwind.easyojbackendmodel.model.dto.qustionsubmit.QuestionSubmitAddRequest;
import com.coldwind.easyojbackendmodel.model.dto.qustionsubmit.QuestionSubmitQueryRequest;
import com.coldwind.easyojbackendmodel.model.entity.QuestionSubmit;
import com.coldwind.easyojbackendmodel.model.entity.User;
import com.coldwind.easyojbackendmodel.model.vo.QuestionSubmitVO;

/**
* @author 123
* @description 针对表【question_submit(题目提交表)】的数据库操作Service
* @createDate 2023-12-22 12:17:51
*/
public interface QuestionSubmitService extends IService<QuestionSubmit> {

    /**
     * 题目提交
     *
     * @param questionSubmitAddRequest
     * @param loginUser
     * @return
     */
    long doQuestionSubmit(QuestionSubmitAddRequest questionSubmitAddRequest, User loginUser);


    /**
     * 获取查询条件
     *
     * @param questionSubmitQueryRequest
     * @return
     */
    QueryWrapper<QuestionSubmit> getQueryWrapper(QuestionSubmitQueryRequest questionSubmitQueryRequest);
    /**
     * 获取题目封装
     *
     * @param questionSubmit
     * @param loginUser
     * @return
     */
    QuestionSubmitVO getQuestionSubmitVO(QuestionSubmit questionSubmit, User loginUser);

    /**
     * 分页获取题目封装
     *
     * @param questionSubmitPage
     * @param loginUser
     * @return
     */
    Page<QuestionSubmitVO> getQuestionSubmitVOPage(Page<QuestionSubmit> questionSubmitPage, User loginUser);

}
