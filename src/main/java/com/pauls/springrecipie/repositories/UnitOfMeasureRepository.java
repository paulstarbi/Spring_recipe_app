package com.pauls.springrecipie.repositories;

import com.pauls.springrecipie.model.UnitOfMeasure;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface UnitOfMeasureRepository extends CrudRepository<UnitOfMeasure, Long> {

    Optional<UnitOfMeasure> findByUnitOfMeasure(String unitOfMeasure);
}
