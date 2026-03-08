// class Food mewarisi class Main
public class Food extends Main {

    // atribut tambahan khusus makanan
    private String portion; // ukuran porsi

    // constructor
    public Food(String name, double price, String portion) {

        // memanggil constructor superclass
        super(name, price);

        // mengisi atribut portion
        this.portion = portion;
    }

    // override method displayInfo
    @Override
    public void displayInfo() {

        System.out.println("Food Menu"); // jenis menu
        System.out.println("Name: " + name); // nama makanan
        System.out.println("Price: Rp " + price); // harga makanan
        System.out.println("Portion: " + portion); // ukuran porsi
        System.out.println(); // baris kosong
    }
}