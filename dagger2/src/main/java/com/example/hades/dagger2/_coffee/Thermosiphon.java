package com.example.hades.dagger2._coffee;

import javax.inject.Inject;

public class Thermosiphon implements Pump {
    private final Heater heater;

    @Inject
    Thermosiphon(Heater heater) {
        this.heater = heater;
    }

    public void pump() {
        if (heater.isHot()) {
            System.out.println("=> => pumping => =>");
        }
    }
}
