package Exercices_OOP.Mivhan.O_cast.O;

public class CastTest {
    public static void main(String[] args) {


        System.out.println("--- Basic Upcasting ---");

        Student s1 = new Student("Frank", 123);
        Person p1 = new Student("Frank", 123); // 1. Upcasting от конкретного класса к родительскому (неявно) (מרומז)
        Person p2 = new Teacher("Grace", 456, "History"); // Upcasting
        Teacher t1 = new Teacher("Grace", 456, "History");
        Employee e1 = new Teacher("Bob", 789, "Math");
        GradStud gs1 = new GradStud("Harry", 123, "Robotics");
        Learnable l1 = new Student("Charlie", 234); // 3. Upcasting к интерфейсу (неявно)
        Workable w1 = new Teacher("David", 999, "Physics");// 4. Upcasting к интерфейсу от класса, который реализует несколько интерфейсов

        System.out.println("\n--- Legal Downcasting ---");
        // 1. Downcasting от родителя к наследнику (явное, корректное)
        Student s2 = (Student) p1;
        s2.study();
        // 2. Downcasting от интерфейса к классу (явное, корректное)
        Employee e2 = (Employee) w1;
        e2.work();
        // 3. Многоуровневое Downcasting (явное, корректное)
        Person p3 = new Teacher("Grace", 678, "History");
        Employee e3 = (Employee) p3;
        Teacher t22 = (Teacher) e3;
        t22.study();

        System.out.println("\n--- Runtime Errors (ClassCastException) ---");
        // 4. Попытка Downcasting к "соседнему" классу
        // Employee e4 = (Employee) p1; // ОШИБКА ВРЕМЕНИ ВЫПОЛНЕНИЯ: Student не является Employee

        // 5. Попытка Downcasting от родителя к более дальнему потомку, когда объект - промежуточный
        Person p5 = new Employee("Ivan", 789);
        // Teacher t2 = (Teacher) p5; // ОШИБКА ВРЕМЕНИ ВЫПОЛНЕНИЯ: Employee не является Teacher

        // 6. Попытка Downcasting от интерфейса к неправильному классу
        // Teacher t3 = (Teacher) l1; // ОШИБКА ВРЕМЕНИ ВЫПОЛНЕНИЯ: Student не является Teacher

        System.out.println("\n--- Compilation Errors ---");
        // 7. Попытка Downcasting между классами без связи в иерархии
        // Janitor j1 = (Janitor) s1; // ОШИБКА КОМПИЛЯЦИИ: Inconvertible types

        // 8. Попытка Downcasting от интерфейса к классу, который его не реализует
        Workable w3 = new Janitor("Niaj", 111);
        // Student s3 = (Student) w3; // ОШИБКА КОМПИЛЯЦИИ: Janitor не может быть Student

        // 9. Попытка создать экземпляр абстрактного класса
        // Person p6 = new Person("Abstract Person"); // ОШИБКА КОМПИЛЯЦИИ
        // 10. Доступ без геттера к полям private/protected
        //		s2.id;      // ОШИБКА КОМПИЛЯЦИИ
        System.out.println("\n--- Casting between interfaces ---");
        // 11. Приведение от одного интерфейса к другому (когда класс реализует оба)
        Learnable l3 = new Teacher("Patricia", 222, "Chemistry");
        Workable w4 = (Workable) l3;
        w4.work();
        // 12. Ошибка приведения интерфейсов (класс реализует только один)
        Learnable l4 = new Student("Quentin", 333);
        // Workable w5 = (Workable) l4; // ОШИБКА ВРЕМЕНИ ВЫПОЛНЕНИЯ: Student не реализует Workable

        // 13. Ковариантность массивов - ошибка времени выполнения (ArrayStoreException)
        Employee[] employees = new Teacher[2]; // Легально
        Object[] objects = employees;
        // objects[0] = new Student("Victor", 888); // ОШИБКА ВРЕМЕНИ ВЫПОЛНЕНИЯ: ArrayStoreException

        // 14. Ошибка компиляции при приведении массивов
        // Student[] students = new Person[5]; // ОШИБКА КОМПИЛЯЦИИ


        System.out.println("\n--- instanceof checks ---");
        // 14. Безопасное приведение типов с instanceof
        Person p7 = new GradStud("Oscar", 678, "AI");
        if (p7 instanceof GradStud) {
            GradStud gs2 = (GradStud) p7;
            System.out.println("Thesis: " + gs1.topic);
        }
        // 15. Проверка на соответствие родительскому классу (true)
        if (p7 instanceof Student) System.out.println("p7 is a Student");
        // 16. Проверка на соответствие интерфейсу (true)
        if (p7 instanceof Learnable) ((Learnable)p7).study();
        // 17. Проверка на соответствие "соседнему" классу (false)
        if (!(p7 instanceof Teacher)) System.out.println("p7 is not a Teacher");


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

        // ===================================================================================
        // ===            АНАЛИЗ ПРИМЕРОВ СО СКРИНШОТОВ С ИЕРАРХИЕЙ PERSON             ===
        // ===================================================================================
        System.out.println("\n\n--- Person Hierarchy Examples (from screenshots) ---\n");

        // --- Аналог ЧАСТИ А: Функция подсчета ---
        System.out.println("--- Аналог Части А: Подсчет учителей (Teacher) ---");
        Person[] peopleForCount = {
            new Student("Alice", 101),
            new Teacher("Bob", 707, "Math"),
            new Janitor("Charlie", 202),
            new Teacher("Diana", 808, "Physics"),
            new GradStud("Eve", 303, "AI")
        };

        int teacherCount = countSpecialTeachers(peopleForCount);
        // Ожидаемый результат: 1 (Учитель Diana с ID > 800)
        System.out.println("Найдено учителей с ID > 800: " + teacherCount);
        System.out.println("-----------------------------------------\n");

        // --- Аналог ЧАСТИ Б: Анализ выражений ---


        // Аналог 30) s1.equals(p1)
        System.out.println("Аналог 30) s1.equals(p1)");
        System.out.println("   Тип ошибки: НЕТ ОШИБКИ.");
        // Тип p1 - Person. В классе Student НЕТ метода equals(Object).
        // Java ищет `equals(Object)` и находит его в классе Object. Он сравнивает ссылки.
        boolean res1 = s1.equals(p1);
        System.out.println("   Результат: " + res1 + " (вызван Object.equals, т.к. в Student НЕТ переопределения equals(Object), ссылки разные)\n");

        // Аналог 31) p1.equals(s1)
        System.out.println("Аналог 31) p1.equals(s1)");
        System.out.println("   Тип ошибки: НЕТ ОШИБКИ.");
        // Ссылка p1 имеет тип Person. Вызывается Object.equals().
        boolean res14_b = p1.equals(s1);
        System.out.println("   Результат: " + res14_b + " (вызван Object.equals, ссылки разные)\n");

        // Аналог 32) t1.equals(p2)
        System.out.println("Аналог 32) t1.equals(p2)");
        System.out.println("   Тип ошибки: НЕТ ОШИБКИ.");
        // Вызывается переопределенный Teacher.equals(Object). Тип p2 - Teacher, сравнение полей даст true.
        boolean res15_b = t1.equals(p2);
        System.out.println("   Результат: " + res15_b + " (вызван переопределенный Teacher.equals)\n");

        // Аналог 33) p2.equals(t1)
        System.out.println("Аналог 33) p2.equals(t1)");
        System.out.println("   Тип ошибки: НЕТ ОШИБКИ.");
        // Полиморфизм! Реальный объект - Teacher. Вызывается его переопределенный метод.
        boolean res33_b = p2.equals(t1);
        System.out.println("   Результат: " + res33_b + " (полиморфный вызов Teacher.equals)\n");

        // Аналог 34) Вызов с несовместимым типом
        System.out.println("Аналог 34) s1.equals(t1)");
        System.out.println("   Тип ошибки: ОШИБКА КОМПИЛЯЦИИ.");
        System.out.println("   Объяснение: У класса Student есть equals(Student) и он наследует equals(Object). Вызов с аргументом Teacher не подходит к equals(Student). Компилятор мог бы выбрать equals(Object), но не делает этого, чтобы предотвратить потенциальные ошибки с несвязанными типами.\n");
        // boolean res34_b = s1.equals(t1); // <- Эта строка не скомпилируется

        // Аналог 35) s1.equals((Student)p1)
        System.out.println("Аналог 18) s1.equals((Student)p1)");
        System.out.println("   Тип ошибки: НЕТ ОШИБКИ.");
        // Явное приведение аргумента к Student. Компилятор находит ПЕРЕГРУЖЕННЫЙ метод equals(Student).
        boolean res18_b = s1.equals((Student) p1);
        System.out.println("   Результат: " + res18_b + " (вызван перегруженный Student.equals(Student))\n");

        // Аналог 36) t1.equals(p1)
        System.out.println("Аналог 19) t1.equals(p1)");
        System.out.println("   Тип ошибки: НЕТ ОШИБКИ.");
        // Вызывается Teacher.equals(Object). Внутри него 'p1 instanceof Teacher' вернет false.
        boolean res36_b = t1.equals(p1);
        System.out.println("   Результат: " + res36_b + " (внутри Teacher.equals проверка 'p1 instanceof Teacher' -> false)\n");

        // Аналог 37) t1.equals((Teacher)p1)
        System.out.println("Аналог 37) t1.equals((Teacher)p1)");
        System.out.println("   Тип ошибки: ОШИБКА ВЫПОЛНЕНИЯ (RuntimeException - ClassCastException).");
        System.out.println("   Объяснение: Ошибка происходит при вычислении аргумента (касте), до вызова equals.\n");
        try {
            t1.equals((Teacher)p1);
        } catch (ClassCastException e) {
            // Этот блок поймает ошибку
        }
        
        // --- Дополнительные тесты ---
        System.out.println("--- Дополнительные тесты иерархии ---\n");
        
        // Сравнение Student и GradStud
        System.out.println("Тест: s1.equals(gs1)");
        System.out.println("   Тип ошибки: НЕТ ОШИБКИ.");
        // Вызывается Object.equals, т.к. нет s1.equals(GradStud) и нет переопределенного s1.equals(Object).
        boolean res_s_gs = s1.equals(gs1);
        System.out.println("   Результат: " + res_s_gs + " (вызван Object.equals)\n");

        System.out.println("39) Тест: gs1.equals(s1)");
        System.out.println("   Тип ошибки: НЕТ ОШИБКИ.");
        // Вызывается GradStud.equals(Object). Внутри него 's1 instanceof GradStud' вернет false.
        boolean res_gs_s = gs1.equals(s1);
        System.out.println("   Результат: " + res_gs_s + " (внутри GradStud.equals 's1 instanceof GradStud' -> false)\n");
        
        // Работа с интерфейсами
        System.out.println("Тест: Приведение интерфейсов на объекте Teacher");
        System.out.println("   Тип ошибки: НЕТ ОШИБКИ.");
        Learnable l2 = t1; // Upcast к первому интерфейсу
        l2.study();
        // Можно ли от одного интерфейса перейти к другому? Да, если класс реализует оба.
        Workable w2 = (Workable) l2; // Каст к другому интерфейсу
        w2.work();
        System.out.println("   Приведение Learnable -> Workable для Teacher прошло успешно.\n");
    }

    /**
     * Вспомогательный метод (аналог функции из Части А на скриншоте).
     * Возвращает количество учителей с ID сотрудника > 800.
     */
    public static int countSpecialTeachers(Person[] persons) {
        int count = 0;
        for (Person p : persons) {
            // Проверяем, является ли объект Учителем (или его подклассом)
            if (p instanceof Teacher) {
                Teacher t = (Teacher) p; // Безопасное приведение типа (Downcasting)
                if (t.getEmployeeId() > 800) {
                    count++;
                }
            }
        }
        return count;
    }
}