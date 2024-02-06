import classes.DbLogger;

public class Main {
    public static void main(String[] args) {
        String message = "Hesabiniza 1000 azn kocuruldu.";
        DbLogger logger = new DbLogger();
        logger.log(message);

    }
}