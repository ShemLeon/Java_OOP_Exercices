package Exercices_OOP._9_Enum.ex13_1_eurovision;// import unit4.collectionsLib.Node;

public class AudienceVoted extends Country {
    private int audPoints;
    public AudienceVoted(String name, int rank, int audPoints) {
        super(name, rank, VoteType.AUDIENCE);
        this.audPoints = audPoints;
    }

    @Override
    public int getPoints(){
        return audPoints;
    }


}
