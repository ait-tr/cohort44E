import java.io.File;
import java.nio.file.Path;
import java.util.Arrays;

public class Main6 {
    public static void main(String[] args) {
        File file = new File("d:\\333\\qer\\yuu");
        System.out.println(file.isFile());
        if(file.isDirectory()){
            String[] list = file.list();
            Arrays.asList(list).forEach(s-> System.out.println(s));
        }

    }
}
