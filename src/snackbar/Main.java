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
        VendingMachine[] machines = { food, drink, office };

        // Customer Jane buys 3 Sodas
        jane.buySnacks(soda.getTotalCost(3));
        soda.buySnack(3);

        System.out.println("Jane's cash on hand is " + jane.getCash()); // 37.75
        System.out.println("Quantity of soda is " + soda.getQuantity()); // 21

        // Jane buys 1 Pretzel
        jane.buySnacks(pretzel.getTotalCost(1));
        pretzel.buySnack(1);

        System.out.println("Jane's cash on hand is " + jane.getCash()); // 35.75
        System.out.println("Quantity of pretzels is " + pretzel.getQuantity()); // 29

        // Bob buys 2 sodas
        bob.buySnacks(soda.getTotalCost(2));
        soda.buySnack(2);

        System.out.println("Bob's cash on hand is " + bob.getCash()); // 28.14
        System.out.println("Quantity of soda is " + soda.getQuantity()); // 19

        // Jane finds $10.00 and add's it to her cash on hand
        jane.addCash(10);
        System.out.println("Jane's cash on hand is " + jane.getCash()); // 45.75

        // Jane buys 1 chocolate bar
        jane.buySnacks(chocolate.getTotalCost(1));
        chocolate.buySnack(1);
        System.out.println("Jane's cash on hand is " + jane.getCash()); // 44.75
        System.out.println("Quantity of chocolate is " + chocolate.getQuantity()); // 35

        // Add 12 more pretzels
        pretzel.addQuantity(12);
        System.out.println("Quantity of pretzels is " + pretzel.getQuantity()); // 41

        // Bob buys 3 pretzels
        bob.buySnacks(pretzel.getTotalCost(3));
        pretzel.buySnack(3);
        System.out.println("Bob's cash on hand is " + bob.getCash()); // 22.14
        System.out.println("Quantity of soda is " + pretzel.getQuantity()); // 38
        System.out.println("-----------------------\n");

        // Stretch
        for (Snack snack : snacks) {
            String vmName = "";
            double totalCost = snack.getQuantity() * snack.getCost();

            for (VendingMachine vendingMachine : machines) {
                if (vendingMachine.getId() == snack.getVendingMachineId()) {
                    vmName = vendingMachine.getName();
                    break;
                }
            }

            System.out.println("Snack: " + snack.getName());
            System.out.println("Vending Machine: " + vmName);
            System.out.println("Quantity: " + snack.getQuantity());
            System.out.printf("Total Cost: $%,.2f\n", totalCost);
            System.out.println("-----------------------\n");
        }
    }
}