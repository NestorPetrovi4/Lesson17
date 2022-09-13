import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

    }

    public static List<Person> generateClients() {
        List<Person> persons = new ArrayList<>();
        persons.add(new Person("Oleg", "Nesterov", 3));
        persons.add(new Person("Vitaliy", "Zuev", 1));
        persons.add(new Person("Polina", "Markova", 5));
        persons.add(new Person("Andrey", "Matveev", 2));
        persons.add(new Person("Viktoriya", "Karelskaya", 2));
        return persons;
    }

}
