package Exercices_OOP._7_Abstract.t2_Persons;


class Person {
  public Person(){
      System.out.println("Person class no-args constructor called");
  }
  public Person(String name){
      System.out.println("Person class Parameterized constructor called by: "+name);
  }
}

