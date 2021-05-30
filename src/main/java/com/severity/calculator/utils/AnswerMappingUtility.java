package com.severity.calculator.utils;

import com.severity.calculator.model.options.ImpactQuestionOptions;

public class AnswerMappingUtility {
    public static int getImpactQuestionValue(String answer) {
        ImpactQuestionOptions[] impactQuestionOptions = ImpactQuestionOptions.values();
        for (ImpactQuestionOptions options : impactQuestionOptions) {
            if (answer.equals(options.getOption())) {
                System.out.println("matched option : " + options.getOption() + ", value : " + options.getValue());
                return options.getValue();
            }
        }
        return 0;
    }
}
