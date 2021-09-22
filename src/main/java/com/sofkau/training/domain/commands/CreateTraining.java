package com.sofkau.training.domain.commands;

import co.com.sofka.domain.generic.Command;
import com.sofkau.training.domain.entity.Apprentice;
import com.sofkau.training.domain.entity.Coach;
import com.sofkau.training.domain.value.*;

import java.util.List;

public class CreateTraining implements Command {

    private final TrainingId trainingId;
    private final League league;
    private final List<Coach> listCoach;
    private final List<Apprentice> listApprentice;


    public CreateTraining(TrainingId trainingId, League league, List<Coach> listCoach, List<Apprentice> listApprentice) {
        this.trainingId = trainingId;
        this.league = league;
        this.listCoach = listCoach;
        this.listApprentice = listApprentice;
    }

    public TrainingId getTrainingId() {
        return trainingId;
    }

    public League getLeague() {
        return league;
    }

    public List<Coach> getListCoach() {
        return listCoach;
    }

    public List<Apprentice> getListApprentice() {
        return listApprentice;
    }

}
