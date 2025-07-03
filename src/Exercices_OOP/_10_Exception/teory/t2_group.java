package Exercices_OOP._10_Exception.teory;// import unit4.collectionsLib.Node;

public class t2_group {
    static class Group{
        private String[] groupMembers;
        private int numOfMembers;
        public Group(int numOfMembers, String[] groupMembers){
            this.numOfMembers = numOfMembers;
            this.groupMembers = groupMembers;
        }
        public int getNumOfMembers(){
            return numOfMembers;
        }
        public void addMember(String newMember){}
//        public void removeMember(int numOfTheMemberToRemove){
//            numOfMembers--;
//            groupMembers[numOfTheMemberToRemove] = null;
//        }
        public void removeMember(int numOfTheMemberToRemove){
            if (numOfTheMemberToRemove <groupMembers.length){
            numOfMembers--;
            groupMembers[numOfTheMemberToRemove] = null;
        } else {
                System.out.println("Нету индекса!");
            }
        }
    public static void main(String[] args) {
       String[] grpMembers = {"Dan", "Din", "Dina"};
       Group dansGroup = new Group(3, grpMembers);
   //  dansGroup.remove(3); - метода remove не существует. Compilation Error
     dansGroup.removeMember(3); // - в этом массиве нет такого итема. есть 0, 1, 2 .NullPointerException
        System.out.println("asd");
    }
    }
}
