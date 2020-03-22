package com.miage.altea.trainer_api.service;


import com.miage.altea.trainer_api.bo.Trainer;
import com.miage.altea.trainer_api.repository.TrainerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TrainerService implements TrainerServiceI {
    private TrainerRepository trainerRepository;

    @Autowired
    public TrainerService(TrainerRepository trainerRepository) {
        this.trainerRepository = trainerRepository;
    }

    @Override
    public Iterable<Trainer> getAllTrainers() {
        return this.trainerRepository.findAll();
    }

    @Override
    public Trainer getTrainer(String name) {
        return this.trainerRepository.findById(name).orElse(null);
    }

    @Override
    public Trainer createTrainer(Trainer trainer) {
        return this.trainerRepository.save(trainer);
    }

    @Override
    public Trainer updateTrainer(String name, Trainer trainer) {
        Trainer realTrainer = this.getTrainer(name);
        realTrainer.setTeam(trainer.getTeam());
        realTrainer.setPassword(trainer.getPassword());
        realTrainer.setName(trainer.getName());
        return this.trainerRepository.save(realTrainer);
    }

    @Override
    public void deleteTrainer(String name) {
        this.trainerRepository.deleteById(name);
    }
}