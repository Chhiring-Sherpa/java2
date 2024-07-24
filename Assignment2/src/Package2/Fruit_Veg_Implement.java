package Package2;
public class Fruit_Veg_Implement implements Fruits_Veg {
    String[] FruitList = {"Apple", "Mango", "Banana", "Grapes"};
    String[] VegList={"Potato", "Cabbage", "Mushroom"};

    @Override // overwritten method from interface class
    public boolean isFruit(String name) {  // function to check if the given name is fruit name or not
        // Check if name exists in FruitList
        // unaproppriate to use try and catch block
        for (String fruit : FruitList) {
            if (fruit.equalsIgnoreCase(name)) { // if it belongs to fruit
                System.out.println("Yes, "+name+" is a Fruit");  // print this
                return true;// adn return true
            }
        }
        return false;// Return false if name is not found
    }

    public static void tasteDetails() {// a static method and void that does not return anything

        System.out.println("Most of the fruits are sweet in taste.");

    }
    public static void tasteDetails1() {// a static method and void that does not return anything

        System.out.println("Most of the Vegetables are rich in Vitamin 'D'.");

    }

    public boolean isVeg(String name){   // to check if the given name is in  vegList or not
        for (String veg : VegList) {
            if (veg.equalsIgnoreCase(name)) {
                System.out.println("Yes, "+name+" is a Vegetable");
                return true;
            }
        }
        return false;
    }

    public void Details(){} // a method does not require to use
}

