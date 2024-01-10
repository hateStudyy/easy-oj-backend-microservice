package com.coldwind.easyojbackendjudgeservice.judge.strategy;


import com.coldwind.easyojbackendmodel.model.codesandbox.JudgeInfo;

/**
 * 判题策略
 * @author ckl
 * @since 2024/1/2 21:02
 */
public interface JudgeStrategy {

    /**
     * 做题
     * @param judgeContext 上下文
     * @return
     */
    JudgeInfo doJudge(JudgeContext judgeContext);
}
