public class Person {
    public String name;
    public String surname;
    protected int amountTicket;

    public Person(String name, String surname, int amountTicket) {
        this.name = name;
        this.surname = surname;
        this.amountTicket = amountTicket;
    }

    public int getAmountTicket() {
        return amountTicket;
    }

    public void setAmountTicket(int amountTicket) {
        this.amountTicket = amountTicket;
    }
}
