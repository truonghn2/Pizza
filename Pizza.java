/*
 *Pizza
 *
 *This program is the definition for a Pizza object
 *Heather Truong
 *4/3/23
 *CMSC 255 Section C90
 */
package Project06;

public class Pizza {
    //characteristics that define a pizza. private enum types
    private Size size;
    private Crust crust;
    private Sauce sauce;
    private MeatTopping meatTopping;
    private VeggieTopping veggieTopping;


    //parameterized constructor. will pass in all pizza properties and initialize the instance variables with them
    public Pizza(Size aSize, Crust aCrust, Sauce aSauce, MeatTopping aMeatTopping, VeggieTopping aVeggieTopping) {
        size = aSize;
        crust = aCrust;
        sauce = aSauce;
        meatTopping = aMeatTopping;
        veggieTopping = aVeggieTopping;
    }
    //default constructor. will assign the default values for all characteristics of the pizza
    public Pizza() {
        size = Size.SMALL;
        crust = Crust.HAND_TOSSED;
        sauce = Sauce.MARINARA;
        meatTopping = MeatTopping.none;
        veggieTopping = VeggieTopping.none;
    }

    //getter and setters for each instance variable
    public Size getSize() {
        return size;
    }
    public void setSize(Size aSize) {
        size = aSize;
    }
    public Crust getCrust() {
        return crust;
    }
    public void setCrust(Crust aCrust) {
        crust = aCrust;
    }
    public Sauce getSauce() {
        return sauce;
    }
    public void setSauce(Sauce aSauce) {
        sauce = aSauce;
    }
    public MeatTopping getMeatTopping() {
        return meatTopping;
    }
    public void setMeatTopping(MeatTopping aMeatTopping) {
        meatTopping = aMeatTopping;
    }
    public VeggieTopping getVeggieTopping() {
        return veggieTopping;
    }
    public void setVeggieTopping(VeggieTopping aVeggieTopping) {
        veggieTopping = aVeggieTopping;
    }
    //toString() method that prints each characteristic of the Pizza object indented by a tab on its own line
    public String toString() {
        return "\n" + "\t" + size + "\n" + "\t" + crust + "\n" + "\t" + sauce + "\n" + "\t" + meatTopping + "\n" + "\t" + veggieTopping + "\n";
    }


}
