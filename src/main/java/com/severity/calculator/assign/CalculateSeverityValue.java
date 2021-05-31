package com.severity.calculator.assign;

import com.severity.calculator.utils.AnswerMappingUtility;

import java.util.ArrayList;

public class CalculateSeverityValue {
    public static int severityValue(ArrayList<String> answers) {
        int sum = 0;

        sum = AnswerMappingUtility.getImpactQuestionValue(answers.get(0)) + AnswerMappingUtility.getCriteriaQuestionValue(answers.get(1)) + AnswerMappingUtility.getReleaseQuestionValue(answers.get(2));
        System.out.println("Total severity value calculated : " + sum);

        return sum;
    }
}
