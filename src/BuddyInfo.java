public class BuddyInfo {

    private String name;
    private String address;
    private String phoneNumber;

    public BuddyInfo(String name, String address, String phoneNumber){
        this.address = address;
        this.name = name;
        this.phoneNumber = phoneNumber;
    }

    public BuddyInfo(){
        this.address = "No Address";
        this.name = "No Name";
        this.phoneNumber = "No Phone Number";
    }

    public String getName() {
        return name;
    }

    public static void main(String[] args) {
        BuddyInfo bud = new BuddyInfo();
        bud.name = "Homer";
        System.out.println("Hello " + bud.getName());

    }

}
