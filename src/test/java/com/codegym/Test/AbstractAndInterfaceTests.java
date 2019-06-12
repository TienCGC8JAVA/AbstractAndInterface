package com.codegym.Test;

import com.codegym.Edible;
import com.codegym.animal.Animal;
import com.codegym.animal.Chicken;
import com.codegym.animal.Tiger;
import com.codegym.fruit.Apple;
import com.codegym.fruit.Fruit;
import com.codegym.fruit.Orange;

import java.util.Arrays;

public class AbstractAndInterfaceTests {
    public static void main(String[] args) {
        Animal[] animals = new Animal[2];
        animals[0] = new Tiger();
        animals[1] = new Chicken();
        Arrays.stream(animals).filter(animal -> animal instanceof Chicken)
                .forEach(Animal::makeSound);

        Fruit[] fruits = new Fruit[2];
        fruits[0] = new Orange();
        fruits[1] = new Apple();
        Arrays.stream(fruits).forEach(Edible::howToEat);
    }
}
