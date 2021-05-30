package com.severity.calculator.model.options;

public enum ImpactQuestionOptions {
    FEATURE_BLOCKER("It is blocking the feature", 10),
    OTHER_FEATURE_BLOCKER("It is blocking other feature", 9),
    TEST_BLOCKER("It is blocking further testing", 8);

    private final String option;
    private final int value;

    public String getOption() {
        return this.option;
    }

    public int getValue() {
        return this.value;
    }

    ImpactQuestionOptions(String option, int value) {
        this.option = option;
        this.value = value;
    }
}
