import java.io.*;

public class Main3 {
    public static void main(String[] args) {
        String inputFile = "D:/333/file.dat";

        int[] filesSize = {601, 57053, 22494};
        File inputData = new File(inputFile);
        if (!inputData.exists()) {
            System.out.println("Отсутствует файл данных");
            System.exit(-1);
        }
        int sizeAll = filesSize[0] + filesSize[1] + filesSize[2];
        System.out.println(inputData.length());
        if (inputData.length() < sizeAll) {
            System.out.println("Не верный формат файла данных");
            System.exit(-1);
        }


        String[] outputFiles = {
                "D:/333/file1",
                "D:/333/file2",
                "D:/333/file3"
        };


        try (FileInputStream inputStream = new FileInputStream(inputFile);) {

            for (int i = 0; i < 3; i++) {
                byte[] buffer = readPart(filesSize[i], inputStream);
                writePart(buffer,outputFiles[i]);
            }
        } catch (IOException e) {
            System.out.println("Ошибка чтения");
        }
    }



    private static byte[] readPart(int fileSize, FileInputStream inputStream) throws IOException {
            byte[] buffer = new byte[fileSize];
            int bytes = inputStream.read(buffer);
            if (bytes != fileSize) {
                throw new IOException("Ошибка чтения");
            }
            return buffer;
    }


    private static void writePart(byte[] buffer, String outputFile) {
        try (OutputStream os = new FileOutputStream(outputFile)) {
            os.write(buffer);
        } catch (IOException e){
            System.out.println("Ошибка записи");
        }
    }

}