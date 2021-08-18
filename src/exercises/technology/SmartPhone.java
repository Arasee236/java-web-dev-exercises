package exercises.technology;

public class SmartPhone extends Computer{
    private int numberOfPhotos;

    public SmartPhone(int aRam,int aStorage,double aScreenSize,int aNumberOfPhotos){
        super(aRam,aStorage,aScreenSize);
        this.numberOfPhotos = aNumberOfPhotos;
    }
    public void takePhoto() {
        this.numberOfPhotos += 1;
    }
    public int getNumberOfPhotos() {
        return this.numberOfPhotos;
    }
}
