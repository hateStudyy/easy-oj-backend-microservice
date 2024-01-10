package com.coldwind.easyojbackendjudgeservice.judge.strategy;


import com.coldwind.easyojbackendmodel.model.codesandbox.JudgeInfo;
import com.coldwind.easyojbackendmodel.model.dto.question.JudgeCase;
import com.coldwind.easyojbackendmodel.model.entity.Question;
import com.coldwind.easyojbackendmodel.model.entity.QuestionSubmit;
import lombok.Data;

import java.util.List;

/**
 * 上下文（用于定义在策略中要传递的参数）
 * @author ckl
 * @since 2024/1/2 21:03
 */
@Data
public class JudgeContext {

    private JudgeInfo judgeInfo;

    private List<String> inputList;

    private List<String> outputList;

    private List<JudgeCase> judgeCaseList;

    private Question question;

    private QuestionSubmit questionSubmit;
}
