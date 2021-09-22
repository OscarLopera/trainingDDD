package com.sofkau.training.domain.events;

import co.com.sofka.domain.generic.DomainEvent;
import com.sofkau.training.domain.value.League;
import com.sofkau.training.domain.value.TrainingId;

public class CreatedTraining extends DomainEvent {

    private final TrainingId trainingId;
    private final League league;

    public CreatedTraining(TrainingId trainingId, League league) {
        super("trainingddd.domain.createdtraining");
        this.trainingId = trainingId;
        this.league=league;
    }

    public TrainingId getTrainingId() {
        return trainingId;
    }

    public League getLeague() {
        return league;
    }
}
