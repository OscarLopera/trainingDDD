package com.sofkau.training.domain;

import co.com.sofka.domain.generic.Entity;
import com.sofkau.training.domain.value.Age;
import com.sofkau.training.domain.value.ApprenticeId;
import com.sofkau.training.domain.value.Name;

public class Apprentice extends Entity {

    protected ApprenticeId apprenticeId;
    protected Name name;
    protected Age age;

    public Apprentice(ApprenticeId apprenticeId, Name name, Age age) {
        super(apprenticeId);
        this.name=name;
        this.age=age;
    }

}
