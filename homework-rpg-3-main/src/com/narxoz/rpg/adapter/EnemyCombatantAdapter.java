package com.narxoz.rpg.adapter;

import com.narxoz.rpg.battle.Combatant;
import com.narxoz.rpg.enemy.Enemy;

public class EnemyCombatantAdapter implements Combatant {

    private Enemy enemy;

    public EnemyCombatantAdapter(Enemy enemy) {
        this.enemy = enemy;
    }

    public String getName() {
        return enemy.getName();
    }

    public int getHealth() {
        return enemy.getHealth();
    }

    public int attack() {
        return enemy.attack();
    }

    public void takeDamage(int damage) {
        enemy.takeDamage(damage);
    }

    public boolean isAlive() {
        return enemy.isAlive();
    }
}