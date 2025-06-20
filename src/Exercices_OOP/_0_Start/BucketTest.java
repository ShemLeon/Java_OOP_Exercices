package Exercices_OOP._0_Start; // import unit4.collectionsLib.Node;

public class BucketTest {
    public static void main(String[] args) {
        Bucket bucket = new Bucket(100);
        System.out.println(bucket.getCapacity()); // это сработает
 //     System.out.println(bucket.capacity);      // это вызовет ошибку компиляции
    }
}