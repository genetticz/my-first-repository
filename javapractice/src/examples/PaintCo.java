package examples;

import java.util.Scanner;

public class PaintCo {

    /*You are writing a program for a Painting Company to provide an estimate for a job.
    The company has determined that one gallon of paint and 7 hours of labor are
    necessary for every 100 square feet of wall space. The price for labor is $36.00 per
    hour.*/

    /*Your program should begin by calling a void method that displays a welcome message
    to the screen.*/
    public PaintCo() {

        System.out.println("Welcome to B2001's company");
    }

    public static void main(String[] args) {

        PaintCo paintObj = new PaintCo();

        Scanner p1 = new Scanner(System.in);

        System.out.println("Please enter price per gallon");

        double pricePerGallon = p1.nextDouble();

        System.out.println("Please enter the amount of square feet that'll be painted");
        int squareFeet = p1.nextInt();

        /*System.out.println("The values of price per gallon is " +
                pricePerGallon +". The value of the Square feet is " + squareFeet);*/

//        paintObj.hours(squareFeet);
        double finalCost = paintObj.totalCost(squareFeet,pricePerGallon);

        System.out.println("The total cost for the job is $" + finalCost);
    }

    /*The number of gallons of paint required*/
    public int gallonsRequired(int x){

        return x/100;
    }

    public int hours(int q){

        // square feet divided by 100 and then multiply that by 7
        return (q/100) * 7;
    }

    public double costOfPaint(double pricePerGallon, int squareFeet){

        return gallonsRequired(squareFeet) * pricePerGallon;
    }

    public double costOfLabor(int squareFeet){

        return hours(squareFeet) * 36;
    }

    public double totalCost(int squareFeet, double pricePerGallon){

        return costOfLabor(squareFeet) + costOfPaint(pricePerGallon,squareFeet);
    }
}
