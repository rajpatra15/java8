import java.util.ArrayList;
import java.util.Comparator;

class Employee {

    String name;
    int eno;
    Employee(String name, int eno){
        this.name = name;
        this.eno = eno;
    }

    @Override
    public String toString() {
        return  "Employee details number:"+ eno+" name:"+name;
    }
}
public class EmployeeTest {

    public static void main(String[] args) {

        Comparator<Employee> myComparator = (emp1, emp2) -> emp2.name.compareTo(emp1.name);
        ArrayList<Employee>employeeArrayList = new ArrayList<>();
        employeeArrayList.add(new Employee("Durga", 23456));
        employeeArrayList.add(new Employee("Ravi", 1234));
        employeeArrayList.add(new Employee("Kumar", 78905));
        employeeArrayList.add(new Employee("Mavi", 34567));
        employeeArrayList.add(new Employee("Raj", 123));

        employeeArrayList.sort(myComparator);
        System.out.println(employeeArrayList);
    }
}
