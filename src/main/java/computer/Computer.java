package computer;

import java.util.Scanner;


public class Computer {

    private Accessories accessories;

    public Computer(Accessories accessories) {
        this.accessories = accessories;
    }
    public void start(){
        Scanner Scan = new Scanner(System.in);
        String startComputer = "START";
        System.out.println("для запуска компьютера введите START :  ");
        startComputer = Scan.findInLine(startComputer);
        if (startComputer != "start") {
            System.out.println("команда не коректна");
        } else if (startComputer == "start"){
            System.out.println("компьютер запустился");
            System.out.println();
            accessories.assembly();

        }
    }
}
