// superclass untuk semua item menu restoran
public class Main {

    // atribut dasar yang dimiliki semua menu
    protected String name;   // menyimpan nama menu
    protected double price;  // menyimpan harga menu

    // constructor untuk mengisi nama dan harga
    public Main(String name, double price) {
        this.name = name;     // mengisi atribut name
        this.price = price;   // mengisi atribut price
    }

    // method untuk menampilkan informasi menu
    public void displayInfo() {
        System.out.println("Name: " + name);     // menampilkan nama menu
        System.out.println("Price: Rp " + price); // menampilkan harga
    }
}