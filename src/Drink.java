// class Drink mewarisi class Main
public class Drink extends Main {

    // atribut tambahan minuman
    private String size; // ukuran minuman

    // constructor
    public Drink(String name, double price, String size) {

        // memanggil constructor superclass
        super(name, price);

        // mengisi atribut size
        this.size = size;
    }

    // override method displayInfo
    @Override
    public void displayInfo() {

        System.out.println("Drink Menu"); // jenis menu
        System.out.println("Name: " + name); // nama minuman
        System.out.println("Price: Rp " + price); // harga
        System.out.println("Size: " + size); // ukuran
        System.out.println(); // baris kosong
    }
}