package com.sofkau.training.domain.entity;

import co.com.sofka.domain.generic.Entity;
import com.sofkau.training.domain.value.CoachId;
import com.sofkau.training.domain.value.Especiality;
import com.sofkau.training.domain.value.Name;

public class Coach extends Entity<CoachId> {

    protected Name name;
    protected Especiality especiality;

    public Coach(CoachId coachId, Name name, Especiality especiality) {
        super(coachId);
        this.name=name;
        this.especiality=especiality;
    }

    public Name Name() {
        return name;
    }

    public Especiality Especiality() {
        return especiality;
    }
}
