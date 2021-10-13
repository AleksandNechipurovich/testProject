package computer;

public class Appliсation {

    public static void main(String[] args) {

        Accessories acs = new Accessories(new Motherboard(),new Hdd(),new VideoCard());
        Computer com = new Computer(acs);
        com.start();
    }

}
