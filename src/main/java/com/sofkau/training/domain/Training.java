package com.sofkau.training.domain;

import co.com.sofka.domain.generic.AggregateEvent;
import com.sofkau.training.domain.entity.Apprentice;
import com.sofkau.training.domain.entity.Coach;
import com.sofkau.training.domain.events.ChangedLeague;
import com.sofkau.training.domain.events.CreatedTraining;
import com.sofkau.training.domain.value.League;
import com.sofkau.training.domain.value.TrainingId;

import java.util.List;
import java.util.Objects;

public class Training extends AggregateEvent<TrainingId> {

    protected League league;
    protected List<Coach> coach;
    protected List<Apprentice> apprentice;
    protected TrainingId trainingId;

    public Training(TrainingId trainingId, League league, List<Coach> coach, List<Apprentice> apprentice) {
        super(trainingId);
        this.league=league;
        this.coach=coach;
        this.apprentice=apprentice;
    }

    public League getLeague() {
        return league;
    }

    public List<Coach> getCoach() {
        return coach;
    }

    public List<Apprentice> getApprentice() {
        return apprentice;
    }

    private Training(TrainingId trainingId) {
        super(trainingId);
        subscribe(new TrainingChange(this));
    }

    public Training(TrainingId trainingId, League league){
        super(trainingId);
        appendChange(new CreatedTraining(trainingId,league)).apply();
    }

    public void chanceNewLeagueTraining(TrainingId trainingId, League league) {
        Objects.requireNonNull(trainingId);
        Objects.requireNonNull(league);
        appendChange(new ChangedLeague(trainingId,league)).apply();
    }
}
