/*
 *PatronPizzaTest
 *
 *This program tests Patron and Pizza classes
 *Heather Truong
 *4/3/23
 *CMSC 255 Section C90
 */

package Project06;

public class PatronPizzaTest {
    public static void main(String[] args) {
        //new pizza objects
        Pizza pizza1 = new Pizza();
        Pizza pizza2 = new Pizza(Size.LARGE, Crust.THICK, Sauce.MARINARA, MeatTopping.SAUSAGE, VeggieTopping.MUSHROOMS);
        Pizza pizza3 = new Pizza(Size.LARGE, Crust.THICK, Sauce.MARINARA, MeatTopping.PEPPERONI, VeggieTopping.PINEAPPLE);

        //new patron objects
        Patron patron1 = new Patron("Heather", "Truong", "571-282-7203", "heath9r@gmail.com");
        Patron patron2 = new Patron("Claire", "Sparks", "555-222-1111", "zwhitten@vcu.edu");

        //add a pizza to the patron's pizzas
        patron1.addPizza(pizza2);
        patron1.addPizza(pizza1);

        patron2.addPizza(pizza3);

        //get pizzas
        patron1.getPizzas();
        patron2.getPizzas();

        //output patron and pizza info
        String output1 = patron1.toString();
        System.out.println(output1);


        String output2 = patron2.toString();
        System.out.println(output2);

    }
}
