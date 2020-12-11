package com.company.CoffeeMachine.models;

import com.company.CoffeeMachine.enums.StickType;

public class Stick {
    private StickType stickType;

    public Stick( StickType stickType ) {
        this.stickType = stickType;
    }

    public StickType getStickType() {
        return stickType;
    }

    public void setStickType( StickType stickType ) {
        this.stickType = stickType;
    }
}