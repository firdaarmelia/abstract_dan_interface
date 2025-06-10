package Kendaraan;
public class Mobil extends Kendaraan implements Mesin {
    public Mobil(String merek, int tahun) {
        super(merek, tahun);
    }

    public void info() {
        System.out.println("Mobil: " + merek + ", Tahun: " + tahun);
    }

    public void start() {
        System.out.println("Mesin mobil dinyalakan...");
    }

    public void stop() {
        System.out.println("Mesin mobil dimatikan.");
    }
}