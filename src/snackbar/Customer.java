package snackbar;

public class Customer {
    private int maxid;
    private int id;
    private String name;
    private float cashonhand;

    // get id
    public int getId() {
        return id;
    }

    // set and get name
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // add cash to cash on hand
    public void addCash(float cash) {
        this.cashonhand += cash;
    }

    // get cash on hand
    public float getCashOnHand() {
        return cashonhand;
    }

    // buy snacks. Given the total cost of the snacks to be purchased, reduce the
    // cash on hand by that amount
    public void buySnacks(float totalCost) {
        this.cashonhand -= totalCost;
    }
}