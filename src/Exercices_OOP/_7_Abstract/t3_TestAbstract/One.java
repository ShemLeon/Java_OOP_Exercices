package _7_Abstract.t3_TestAbstract;


public abstract class One {
    public abstract int sumOfTwo(int n1, int n2);
    public abstract int sumOfThree(int n1, int n2, int n3);
    public void disp(){
        System.out.println("Method of class One");
    }
}

class Two extends One{

    @Override
    public int sumOfTwo(int num1, int num2) {
        return num1+num2;
    }

    @Override
    public int sumOfThree(int num1, int num2, int num3) {
        return num1+num2+num3;
    }
}

class Testabstract{
    public static void main(String args[]){
        Two obj = new Two(); // 10
        System.out.println(obj.sumOfTwo(3,7)); // 26
        System.out.println(obj.sumOfThree(4,3,19));
        obj.disp();     // Method of class One

    }
}
