package com.narxoz.rpg.battle;

public class BattleEngine {

    public EncounterResult fight(Combatant c1, Combatant c2) {

        while (c1.isAlive() && c2.isAlive()) {

            c2.takeDamage(c1.attack());
            if (!c2.isAlive()) break;

            c1.takeDamage(c2.attack());
        }

        if (c1.isAlive()) {
            return new EncounterResult(c1.getName());
        } else {
            return new EncounterResult(c2.getName());
        }
    }
}