package com.severity.calculator.model.options;

public enum CriteriaQuestionOptions {
    CORE_FUNCTIONALITY("a) Core functionality like API validation, micro service flow etc.", 20),
    UI_FUNCTIONAL("b) UI functional items like links, action buttons, drop downs, pop ups etc.", 15),
    UI_NON_FUNCTIONAL("c) UI label, title, placeholder etc. non-functional items", 8);

    private final String option;
    private final int value;

    public String getOption() {
        return this.option;
    }

    public int getValue() {
        return this.value;
    }

    CriteriaQuestionOptions(String option, int value) {
        this.option = option;
        this.value = value;
    }
}
