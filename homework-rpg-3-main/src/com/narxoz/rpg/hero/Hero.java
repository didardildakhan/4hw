package com.narxoz.rpg.hero;

public abstract class Hero {

    protected String name;
    protected int health;
    protected int damage;

    public Hero(String name, int health, int damage) {
        this.name = name;
        this.health = health;
        this.damage = damage;
    }

    public String getName() {
        return name;
    }

    public int attack() {
        return damage;
    }

    public void takeDamage(int dmg) {
        health -= dmg;
    }

    public int getHealth() {
        return health;
    }

    public boolean isAlive() {
        return health > 0;
    }
}