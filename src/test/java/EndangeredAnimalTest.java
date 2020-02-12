import org.junit.Test;

import static org.junit.Assert.*;

public class EndangeredAnimalTest {

    @Test
    public void InitializeNewEndangeredAnimal_true() throws Exception{
        EndangeredAnimal endangeredanimal = new EndangeredAnimal(1, "rhino","healthy","young");
        assertEquals(true, endangeredanimal instanceof EndangeredAnimal );
    }
    @Test
    public void InitializeNewEndangeredAnimal_1() throws Exception{
        EndangeredAnimal endangeredanimal = new EndangeredAnimal(1, "rhino","healthy","young");
        assertEquals(1, endangeredanimal.getId);
    }


}