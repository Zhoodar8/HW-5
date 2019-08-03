package com.company;

import java.util.Random;

public class Boss {
    private String name;
    private int health;
    private int hit;
    private int defence;

    public Boss() {}

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getHit() {
        return hit;
    }

    public void setHit(int hit) {
        this.hit = hit;
    }

    public int getDefence() {
        return defence;
    }

    public void setDefence(int defence) {
        this.defence = defence;
    }


      public void changeDefence(){
          Random r = new Random();
          int randomNum = r.nextInt(700)+300;
          defence = randomNum;

      }


}
