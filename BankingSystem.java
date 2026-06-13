package practiceJava;
class TransactionLogger {
    private static TransactionLogger instance;

    private TransactionLogger() {}

    public static TransactionLogger getInstance() {
        if (instance == null) {
            instance = new TransactionLogger();
        }
        return instance;
    }

    public void log(String message) {
        System.out.println("LOG: " + message);
    }
}

// Usage
public class BankingSystem {
    public static void main(String[] args) {
        TransactionLogger logger = TransactionLogger.getInstance();
        System.out.println(logger);
        logger.log("Transaction started...");
        logger.log("Transaction completed...");
    }
}