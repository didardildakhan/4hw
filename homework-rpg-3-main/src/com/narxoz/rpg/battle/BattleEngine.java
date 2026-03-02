package com.narxoz.rpg.battle;

public class BattleEngine {

    public EncounterResult fight(Combatant c1, Combatant c2) {

        System.out.println(c1.getName() + " vs " + c2.getName());
        System.out.println("Battle started!\n");

        while (c1.isAlive() && c2.isAlive()) {

            c2.takeDamage(c1.attack());
            System.out.println(c1.getName() + " attacks! "
                    + c2.getName() + " HP: " + c2.getHealth());

            if (!c2.isAlive()) break;

            c1.takeDamage(c2.attack());
            System.out.println(c2.getName() + " attacks! "
                    + c1.getName() + " HP: " + c1.getHealth());

            System.out.println();
        }

        String winner = c1.isAlive() ? c1.getName() : c2.getName();
        return new EncounterResult(winner);
    }
}