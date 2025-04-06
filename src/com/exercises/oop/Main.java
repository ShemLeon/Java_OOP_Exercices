package com.exercises.oop;

import com.exercises.oop.overloading.Point;
import com.exercises.oop.overloading.Date;
import com.exercises.oop.murkavim.Message;
import com.exercises.oop.murkavim.Student;
import com.exercises.oop.murkavim.Table;
import com.exercises.oop.murkavim.Priangle;
import com.exercises.oop.staticmembers.Counter;
import com.exercises.oop.staticmembers.ClassMember;
import com.exercises.oop.staticmembers.Kids;
import com.exercises.oop.staticmembers.Line;
import com.exercises.oop.staticmembers.MyClass;
import com.exercises.oop.staticmembers.TestRunner;
import com.exercises.oop.maarah.Animal;
import com.exercises.oop.maarah.Pixel;
import com.exercises.oop.maarah.Subject;

public class Main {
    public static void main(String[] args) {
        // Пример использования Point
        Point p1 = new Point(4, 9);
        Point p2 = new Point(p1);
        System.out.println("Point p1: " + p1);
        System.out.println("Point p2: " + p2);
        
        // Пример использования Date
        Date d1 = new Date(1, 1, 2024);
        Date d2 = new Date(d1);
        System.out.println("Date d1: " + d1);
        System.out.println("Date d2: " + d2);

        // Пример использования Message
        Message m1 = new Message("Alice", "Bob", "Hello!", d1);
        System.out.println("Message m1: " + m1);

        // Пример использования Student
        Student s1 = new Student("John", "123", 'M', d1);
        System.out.println("Student s1: " + s1);

        // Пример использования Table
        Table t1 = new Table(1, 'A');
        System.out.println("Table t1: " + t1);

        // Пример использования Priangle
        Priangle tr1 = new Priangle(p1, p2);
        System.out.println("Priangle area: " + tr1.areaOfpriangle());

        // Пример использования Counter
        Counter c1 = new Counter();
        Counter c2 = new Counter();
        System.out.println("Counter count: " + Counter.getCount());

        // Пример использования ClassMember
        ClassMember cm1 = new ClassMember("Alice");
        ClassMember cm2 = new ClassMember("Bob");
        System.out.println("ClassMember box: " + ClassMember.getClassDiscBox());

        // Пример использования Kids
        Kids k1 = new Kids("Charlie", 10, 1);
        Kids k2 = new Kids("David", 8, 2);
        System.out.println("Kids count: " + Kids.getNumChildren());

        // Пример использования Line
        Line l1 = new Line(0, 0, 10, 10);
        Line l2 = new Line(10, 10, 20, 20);
        System.out.println("Line count: " + Line.count);

        // Пример использования MyClass
        MyClass mc1 = new MyClass(1, "First");
        MyClass.print();
        System.out.println("MyClass found: " + MyClass.found);

        // Пример использования TestRunner
        TestRunner testRunner = new TestRunner(5, 2);
        System.out.println("TestRunner: " + testRunner);

        // Примеры использования классов из пакета maarah
        System.out.println("\nПримеры использования классов из пакета maarah:");
        
        // Пример с Animal и Zoo
        Animal lion = new Animal("Лев", 5, "Хищник");
        Animal elephant = new Animal("Слон", 10, "Травоядное");
        Animal.Zoo zoo = new Animal.Zoo();
        zoo.addAnimal(lion);
        zoo.addAnimal(elephant);
        System.out.println("Животные в зоопарке:");
        zoo.displayAnimals();
        
        // Пример с Pixel и Picture
        Pixel redPixel = new Pixel(255, 0, 0);
        Pixel greenPixel = new Pixel(0, 255, 0);
        Pixel bluePixel = new Pixel(0, 0, 255);
        Pixel[][] picturePixels = {
            {redPixel, greenPixel, bluePixel},
            {redPixel, greenPixel, bluePixel},
            {redPixel, greenPixel, bluePixel}
        };
        Pixel.Picture picture = new Pixel.Picture("Тестовая картина", "Тестовый художник", 3, 3);
        picture.createPic(picturePixels);
        System.out.println("Картина сбалансирована: " + picture.isBalanced());
        
        // Пример с Subject и ReportCard
        Subject[] subjects = {
            new Subject("Математика", 95),
            new Subject("Физика", 90),
            new Subject("Химия", 88)
        };
        Subject.ReportCard reportCard = new Subject.ReportCard("Алиса", subjects);
        System.out.println("Средний балл: " + reportCard.average());
        System.out.println("Отличник: " + reportCard.isExcellent());
    }
} 