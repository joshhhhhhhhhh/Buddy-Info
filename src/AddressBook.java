import java.util.*;
public class AddressBook {
    List<BuddyInfo> buds;

    public AddressBook(){
        buds = new ArrayList<>();
    }
    public void addBuddy(BuddyInfo bud){
        buds.add(bud);
    }//Some text added in github

    public boolean removeBuddy(BuddyInfo bud){
        return buds.remove(bud);
    }

    public static void main(String[] args){
        BuddyInfo buddy = new BuddyInfo("Tom", "Carleton", "613");
        AddressBook addressBook = new AddressBook();
        addressBook.addBuddy(buddy);
        addressBook.removeBuddy(buddy);
    }
    public int addTwoInts(int one, int two){
        return one + two;
    }

}
