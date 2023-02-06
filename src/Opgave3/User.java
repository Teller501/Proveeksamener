package Opgave3;

public class User {
    private String username;
    private int userid;
    private Role role;

    enum Role {
        ADMIN,
        EDITOR,
        READER
    }


    public User(String username, Role role){
        this.username = username;
        this.role = role;
    }

    public int getUserid() {
        return userid;
    }

    public Role getRole() {
        return role;
    }

    public String getUsername() {
        return username;
    }

    public void setUserid(int userid) {
        this.userid = userid;
    }
}
