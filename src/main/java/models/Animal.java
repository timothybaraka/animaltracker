package models;

import org.sql2o.Connection;

import java.util.List;
import java.util.Objects;

public class Animal {

    private int id;
    private String name;

    public Animal( String name){
        this.id = id;
        this.name = name;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Animal animal = (Animal) o;
        return id == animal.id &&
                name.equals(animal.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name);
    }


    public int getId(){
        return id;
    }


    public String getName(){
        return name;
    }

    public void setName (String name){
        this.name = name;
    }


    public int setId(int id){
        return this.id;
    }


    public void saveAnimal() {
        try (Connection con = Database.sql2o.open()) {
            String sql = "INSERT INTO animals (name) VALUES (:name);";
            this.id = (int) con.createQuery(sql, true)
                    .addParameter("name", this.name)
                    .executeUpdate()
                    .getKey();
        }
    }

  //Method to return all entries in a database
    public static List<Animal> getAll() {
        try (Connection con = Database.sql2o.open()) {
            String sql = "SELECT * FROM animals";
            return con.createQuery(sql)
                    .executeAndFetch(Animal.class);
        }
    }

}




