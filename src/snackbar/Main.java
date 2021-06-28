package snackbar;

public class Main {
    public static void main(String[] args) {

        // Customers
        Customer jane = new Customer("Jane", 45.25);
        Customer bob = new Customer("Bob", 33.14);

        // Vending Machines
        VendingMachine food = new VendingMachine("Food");
        VendingMachine drink = new VendingMachine("Drink");
        VendingMachine office = new VendingMachine("Office");

        // Snacks
        Snack chips = new Snack("Chips", 36, 1.75, food.getId());
        Snack chocolate = new Snack("Chocolate Bar", 36, 1, food.getId());
        Snack pretzel = new Snack("Pretzel", 30, 2, food.getId());
        Snack soda = new Snack("Soda", 24, 2.50, drink.getId());
        Snack water = new Snack("Water", 20, 2.75, drink.getId());

        Snack[] snacks = { chips, chocolate, pretzel, soda, water };

        jane.buySnacks(soda.getCost() * 3);
        soda.buySnack(3);

        System.out.println("Jane's cash on hand is " + jane.getCash()); // 37.75
        System.out.println("Quantity of soda is " + soda.getQuantity()); // 21

        jane.buySnacks(pretzel.getCost());
        pretzel.buySnack(1);

        System.out.println("Jane's cash on hand is " + jane.getCash()); // 35.75
        System.out.println("Quantity of pretzels is " + pretzel.getQuantity()); // 29

        bob.buySnacks(soda.getCost() * 2);
        soda.buySnack(2);

        System.out.println("Bob's cash on hand is " + bob.getCash()); // 28.14
        System.out.println("Quantity of soda is " + soda.getQuantity()); // 19

        // Jane finds $10.00 and add's it to her cash on hand
        jane.addCash(10);
        System.out.println("Jane's cash on hand is " + jane.getCash()); // 45.75

        jane.buySnacks(chocolate.getCost());
        chocolate.buySnack(1);
        System.out.println("Jane's cash on hand is " + jane.getCash()); // 44.75
        System.out.println("Quantity of chocolate is " + chocolate.getQuantity()); // 35

        pretzel.addQuantity(12);
        System.out.println("Quantity of pretzels is " + pretzel.getQuantity()); // 41

        bob.buySnacks(pretzel.getCost() * 3);
        pretzel.buySnack(3);
        System.out.println("Bob's cash on hand is " + bob.getCash()); // 22.14
        System.out.println("Quantity of soda is " + pretzel.getQuantity()); // 38
        System.out.println("-----------------------\n");
        // For each snack display the following:
        /*
         * Name Vending Machine Name Quantity on hand Total cost of all of the
         * quantities of this snack on hand
         */
        for (Snack snack : snacks) {
            System.out.println("Snack: " + snack.getName());
            // System.out.println("Vending Machine: " + snack.getVendingMachineId());
            System.out.println("Quantity: " + snack.getQuantity());
            System.out.println("Total Cost: " + (snack.getQuantity() * snack.getCost()));
            System.out.println("-----------------------\n");
        }
    }
}
