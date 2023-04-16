package edBitExercise;

import java.util.HashMap;
import java.util.Map;

public class getBudget {

    public static int getBudgets(Person[] people) {
        int totalBudget = 0;
        for (Person person : people) {
            totalBudget += person.getBudget();

        }
    return totalBudget;
    }

    public static void main(String[] args) {
        Person[] people = {
                new Person("John", 21, 23000),
                new Person("Steve", 32, 40000),
                new Person("Martin", 16, 2700)
        };
        int totalBudget = getBudgets(people);
        System.out.println("Total Budget: " + totalBudget);
    }
}
class Person {

    private String name;
    private int age;
    private int budget;

    public Person(String name, int age, int budget) {
        this.name = name;
        this.age = age;
        this.budget = budget;
    }

    public int getBudget() {
        return budget;
    }
}


