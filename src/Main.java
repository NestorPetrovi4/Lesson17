import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Person> persons = generateClients();
        Deque<Person> dequePerson = new ArrayDeque<>();
        dequePerson.addAll(persons);
        while (true) {
            Person person = dequePerson.poll();
            if (person == null) {
                System.out.print("Очередь закончилась!!!");
                break;
            }
            int amountTicket = person.getAmountTicket();
            if (amountTicket - 1 > 0) {
                System.out.println(person.name + " " + person.surname + " прокатился на аттракционе осталось билетов " + (amountTicket - 1));
                person.setAmountTicket(amountTicket - 1);
                dequePerson.addLast(person);
            } else {
                System.out.println(person.name + " " + person.surname + " прокатился на аттракционе");
            }

        }

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
