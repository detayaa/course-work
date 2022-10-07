public class Employee {
    private String name;
    private  String lastName;
    private  String patronymic;
    private int department;
    private int salary;
    static int id;

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                ", patronymic='" + patronymic + '\'' +
                ", department=" + department +
                ", salary=" + salary +
                '}';

    }

    public Employee(String name, String lastName, String patronymic, int department, int salary) {
        this.name = name;
        this.department = department;
        this.salary = salary;
        this.lastName = lastName;
        this.patronymic = patronymic;

        id++;
    }

    public String getName() {
        return getName();
    }

    public String getLastName() {
        return getLastName();
    }

    public String getPatronymic() {
        return getPatronymic();
    }

    public int getDepartment() {
        return getDepartment();
    }

    public int getSalary() {
        return getSalary();
    }

    public int getId() {
        return getId();
    }

    public void setDepartment(int department) {
        this.department = department;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
}
