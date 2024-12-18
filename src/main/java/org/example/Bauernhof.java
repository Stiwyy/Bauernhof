package org.example;

import java.util.List;

public class Bauernhof {
    public String name;
    List<Tier> tiere = List.of();

    public Bauernhof(String name) {
        this.name = name;
        this.tiere = tiere;
        Pferd pferd1 = new Pferd("pferd 1", 14, 45);
        Kuh kuh1 = new Kuh("kuh1", 5, 35);
        this.tiere.add(pferd1);
        this.tiere.add(kuh1);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Tier> getTiere() {
        return tiere;
    }

    public void setTiere(List<Tier> tiere) {
        this.tiere = tiere;
    }
}
