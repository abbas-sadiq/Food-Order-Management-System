package Queue;

class Order {
    private int tableNo;
    private String pizza;
    private String burger;
    private String fries;
    private String coldDrinks;

    public Order(int tableNo, String pizza, String burger, String fries, String coldDrinks) {
        this.tableNo = tableNo;
        this.pizza = pizza;
        this.burger = burger;
        this.fries = fries;
        this.coldDrinks = coldDrinks;
    }

    public int getTableNo() {
        return tableNo;
    }

    public String getPizza() {
        return pizza;
    }

    public void setPizza(String pizza) {
        this.pizza = pizza;
    }

    public String getBurger() {
        return burger;
    }

    public void setBurger(String burger) {
        this.burger = burger;
    }

    public String getFries() {
        return fries;
    }

    public void setFries(String fries) {
        this.fries = fries;
    }

    public String getColdDrinks() {
        return coldDrinks;
    }

    public void setColdDrinks(String coldDrinks) {
        this.coldDrinks = coldDrinks;
    }

    public String toString(){
        return  "Order detail {" +
                ", Pizza='" + pizza + '\'' +
                "Burger='" + burger + '\'' +

                ", Fries='" + fries + '\'' +
                ",coldDrinks='" + coldDrinks + '\''+
                '}';
    }
}


