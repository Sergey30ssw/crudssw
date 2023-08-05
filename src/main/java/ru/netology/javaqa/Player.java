package ru.netology.javaqa;

public class Player { // создание дата класса  с полями id, name и strength
    private int id;
    private String name;
    private int strength;


    public Player(int id, String name, int strength) { // конструктор
        this.id = id;
        this.name = name;
        this.strength = strength;
    }

    public String getName() { // геттер
        return name;
    }

    public int getStrength() { // геттер
        return strength;
    }


}