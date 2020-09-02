package com.siyee.designpatterns.adapter.demo;

public class PoliceCarAdpater extends CarController {

    PoliceLamp policeLamp;

    PoliceSound policeSound;

    public PoliceCarAdpater() {
        policeLamp = new PoliceLamp();
        policeSound = new PoliceSound();
    }

    @Override
    public void phonate() {
        policeSound.alarmSound();
    }

    @Override
    public void twinkle() {
        policeLamp.alarmLamp();
    }
}
