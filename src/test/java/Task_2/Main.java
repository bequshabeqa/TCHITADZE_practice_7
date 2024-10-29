package Task_2;


public class Main {
    public static void main(String[] args) {

            Notification emailNotification = new EmailNotification();
            Notification smsNotification = new SMSNotification();


                System.out.println("Sending alerts: ");
                NotificationService.sendAlert(emailNotification, "Email alert. ");
                NotificationService.sendAlert(smsNotification, "SMS verification alert. ");


                System.out.println("with polymorphism");
                emailNotification.sendNotification("email-ის ხარვეზი ");
                smsNotification.sendNotification("ესაჭიროება შეკეთბა ");
        }

        public static void sendAlert(EmailNotification emailNotification) {
            emailNotification.sendNotification();
        }

        public void sendEmailNotification(String service) {
            System.out.println("snet by email service: " + service);
        }
        public void sendSMSNotification(String service) {
            System.out.println("snet by email service: " + service);
        }
}