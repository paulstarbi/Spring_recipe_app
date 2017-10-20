package com.pauls.springrecipie.service;

import com.pauls.springrecipie.model.Recipe;
import com.pauls.springrecipie.repositories.RecipeRepository;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.util.HashSet;
import java.util.Set;

import static org.junit.Assert.*;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

public class RecipeServiceImplTest {

    RecipeServiceImpl recipeService;

    @Mock
    RecipeRepository recipeRepository;

    @Before
    public void setUp() throws Exception {
        MockitoAnnotations.initMocks(this);

        recipeService = new RecipeServiceImpl(recipeRepository);
    }

    @Test
    public void recipies() throws Exception {
        Recipe recipe = new Recipe();
        Set<Recipe> ex = new HashSet<>();
        ex.add(recipe);

        when(recipeService.recipies()).thenReturn(ex);

        Set<Recipe> recipeSet = recipeService.recipies();

        assertEquals(recipeSet.size(), 1);
        verify(recipeRepository, times(1)).findAll();
    }

}