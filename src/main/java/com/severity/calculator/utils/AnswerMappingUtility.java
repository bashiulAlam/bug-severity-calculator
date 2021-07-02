package com.severity.calculator.utils;

import com.severity.calculator.model.options.CategoryQuestionOptions;
import com.severity.calculator.model.options.ImpactQuestionOptions;
import com.severity.calculator.model.options.ReleaseQuestionOptions;

public class AnswerMappingUtility {
    public static int getImpactQuestionValue(String answer) {
        ImpactQuestionOptions[] impactQuestionOptions = ImpactQuestionOptions.values();
        for (ImpactQuestionOptions options : impactQuestionOptions) {
            if (answer.equals(options.getOption())) {
                System.out.println("Matched impact question option : " + options.getOption() + ", value : " + options.getValue());
                return options.getValue();
            }
        }
        return 0;
    }

    public static int getCriteriaQuestionValue(String answer) {
        CategoryQuestionOptions[] categoryQuestionOptions = CategoryQuestionOptions.values();
        for (CategoryQuestionOptions options : categoryQuestionOptions) {
            if (answer.equals(options.getOption())) {
                System.out.println("Matched criteria question option : " + options.getOption() + ", value : " + options.getValue());
                return options.getValue();
            }
        }
        return 0;
    }

    public static int getReleaseQuestionValue(String answer) {
        ReleaseQuestionOptions[] releaseQuestionOptions = ReleaseQuestionOptions.values();
        for (ReleaseQuestionOptions options : releaseQuestionOptions) {
            if (answer.equals(options.getOption())) {
                System.out.println("Matched release question option : " + options.getOption() + ", value : " + options.getValue());
                return options.getValue();
            }
        }
        return 0;
    }
}
