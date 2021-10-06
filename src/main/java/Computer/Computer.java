package Computer;

public class Computer {
    static public void main(String[]args){
        Hdd hdd = new Hdd();
        Motherboard motherboard = new Motherboard();
        VideoCard videoCard = new VideoCard();

        motherboard.MotherBoard();
        hdd.Hdd();
        videoCard.VideoCard();

        motherboard.MotherBoard = "  MSI Z370G ";
        hdd.HddName = "Hdd segat 1Tb";
        videoCard.VideoCard = " msi 1060 3gb ";

        System.out.print(" Жесткий диск - Hdd segat 1Tb" +
                          "Видео карта -  msi 1060 3gb" + " материнская плата -  MSI Z370G "
        );




    }
}



