package org.stephane.pieceofcode.business.filter.personne;

import org.stephane.pieceofcode.entities.Personne;

import java.time.LocalDate;
import java.time.Period;
import java.util.function.Predicate;

public class Age {
    private Age() {
    }

    public static Predicate<Personne> isAdult() {
        return p -> calulateYear(p) > 17;
    }
    public static Predicate<Personne> isTeenager() {
        return p -> calulateYear(p) < 18 && calulateYear(p) > 9 ;
    }
    public static Predicate<Personne> isChild() {
        return p -> calulateYear(p) < 10 && calulateYear(p) > 3 ;
    }
    public static Predicate<Personne> isBaby() {
        return p -> calulateYear(p) < 4 ;
    }
    private static int calulateYear(Personne personne){
        Period period = Period.between(personne.getDnaiss(), LocalDate.now());
        return period.getYears();
    }
}
