package org.stephane.pieceofcode.business;

import org.stephane.pieceofcode.business.filter.personne.Age;
import org.stephane.pieceofcode.business.filter.personne.Uuid;
import org.stephane.pieceofcode.entities.Personne;

import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class PersonneFilter {
    public static Age AGE;
    public static Uuid UUID;
    private PersonneFilter() {
    }

    public static List<Personne> filter(List<Personne> employees,
                                        Predicate<Personne> predicate) {
        return employees.stream()
                .filter(predicate)
                .collect(Collectors.<Personne>toList());
    }
}
