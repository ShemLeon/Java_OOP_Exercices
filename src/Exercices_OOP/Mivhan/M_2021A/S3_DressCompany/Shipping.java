package Exercices_OOP.Mivhan.M_2021A.S3_DressCompany;

public class Shipping {
    private String address;
    private Object[] arr;
    public Shipping(String address, Object[] arr) {
        this.address = address;
        this.arr = arr;
    }

    public double sum(){
        double sum=0;
        if (arr.length<1) return 0;
        for (Object item : arr){
            if (item instanceof Book) sum+= ((Book)item).getPrice();
            else if (item instanceof Clothes) sum+= ((Clothes)item).getPrice();
        }
        return sum;
    }
}
