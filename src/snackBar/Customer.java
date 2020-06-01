package snackBar;

public class Customer {

    // Customer has fields (so knows)\
    // maxId - keep track of last used customer id
    private static int maxId = 0;

    // id - automatically generated field
    private int id;
    // name
    private String name;
    // cash on hand
    private double cashOnHand;

    // Customer has methods (so can)
    //constructor initializes the fields
    public Customer(String name, double cashOnHand){
        maxId++;
        id = maxId;
        this.name = name;
        this.cashOnHand = cashOnHand;
    }
    //getters
    // get id
    public int getId(){
        return id; 
    }

    //get name 
    public String getName(){
        return name;
    }

    //get cash on hand 
    public double getCash(){
        return cashOnHand;
    }

    //setters 
    //set name
    public void setName(String name){
        this.name = name; 
    }
   
    // add cash to cash on hand
    public void addCash(double cash){
        this.cashOnHand += cash; 
    }
   
    // buy snacks. Given the total cost of the snacks to be purchased, reduce the cash on hand by that amount
    public double buySnacks(double total){
        if(total > this.cashOnHand){
            return 0;
        }
        return this.cashOnHand -= total; 
    }
    public void printFields(){
        System.out.println("*** Customer Class Fields");
        System.out.println("FIELDS name" + this.name);
        System.out.println("FIELDS cash on hand" + this.cashOnHand);
        System.out.println("FIELDS id" + this.id);
    }

}