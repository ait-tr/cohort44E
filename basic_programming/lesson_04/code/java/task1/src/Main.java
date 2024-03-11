public class Main {
    public static void main(String[] args) {

        double tempFlask1 = -100.3;
        double tempFlask2 = 999.8;
        //--------------------------------------------------------

        boolean isDeviceCorrect = (tempFlask1>100 && tempFlask2<0) ||
                                    (tempFlask2>100 && tempFlask1<0) ;

    // -----------------------------------------------------------


        if (isDeviceCorrect){
            System.out.println("прибор - ок");
        } else {
            System.out.println("Error! Alarm!!!!!");
        }
    }
}