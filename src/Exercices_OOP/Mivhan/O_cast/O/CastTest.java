package Exercices_OOP.Mivhan.O_cast.O;

public class CastTest {
    public static void main(String[] args) {

        System.out.println("--- Basic Upcasting ---");
        // 1. Upcasting от конкретного класса к родительскому (неявно) (מרומז)
        Person p1 = new Student("Alice", 123);
        // 2. Upcasting от конкретного класса к родительскому (неявно)
        Employee e1 = new Teacher("Bob", 789, "Math");
        // 3. Upcasting к интерфейсу (неявно)
        Learnable l1 = new Student("Charlie", 234);
        // 4. Upcasting к интерфейсу от класса, который реализует несколько интерфейсов
        Workable w1 = new Teacher("David", 999, "Physics");


        System.out.println("\n--- Legal Downcasting ---");
        // 5. Downcasting от родителя к наследнику (явное, корректное)
        Person p2 = new Student("Eve", 345);
        Student s1 = (Student) p2;
        s1.study();
        // 6. Downcasting от интерфейса к классу (явное, корректное)
        Workable w2 = new Employee("Frank", 567);
        Employee e2 = (Employee) w2;
        e2.work();
        // 7. Многоуровневое Downcasting (явное, корректное)
        Person p3 = new Teacher("Grace", 678, "History");
        Employee e3 = (Employee) p3;
        Teacher t1 = (Teacher) e3;
        t1.study();

        System.out.println("\n--- Runtime Errors (ClassCastException) ---");
        // 8. Попытка Downcasting к "соседнему" классу
        Person p4 = new Student("Heidi", 456);
        // Employee e4 = (Employee) p4; // ОШИБКА ВРЕМЕНИ ВЫПОЛНЕНИЯ: Student не является Employee

        // 9. Попытка Downcasting от родителя к более дальнему потомку, когда объект - промежуточный
        Person p5 = new Employee("Ivan", 789);
        // Teacher t2 = (Teacher) p5; // ОШИБКА ВРЕМЕНИ ВЫПОЛНЕНИЯ: Employee не является Teacher

        // 10. Попытка Downcasting от интерфейса к неправильному классу
        Learnable l2 = new Student("Judy", 567);
        // Teacher t3 = (Teacher) l2; // ОШИБКА ВРЕМЕНИ ВЫПОЛНЕНИЯ: Student не является Teacher

        System.out.println("\n--- Compilation Errors ---");
        // 11. Попытка Downcasting между классами без связи в иерархии
        Student s2 = new Student("Mallory", 890);
        // Janitor j1 = (Janitor) s2; // ОШИБКА КОМПИЛЯЦИИ: Inconvertible types

        // 12. Попытка Downcasting от интерфейса к классу, который его не реализует
        Workable w3 = new Janitor("Niaj", 111);
        // Student s3 = (Student) w3; // ОШИБКА КОМПИЛЯЦИИ: Janitor не может быть Student

        // 13. Попытка создать экземпляр абстрактного класса
        // Person p6 = new Person("Abstract Person"); // ОШИБКА КОМПИЛЯЦИИ


        System.out.println("\n--- instanceof checks ---");
        // 14. Безопасное приведение типов с instanceof
        Person p7 = new GradStud("Oscar", 678, "AI");
        if (p7 instanceof GradStud) {
            GradStud gs1 = (GradStud) p7;
            System.out.println("Thesis: " + gs1.topic);
        }
        // 15. Проверка на соответствие родительскому классу (true)
        if (p7 instanceof Student) System.out.println("p7 is a Student");
        // 16. Проверка на соответствие интерфейсу (true)
        if (p7 instanceof Learnable) ((Learnable)p7).study();
        // 17. Проверка на соответствие "соседнему" классу (false)
        if (!(p7 instanceof Teacher)) System.out.println("p7 is not a Teacher");

        System.out.println("\n--- Casting between interfaces ---");
        // 18. Приведение от одного интерфейса к другому (когда класс реализует оба)
        Learnable l3 = new Teacher("Patricia", 222, "Chemistry");
        Workable w4 = (Workable) l3;
        w4.work();
        // 19. Ошибка приведения интерфейсов (класс реализует только один)
        Learnable l4 = new Student("Quentin", 333);
        // Workable w5 = (Workable) l4; // ОШИБКА ВРЕМЕНИ ВЫПОЛНЕНИЯ: Student не реализует Workable

        System.out.println("\n--- Array Casting Scenarios ---");
        // 20. Массив суперкласса хранит объекты подклассов
        Person[] people = new Person[4];
        people[0] = new Student("Rose", 444);
        people[1] = new Teacher("Steve", 555, "Art");
        people[2] = new Janitor("Trent", 666);
        people[3] = new GradStud("Ulysses", 777, "Biology");

        // 21. Использование instanceof в цикле для работы с элементами массива
        for (Person person : people) {
            System.out.print(person.getName() + ": ");
            if (person instanceof Learnable) ((Learnable) person).study();
            else if (person instanceof Workable) ((Workable) person).work();
        }

        // 22. Ковариантность массивов - ошибка времени выполнения (ArrayStoreException)
        Employee[] employees = new Teacher[2]; // Легально
        Object[] objects = employees;
        // objects[0] = new Student("Victor", 888); // ОШИБКА ВРЕМЕНИ ВЫПОЛНЕНИЯ: ArrayStoreException

        // 23. Ошибка компиляции при приведении массивов
        // Student[] students = new Person[5]; // ОШИБКА КОМПИЛЯЦИИ

        // 24. Явное приведение массива (легально, но опасно)
        Person[] personsArray = new Student[2];
        personsArray[0] = new Student("Walter", 999);
        Student[] studentsArray = (Student[]) personsArray;
        System.out.println("\nCasted array element: " + studentsArray[0].getName());

        // 25. Явное приведение массива, которое вызовет ошибку
        Person[] personsArray2 = new Person[2];
        personsArray2[0] = new Student("Xavier", 111);
        personsArray2[1] = new Employee("Yvonne", 222);
        // Student[] studentsArray2 = (Student[]) personsArray2; // ОШИБКА ВРЕМЕНИ ВЫПОЛНЕНИЯ
        
        // 26. Приведение null - всегда легально
        Person p_null = null;
        Student s_null = (Student) p_null;
        System.out.println("Casting null to Student results in: " + s_null); // Выведет null

        // 27. instanceof с null всегда false
        System.out.println("null instanceof Student: " + (p_null instanceof Student)); // Выведет false
    }
}