package com.walker.data;

public enum Weather {
    CLEAR(0.0),
    MOSTLY_SUNNY(0.1),
    CLOUDY(0.5),
    OVERCAST(0.8);

    private final double coverage;

    Weather(double coverage) {
        this.coverage = coverage;
    }

    public double getCoverage() {
        return coverage;
    }
}

