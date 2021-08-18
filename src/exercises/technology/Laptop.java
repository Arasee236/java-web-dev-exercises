package exercises.technology;

public class Laptop extends Computer {

    private double weight;

    public Laptop(int aRam,int aStorage, double aScreenSize,double aWeight){
        super(aRam,aStorage,aScreenSize);
        this.weight = aWeight;
    }

    public boolean isHeavy(){
        if (weight > 5.0){
            return true;
        }
        else {
            return false;
        }
    }
}
