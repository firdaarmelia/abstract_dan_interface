package Kendaraan;
public class Motor extends Kendaraan implements Mesin {
    public Motor(String merek, int tahun) {
        super(merek, tahun);
    }

    public void info() {
        System.out.println("Motor: " + merek + ", Tahun: " + tahun);
    }

    public void start() {
        System.out.println("Mesin motor dinyalakan...");
    }

    public void stop() {
        System.out.println("Mesin motor dimatikan.");
    }
}