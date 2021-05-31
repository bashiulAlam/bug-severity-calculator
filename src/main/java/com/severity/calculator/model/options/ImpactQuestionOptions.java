package com.severity.calculator.model.options;

public enum ImpactQuestionOptions {
    FEATURE_BLOCKER("a) It is blocking the feature", 30),
    OTHER_FEATURE_BLOCKER("b) It is blocking other feature", 30),
    TEST_BLOCKER("c) It is blocking further testing", 25),
    WRONG_API_CALL("d) A wrong API call is initiated", 25),
    WRONG_UI_NAVIGATION("e) UI navigation is wrong", 20),
    WRONG_ERROR_MESSAGE("f) Error message is wrong", 15),
    NOT_EFFECTING_OTHER_FEATURE("g) Does not affect any functionality", 7),
    NOT_SERIOUS("h) Not a significant issue, can be deferred", 2);

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
