package com.coldwind.easyojbackendjudgeservice.judge.codesandbox.impl;


import com.coldwind.easyojbackendjudgeservice.judge.codesandbox.CodeSandbox;
import com.coldwind.easyojbackendmodel.model.codesandbox.ExecuteCodeRequest;
import com.coldwind.easyojbackendmodel.model.codesandbox.ExecuteCodeResponse;

/**
 * 第三方代码沙箱（调用网上现有的代码沙箱）
 * @author ckl
 * @since 2024/1/2 3:33
 */
public class ThirtyPartyCodeSandbox implements CodeSandbox {
    @Override
    public ExecuteCodeResponse executeCode(ExecuteCodeRequest executeCodeRequest) {
        System.out.println("第三方代码沙箱");
        return null;
    }
}
