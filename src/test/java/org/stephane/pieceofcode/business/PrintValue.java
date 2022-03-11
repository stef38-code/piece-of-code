package org.stephane.pieceofcode.business;

import lombok.extern.slf4j.Slf4j;
import org.stephane.pieceofcode.entities.Personne;

import java.util.List;
@Slf4j
public class PrintValue {
    protected void printResultat(List<Personne> personnes) {
        personnes.forEach(
                personne -> log.info("--> {}", personne)
        );
    }
}
