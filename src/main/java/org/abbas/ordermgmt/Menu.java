package org.abbas.ordermgmt;
public class Menu {

    private Item pizza;
    private  Item burger;
    private Item  fries;
    private Item coldDrinks;


    public Menu(Item pizza, Item burger, Item fries, Item coldDrinks) {
        this.pizza = pizza;
        this.burger = burger;
        this.fries = fries;
        this.coldDrinks = coldDrinks;
    }

    public Item getPizza() {
        return pizza;
    }
    public void setPizza(Item pizza) {
        this.pizza = pizza;
    }
    public Item getBurger() {
        return burger;
    }
    public void setBurger(Item burger) {
        this.burger = burger;
    }
    public Item getFries() {
        return fries;
    }
    public void setFries(Item fries) {
        this.fries = fries;
    }
    public Item getColdDrinks() {
        return coldDrinks;
    }
    public void setColdDrinks(Item coldDrinks) {
        this.coldDrinks = coldDrinks;
    }

  public void showMenu(){
      System.out.println("Menu Item:  \n" + getPizza()+"\n"+getBurger()+"\n"+getFries()+"\n"+ getColdDrinks());
  }
}
