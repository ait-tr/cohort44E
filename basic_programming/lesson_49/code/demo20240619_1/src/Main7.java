import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.OutputStream;

public class Main7 {
    public static void main(String[] args) {
        /*

        {
        "name":"Jack",
        "age":27
        "list":[]
        }




         */

        Person p= new Person("Jack",25);
        String str = "java serialization";
        try (ObjectOutputStream os = new ObjectOutputStream(new FileOutputStream("1.dat"));){
            os.writeObject(p);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }
}
