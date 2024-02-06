package classes;

import interfaces.Logger;

public class SmsLogger implements Logger {
    @Override
    public void log(String message) {
        System.out.println("Sms sent: " + message);
    }

}
