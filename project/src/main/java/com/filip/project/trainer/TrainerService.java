package com.filip.project.trainer;

import com.filip.project.group.Group;
import com.filip.project.group.GroupRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.LinkedList;
import java.util.List;
import java.util.Optional;

@Service
public class TrainerService {
    private final TrainerRepository trainerRepository;
    private final GroupRepository groupRepository;

    @Autowired
    public TrainerService(TrainerRepository trainerRepository, GroupRepository groupRepository) {
        this.trainerRepository = trainerRepository;
        this.groupRepository = groupRepository;
    }

    public List<Trainer> getTrainers() {
        return (List<Trainer>) trainerRepository.findAll();
    }

    public Optional<Trainer> getTrainer(long trainerId) {
        return trainerRepository.findById(trainerId);
    }

    public  List<TrainerDto> convertTrainers() {
        LinkedList<TrainerDto> convertedTrainers = new LinkedList<>();
        for (Trainer i : trainerRepository.findAll()) {
            convertedTrainers.add(convertTrainerToDto(i));
        }
        return convertedTrainers;
    }

    public TrainerDto convertTrainerToDto(Trainer trainer) {
        TrainerDto trainerDto = new TrainerDto();
        trainerDto.setTrainerId(trainer.getId());
        trainerDto.setFirstName(trainer.getFirstName());
        trainerDto.setLastName(trainer.getLastName());
        trainerDto.setEmail(trainer.getEmail());
        trainerDto.setAddress(trainer.getAddress());
        trainerDto.setEmploymentType(trainer.getEmploymentType());
        trainerDto.setWage(trainer.getWage());
        trainerDto.setCategory(trainer.getCategory());

        LinkedList<Group> groupsList = new LinkedList<>();
        groupRepository.findAll().forEach(groupsList::add);

        for (Group group : groupsList) {
            if (group.getRoom() != null){
                trainerDto.setRoomId(group.getRoom().getId());
                trainerDto.setRoomNumber(group.getRoom().getNumber());
            }else {
                trainerDto.setRoomId(0);
                trainerDto.setRoomNumber("");
            }
        }
        return trainerDto;

    }

    public void addTrainer(Trainer trainer) {
        trainerRepository.save(trainer);
    }

    public void put(Trainer trainer) {
        trainerRepository.save(trainer);
    }

    public void delete(long trainerId) {
        trainerRepository.deleteById(trainerId);
    }
}
