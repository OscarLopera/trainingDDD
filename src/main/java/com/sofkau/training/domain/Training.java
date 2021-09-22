package com.sofkau.training.domain;

import co.com.sofka.domain.generic.AggregateEvent;
import com.sofkau.training.domain.value.League;
import com.sofkau.training.domain.value.TrainingId;

import java.util.List;

public class Training extends AggregateEvent<TrainingId> {

    protected League league;
    protected List<Coach> coach;
    protected List<Apprentice> apprentice;

    public Training(TrainingId trainingId, League league, List<Coach> coach, List<Apprentice> apprentice) {
        super(trainingId);
        this.league=league;
        this.coach=coach;
        this.apprentice=apprentice;
    }
}
