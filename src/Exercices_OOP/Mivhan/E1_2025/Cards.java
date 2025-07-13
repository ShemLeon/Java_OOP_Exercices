package Exercices_OOP.Mivhan.E1_2025;


class Card{
        public int id;
        public int power;
        public String color;
        public Card(int id, int power, String color){
            this.id=id;
            this.power=power;
            this.color=color;
        }
        public int calcForce(){
            return power;
        }
        public String toString(){
            return "id:"+id+" power:"+power;
        }
    }
   class Goblin extends Card{
       public int id;
       public int power;
       public String color;
        public int tools;
        public Goblin(int id, int power, String color, int tools){
            super(id, power, color);
            this.tools = tools;
        }
        public String toString(){
            return super.toString() + " count tools:" + tools;
        }
    }
public class Cards {
    public static void main(String[] args) {
            Card card = new Card(1, 250, "black");
            System.out.println(card);
        }
    }

