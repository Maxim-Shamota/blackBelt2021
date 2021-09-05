import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class TestComparator {
    public static void main(String[] args) {
        List<Employe> list = new ArrayList<>();
        Employe emp1 = new Employe(100,"Max", "Ivanov", 100500);
        Employe emp2 = new Employe(15,"Ivan", "Petrov", 12121);
        Employe emp3 = new Employe(254,"Ivan", "Sidorov", 565464654);
        list.add(emp1);
        list.add(emp2);
        list.add(emp3);
        System.out.println("Before sorting \n " + list);
        Collections.sort(list, new SalaryComparator());
        System.out.println("After sorting \n " + list);
    }
}

class Employe implements Comparable<Employe>{
    int id;
    String name;
    String surname;
    int salary;

    public Employe(int id, String name, String surname, int salary) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", salary=" + salary +
                '}';
    }

    @Override
    public int compareTo(Employe anotherEmp) {
        if (this.id == anotherEmp.id) {
            return 0;
        } else if (this.id < anotherEmp.id) {
            return -1;
        } else return 1;
    }
}

//class IdComparator implements Comparator<Employe> {
//    @Override
//    public int compare(Employe emp1, Employe emp2) {
//        if (emp1.id == emp2.id) {
//            return 0;
//        } else if (emp1.id < emp2.id) {
//            return -1;
//        } else return 1;
//    }
//}

class NameComparator implements Comparator<Employe> {
    @Override
    public int compare(Employe emp1, Employe emp2) {
        return emp1.name.compareTo(emp2.name);
    }
}

class SalaryComparator implements Comparator<Employe> {
    @Override
    public int compare(Employe emp1, Employe emp2) {
        return emp1.salary-emp2.salary;
    }
}