public class Main5 {
    public static void main(String[] args) {
        String str = "Hello Java world!";
        System.out.println(str.length()); // количество символов в строке

        int i = 0;
        while (i<str.length()){
            if (str.charAt(i) !=' ') {
                System.out.println(str.charAt(i));
            }
            i=i+1;
        }

        System.out.println("------------------------");
        for( i = 0 ;  i<str.length()   ; i=i+1 ){
            if (str.charAt(i) !=' ') {
                System.out.println(str.charAt(i));
            }
        }





    }
}
