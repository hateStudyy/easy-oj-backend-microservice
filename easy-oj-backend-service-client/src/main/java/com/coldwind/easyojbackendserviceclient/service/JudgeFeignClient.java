package com.coldwind.easyojbackendserviceclient.service;


import com.coldwind.easyojbackendmodel.model.entity.QuestionSubmit;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * 判题服务
 * @author ckl
 * @since 2024/1/2 18:57
 */
@FeignClient(name = "easy-oj-backend-judge-service", path = "/api/judge/inner")

public interface JudgeFeignClient {

    /**
     * 判题
     * @param questionSubmitId
     * @return
     */
    @PostMapping("/do")
    QuestionSubmit doJudge(@RequestParam("questionSubmitId") long questionSubmitId);
}
