package org.stephane.pieceofcode.business;

import org.stephane.pieceofcode.entities.Personne;
import org.stephane.pieceofcode.entities.PersonneBuilder;

import java.time.LocalDate;
import java.util.List;
import java.util.UUID;

public class Population {
    public List<Personne> get(){
        return List.of(
                createPersonne(UUID
                        .fromString("f270ee5c-9631-11ec-b909-0242ac120002"),"Doe","John", LocalDate.now().minusYears(55)),
                createPersonne(UUID
                        .fromString("6a57ed4c-9634-11ec-b909-0242ac120002"),"Doe","Brigitte", LocalDate.now().minusYears(49)),
                createPersonne(UUID
                        .fromString("6a57effe-9634-11ec-b909-0242ac120002"),"Cobb","Maliyah", LocalDate.now().minusYears(30)),
                createPersonne(UUID
                        .fromString("6a57f15c-9634-11ec-b909-0242ac120002"),"Cobb","Marc", LocalDate.now().minusYears(29)),
                createPersonne(UUID
                        .fromString("6a57f512-9634-11ec-b909-0242ac120002"),"Whitney","Enzo", LocalDate.now().minusYears(24)),
                createPersonne(UUID
                        .fromString("879e4054-9634-11ec-b909-0242ac120002"),"Whitney","Janiya", LocalDate.now().minusYears(20)),
                createPersonne(UUID
                        .fromString("879e42c0-9634-11ec-b909-0242ac120002"),"Petersen","Lewis", LocalDate.now().minusYears(15)),
                createPersonne(UUID
                        .fromString("879e450e-9634-11ec-b909-0242ac120002"),"Sellers","Santino", LocalDate.now().minusYears(15)),
                createPersonne(UUID
                        .fromString("879e46f8-9634-11ec-b909-0242ac120002"),"Malone","Marianna", LocalDate.now().minusYears(12)),
                createPersonne(UUID
                        .fromString("879e4a0e-9634-11ec-b909-0242ac120002"),"Patton","Khalil", LocalDate.now().minusYears(11)),
                createPersonne(UUID
                        .fromString("879e4bee-9634-11ec-b909-0242ac120002"),"Rice","Trinity", LocalDate.now().minusYears(11)),
                createPersonne(UUID
                        .fromString("879e4db0-9634-11ec-b909-0242ac120002"),"Page","Kayley", LocalDate.now().minusYears(6)),
                createPersonne(UUID
                        .fromString("879e4fae-9634-11ec-b909-0242ac120002"),"Flynn","Macey", LocalDate.now().minusYears(8)),
                createPersonne(UUID
                        .fromString("879e5152-9634-11ec-b909-0242ac120002"),"Maldonado","Miriam", LocalDate.now().minusYears(6)),
                createPersonne(UUID
                        .fromString("879e5292-9634-11ec-b909-0242ac120002"),"Bond","Aurora", LocalDate.now().minusYears(6)),
                createPersonne(UUID
                        .fromString("b9e1bb7c-9634-11ec-b909-0242ac120002"),"Castaneda","Donte", LocalDate.now().minusYears(3)),
                createPersonne(UUID
                        .fromString("b9e1be4c-9634-11ec-b909-0242ac120002"),"Townsend","Eugene", LocalDate.now().minusYears(2)),
                createPersonne(UUID
                        .fromString("b9e1bfb4-9634-11ec-b909-0242ac120002"),"Villegas","Cristopher", LocalDate.now().minusYears(2)),
                createPersonne(UUID
                        .fromString("b9e1c0ea-9634-11ec-b909-0242ac120002"),"Vance","Jayvion", LocalDate.now().minusMonths(11)),
                createPersonne(UUID
                        .fromString("b9e1c20c-9634-11ec-b909-0242ac120002"),"Newman","Taniya", LocalDate.now().minusMonths(9)),
                createPersonne(UUID
                        .fromString("d64ab2f0-9634-11ec-b909-0242ac120002"),"Clark","Eddie", LocalDate.now().minusMonths(8)),
                createPersonne(UUID
                        .fromString("d64ab566-9634-11ec-b909-0242ac120002"),"Medina","Jane", LocalDate.now().minusMonths(3)),
                createPersonne(UUID
                        .fromString("d64ab6ce-9634-11ec-b909-0242ac120002"),"Santiago","Kristian", LocalDate.now().minusMonths(1)),
                createPersonne(UUID
                        .fromString("d64abbc4-9634-11ec-b909-0242ac120002"),"Davila","Brenna", LocalDate.now().minusMonths(1))
        );
    }

    private Personne createPersonne(UUID uuid, String nom, String prenom, LocalDate dnaiss) {
        return PersonneBuilder.create()
                .withId(uuid)
                .withNom(nom)
                .withPrenom(prenom)
                .withDnaiss(dnaiss)
                .build();
    }
}
