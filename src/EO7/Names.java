package EO7;

public class Names {
    private String firstName;
    private String lastName;
    private String middleName;

    public Names(String fullName){
        String[] splitted = fullName.split(" ");

        if (splitted.length == 2){
            this.firstName = splitted[0];
            this.lastName = splitted[1];
            this.middleName = "";
        }else{
            this.firstName = splitted[0];
            this.lastName = splitted[2];
            this.middleName = splitted[1];
        }
    }

    public static void main(String[] args) {
        Names names1 = new Names("Anders Teller");
        Names names2 = new Names("Nicolai Aagaard Andersson");
        Names names3 = new Names("Simon Bang Olesen");
        Names names4 = new Names("Tobias Kramer");

        System.out.println(names1.firstName);
        System.out.println(names2.middleName);
        System.out.println(names3.middleName);
        System.out.println(names4.firstName);
    }

    @Override
    public String toString() {
        if (!middleName.isEmpty()){
            return firstName + " " + middleName + " " + lastName;
        }else{
            return firstName + " " + lastName;
        }
    }
}
