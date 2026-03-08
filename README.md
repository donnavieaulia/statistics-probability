## Data Structure Object-Oriented Programming

Project ini merupakan implementasi dari konsep Object-Oriented Programming (OOP) dalam bahasa Java menggunakan studi kasus Restaurant Menu System.

Pada project ini terdapat main class (parent class) yaitu Main yang merepresentasikan menu restoran secara umum. Kemudian dibuat kelas turunannya (subclass) berupa:

1.Food

2.Drink

3.Dessert

Setiap subclass merepresentasikan jenis menu yang berbeda di dalam restoran.

## 4 Pilar Object-Oriented Programming


1. Encapsulation
   
Encapsulation merupakan konsep untuk membungkus data dan method dalam sebuah class sehingga data tidak dapat diakses langsung dari luar class.
Pada program ini atribut name disimpan dalam class `Main` dan digunakan oleh subclass.
```Java
  //Parent class yang merepresentasikan menu restoran secara umum
public class Main {

    //atribut menu
    protected String name;

    //constructor untuk menginisialisasi object
    public Main(String name){
        this.name = name;
    }

    //method untuk menampilkan menu
    public void displayMenu(){
        System.out.println("Menu: " + name);
    }
}

```
2.Inheritance

Inheritance adalah konsep pewarisan sifat dari class induk ke class turunan.

Pada program ini `Main` menjadi `Parent Class`, sedangkan `Food`, `Drink`, dan `Dessert` merupakan `Child Class` yang mewarisi atribut dan method dari class `Main`.
Contoh pada class Food:
```Java
//Inheritance. Child class dari Main
public class Food extends Main {

    //constructor memanggil constructor parent
    public Food(String name){
        super(name);
    }
}
```
Dengan menggunakan `extends`, class `Food` dapat menggunakan atribut name dan method dari class `Main` tanpa perlu menulis ulang kode.

3.Polymorphism

Polymorphism berarti satu method dapat memiliki banyak bentuk atau perilaku yang berbeda.
Pada program ini method `displayMenu()` didefinisikan di class `Main`.
```Java
//method umum yang dimiliki semua menu
public void displayMenu(){
    System.out.println("Menu: " + name);
}
```
Kemudian method tersebut di-override pada subclass.
Contoh pada class `Drink`:
```Java
//Polymorphism. Method diubah perilakunya untuk Drink
@Override
public void displayMenu(){
    System.out.println("Drink Menu: " + name);
}
```
Dengan demikian setiap subclass memiliki output yang berbeda sesuai dengan jenis menu.

4.Abstraction

Abstraction merupakan konsep menyembunyikan detail implementasi dan hanya menampilkan fungsi utama kepada pengguna.

Pada class utama `RestaurantApp`, program hanya memanggil method tanpa mengetahui bagaimana proses di dalam class tersebut.

```Java
public class RestaurantApp {

    public static void main(String[] args){

        Main food = new Food("Nasi Goreng");
        Main drink = new Drink("Es Teh");
        Main dessert = new Dessert("Ice Cream");

        //memanggil method dari setiap object
        food.displayMenu();
        drink.displayMenu();
        dessert.displayMenu();
    }
}

```
Dengan demikian pengguna hanya perlu memanggil method displayMenu() tanpa mengetahui bagaimana method tersebut diimplementasikan di dalam class.

## Strukdat-OOP-2026
