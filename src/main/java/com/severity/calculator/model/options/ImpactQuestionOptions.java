package com.severity.calculator.model.options;

public enum ImpactQuestionOptions {
    FEATURE_BLOCKER("a) It is blocking the feature.", 11),
    TEST_BLOCKER("b) It is blocking further testing.", 10),
    CLIENT_REPORTED("c) This issue came from client side.", 9),
    OTHER_FEATURE_BLOCKER("d) It is blocking another feature.", 8),
    VIOLATES_REQUIREMENT("e) Violates the requirements.", 7),
    INCOMPLETE_FEATURE("f) Incomplete feature.", 6),
    NON_BLOCKING("g) This is not a blocker itself or not blocking any other feature",5);

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
