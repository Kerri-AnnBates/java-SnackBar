package snackbar;

public class Snack {
    private int maxid;
    private int id;
    private String name;
    private int quantity;
    private float cost;
    private int vendingmachineid;

    public Snack(String name, int quantity, float cost, int vendingmachineid) {
        this.name = name;
        this.quantity = quantity;
        this.cost = cost;
        this.vendingmachineid = vendingmachineid;
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

    public float getCost() {
        return cost;
    }

    public void setCost(float cost) {
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

    public float getTotalCost(int quantity) {
        return this.cost * quantity;
    }
}