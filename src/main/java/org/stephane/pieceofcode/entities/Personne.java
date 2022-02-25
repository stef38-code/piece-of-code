package org.stephane.pieceofcode.entities;

import lombok.Getter;
import lombok.Setter;
import org.apache.commons.lang3.builder.ToStringBuilder;

import java.time.LocalDate;
import java.util.UUID;

@Getter
@Setter
public class Personne {
    private UUID id;
    private String nom;
    private String prenom;
    private LocalDate dnaiss;

    @Override
    public String toString() {
        return new ToStringBuilder(this)
                .append("id", id)
                .append("nom", nom)
                .append("prenom", prenom)
                .append("dnaiss", dnaiss)
                .toString();
    }
}
