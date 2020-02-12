import org.junit.Test;

import static org.junit.Assert.*;

public class AnimalTest {

    @Test
    public void InitializeNewAnimal_true() throws Exception{
        Animal animal = new Animal(1, "lion");
        assertEquals(true, animal instanceof Animal );
    }
    @Test
    public void IdGetsCorrectltAdded_1() throws Exception{
        Animal animal = new Animal(1, "lion");
        assertEquals(1, animal.getId());
    }


}