package Package1;
public class Cars extends Vehicles{  // child class car that extend to super class vehicles
    static String Mode="Manual";  // a static variable that is called only in static method
    String model;
    Cars ( String Brand, int Speed, String Color, String model){ //using the costume constructor from the super with some more added parameter
        super(Brand, Speed, Color);
        this.model=model;
    }
    static void DrivingMode(){  // A static method that does not return anything but just print msg and use a static variable
        System.out.println("Driving Mode of this Vehicles is "+Mode);
    }
    @Override   // overwritten method from the super class
    public int Speed(int x){
        try {
            int b = 12;//
            System.out.println("Speed of the " + model + " is " + x + " Miles/Hour");
            return x / b;
        }
        catch (ArithmeticException e){   // can throw arithmetic exception
            System.out.println("error is :");
            System.out.println(e.getMessage());
            return 0; // return default 0 if exception
        }
    }


    @Override   // another overwritten method
    public  void Engine(String y){
        System.out.println("Engine Power of this"+model+" is :" + y);

    }


     void CarsDetails(){   // a method to give car detail bto does not return anything
        System.out.println("Brand: "+Brand);
        System.out.println("Speed: "+Speed+" Miles/Hour");
        System.out.println("Color: "+Color);
         System.out.println("Model: "+model);
     }

}
