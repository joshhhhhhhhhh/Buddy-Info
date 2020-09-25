import java.util.List;
public class AddressBook {
    List<BuddyInfo> buds;

    public void addBuddy(BuddyInfo bud){
        buds.add(bud);
    }

    public boolean removeBuddy(BuddyInfo bud){
        return buds.remove(bud);
    }

    public static void main(String[] args){
        BuddyInfo buddy = new BuddyInfo("Tom", "Carleton", "613");
        AddressBook addressBook = new AddressBook();
        addressBook.addBuddy(buddy);
        addressBook.removeBuddy(buddy);
    }

}