//package dao;
//import dao.Sql2oAnimalDao;
//import models.Animal;
//import org.sql2o.*;
//import org.junit.*;
//import static org.junit.Assert.*;
//
//public class Sql2oAnimalDaoTest {
//
//    private Sql2oAnimalDao;
//    private Connection conn; //must be sql2o class conn

//    @Before
//    public void setUp() throws Exception {
//        String connectionString = "jdbc:h2:mem:testing;INIT=RUNSCRIPT from 'classpath:db/create.sql'";
//        Sql2o sql2o = new Sql2o(connectionString, "", "");
//        Sql2oAnimalDao animalDao = new Sql2oAnimalDao(sql2o);
//        conn = sql2o.open(); //keep connection open through entire test so it does not get erased
//    }
//
//    @After
//    public void tearDown() throws Exception {
//        conn.close();
//    }
//
//    @Test
//    public void addingCourseSetsId() throws Exception {
//        Animal animal = new Animal ("mow the lawn");
//        int originalTaskId = animal.getId();
//        animalDao.add(animal);
//        assertNotEquals(AnimalId, animal.getId());
//    }
//
//    @Test
//    public void existingTasksCanBeFoundById() throws Exception {
//        Animal animal = new Animal  ("mow the lawn");
//        animalDao.add(animal ); //add to dao (takes care of saving)
//        Animal foundAnimal = animalDao.findById(animal .getId()); //retrieve
//        assertEquals(animal , foundAnimal); //should be the same
//    }
//    @Test
//    public void existingTasksCanBeReturned() throws Exception {
//        Animal animal = new Animal  ("mow the lawn");
//        animalDao.getAll(animal ); //add to dao (takes care of saving)
//        Animal foundTask = animalDao.findById(animal .getId()); //retrieve
//        assertEquals(animal , foundTask); //should be the same
//    }
//}