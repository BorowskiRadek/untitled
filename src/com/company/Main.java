package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        RoadData roadData = new RoadData(1,0,0);


        int totalFuel = 0;
        int totalDistance = 0;


        while (roadData.getNumber() > 0) {

            System.out.println("Aby zakończyć wpisz 0");
            System.out.print("Wpisz numer trasy: ");


            int theNumber = input.nextInt();
            roadData.setNumber(theNumber);

            if (theNumber != 0) {


                System.out.print("Wpisz liczbę przejechanych kilometrów: ");
                int theDistance = input.nextInt();
                roadData.setDistance(theDistance);

                System.out.print("Wpisz spaleone paliwo: ");
                int theFuel = input.nextInt();
                roadData.setFuel(theFuel);

                double average = (double) roadData.getFuel() * 100 / roadData.getDistance();
                totalDistance = totalDistance + theDistance;
                totalFuel = totalFuel + theFuel;


                System.out.printf("Srednie spalanie z tej trasy wynosi: %.2f l/100km %n",average);

            }

            else {
                double totalAverage = (double) totalFuel * 100 / (double) totalDistance;
                System.out.printf("Srednia ze wszystkich przejazdów: %.2f l/100 km %n",totalAverage);

            }



        }

    }
}
