package Computer;

import java.util.Scanner;


public class Computer {
    static public void main(String[] args) {


          //  Hdd hdd = new Hdd();
          //  Motherboard motherboard = new Motherboard();
           // VideoCard videoCard = new VideoCard();
            Accessories accessories = new Accessories();

       //    motherboard.MotherBoard();
         //   hdd.Hdd();
          //  videoCard.VideoCard();

       // System.out.println();


        //motherboard.MotherBoard1 = "  MSI Z370G ";
        //hdd.HddName1 = "Hdd segat 1Tb";
       // videoCard.VideoCard1 = " msi 1060 3gb ";

      //  System.out.print(" Жесткий диск - Hdd segat 1Tb" + "Видео карта -  msi 1060 3gb" + " материнская плата -  MSI Z370G "
        //);


        Scanner Scan = new Scanner(System.in);
        String startComputer = "START";
        System.out.println("для запуска компьютера введите START :  ");
        startComputer = Scan.findInLine(startComputer);
        if (startComputer == "") {
            System.out.println("команда не коректна");
        } else if (startComputer == "start");
        {
           System.out.println("компьютер запустился");
           System.out.println();
           accessories.assembly();
       }
    }
}

