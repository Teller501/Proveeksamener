package EO20;

public class User implements DataObject{
    private int id;
    private String name;
    private String username;

    public User(int id, String name, String username){
        this.id = id;
        this.name = name;
        this.username = username;
    }

    @Override
    public int getId() {
        return id;
    }

    @Override
    public String[] getData() {
        String[] data = new String[2];
        data[0] = name;
        data[1] = username;

        return data;
    }
}
