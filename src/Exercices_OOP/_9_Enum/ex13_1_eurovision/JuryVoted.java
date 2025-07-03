package Exercices_OOP._9_Enum.ex13_1_eurovision;// import unit4.collectionsLib.Node;

public class JuryVoted extends Country {
    private int juryPoints;
    public JuryVoted(String name, int rank, int juryPoints) {
        super(name, rank, VoteType.JURY);
        this.juryPoints = juryPoints;
    }

    @Override
    public int getPoints(){
        return juryPoints;
    }
}
