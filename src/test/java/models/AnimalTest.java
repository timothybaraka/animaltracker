package models;

import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;

import static org.junit.Assert.*;

public class AnimalTest {

    @Rule
    public DatabaseRule database = new DatabaseRule();

    @Test
    public void save_insertObjectIntoDatabase_Animal(){
        Animal testAnimal= new Animal("Rhino");
        testAnimal.saveAnimal();
        assertTrue(Animal.getAll().get(0).equals(testAnimal));
    }



    @Test
    public void getName() {
        Animal animal = new Animal("lion");
        assertEquals("lion",animal.getName());
    }
    @Test
    public void equals_returnsTrueIfNamesAreTheSame_true() {
        Animal animal = new Animal("lion");
        Animal anotherAnimal = new Animal("lion");
        assertTrue(animal.equals(anotherAnimal));
    }
//    @Test
//    public void saveAnimal() {
//        Animal animal = new Animal("lion");
//        animal.saveAnimal();
//        assertTrue(Animal.getAll().get(0).equals(animal));
//    }

    @Test
    public void save_insertAnimalIntoDatabase_Animal() {
        Animal animal = new Animal("cheetah");
        animal.saveAnimal();
        assertTrue(Animal.getAll().get(0).equals(animal));
    }

//    @Test
//    public void save_assignsIdToAnimal() {
//        Animal animal = new Animal("lion");
//        animal.saveAnimal();
//        assertEquals(Animal.getAll().get(0).equals(animal));
//    }

    @Test
    public void getAll() {
    }
}