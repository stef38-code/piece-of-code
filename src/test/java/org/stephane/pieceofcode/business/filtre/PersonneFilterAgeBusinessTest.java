package org.stephane.pieceofcode.business.filtre;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.stephane.pieceofcode.business.PersonneBusiness;
import org.stephane.pieceofcode.business.Population;
import org.stephane.pieceofcode.business.PrintValue;
import org.stephane.pieceofcode.entities.Personne;

import java.util.List;

import static org.assertj.core.api.BDDAssertions.then;

@Slf4j
class PersonneFilterAgeBusinessTest extends PrintValue {
    private Population population;

    @BeforeEach
    void setUp() {
        population = new Population();
    }

    @Test
    @DisplayName("Nombre de personne qui sont des adultes (18-++ ans)")
    void filter_PersonneAdult() {
        List<Personne> personnes = PersonneBusiness.filter(population.get(), PersonneBusiness.AGE.isAdult());
        then(personnes).isNotEmpty().hasSize(6);
        printResultat(personnes);
    }

    @Test
    @DisplayName("Nombre de personne qui sont des adolescents (10-17 ans)")
    void filter_PersonneTeenager() {
        List<Personne> personnes = PersonneBusiness.filter(population.get(), PersonneBusiness.AGE.isTeenager());
        then(personnes).isNotEmpty().hasSize(5);
        printResultat(personnes);
    }

    @Test
    @DisplayName("Nombre de personne qui sont des enfants (4-9 ans)")
    void filter_PersonneChild() {
        List<Personne> personnes = PersonneBusiness.filter(population.get(), PersonneBusiness.AGE.isChild());
        then(personnes).isNotEmpty().hasSize(4);
        printResultat(personnes);
    }

    @Test
    @DisplayName("Nombre de personne qui sont des bébés (0-3 ans)")
    void filter_PersonneBabys() {
        List<Personne> personnes = PersonneBusiness.filter(population.get(), PersonneBusiness.AGE.isBaby());
        then(personnes).isNotEmpty().hasSize(9);
        printResultat(personnes);
    }

}
