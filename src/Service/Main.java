package Service;

import Countries.Australia;
import Countries.Dubai;
import Countries.Japan;
import TravelType.*;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Lütfen gitmek istediğiniz ülkeyi seçiniz:");

        System.out.println("1- Australia\n2- Dubai\n3- Japan\n4- South Africa\n5- Sweden");
        int number =scan.nextInt();

        switch (number){
            case 1:
                System.out.println("Your choice is Australia...\nHere are some informations about the country:");
                Australia aus = new Australia("Australia", "Oceania",true, 0);
                System.out.println(aus.toString());
                System.out.println("Please choose the travel type..\n1- Plane\n2- Ship");
                int tt = scan.nextInt();
                switch (tt){
                        case 1:
                        System.out.println("Your choice is Plane...Here are some informations about travel..");
                        Plane plane = new Plane(2500,22,"Plane");
                            System.out.println(plane.toString());
                        break;

                        case 2:
                        System.out.println("Your choice is Ship...Here are some informations about travel..");
                        Ship ship = new Ship(3000,120,"Cruise Ship");
                            System.out.println(ship.toString());
                        break;
                }
                System.out.println("What do you want to do in "+aus.getCountryName()+" ?\nHere are some options:\n1-Safari\n2-Swim\n3-Surf");
                int dosmth = scan.nextInt();
                if(dosmth==1){
                    System.out.println(aus.doSafari(aus.getCountryName()));
                }else if (dosmth==2){
                    System.out.println(aus.doSwim(aus.getCountryName()));
                }else if (dosmth==3){
                    System.out.println(aus.doSurfing(aus.getCountryName()));
                }

                break;
            case 2:
                System.out.println("Your choice is Dubai...Here are some informations about the country");
                Dubai dubai = new Dubai("Dubai", "Asia",false, 3);
                System.out.println(dubai.toString());

                System.out.println("Please choose the travel type..\n1- Car\n2- Plane\n3- Ship\n4- Train");
                int no1 = scan.nextInt();
                switch (no1){
                    case 1:
                        System.out.println("Your choice is Car...Here are some informationsabout travel..");
                        Car car = new Car(4000,39,"Toyota - Land Cruiser");
                        System.out.println(car.toString());
                        break;
                    case 2:
                        System.out.println("Your choice is Plane...Here are some informationsabout travel..");
                        Plane plane = new Plane(1500,5,"Boeing-770");
                        System.out.println(plane.toString());
                        break;
                    case 3:
                        System.out.println("Your choice is Ship...Here are some informations about travel..");
                        Ship ship = new Ship(3000,200,"Cruise Ship");
                        System.out.println(ship.toString());
                        break;
                    case 4:
                        System.out.println("Your choice is Train...Here are some informations about travel..");
                        Train train = new Train(1700,150,"Train");
                        System.out.println(train.toString());
                        break;
                }
                break;
            case 3:
                System.out.println("Your choice is Japan...Here are some informations about the country");
                Japan japan = new Japan("Japan", "Asia",true, 0);
                System.out.println(japan.toString());


                System.out.println("Please choose the travel type..\n1- Car\n2- Plane\n3- Ship\n4- Train");
                int no2 = scan.nextInt();
                switch (no2){
                    case 1:
                        System.out.println("Your choice is Car...Here are some informationsabout travel..");
                        Car car = new Car(4000,39,"Toyota - Land Cruiser");
                        System.out.println(car.toString());
                        break;
                    case 2:
                        System.out.println("Your choice is Plane...Here are some informationsabout travel..");
                        Plane plane = new Plane(1500,5,"Boeing-770");
                        System.out.println(plane.toString());
                        break;
                    case 3:
                        System.out.println("Your choice is Ship...Here are some informations about travel..");
                        Ship ship = new Ship(3000,200,"Cruise Ship");
                        System.out.println(ship.toString());
                        break;
                    case 4:
                        System.out.println("Your choice is Train...Here are some informations about travel..");
                        Train train = new Train(1700,150,"Train");
                        System.out.println(train.toString());
                        break;
                }
                break;
        }

    }
}
