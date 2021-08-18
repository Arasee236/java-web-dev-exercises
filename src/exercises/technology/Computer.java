package exercises.technology;

public class Computer {

    private int ram;
    private int storage;
    private double screenSize;

    public Computer(int aRam, int aStrorage, double aScreenSize){
        super();
        this.ram = aRam;
        this.storage = aStrorage;
        this.screenSize = aScreenSize;
    }

    public void increaseRam(int n){
        this.ram = this.ram + n;
    }

    public void increaseStorage(int a){
        this.storage = this.storage + a;
    }
}
