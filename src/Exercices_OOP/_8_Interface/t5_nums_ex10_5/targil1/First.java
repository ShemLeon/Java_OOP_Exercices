package Exercices_OOP._8_Interface.t5_nums_ex10_5.targil1;

class First {
   public First(int k){
       System.out.println(k+":First");
   }
}
// class Second extends First {
//    public Second(int k){
//        System.out.println(k+":Second");
//    }
//}

class Second extends First {
    public Second(int k) {
    super(5);
    System.out.print(k+" :Second ");
}}


