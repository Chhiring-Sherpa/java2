package Package2;

public class Main_Package2 {
    public static void main(String[] args) {
    Fruit_Veg_Implement A1= new Fruit_Veg_Implement();// instantiating implement class , cannot instantiate interface class
        String name="potato";  // you can check it my using
    boolean Value = A1.isFruit(name); //execution of first method
        try{
            if (Value){  //if value is true
                Fruit_Veg_Implement.tasteDetails();  // execution of static method using class name
            }
            else{  // else check if that belongs to vegetable
                boolean value1=A1.isVeg(name);   //non-static method
                if(value1){
                    Fruit_Veg_Implement.tasteDetails1(); // if yes execute this static method
                }
                else{
                    System.out.println("Invalid name");  // if not print this method
                }
            }
        }
        catch (Exception e){ // catch any exception
            System.out.println("error:");
            System.out.println(e.getMessage());
        }
    A1.Details();  // execute this outside the try catch block

    }
}
