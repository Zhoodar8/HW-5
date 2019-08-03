package com.company;

public class Main {

    public static void main(String[] args) {


        Heroes h = new Heroes("Naruto", 1000, 200, 500);
        System.out.println(h.heroes +  " health: " + h.health + " hit: " + h.hit + " superhit: " + h.superhit +"\n" );


        Boss b = new Boss();
        b.setName("Madara");
        b.setHealth(1300);
        b.setHit(350);
        b.setDefence(700);
        b.changeDefence();
        System.out.println("Boss Defence  :" + b.getDefence());





    }
}
