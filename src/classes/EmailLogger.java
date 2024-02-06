package classes;

import interfaces.Logger;

public class EmailLogger implements Logger{

    @Override
    public void log(String message) {
        System.out.println(message);
    }
}
