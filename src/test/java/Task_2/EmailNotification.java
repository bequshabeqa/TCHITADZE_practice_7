package Task_2;

public class EmailNotification extends Notification {
    public void sendNotification(String message) {
        System.out.println("sent by email: " + message);
    }
    public void sendNotification() {
        sendNotification("sent by email service ");
    }
}