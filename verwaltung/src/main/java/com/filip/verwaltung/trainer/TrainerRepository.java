package com.filip.verwaltung.trainer;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TrainerRepository extends CrudRepository<TrainerEntity, Integer> {
}
