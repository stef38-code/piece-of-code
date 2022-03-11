package org.stephane.pieceofcode.business.filter.personne;

import org.stephane.pieceofcode.entities.Personne;

import java.util.function.Predicate;

public class Uuid{
    private Uuid() {
    }

    public static Predicate<Personne> isStartWith(String uuidPrefix) {
        return p -> p.getId().toString().startsWith(uuidPrefix);
    }
}
