package EO20;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public interface DataObject {

    public int getId();

    public String[] getData();

    public static void main(String[] args) {
        ArrayList<DataObject> dataObjects = new ArrayList<>();

        User user = new User(1, "Anders", "andersteller");
        User user2 = new User(2, "Nicolai", "NicolaiAndersson");
        User user3 = new User(3, "Svend", "SvendSvendsen");
        Student student = new Student(1 , "Victor", "victor@kea.dk");
        Student student2 = new Student(2 , "Omar", "omar@kea.dk");
        Student student3 = new Student(3 , "Simon", "Simon@kea.dk");

        Collections.addAll(dataObjects, user,user2,user3,student2,student,student3);

        for (DataObject dataObject : dataObjects){
            System.out.println(dataObject.getId());
            System.out.println(Arrays.toString(dataObject.getData()));
        }
    }
}
