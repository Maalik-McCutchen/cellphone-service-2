package com.pluralsight;

import java.util.Scanner;

public class CellPhoneApplication2 {
    public static void main(String[] args) {

        CellPhone2 cellPhone1 = new CellPhone2();

        CellPhone2 cellPhone2 = new CellPhone2();


        Scanner scanner = new Scanner(System.in);


        System.out.print("What is the serial number? ");
        int serialNumber = scanner.nextInt();
        cellPhone1.setSerialNumber(serialNumber);
        scanner.nextLine();

        System.out.print("What model is the phone? ");
        String model = scanner.nextLine();
        cellPhone1.setModel(model);

        System.out.print("Who is the carrier? ");
        String carrier = scanner.nextLine();
        cellPhone1.setCarrier(carrier);

        System.out.print("What is the phone number? ");
        String phoneNumber = scanner.nextLine();
        cellPhone1.setPhoneNumber(phoneNumber);

        System.out.print("Who is the owner of the phone? ");
        String owner = scanner.nextLine();
        cellPhone1.setOwner(owner);


        System.out.print("What is the serial number? ");
        int serialNumber2 = scanner.nextInt();
        cellPhone2.setSerialNumber(serialNumber2);
        scanner.nextLine();

        System.out.print("What model is the phone? ");
        String model2 = scanner.nextLine();
        cellPhone2.setModel(model2);

        System.out.print("Who is the carrier? ");
        String carrier2 = scanner.nextLine();
        cellPhone2.setCarrier(carrier2);

        System.out.print("What is the phone number? ");
        String phoneNumber2 = scanner.nextLine();
        cellPhone2.setPhoneNumber(phoneNumber2);

        System.out.print("Who is the owner of the phone? ");
        String owner2 = scanner.nextLine();
        cellPhone2.setOwner(owner2);



        scanner.close();


        System.out.println("\nCellPhone Details:");
        System.out.println("Serial Number: " + cellPhone1.getSerialNumber());
        System.out.println("Model: " + cellPhone1.getModel());
        System.out.println("Carrier: " + cellPhone1.getCarrier());
        System.out.println("Phone Number: " + cellPhone1.getPhoneNumber());
        System.out.println("Owner: " + cellPhone1.getOwner());


    }

}

public static void display(CellPhone2 phone){


}

