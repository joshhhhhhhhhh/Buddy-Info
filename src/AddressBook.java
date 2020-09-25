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
        System.out.println("Address Book");
    }

}