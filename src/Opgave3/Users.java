package Opgave3;

import java.util.ArrayList;

public class Users {
    private ArrayList<User> users;
    private int nextID;

    public Users(){
       users = new ArrayList<>();
       nextID = 1;
    }

    public void createUser(String username, User.Role role){
        User user = new User(username, role);
        user.setUserid(nextID);
        nextID++;
        users.add(user);
    }

    public ArrayList<User> getUsers() {
        return users;
    }

    public ArrayList<User> getUsersByRole(User.Role role) {
        ArrayList<User> usersByRole = new ArrayList<>();
        for (User user : users){
            if (user.getRole() == role){
                usersByRole.add(user);
            }
        }
        return usersByRole;
    }

    public static void main(String[] args) {
        Users users1 = new Users();

        users1.createUser("Ande777j", User.Role.READER);
        users1.createUser("Omsefar", User.Role.READER);
        users1.createUser("Simsefar", User.Role.READER);
        users1.createUser("Peterlind", User.Role.ADMIN);
        users1.createUser("NyborgCyborg", User.Role.ADMIN);
        users1.createUser("Tine", User.Role.ADMIN);

        for (User user : users1.users){
            System.out.println(user.getUserid());
            System.out.println(user.getUsername());
            System.out.println(user.getRole());
        }

        System.out.println(users1.getUsersByRole(User.Role.ADMIN));
    }


}
