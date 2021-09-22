package com.sofkau.training.domain.value;

import co.com.sofka.domain.generic.Identity;

public class CoachId extends Identity {

    private CoachId(String id){
        super(id);
    }

    public static CoachId of(String id){
        return new CoachId(id);
    }
}
