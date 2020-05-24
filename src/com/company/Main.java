package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        RoadData roadData = new RoadData(1,0,0);

        while (roadData.getNumber() > 0) {


            int totalFuel = 0;
            int totalDistance = 0;
            double totalAverage = 0;
            double average = 0;

            System.out.println("Aby zakończyć wpisz 0");
            System.out.println("Wpisz numer trasy: ");
            int theNumber = input.nextInt();
            if (theNumber != -1) {


                roadData.setNumber(theNumber);

                System.out.println("Wpisz liczbę przejechanych kilometrów ");
                int theDistance = input.nextInt();
                roadData.setDistance(theDistance);

                System.out.println("Wpisz spaleone paliwo: ");
                int theFuel = input.nextInt();
                roadData.setFuel(theFuel);

                average = roadData.getFuel() * 100 / roadData.getDistance();
                totalDistance = totalDistance + roadData.getDistance();
                totalFuel = totalFuel + roadData.getFuel();


                System.out.printf("Srednie spalanie z tej trasy wynosi: %s%n", average);

            }

            /*else {

            }*/

            totalAverage = totalFuel * 100 / totalDistance;
            System.out.printf("Srednia ze wszystkich przejazdów: %s%n", totalAverage);

        }

    }
}
