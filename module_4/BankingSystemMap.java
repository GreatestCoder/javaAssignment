import java.util.HashMap;
import java.util.Map;
public class BankingSystemMap {
    private Map<Integer, Double> accounts = new HashMap<>();
    public void create(int id, double bal) { accounts.put(id, bal); }
    public void deposit(int id, double amt) { accounts.put(id, accounts.getOrDefault(id,0.0)+amt); }
    public boolean withdraw(int id, double amt) {
        double bal = accounts.getOrDefault(id, 0.0);
        if (bal>=amt) { accounts.put(id, bal-amt); return true; }
        return false;
    }
    public static void main(String[] args) {
        BankingSystemMap b = new BankingSystemMap();
        b.create(1, 1000); b.deposit(1, 500); b.withdraw(1, 200);
        System.out.println("Balance of 1: " + b.accounts.get(1));
    }
}
