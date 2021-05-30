package com.severity.calculator.assign;

import com.severity.calculator.model.Severity;
import com.severity.calculator.utils.Utility;

public class AssignSeverityLevel {
    public static String severityLevel(int severityValue) {
        String level = "";

        Severity[] severities = Severity.values();
        for (Severity severity : severities) {
            if (Utility.isInBetween(severityValue, severity.getMinRange(), severity.getMaxRange())) {
                level = severity.getValue();
                break;
            }
        }

        return level;
    }
}
