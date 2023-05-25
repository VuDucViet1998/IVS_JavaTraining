package day2.assignment2;

public class Main {
    public static void main(String[] args) {
        Employee e1 = new Employee("Viet", "2022", "Hung Yen", "0d");
        Employee e2 = new Employee("Viet2", "2022", "Hung Yen", "0d");
        Employee e3 = new Employee("Viet3", "2022", "Hung Yen", "0d");

        System.out.println("Name\tYear of joining\t\tAddress\t\t\tSalary");
        System.out.println(e1.getEmployee());
        System.out.println(e2.getEmployee());
        System.out.println(e3.getEmployee());
    }
}
