
import java.util.Objects;

public class Person {

    private String name;
    private SimpleDate birthday;
    private int height;
    private int weight;

    public Person(String name, SimpleDate birthday, int height, int weight) {
        this.name = name;
        this.birthday = birthday;
        this.height = height;
        this.weight = weight;
    }

    // implement an equals method here for checking the equality of objects
    public boolean equals (Object compared){
        
        //compare variable position
        if (this == compared){
            return true;
        }
        //compare type of compared object
        if (!(compared instanceof Person)){
            return false;
        }
        //convert compared object to type of Person
        Person comparedPerson = (Person) compared;
        
        //compare person attributes
        if (this.name == comparedPerson.name && this.height == comparedPerson.height && this.weight == comparedPerson.weight && this.birthday.equals(comparedPerson.birthday)){
            return true;
        }
        return false;
    }
}
