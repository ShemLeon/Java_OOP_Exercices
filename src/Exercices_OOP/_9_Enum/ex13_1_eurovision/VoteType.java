package Exercices_OOP._9_Enum.ex13_1_eurovision;

public enum VoteType {
    AUDIENCE("Audience points"),
    JURY("Jury points");
    private final String description;

    VoteType(String description){
        this.description = description;
    }

    public String getDescription(){
        return description;
    }
}
