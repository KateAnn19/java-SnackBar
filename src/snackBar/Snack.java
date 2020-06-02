package snackBar;

public class Snack {
    // initialize variables
    // private makes the variable only available within the instance, by its' own
    // methods
    // static keeps it from being reset when the class is called

    private static int maxId = 0;
    private int id;
    private String name;
    private int quantity;
    private double cost;
    private int vendMachId;
    private String vendMachName;

    // constructor function
    public Snack(String name, int quantity, double cost, int vendMachId, String vendMachName) {
        maxId++;
        id = maxId;
        this.name = name;
        this.quantity = quantity;
        this.cost = cost;
        this.vendMachId = vendMachId;
        this.vendMachName = vendMachName;
    }
     //getters
    // get id
    public int getId(){
        return id; 
    }
    // get name
    public String getName(){
        return name; 
    }
    //get cost
    public double getCost(){
        return cost;
    }
    
    //get Vend Mach Id
    public int getVendMachId(){
        return vendMachId;
    }
    // get quantity
    public int getQuantity(){
        return quantity; 
    }
    
    //setters
    //set name
    public void setName(String name){
        this.name = name;
    }
    //set cost 
    public void setCost(double cost){
        this.cost = cost;
    }
    //set vend mach id
    public void setVendMachId(int vendMachId){
        this.vendMachId = vendMachId; 
    }
    // add quantity when given how many to add
    public void addQuantity(int value){
        this.quantity += value; 
    }

    // buy snack when given how many to buy
    public int buySnack(int value){
        if(value > this.quantity){
            return 0;
        }
        this.quantity -= value;
        return this.quantity; 
    }
    // get total cost given a quantity
    public double getTotalCost(int value){
        if(value > this.quantity){
            return 0;
        }
        return this.cost * value; 
    }

    public void printFields(){
        System.out.println("Snack: " + this.getName());
        //System.out.println("Name not in function: " + this.name);
        //System.out.println("Quantity not in function: " + this.quantity);
        System.out.println("Quantity: " + this.getQuantity());
        //System.out.println("Id not in function: " + this.id);
        //System.out.println("Id " + this.getId());
        System.out.println("Cost: " + "$" + this.getCost());
        //System.out.println("Cost: " + this.cost);
        System.out.println("Total cost: " + "$" + this.getTotalCost(this.getQuantity()));
        System.out.println("Vending Machine Name: " + this.vendMachName);
    }

    

}