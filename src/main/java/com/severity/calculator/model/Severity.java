package com.severity.calculator.model;

public enum Severity {
    BLOCKER("BLOCKER", 91, 100),
    HIGHEST("HIGHEST", 81, 90),
    HIGH("HIGH", 61, 80),
    MEDIUM("MEDIUM", 41, 60),
    LOW("LOW", 21, 40),
    LOWEST("LOWEST", 1, 20);

    private final String value;
    private final int minRange;
    private final int maxRange;

    public String getValue() {
        return this.value;
    }

    public int getMinRange() {
        return this.minRange;
    }

    public int getMaxRange() {
        return this.maxRange;
    }

    Severity(String value, int minRange, int maxRange) {
        this.value = value;
        this.minRange  = minRange;
        this.maxRange = maxRange;
    }
}
