public class Employee {
    private String name;
    private String lastName;
    private String patronymic;
    private int department;
    private int salary;
    private final int id;

    public Employee(String name,String lastName,String patronymic, int department, int salary, int id) {
        this.name = name;
        this.department = department;
        this.salary = salary;
        this.id = id;
        this.lastName = lastName;
        this.patronymic = patronymic;
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



}
