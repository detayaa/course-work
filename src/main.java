public class main {
    static Employee[] employee = new Employee[5];

    public static void main(String[] args) {
        fio();
        monthSalary();
        //minSalary();

    }

    public static void fio() {
        for (int i = 0; i <= employee.length - 1; i++) {
            employee[0] = new Employee("Ivan", "Ivanov", "Ivanovich", 1, 30000);
            employee[1] = new Employee("Stepan", "Stepanov", "Stepanovich", 2, 40000);
            employee[2] = new Employee("Danil", "Danilov", "Danilovich", 3, 50000);
            employee[3] = new Employee("Artem", "Artemov", "Artemovich", 4, 60000);
            employee[4] = new Employee("Maksim", "Maksimov", "Maksimovich", 5, 70000);
            System.out.println(employee[i]);

        }

    }

    public static void monthSalary() {
        int sum = 0;
        for (int i = 0; i <= employee.length - 1; i++) {
            sum += employee[1].getSalary();
            System.out.println("Сумма затрат на зарплату равна " + sum);
        }
    }

    //public static void minSalary() {
        //int min = 100000000;
        //String name = null;
        //for (int i = 0; i <employee.length ; i++) {
            //if (min > employee[i].getSalary()) {
                //name = employee[i].getName();
            //}
            //System.out.println("Сотрудник с минимальной зарплатой - " + name);
        //}
    //}
}


