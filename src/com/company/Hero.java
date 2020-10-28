package com.company;

public class Hero {
    private int damage;
    private int health;
    private String superAbility;

    public Hero(int damage, int health, String superAbility) {
        this.damage = damage;
        this.health = health;
        this.superAbility = superAbility;
    }

 public Hero(int damage, int health) {
      this.damage = damage;
      this.health = health;
 }

    public int getDamage() {
        return damage;
    }

    public int getHealth() {
        return health;
    }

    public String getSuperAbility() {
        return superAbility;
    }

}