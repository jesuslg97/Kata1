package kata1;

import java.time.LocalDate;

public class Kata1 {

    public static void main(String[] args) {
        LocalDate date;
        date = LocalDate.of(1997,6,21);
        Person person = new Person("Jesus", date);
        System.out.println(person.getName() + " tiene " + person.getAge() + " años");
    }   
}