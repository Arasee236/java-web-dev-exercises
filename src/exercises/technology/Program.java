package exercises.technology;

public class Program {
    public static void main(String[] args){
        Laptop Hp = new Laptop(8,256,15.6,8);
        Hp.increaseRam(8);
        System.out.println(Hp.isHeavy());

        SmartPhone iPhone = new SmartPhone(6,512,6.7,1322);
        iPhone.takePhoto();
        System.out.println("The number of photos in iPhone is " +iPhone.getNumberOfPhotos());
    }
}
