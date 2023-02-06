package Opgave4;

public class Main {
    public static void main(String[] args) {
        User[] users = new User[5];
        for(int i = 0; i <=4; i++){
            users[i] = new User("Navn" + i);
        }

        for (User user : users){
            System.out.println(user.getName());
        }
    }
}
