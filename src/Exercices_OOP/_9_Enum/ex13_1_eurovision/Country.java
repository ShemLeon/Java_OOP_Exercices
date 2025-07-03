package Exercices_OOP._9_Enum.ex13_1_eurovision;// import unit4.collectionsLib.Node;

public abstract class Country {
   private String name;
   private int rank;
   private VoteType voteType;
   public Country(String name, int rank, VoteType voteType){
       this.name = name;
       this.rank = rank;
       this.voteType = voteType;
   }
    public String getName(){
       return this.name;
    }
    public abstract int getPoints();

    @Override
    public String toString() {
        return "Name: "+this.name +", rank: "+this.rank+" voteType: "+this.voteType;
    }
}
