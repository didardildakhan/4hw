package com.narxoz.rpg.battle;

public class EncounterResult {

    private String winner;

    public EncounterResult(String winner) {
        this.winner = winner;
    }

    public void printResult() {
        System.out.println("Battle finished!");
        System.out.println("Winner: " + winner);
    }
}