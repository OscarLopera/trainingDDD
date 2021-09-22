package com.sofkau.training.domain.value;

import co.com.sofka.domain.generic.Identity;

public class TrainingId extends Identity {

    private TrainingId(String id){
        super(id);
    }

    public static TrainingId of(String id){
        return new TrainingId(id);
    }
}
