package com.severity.calculator.model.options;

public enum CategoryQuestionOptions {
    CORE_FUNCTIONALITY("a) It is related with core functionality like API validation, micro service flow", 7),
    WRONG_ERROR_MESSAGE("b) This issue was raised due to Wrong Error Message", 6),
    UI_FUNCTIONAL("c) UI functional items like links, action buttons, drop downs, pop ups etc.", 5),
    UI_NON_FUNCTIONAL("d) UI label, title, placeholder etc. non-functional items", 4),
    QUICK_FIX("e) This issue fixing can be done quickly",3),
    LENGTHY_FIX("f) This issue fixing may take long time",2);

    private final String option;
    private final int value;

    public String getOption() {
        return this.option;
    }

    public int getValue() {
        return this.value;
    }

    CategoryQuestionOptions(String option, int value) {
        this.option = option;
        this.value = value;
    }
}
