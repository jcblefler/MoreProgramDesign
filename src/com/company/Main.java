package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        //Measurement Loop

        //Input
        //  Prompt user for measurement

        //Process
        // inputCount = 1
        // DOWHILE inputCount <= 15
        //      Add 25.4 to each measurement to convert to millimeters
        //      Display milliMeasurement
        //      Add 1 to inputCount
        //ENDDO
        //IF (inputCount > 15)
        //      Display "All measurements processed"

        //Output
        //  Display "All measurements processed"


        Scanner scanner = new Scanner(System.in);
        double measurement;
        int inputCount = 1;
        double milliMeasurement;


        while (inputCount <= 15) {
            System.out.print("Input a measurement in inches: ");
            measurement = scanner.nextDouble();
            milliMeasurement = measurement * 25.4;
            System.out.println("Measurement " + inputCount + ": " + milliMeasurement + " millimeters");
            inputCount++;
        }
        if (inputCount > 15){
            System.out.println("All measurements processed");
        }

    }
}
