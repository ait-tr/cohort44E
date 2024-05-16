import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        MailDeliveryService[] services = {
                new DHL(),
                new Email(),
                new Pigeon(),
                new UPS()
        };

        boolean isContinue=true;
        while (isContinue) {
            MailDeliveryService service = selectService(services);
            if (service != null) {
                sendMail(service);
            }
            isContinue=isContinue();
        }

    }
    public  static boolean isContinue(){
        System.out.println("0 - выход, любая цифра - продолжаем" );
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt()==0? false:true;
    }
    public static MailDeliveryService selectService(MailDeliveryService[] services){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Выберите способ доставки почты:");
        for (int i = 0; i < services.length; i++) {
            System.out.println((i+1) + " "+services[i].getServiceName());
        }
        int choice =scanner.nextInt();
        if(choice<=0 ||choice >services.length ){
            return null;
        } else {
            return services[choice-1];
        }

    }

    public static void sendMail(MailDeliveryService service){

        System.out.println("Подготовили письмо");
        System.out.println("отсылаем ......");
        service.deliveryMail();                ////////   !!!!!!!
        System.out.println("Отослано!!!!");
    }
}