public class Main2 {
    public static void main(String[] args) {

        String str ="qwer;qwer1;86987;888.9;wert;sdfghjk fgh;";
        //JSON - JavaScript Object Notation

        String[] arr = str.split(";");
        int a = Integer.parseInt(arr[2]);
        double b = Double.parseDouble(arr[3]);

        System.out.println(a+b);
    }
}
