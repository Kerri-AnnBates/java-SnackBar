package snackbar;

public class Snack {
    private static int maxid = 0;
    private int id;
    private String name;
    private int quantity;
    private double cost;
    private int vendingmachineid;

    public Snack(String name, int quantity, double cost, int vendingmachineid) {
        this.name = name;
        this.quantity = quantity;
        this.cost = cost;
        this.vendingmachineid = vendingmachineid;
        this.id = maxid;
        maxid++;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public int getVendingMachineId() {
        return vendingmachineid;
    }

    public void setVendingMachineId(int vendingmachineid) {
        this.vendingmachineid = vendingmachineid;
    }

    public int getQuantity() {
        return quantity;
    }

    public void addQuantity(int quantity) {
        this.quantity = this.quantity + quantity;
    }

    public void buySnack(int quantity) {
        this.quantity = this.quantity - quantity;
    }

    public double getTotalCost(int quantity) {
        return this.cost * quantity;
    }
}