package Package1;

public class Main_Package1 {
    public static void main(String[] args) {
        Cars cr= new Cars("BMW", 180, "Red", "BMW M3");  // setting the values for the parameters using constructor
        Vehicles vc= new Vehicles();


        try {
            System.out.println(cr.Brand);  // printing the brand of the car// instantiating super class
            Cars.vehiclesTypes();  // calling the static method of super class with child class name;
            int a=vc.Speed(23);  // calling the overwritten function  and storing the return value with both class obj
            int b = cr.Speed(120);
            int d=0;
            int c=a/d;  // code after the exception of a try block will not be executed
            System.out.println(c);
            if(a<b){
                System.out.println("Speed of bmw is more than average vehicles");
            }
        }
        catch (Exception e){  // this block will print msg for the occured exception
            System.out.println(" we failed to execute, reason: ");
            System.out.println(e.getMessage());
        }
        finally { // this code will be executed.
            System.out.println("execution of more code that is in finally");
        //vr.CarsDetails(); we can access the super class methods from child class but we cannot do vice-versa
        Cars.DrivingMode();
        cr.CarsDetails();  //
        }

    }


}
