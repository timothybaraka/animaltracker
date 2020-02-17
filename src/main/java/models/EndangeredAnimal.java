package models;

public class EndangeredAnimal {

    private int id;
    private String name;
    private String health;
    private String age;

    public EndangeredAnimal(int id, String name,String health,String age){
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

}
