package com.sofkau.training.domain.value;

import co.com.sofka.domain.generic.ValueObject;

public class Name implements ValueObject<String> {

    private final String value;

    private Name(String value){
        this.value=value;
    }

    @Override
    public String value(){
        return value;
    }
}
