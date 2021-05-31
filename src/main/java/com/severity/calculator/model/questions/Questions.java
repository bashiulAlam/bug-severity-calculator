package com.severity.calculator.model.questions;

public enum Questions {
    QUESTION_1("What is the impact of the issue?"),
    QUESTION_2("What is the criteria of the issue?"),
    QUESTION_3("When this issue should be fixed and released?");

    private final String question;

    public String getQuestion() {
        return this.question;
    }

    Questions(String question) {
        this.question = question;
    }
}
