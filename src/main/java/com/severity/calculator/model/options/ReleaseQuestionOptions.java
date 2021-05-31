package com.severity.calculator.model.options;

public enum ReleaseQuestionOptions {
    IMMEDIATELY("a) Immediately", 25),
    END_OF_RELEASE_CYCLE("b) At the end of current release cycle", 22),
    END_OF_SPRINT("c) At the end of current sprint", 20),
    IN_NEXT_RELEASE("d) In the next release/term", 15),
    DEFERRED("e) Can be deferred much later", 5);

    private final String option;
    private final int value;

    public String getOption() {
        return this.option;
    }

    public int getValue() {
        return this.value;
    }

    ReleaseQuestionOptions(String option, int value) {
        this.option = option;
        this.value = value;
    }
}
