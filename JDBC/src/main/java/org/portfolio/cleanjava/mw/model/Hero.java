package org.portfolio.cleanjava.mw.model;

public class Hero {

    private int id;
    private String name;
    private int level = 1;

    public Hero(int id, String name, int level){
        this.id = id;
        this.name = name;
        this.level = level;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getLevel() {
        return level;
    }

    @Override
    public String toString() {
        return "Hero{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", level=" + level +
                '}';
    }
}
