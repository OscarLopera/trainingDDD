package com.sofkau.training.domain.events;

import co.com.sofka.domain.generic.DomainEvent;
import com.sofkau.training.domain.value.League;
import com.sofkau.training.domain.value.TrainingId;

public class ChangedLeague extends DomainEvent {

    private final TrainingId trainingId;
    private final League league;


    public ChangedLeague(TrainingId trainingId, League league) {
        super("trainingddd.domain.changedtraining");
        this.trainingId = trainingId;
        this.league = league;
    }

    public TrainingId getTrainingId() {
        return trainingId;
    }

    public League getLeague() {
        return league;
    }
}
