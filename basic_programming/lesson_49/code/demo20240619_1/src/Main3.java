import java.io.*;

public class Main3 {
    public static void main(String[] args) {
        copy();
    }

    public static void copy(){
        try (InputStream is = new FileInputStream("d:/333/1.mp4");
             OutputStream os= new FileOutputStream("d:/333/1copy.mp4")){

            int size = 1024*1024*10;
            byte[] data = new byte[size];

            int count=0;

            while ((count=is.read(data))!=-1){
                System.out.println(count);
                if(count<size){
                    os.write(data,0,count);
                } else {
                    os.write(data);
                }

            }

        } catch (IOException e){
            e.printStackTrace();
        }


    }

}
