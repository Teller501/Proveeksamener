package Opgave7;

public class Names {
    private String firstName;
    private String middleName;
    private String lastName;

    public Names(String fullName){
        String[] splittedName = fullName.split(" ");
        if (splittedName.length == 2){
            firstName = splittedName[0];
            lastName = splittedName[1];
            middleName = "";
        }else{
            firstName = splittedName[0];
            middleName = splittedName[1];
            lastName = splittedName[2];
        }
    }

    @Override
    public String toString() {
        if (middleName.isEmpty()){
            return firstName + " " + lastName;
        }else{
            return firstName + " " + middleName + " " + lastName;
        }
    }

    public static void main(String[] args) {
        Names name1 = new Names("Anders Teller");
        Names name2 = new Names("Anders Olsen Teller");
        Names name3 = new Names("Nicolai Andersson");

        System.out.println(name1);
        System.out.println(name2);
        System.out.println(name3);
    }
}
