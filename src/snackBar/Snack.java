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

    // constructor function
    public Snack(String name, int quantity, double cost, int vendMachId) {
        maxId++;
        id = maxId;
        this.name = name;
        this.quantity = quantity;
        this.cost = cost;
        this.vendMachId = vendMachId;
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
        System.out.println("*** Snack Class Fields");
        System.out.println("FIELDS name" + this.name);
        System.out.println("FIELDS quantity" + this.quantity);
        System.out.println("FIELDS id" + this.id);
        System.out.println("FIELDS vending machine id" + this.vendMachId);
        System.out.println("FIELDS cost" + this.cost);
    }

}