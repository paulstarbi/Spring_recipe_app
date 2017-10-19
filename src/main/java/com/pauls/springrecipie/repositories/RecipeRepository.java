package com.pauls.springrecipie.repositories;

import com.pauls.springrecipie.model.Recipe;
import org.springframework.data.repository.CrudRepository;

public interface RecipeRepository extends CrudRepository<Recipe, Long> {

}
