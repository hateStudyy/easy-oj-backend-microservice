package com.coldwind.easyojbackendjudgeservice.judge.codesandbox.impl;


import com.coldwind.easyojbackendjudgeservice.judge.codesandbox.CodeSandbox;
import com.coldwind.easyojbackendmodel.model.codesandbox.ExecuteCodeRequest;
import com.coldwind.easyojbackendmodel.model.codesandbox.ExecuteCodeResponse;
import com.coldwind.easyojbackendmodel.model.codesandbox.JudgeInfo;
import com.coldwind.easyojbackendmodel.model.enums.JudgeInfoMessageEnum;
import com.coldwind.easyojbackendmodel.model.enums.QuestionSubmitStatusEnum;
import lombok.extern.slf4j.Slf4j;

import java.util.List;

/**
 * 示例代码沙箱
 *
 * @author ckl
 * @since 2024/1/2 3:33
 */
@Slf4j
public class ExampleCodeSandbox implements CodeSandbox {
    @Override
    public ExecuteCodeResponse executeCode(ExecuteCodeRequest executeCodeRequest) {
        List<String> inputList = executeCodeRequest.getInputList();
        ExecuteCodeResponse executeCodeResponse = new ExecuteCodeResponse();
        // 这里没有真是实现导致答案错误
        executeCodeResponse.setOutputList(inputList);
        executeCodeResponse.setMessage("");
        executeCodeResponse.setStatus(QuestionSubmitStatusEnum.SUCCEED.getValue());
        JudgeInfo judgeInfo = new JudgeInfo();
        judgeInfo.setMessage(JudgeInfoMessageEnum.ACCEPTED.getText());
        judgeInfo.setMemory(100L);
        judgeInfo.setTime(100L);
        executeCodeResponse.setJudgeInfo(judgeInfo);
        return executeCodeResponse;
    }
}
