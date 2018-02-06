package Employee;
import java.util.Random;

public class Employee {
    private int staffNumber;
    private String surname;

    public Employee(int eStaffNumber, String eSurname) {
        staffNumber = eStaffNumber;
        surname = eSurname;
    }

    public boolean validEmployee() {
        return true;
    }

    public double getSalary() {
        if (validEmployee() == true ) {
            Random rand = new Random();
            double salary = Math.random() * 10000;
            return salary;
        }
        else
            return -1;
    }

}

