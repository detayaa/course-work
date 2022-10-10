public class Employee {
    private String name;
    private  String lastName;
    private  String patronymic;
    private int department;
    private int salary;
    private static int id = 0;

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
        this.id = id;

    }

    public String getName() {
        return name;
    }

    public String getLastName() {
        return lastName;
    }

    public String getPatronymic() {
        return patronymic;
    }

    public int getDepartment() {
        return department;
    }

    public int getSalary() {
        return salary;
    }

    public int getId() {
        return id;
    }

    public void setDepartment(int department) {
        this.department = department;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
}
