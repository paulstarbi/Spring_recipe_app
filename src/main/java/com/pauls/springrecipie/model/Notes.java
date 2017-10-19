package com.pauls.springrecipie.model;

import javax.persistence.*;

@Entity
public class Notes {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToOne
    private Recipe recipe;

    @Lob
    private String reciepieNotes;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Recipe getRecipe() {
        return recipe;
    }

    public void setRecipe(Recipe recipe) {
        this.recipe = recipe;
    }

    public String getReciepieNotes() {
        return reciepieNotes;
    }

    public void setReciepieNotes(String reciepieNotes) {
        this.reciepieNotes = reciepieNotes;
    }
}
