interface Notification {
    void sendMessage(String message);
}

class EmailNotification implements Notification {
    public void sendMessage(String message) {
        System.out.println("Email Notification: " + message);
    }
}

class SMSNotification implements Notification {
    public void sendMessage(String message) {
        System.out.println("SMS Notification: " + message);
    }
}

public class notify {
    public static void main(String[] args) {

        Notification n;

        n = new EmailNotification();
        n.sendMessage("Welcome to our application");

        n = new SMSNotification();
        n.sendMessage("Your OTP is 1234");
    }
}