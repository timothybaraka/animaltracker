package models;
import org.junit.rules.ExternalResource;
import org.sql2o.Connection;
import org.sql2o.Sql2o;
public class DatabaseRule extends ExternalResource {
    @Override
    protected void before() {
        Database.sql2o = new Sql2o("jdbc:postgresql://localhost:5432/wildlife_tracker_test", "timothy", "3680");
    }
    @Override
    protected void after() {
        try (Connection con = Database.sql2o.open()) {
            String deleteAnimalsQuery = "DELETE FROM animals *;";
            String deleteEndangeredAnimalsQuery = "DELETE FROM endangered_animals *;";
//            String deleteSightingsQuery = "DELETE FROM sightings *;";
            con.createQuery(deleteAnimalsQuery).executeUpdate();
            con.createQuery(deleteEndangeredAnimalsQuery).executeUpdate();
//            con.createQuery(deleteSightingsQuery).executeUpdate();
        }
    }
}
