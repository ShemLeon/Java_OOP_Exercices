package Exercices_OOP.Mivhan.M_2025a.S4_CarMoto;// import unit4.collectionsLib.Node;

public class Motorcycle {
   private int speed;
   public Motorcycle(int s){
       speed = s;
   }
   public int getSpeed(){
       return speed;
   }
   public boolean equals(Object other){
       return ( (other != null) &&
               (other instanceof Motorcycle) &&
               (speed == ((Motorcycle)other).speed)
       );
   }
}


