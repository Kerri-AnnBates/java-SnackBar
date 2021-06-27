package snackbar;

public class Snack {
    private int maxid;
    private int id;
    private String name;
    private int quantity;
    private float cost;
    private int vendingmachineid;

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public float getCost() {
        return cost;
    }

    public int getVendingMachineId() {
        return vendingmachineid;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCost(float cost) {
        this.cost = cost;
    }

    public void setVendingMachineId(int vendingmachineid) {
        this.vendingmachineid = vendingmachineid;
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