package com_box.practice100;

import java.util.Scanner;

public class TempDegreeConvertor {

    // convert F to Degree Cel.
     void converter(float temperature) {
        temperature =  ((temperature - 32) * 5) / 9;
        System.out.println(" Degree is "+temperature);
    }

void converter (double a){
    a =  ((a * 9 / 5) + 32);   //°F = (°C × 9/5) + 32
    System.out.println("Feranith is " +a);
}


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the Temp");
        float temperature = sc.nextFloat();
        double a =temperature;

        TempDegreeConvertor te = new TempDegreeConvertor();
        te.converter(a);
        te.converter(temperature);



    }
}
