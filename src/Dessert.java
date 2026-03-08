// class Dessert mewarisi class Main
public class Dessert extends Main {

    // atribut tambahan dessert
    private boolean cold; // apakah dessert dingin

    // constructor
    public Dessert(String name, double price, boolean cold) {

        // memanggil constructor superclass
        super(name, price);

        // mengisi atribut cold
        this.cold = cold;
    }

    // override method displayInfo
    @Override
    public void displayInfo() {

        System.out.println("Dessert Menu"); // jenis menu
        System.out.println("Name: " + name); // nama dessert
        System.out.println("Price: Rp " + price); // harga
        System.out.println("Cold Dessert: " + cold); // apakah dingin
        System.out.println(); // baris kosong
    }
}