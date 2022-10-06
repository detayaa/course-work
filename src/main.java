public class main {
    static Employee[] employee = new Employee[10];



    public static void main(String[] args) {
        Employee employee1 = new Employee(1, "Ivan", "Ivanov", "Ivanovich", 1, 30000);
        Employee employee2 = new Employee(2, "Stepan", "Stepanov", "Stepanovich", 2, 40000);
        Employee employee3 = new Employee(3, "Danil", "Danilov", "Danilovich", 3, 50000);
        Employee employee4 = new Employee(4, "Artem", "Artemov", "Artemovich", 4, 60000);
        Employee employee5 = new Employee(5, "Maksim", "Maksimov", "Maksimovich", 5, 70000);
        System.out.println(employee1);
    }


}
