package com.severity.calculator;

import com.severity.calculator.gui.SeverityCalculatorForm;
import com.severity.calculator.model.Severity;
import com.severity.calculator.model.options.ImpactQuestionOptions;

public class Main {
    public static void main(String[] args) {
        /*ImpactQuestionOptions[] impactQuestionOptions = ImpactQuestionOptions.values();
        for (ImpactQuestionOptions options : impactQuestionOptions) {
            System.out.println("option : " + options.getOption() + ", value : " + options.getValue());
        }

        Severity[] severities = Severity.values();
        for (Severity severity : severities) {
            System.out.println("value : " + severity.getValue() + " min range : " + severity.getMinRange()
            + " max range : " + severity.getMaxRange());
        }*/

        SeverityCalculatorForm form = new SeverityCalculatorForm();
    }
}
