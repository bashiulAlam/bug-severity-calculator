package com.severity.calculator.assign;

import com.severity.calculator.exception.SumOutOfAllowedRangeException;
import com.severity.calculator.utils.AnswerMappingUtility;

import java.util.ArrayList;

public class CalculateSeverityValue {
    public static int severityValue(ArrayList<String> answers) throws SumOutOfAllowedRangeException {
        int sum = 0;

        sum = AnswerMappingUtility.getImpactQuestionValue(answers.get(0)) + AnswerMappingUtility.getCriteriaQuestionValue(answers.get(1)) + AnswerMappingUtility.getReleaseQuestionValue(answers.get(2));
        System.out.println("Total severity value calculated : " + sum);

        if (sum <= 100)
            return sum;
        else {
            throw new SumOutOfAllowedRangeException("Severity value cannot be more than 100");
        }
    }
}
