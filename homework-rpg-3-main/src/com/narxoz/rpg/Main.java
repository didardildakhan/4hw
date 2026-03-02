package com.narxoz.rpg;

import com.narxoz.rpg.adapter.EnemyCombatantAdapter;
import com.narxoz.rpg.adapter.HeroCombatantAdapter;
import com.narxoz.rpg.battle.BattleEngine;
import com.narxoz.rpg.enemy.Goblin;
import com.narxoz.rpg.hero.Warrior;

public class Main {

    public static void main(String[] args) {

        Warrior warrior = new Warrior("Arthas");
        Goblin goblin = new Goblin();

        HeroCombatantAdapter heroAdapter = new HeroCombatantAdapter(warrior);
        EnemyCombatantAdapter enemyAdapter = new EnemyCombatantAdapter(goblin);

        BattleEngine engine = new BattleEngine();
        engine.fight(heroAdapter, enemyAdapter);
    }
}