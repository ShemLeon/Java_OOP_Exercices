package Ex14_1;


public class Main {
    public static void main(String[] args) {

        System.out.println("Shalom!");
        // Сначала создаем массив сотрудников
        Employee[] team = new Employee[80];
        // Заполняем команду разными типами сотрудников
        team[0] = new Technician("Ivan ", 3, 10);
        team[1] = new UnionMember("Petrov", 5, 3);
        team[2] = new Technician("Ololoev", 2, 400);
        team[3] = new RegularEmployee("Parampam", 4);
        team[4] = new UnionMember("Kozlov", 6, 10);
        team[5] = new Technician("Bananna", 1, 100);
        team[6] = new RegularEmployee("Volkov", 3);
        team[7] = new UnionMember("Suzanna", 4, 10);
        team[8] = new Technician("Pavel", 2, 200);
        team[9] = new RegularEmployee("Bibika", 5);
        ProjectSupervisor s1 = new ProjectSupervisor("Komandir", 2, team);
        System.out.println(s1);
        System.out.println(s1.calculateSalary());
        System.out.println(team[3]);
        System.out.println(team[3].calculateSalary());
    }
}
