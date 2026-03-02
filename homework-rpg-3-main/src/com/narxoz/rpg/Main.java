package com.narxoz.rpg;

import com.narxoz.rpg.adapter.EnemyCombatantAdapter;
import com.narxoz.rpg.adapter.HeroCombatantAdapter;
import com.narxoz.rpg.battle.BattleEngine;
import com.narxoz.rpg.battle.EncounterResult;
import com.narxoz.rpg.enemy.BasicEnemy;
import com.narxoz.rpg.enemy.Goblin;
import com.narxoz.rpg.hero.Mage;
import com.narxoz.rpg.hero.Warrior;

public class Main {

    public static void main(String[] args) {

        Warrior warrior = new Warrior("Arthas");
        Mage mage = new Mage("Jaina");

        Goblin goblin = new Goblin();
        BasicEnemy wolf = new BasicEnemy("Wolf", 60, 12);

        BattleEngine engine = new BattleEngine();

        System.out.println("=== Warrior vs Goblin ===");
        EncounterResult result1 = engine.fight(
                new HeroCombatantAdapter(warrior),
                new EnemyCombatantAdapter(goblin)
        );
        result1.printResult();

        System.out.println("\n=== Mage vs Wolf ===");
        EncounterResult result2 = engine.fight(
                new HeroCombatantAdapter(mage),
                new EnemyCombatantAdapter(wolf)
        );
        result2.printResult();
    }
}