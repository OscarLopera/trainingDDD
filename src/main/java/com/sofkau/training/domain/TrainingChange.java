package com.sofkau.training.domain;

import co.com.sofka.domain.generic.EventChange;
import com.sofkau.training.domain.events.ChangedLeague;
import com.sofkau.training.domain.events.CreatedTraining;

public class TrainingChange extends EventChange {

    public TrainingChange(Training training){

        apply((CreatedTraining event) ->{
          training.league = event.getLeague();
          training.trainingId = event.getTrainingId();
        });

        apply((ChangedLeague event) ->{
            training.league=event.getLeague();
        });
    }


}
