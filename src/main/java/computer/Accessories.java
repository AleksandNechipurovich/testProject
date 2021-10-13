package computer;

public class Accessories {
    private Motherboard motherboard;
    private Hdd hdd;
    private VideoCard vd;

    public Accessories(Motherboard motherboard, Hdd hdd, VideoCard vd) {
        this.motherboard = motherboard;
        this.hdd = hdd;
        this.vd = vd;
    }

    public void assembly( ){
        System.out.println(" жесткий диск - " + hdd.getHddName());
        System.out.println(" материнская карта - " + motherboard.getMotherBoard());
        System.out.println(" видео карта - " + vd.getvideoCard());
    }
}
