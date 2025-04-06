package _7_Abstract.t2_Persons;

public class Record extends Person{
    public Record(){
        this("Record class");
        System.out.println("Record class no-args constructor called");
    }
    public Record(String name){
        super();
        System.out.println("Record class parameterized constructor called by: "+name);
    }
    public static void main(String args[]){
        Record c = new Record();
    }

}
