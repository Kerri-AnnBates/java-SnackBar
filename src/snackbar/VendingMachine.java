package snackbar;

public class VendingMachine {
    private static int maxid = 0;
    private int id;
    private String name;

    public VendingMachine(String name) {
        this.name = name;
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
}