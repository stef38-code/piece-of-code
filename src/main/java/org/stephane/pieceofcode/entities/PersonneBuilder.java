package org.stephane.pieceofcode.entities;

import java.time.LocalDate;
import java.util.UUID;

public final class PersonneBuilder {
    private UUID id;
    private String nom;
    private String prenom;
    private LocalDate dnaiss;

    private PersonneBuilder() {
    }

    public static PersonneBuilder create() {
        return new PersonneBuilder();
    }

    public PersonneBuilder withId(UUID id) {
        this.id = id;
        return this;
    }

    public PersonneBuilder withNom(String nom) {
        this.nom = nom;
        return this;
    }

    public PersonneBuilder withPrenom(String prenom) {
        this.prenom = prenom;
        return this;
    }

    public PersonneBuilder withDnaiss(LocalDate dnaiss) {
        this.dnaiss = dnaiss;
        return this;
    }

    public Personne build() {
        Personne personne = new Personne();
        personne.setId(id);
        personne.setNom(nom);
        personne.setPrenom(prenom);
        personne.setDnaiss(dnaiss);
        return personne;
    }
}
