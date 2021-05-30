package com.severity.calculator.model.questions;

public enum Questions {
    QUESTION_1("What is the impact of the issue?");

    private final String question;

    public String getQuestion() {
        return this.question;
    }

    Questions(String question) {
        this.question = question;
    }
}
