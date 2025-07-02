package Exercices_OOP._9_Enum.teory;

public enum MyEnums {
    FIRST, SECOND, THIRD, FOURTH;
}

class Test3{
    public static void main(String[] args){
        MyEnums[] myEnums = new MyEnums[4];
        for (int i=0; i< myEnums.length; i++){
            System.out.println(myEnums[i]);
        }
    }
}
