package org.stephane.pieceofcode.business.sort;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.stephane.pieceofcode.business.Population;
import org.stephane.pieceofcode.business.PrintValue;
import org.stephane.pieceofcode.entities.Personne;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import static org.assertj.core.api.BDDAssertions.then;

@Slf4j
class PersonneSortTest extends PrintValue {
    private Population population;

    @BeforeEach
    void setUp() {
        population = new Population();
    }

    @Test
    @DisplayName("Trie des personnes par leurs noms")
    void filter_PersonneSortBy() {
        List<Personne> list = population.get();
        Comparator<? super Personne> comparatorByName = Comparator.comparing(Personne::getNom);
        List<Personne> personnes = list.stream().sorted(comparatorByName).collect(Collectors.toList());
        then(personnes).isNotEmpty();
        printResultat(personnes);
    }


}
