package com.company;

public class Main {

    public static void main(String[] args){
        Boss boss = new Boss();
        boss.setHealth(700);
        boss.setDamage(70);
        boss.setSuperAbility("Defence");
        System.out.println("health " + boss.getHealth() + " Damage " + boss.getDamage() + "" +
                " Defence" + boss.getSuperAbility()) ;
    }
}
