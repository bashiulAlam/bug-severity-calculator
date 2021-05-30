package com.severity.calculator.assign;

import com.severity.calculator.utils.AnswerMappingUtility;

import java.util.ArrayList;

public class CalculateSeverityValue {
    public static int severityValue(ArrayList<String> answers) {
        int sum = 0;

        sum += AnswerMappingUtility.getImpactQuestionValue(answers.get(0));

        return sum;
    }
}
