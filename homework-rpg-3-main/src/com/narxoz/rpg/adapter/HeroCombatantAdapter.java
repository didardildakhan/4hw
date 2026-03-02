package com.narxoz.rpg.adapter;

import com.narxoz.rpg.battle.Combatant;
import com.narxoz.rpg.hero.Hero;

public class HeroCombatantAdapter implements Combatant {

    private Hero hero;

    public HeroCombatantAdapter(Hero hero) {
        this.hero = hero;
    }

    public String getName() {
        return hero.getName();
    }

    public int getHealth() {
        return hero.getHealth();
    }

    public int attack() {
        return hero.attack();
    }

    public void takeDamage(int damage) {
        hero.takeDamage(damage);
    }

    public boolean isAlive() {
        return hero.isAlive();
    }
}