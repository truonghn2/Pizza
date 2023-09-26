/*
 *Patron
 *
 *This program is the definition for a Patron object representing a customer placing a pizza order
 *Heather Truong
 *4/3/23
 *CMSC 255 Section C90
 */
package Project06;

import java.util.ArrayList;

public class Patron {
    //the instance variables that define a patron
    private String firstName;
    private String lastName;
    private String phone;
    private String email;
    private ArrayList<Pizza> pizzas;

    //parameterized constructor that initializes all instance variables and create an empty array list in the pizzas attribute
    public Patron(String aFirstName, String aLastName, String aPhone, String anEmail) {
        firstName = aFirstName;
        lastName = aLastName;
        phone = aPhone;
        email = anEmail;
        pizzas = new ArrayList<>();
    }
    //default constructor that will place an empty String into each of the String instance variables and will also create an empty array list in the pizzas attribute
    public Patron() {
        firstName = "";
        lastName = "";
        phone = "";
        email = "";
        pizzas = new ArrayList<>();
    }

    //getter and setters for String instance variables
    public String getFirstName() {
        return firstName;
    }
    public void setFirstName(String aFirstName) {
        firstName = aFirstName;
    }
    public String getLastName() {
        return lastName;
    }
    public void setLastName(String aLastName) {
        lastName = aLastName;
    }
    public String getPhone() {
        return phone;
    }
    public void setPhone(String aPhone) {
        phone = aPhone;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String anEmail) {
        email = anEmail;
    }

    //addPizza() method that will add a Pizza object to the Patron object's ArrayList called pizzas
    public void addPizza(Pizza aPizza) {
        pizzas.add(aPizza);
    }

    //getNumPizzas() that will let you know how many Pizza objects are associated with a Patron object or are in the ArrayList for that patron
    public int getNumPizzas() {
        return pizzas.size();
    }

    //getPizzas() method that will return the ArrayList of Pizza objects associated with the Patron object
    public ArrayList<Pizza> getPizzas() {
        return pizzas;
    }

    //toString() method to output the patron information, separated by newlines, along with the pizzas associated with it
    public String toString() {
        String pizzaString = "";
        for (Pizza pizza : pizzas) {
            pizzaString += pizza.toString();
        }
        return firstName + "\n" + lastName + "\n" + phone + "\n" + email + "\n" + "Pizzas:" + "\n" + pizzaString;
    }
}

