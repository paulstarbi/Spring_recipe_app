package com.pauls.springrecipie.model;

import javax.persistence.*;

@Entity
public class Notes {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToOne
    private Reciepie reciepie;

    @Lob
    private String reciepieNotes;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Reciepie getReciepie() {
        return reciepie;
    }

    public void setReciepie(Reciepie reciepie) {
        this.reciepie = reciepie;
    }

    public String getReciepieNotes() {
        return reciepieNotes;
    }

    public void setReciepieNotes(String reciepieNotes) {
        this.reciepieNotes = reciepieNotes;
    }
}
