package Task5;

public class Client {
    private String login;
    private String purchases;
    private int quantity;

    public Client(String login, String purchases, int quantity) {
        this.login = login;
        this.purchases = purchases;
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return "Client{" +
                "login='" + login + '\'' +
                ", purchases='" + purchases + '\'' +
                ", quantity=" + quantity +
                '}';
    }
}
