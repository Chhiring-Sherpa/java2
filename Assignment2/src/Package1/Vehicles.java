package Package1;

public class Vehicles {  //super class Vehicles
    public String Brand;  // public variable
    private String VehiclesType="all";  // private variable
    public String Color;
    protected int Speed;  // protected variable that can only be access within the same package
    public void setBrand(){ // setter for the brand: just for example
        this.Brand=Brand;
    }
    public String getBrand(){   // getter for the brand: just for the example
        return Brand;
    }
    public Vehicles (String Brand, int Speed, String Color){  //constructor with parameter
        this.Brand=Brand;
        this.Speed=Speed;
        this.Color= Color;
    }
    Vehicles (){  // default constructor
    }
    public static void vehiclesTypes(){   // static method that does not require class instantiation to call;
        System.out.println("Vehicles Type are:\" Car, Truck, Van, Jeep, SuperCar\"");
    }

    public int Speed(int x){  // non-static method that require class instantiation
        System.out.println("The average Speed of a vehicles is "+ x); // this function return the parameter it takes
        return x;
    }

    public void  Engine(String y){  //  a method that will print the engine power
        System.out.println("Engine Power of the Vehicle is :" + y);
    }

}
