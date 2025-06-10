package Kendaraan;
public class KendaraanMain {
    public static void main(String[] args) {
        Mobil mobil = new Mobil("Toyota Avanza", 2020);
        Motor motor = new Motor("Honda Beat", 2022);

        System.out.println("== DATA KENDARAAN ==");
        mobil.info();
        mobil.start();
        mobil.stop();

        System.out.println();

        motor.info();
        motor.start();
        motor.stop();
    }
}