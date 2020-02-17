package models;

import org.junit.Rule;
import org.junit.Test;

import static org.junit.Assert.*;

public class AnimalTest {

@Rule
public DatabaseRule database = new DatabaseRule();

    @Test
    public void getName() {
        Animal animal = new Animal("lion");
        assertEquals("lion",animal.getName());
    }

    @Test
    public void saveAnimal() {
        Animal animal = new Animal("lion");
        animal.saveAnimal();
        assertTrue(Animal.getAll().get(0).equals(animal));
    }

    @Test
    public void getAll() {
    }
}