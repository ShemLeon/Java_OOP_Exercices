package Exercices_OOP._0_Start;

public class Bucket {
    private int capacity;
    private double currentAmount;
    public Bucket(int capacity, double currentAmount){
        this.capacity = capacity;
        this.currentAmount = currentAmount;
    }
    public Bucket(int capacity){
        this.capacity = capacity;
        this.currentAmount = 0;
    }
    public int getCapacity(){
        return this.capacity;
    }
    public void setCapacity(int newCapacity ){
        this.capacity = newCapacity;
    }
    public void fill(double amountToFill){
        double newAmount = this.currentAmount+amountToFill;
        if (newAmount<=this.capacity){
            this.currentAmount = newAmount;
        } else {
            this.currentAmount = this.capacity;
        }
    }
    public String toString(){
        return "Bucket:\ncapacity:"+this.capacity+
        "\ncurrent amount:"+this.currentAmount+"\n";
    }

    public static void main(String[] args) {
        Bucket bucket1 = new Bucket(150,0);
        Bucket bucket2 = new Bucket(180);
        int cap1 = bucket1.getCapacity();
        System.out.println("cap1="+cap1); // 150
        bucket1.setCapacity(13);
        System.out.println("cap1="+cap1); //150
        System.out.println("bucket1 capacity="+bucket1.getCapacity()); // 13
        System.out.println("bucket2 currentAmount="+bucket2.currentAmount);
        bucket2.fill(cap1);
        System.out.println("bucket2 capacity="+bucket2.capacity);
        System.out.println("bucket2 currentAmount="+bucket2.currentAmount);
        System.out.println("bucket2 capacity="+bucket2.getCapacity());
        System.out.println (bucket1.toString());
        System.out.println (bucket2);
    }

}



