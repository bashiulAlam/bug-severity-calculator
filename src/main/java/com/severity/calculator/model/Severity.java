package com.severity.calculator.model;

public enum Severity {
    BLOCKER("BLOCKER", 25, 50),
    HIGHEST("HIGHEST", 21, 24),
    HIGH("HIGH", 17, 20),
    MEDIUM("MEDIUM", 13, 16),
    LOW("LOW", 11, 12),
    LOWEST("LOWEST", 7, 10);

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
