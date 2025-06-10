package Kendaraan;
public abstract class Kendaraan {
    protected String merek;
    protected int tahun;

    public Kendaraan(String merek, int tahun) {
        this.merek = merek;
        this.tahun = tahun;
    }

    public abstract void info();
}