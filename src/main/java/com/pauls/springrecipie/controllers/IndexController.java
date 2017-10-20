package com.pauls.springrecipie.controllers;

import com.pauls.springrecipie.service.RecipeService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Slf4j
@Controller
public class IndexController {

    private final RecipeService recipeService;

    @Autowired
    public IndexController(RecipeService recipeServiceImpl) {
        this.recipeService = recipeServiceImpl;
    }

    @RequestMapping({"/", "/index"})
    public String index(Model model) {
        log.debug("inside index controller");

        model.addAttribute("recipies", recipeService.recipies());

        return "index";
    }


}
