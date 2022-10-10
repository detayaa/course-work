public class Main {
    private static Employee[] employee = new Employee[5];


    public static void main(String[] args) {
        employee[0] = new Employee("Ivan", "Ivanov", "Ivanovich", 1, 30000);
        employee[1] = new Employee("Stepan", "Stepanov", "Stepanovich", 2, 40000);
        employee[2] = new Employee("Danil", "Danilov", "Danilovich", 3, 10000);
        employee[3] = new Employee("Artem", "Artemov", "Artemovich", 4, 60000);
        employee[4] = new Employee("Maksim", "Maksimov", "Maksimovich", 5, 70000);
        allInformations();
        monthSalary();
        minSalary();
        maxSalary();
        averageSalary();
        fio();

    }

    private static void allInformations() {
        for (int i = 0; i <= employee.length - 1; i++) {

            System.out.println(employee[i]);
        }

    }

    private static void monthSalary() {
        int sum = 0;
        for (int i = 0; i <= employee.length - 1; i++) {
            sum += employee[i].getSalary();

        }
        System.out.println("Сумма затрат на зарплату равна " + sum);
    }

    private static void minSalary() {
        int min = employee[0].getSalary();
        String name = null;
        for (int i = 0; i < employee.length; i++) {
            if (min > employee[i].getSalary()) {
                min = employee[i].getSalary();
                name = employee[i].getName() + " " + employee[i].getLastName() + " " + employee[i].getPatronymic();
            }else{
                name = employee[0].getName() + " " + employee[0].getLastName() + " " + employee[0].getPatronymic();
            }
        }
        System.out.println("Сотрудник с минимальной зарплатой - " + name);
    }

    private static void maxSalary() {
        int max = employee[0].getSalary();
        String name = null;
        for (int i = 0; i < employee.length; i++) {
            if (max < employee[i].getSalary()) {
                max = employee[i].getSalary();
                name = employee[i].getName() + " " + employee[i].getLastName() + " " + employee[i].getPatronymic();
            }else{
                name = employee[0].getName() + " " + employee[0].getLastName() + " " + employee[0].getPatronymic();
            }
        }
        System.out.println("Сотрудник с максимальной зарплатой - " + name);
    }

    private static void averageSalary() {
        float average;
        int sum = 0;
        for (int i = 0; i < employee.length; i++) {
            sum += employee[i].getSalary();
        }
        average = sum % employee.length;
        System.out.println("Среднее значение зарплат " + average);
    }

    private static void fio() {
        for (int i = 0; i < employee.length; i++) {
            System.out.println(employee[i].getName() + " " + employee[i].getLastName() + " " + employee[i].getPatronymic());
        }
    }
}



