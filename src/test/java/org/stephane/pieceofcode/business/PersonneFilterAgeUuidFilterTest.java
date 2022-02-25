package org.stephane.pieceofcode.business;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.stephane.pieceofcode.entities.Personne;

import java.util.List;
import java.util.function.Predicate;

import static org.assertj.core.api.BDDAssertions.then;

@Slf4j
class PersonneFilterAgeUuidFilterTest {
    private Population population;

    @BeforeEach
    void setUp() {
        population = new Population();
    }

    @Test
    @DisplayName("personne avec les critères : être un baby avec un uuid commençant par f270")
    void filter_PersonneBabyAndUUIDf270() {
        List<Personne> personnes = PersonneFilter.filter(population.get(),
                PersonneFilter.AGE.isBaby().and(
                PersonneFilter.UUID.isStartWith("f270"))
        );
        then(personnes).isEmpty(); //Aucune personne :-))
    }
    @Test
    @DisplayName("personne avec les critères : être un baby ou avoir un uuid commençant par f270")
    void filter_PersonneBabyOrUUIDf270() {
        Predicate<Personne> query = PersonneFilter.AGE.isBaby().or(
                PersonneFilter.UUID.isStartWith("f270"));

        List<Personne> personnes = PersonneFilter.filter(population.get(),
                query
        );
        then(personnes).isNotEmpty().hasSize(10);
        printResultat(personnes);
    }
    @Test
    @DisplayName("personne avec les critères : être pas (être un baby ou avoir un uuid commençant par f270)")
    void filter_Personne_NotBabyOrUUIDf270() {
        Predicate<Personne> query = PersonneFilter.AGE.isBaby().or(
                PersonneFilter.UUID.isStartWith("f270"));

        List<Personne> personnes = PersonneFilter.filter(population.get(),
                query.negate()
        );
        then(personnes).isNotEmpty().hasSize(14);
        printResultat(personnes);
    }

    private void printResultat(List<Personne> personnes) {
        personnes.forEach(
                personne -> log.info("--> {}", personne)
        );
    }
}
