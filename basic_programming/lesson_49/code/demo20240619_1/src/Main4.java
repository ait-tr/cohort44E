import java.io.*;

public class Main4 {
    public static void main(String[] args) {
        copy();
    }

    public static void copy(){
        try (InputStream is=new BufferedInputStream(new FileInputStream("d:/333/1.mp4"));
             OutputStream os= new BufferedOutputStream(new FileOutputStream("d:/333/2copy.mp4"))){

            int count=0;
            int data;
            while ((data=is.read())!=-1){
                count++;
                if(count%100000==0){
                    System.out.println(count);
                }
                os.write(data);
            }

        } catch (IOException e){
            e.printStackTrace();
        }


    }

}
