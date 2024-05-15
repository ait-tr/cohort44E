public class Pigeon implements MailDeliveryService {
    @Override
    public void deliveryMail() {
        System.out.println("Голубь?! В 21 веке?! Ты крэйзи!!!! Я улетаю");
    }

    @Override
    public String getServiceName() {
        return "Голубь";
    }
}

