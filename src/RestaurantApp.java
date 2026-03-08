public class Main {

    private String name;
    private double price;

    public RestaurantItem(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Price: Rp " + price);
    }
}
