package io.javabrains.javabasics;

public class Cat extends Animal {

    private int numOfLives;


    public Cat(String name, int age,int lives) {
        super(name, age);
        this.numOfLives = lives;
    }

    public int getNumOfLives() {
        return numOfLives;
    }

    public void setNumOfLives(int numOfLives) {
        this.numOfLives = numOfLives;
    }

    @Override
    public void makeSound() {
        System.out.println("The cat meows");
    }
}
