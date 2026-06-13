package practiceJava;

import java.util.*;
import java.util.stream.*;
public class TransactionsStreams {
    public static void main(String[] args) {
        List<Transaction> txns = Arrays.asList(
            new Transaction(1, 101, 500),
            new Transaction(2, 101, 200),
            new Transaction(3, 101, 800),
            new Transaction(4, 102, 1000),
            new Transaction(5, 102, 300),
            new Transaction(6, 102, 700)
        );

        Map<Integer, List<Transaction>> result =
            txns.stream().collect(Collectors.groupingBy(
                Transaction::getuserId,Collectors.collectingAndThen(
                    Collectors.toList(),list->list.stream()
                                                  .sorted(Comparator        .comparingInt(Transaction::getAmount).reversed())
                                                 .limit(2).collect(Collectors.toList()))
                ));

        result.forEach((user, topTxns) -> 
            System.out.println("User " + user + " => " + topTxns));
    }
}

class Transaction {
    int id;
    int userId;
    int amount;
    Transaction(int id, int userId, int amount) {
        this.id = id; this.userId = userId; this.amount = amount;
    }
    public String toString() {
        return "T" + id + "(user:" + userId + ", amt:" + amount + ")";
    }
    public int getuserId(){
        return userId;
    }
    public int getAmount(){
        return amount;
    }
}

