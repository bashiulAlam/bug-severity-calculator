package com.severity.calculator.model.options;

public enum ReleaseQuestionOptions {
    IMMEDIATELY("a) Immediately", 10),
    END_OF_RELEASE_CYCLE("b) At the end of current release cycle", 8),
    END_OF_SPRINT("c) At the end of current sprint", 6),
    IN_NEXT_RELEASE("d) In the next release/term", 3),
    DEFERRED("e) Can be deferred later/Not sure about deadline", 2);

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
