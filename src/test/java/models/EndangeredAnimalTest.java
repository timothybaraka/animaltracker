package models;

import models.EndangeredAnimal;
import org.junit.Rule;
import org.junit.Test;

import static org.junit.Assert.*;

public class EndangeredAnimalTest {

    @Rule
    public DatabaseRule database = new DatabaseRule();

    @Test
    public void InitializeNewEndangeredAnimal_true(){
        EndangeredAnimal endangeredanimal = new EndangeredAnimal("rhino", "healthy", "young");
        assertEquals(true, endangeredanimal instanceof EndangeredAnimal);
    }



    @Test
    public void InitializeNewEndangeredAnimal_rhino() throws Exception {
        EndangeredAnimal endangeredanimal = new EndangeredAnimal( "rhino", "healthy", "young");
        assertEquals("rhino", endangeredanimal.getName());
    }

    @Test
    public void InitializeNewEndangeredAnimal_healthy() throws Exception {
        EndangeredAnimal endangeredanimal = new EndangeredAnimal("rhino", "healthy", "young");
        assertEquals("young", endangeredanimal.getHealth());
    }

    @Test
    public void InitializeNewEndangeredAnimal_young() throws Exception {
        EndangeredAnimal endangeredanimal = new EndangeredAnimal( "rhino", "healthy", "young");
        assertEquals("healthy", endangeredanimal.getAge());
    }

    @Test
    public void save_ObjectToDataBase_true() {
        EndangeredAnimal endangeredanimal = new EndangeredAnimal( "rhino", "healthy", "young");
        endangeredanimal.saveAnimal();
        assertTrue(EndangeredAnimal.getAll().get(0).equals(endangeredanimal));
    }
}






