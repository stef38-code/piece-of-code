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
import java.util.function.Predicate;

import static org.assertj.core.api.BDDAssertions.then;

@Slf4j
class PersonneFilterAgeUuidBusinessTest extends PrintValue {
    private Population population;

    @BeforeEach
    void setUp() {
        population = new Population();
    }

    @Test
    @DisplayName("personne avec les critères : être un baby avec un uuid commençant par f270")
    void filter_PersonneBabyAndUUIDf270() {
        List<Personne> personnes = PersonneBusiness.filter(population.get(),
                PersonneBusiness.AGE.isBaby().and(
                PersonneBusiness.UUID.isStartWith("f270"))
        );
        then(personnes).isEmpty(); //Aucune personne :-))
    }
    @Test
    @DisplayName("personne avec les critères : être un baby ou avoir un uuid commençant par f270")
    void filter_PersonneBabyOrUUIDf270() {
        Predicate<Personne> query = PersonneBusiness.AGE.isBaby().or(
                PersonneBusiness.UUID.isStartWith("f270"));

        List<Personne> personnes = PersonneBusiness.filter(population.get(),
                query
        );
        then(personnes).isNotEmpty().hasSize(10);
        printResultat(personnes);
    }
    @Test
    @DisplayName("personne avec les critères : être pas (être un baby ou avoir un uuid commençant par f270)")
    void filter_Personne_NotBabyOrUUIDf270() {
        Predicate<Personne> query = PersonneBusiness.AGE.isBaby().or(
                PersonneBusiness.UUID.isStartWith("f270"));

        List<Personne> personnes = PersonneBusiness.filter(population.get(),
                query.negate()
        );
        then(personnes).isNotEmpty().hasSize(14);
        printResultat(personnes);
    }


}
