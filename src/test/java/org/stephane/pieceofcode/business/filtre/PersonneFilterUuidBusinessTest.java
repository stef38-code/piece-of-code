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
class PersonneFilterUuidBusinessTest extends PrintValue {
    private Population population;

    @BeforeEach
    void setUp() {
        population = new Population();
    }

    @Test
    @DisplayName("Uuid commençant par f270")
    void filter_Personne_UUIDf270() {
        List<Personne> personnes = PersonneBusiness.filter(population.get(), PersonneBusiness.UUID.isStartWith("f270"));
        then(personnes).isNotEmpty().hasSize(1);
        printResultat(personnes);
    }

    @Test
    @DisplayName("Uuid commençant par 6a57")
    void filter_Personne_UUID6a57() {
        List<Personne> personnes = PersonneBusiness.filter(population.get(), PersonneBusiness.UUID.isStartWith("6a57"));
        then(personnes).isNotEmpty().hasSize(4);
        printResultat(personnes);
    }

    @Test
    @DisplayName("Uuid commençant par 879e")
    void filter_PersonneUUID879e() {
        List<Personne> personnes = PersonneBusiness.filter(population.get(), PersonneBusiness.UUID.isStartWith("879e"));
        then(personnes).isNotEmpty().hasSize(10);
        printResultat(personnes);
    }

    @Test
    @DisplayName("Uuid commençant par b9e1")
    void filter_Personne_UUIDb9e1() {
        List<Personne> personnes = PersonneBusiness.filter(population.get(), PersonneBusiness.UUID.isStartWith("b9e1"));
        then(personnes).isNotEmpty().hasSize(5);
        printResultat(personnes);
    }


}
