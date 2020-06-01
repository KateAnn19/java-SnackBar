package snackBar;

public class VendingMachine {

    // Vending machine has fields (so knows)
    // maxId - keep track of last used vending machine id
    public static int maxId = 0;

    // id - automatically generated field
    private int id;

    // name
    private String name; 
    
   //constructor 
    public VendingMachine(String name){
        maxId++;
        id = maxId; 
        this.name = name; 
    }
    
     // Vending Machine has methods (so can)
     // get id
     public int getId(){
         return id; 
     }
     public String getName(){
         return name; 
     }
    // set name
    public void setName(String name){
        this.name = name;
    }
    public void printFields(){
        System.out.println("*** Vending Machine Class Fields");
        System.out.println("FIELDS name" + this.name);
        System.out.println("FIELDS id" + this.id);
    }
}