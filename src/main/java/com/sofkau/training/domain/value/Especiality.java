package com.sofkau.training.domain.value;

import co.com.sofka.domain.generic.ValueObject;

public class Especiality implements ValueObject<String> {

    private final String value;

    public Especiality(String value){
        this.value=value;
    }

    @Override
    public String value(){
        return value;
    }
}
