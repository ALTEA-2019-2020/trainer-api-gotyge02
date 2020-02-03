package com.miage.altea.trainer_api.service;

import com.miage.altea.trainer_api.bo.Trainer;

public interface TrainerServiceI {
    Iterable<Trainer> getAllTrainers();
    Trainer getTrainer(String name);
    Trainer createTrainer(Trainer trainer);
    Trainer updateTrainer(String name, Trainer trainer);
    void deleteTrainer(String name);
}