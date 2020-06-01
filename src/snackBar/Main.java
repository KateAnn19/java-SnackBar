package snackBar;

public class Main {
    private static void workWithData() {
        // String name, double cashOnHand
        // Customer 1 cash on hand 37.75
        Customer c_Jane = new Customer("Janey-girl", 45.25);
        Customer c_Babby = new Customer("Babby-boy", 33.14);

        VendingMachine v_food = new VendingMachine("food");
        VendingMachine v_drink = new VendingMachine("drink");
        VendingMachine v_office = new VendingMachine("office");

        // String name, int quantity, double cost, int vendMachId
        Snack s_one = new Snack("Chips", 36, 1.75, v_food.getId());
        Snack s_two = new Snack("Chocolate Bar", 36, 1.00, v_food.getId());
        Snack s_three = new Snack("Pretzel", 30, 2.00, v_food.getId());
        Snack s_four = new Snack("Soda", 24, 2.50, v_drink.getId());
        Snack s_five = new Snack("Water", 20, 2.75, v_drink.getId());

        // Processing
        
        // Customer 1 (Jane) buys 3 of snack 4 (Soda).  
        s_four.buySnack(3);
        double total = s_four.getTotalCost(3);
        c_Jane.buySnacks(total);

        // Print Customer 1 (Jane) Cash on hand.
        // Print quantity of snack 4 (Soda).
        System.out.println(c_Jane.getCash());
        System.out.println(s_four.getQuantity());

        
        // Customer 1 (Jane) buys 1 of snack 3 (Pretzel).
        // Print Customer 1 (Jane) Cash on hand.
        // Print quantity of snack 3 (Pretzel).


        // Customer 2 (Bob) buys 2 of snack 4 (Soda).
        // Print Customer 2 (Bob) Cash on Hand.
        // Print quantity of snack 4 (Soda).


        // Customer 1 (Jane) finds $10.
        // Print Customer 1 (Jane) Cash on Hand.


        // Customer 1 (Jane) buys 1 of snack 2 (Chocolate Bar).
        // Print Customer 1 (Jane) Cash on Hand.
        // Print quantity of snack 2 (Chocolate Bar).

        // Add 12 more items to snack 3 (Pretzel).
        // Print quantity of snack 3 (Pretzel).

        // Customer 2 (Bob) buys 3 of snack 3 (Pretzel).
        // Print Customer 2 (Bob) Cash on hand.
        // Print quantity of snack 3 (Pretzel).


        // Stretch Goals

        // Display each snack with
        // Name
        // Vending Machine Name
        // Quantity on hand
        // Total cost of all of the quantities of this snack on hand


        // Format all dollar amount like $1,234.56
        // Starts with a dollar sign
        // comma separating group of 3 numbers
        // rounded to the nearest cents, hundredths place
    }

    public static void main(String[] args) {
        workWithData();
    }
}