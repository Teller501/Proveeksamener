package EO20;

public class Student implements DataObject{
    private int id;
    private String name;
    private String email;

    public Student(int id, String name, String email){
        this.id = id;
        this.name = name;
        this.email = email;
    }

    @Override
    public int getId() {
        return id;
    }

    @Override
    public String[] getData() {
        String[] data = new String[2];

        data[0] = name;
        data[1] = email;

        return data;
    }
}
