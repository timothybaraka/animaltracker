package models;

import org.sql2o.Connection;

import java.util.List;
import java.util.Objects;

public class EndangeredAnimal {

    private int id;
    private String name;
    private String health;
    private String age;

    public EndangeredAnimal( String name,String health,String age){
        this.id = id;
        this.name = name;
        this.health = health;
        this.age = age;
    }
    int getId(){
        return id;
    }
    String getName(){
        return name;
    }
    String getHealth(){
        return health;
    }
    String getAge(){
        return age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        EndangeredAnimal that = (EndangeredAnimal) o;
        return id == that.id &&
                name.equals(that.name) &&
                health.equals(that.health) &&
                age.equals(that.age);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, health, age);
    }
    public void saveAnimal() {
        try (Connection con = Database.sql2o.open()) {
            String sql = "INSERT INTO endangered (name,age,health) VALUES (:name,:age,:health);";
            this.id = (int) con.createQuery(sql, true)
                    .addParameter("name", this.name)
                    .addParameter("health", this.age)
                    .addParameter("name", this.health)
                    .executeUpdate()
                    .getKey();
        }
    }
    public static List<EndangeredAnimal> getAll() {
        try (Connection con = Database.sql2o.open()) {
            String sql = "SELECT * FROM endangered";
            return con.createQuery(sql)
                    .executeAndFetch(EndangeredAnimal.class);
        }
    }



}

