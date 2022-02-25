package org.stephane.pieceofcode.business;

import org.stephane.pieceofcode.business.filter.PersonneAgeFiltering;
import org.stephane.pieceofcode.entities.Personne;

import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class PersonneFilter {
    public static PersonneAgeFiltering AGE_FILTER;

    private PersonneFilter() {
    }

    public static List<Personne> filterPersonne (List<Personne> employees,
                                                 Predicate<Personne> predicate)
    {
        return employees.stream()
                .filter( predicate )
                .collect(Collectors.<Personne>toList());
    }
}
