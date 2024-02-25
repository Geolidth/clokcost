/*
 * Sallai András, 2024-02-19
 * Copyright (c) 2024, Sallai András
 * Licenc: MIT
 * Refakotárlás: Csajbók-Reményi László, 2024-02-25
 */

import java.util.Scanner;

public class MainConsole {
    Scanner scanner;
    Koltseg koltseg;
    String deliveryPrice = "";
    String name = "";
    String quantity = "";
    Filehandler fileHandler;

    public MainConsole() {
        printHeader();
        scanner = new Scanner(System.in);
        startScans();
        initComponents();
    }

    private void printHeader() {
        System.out.println("╔═════════════════════════════════════════╗");
        System.out.printf("║%17s%25s\n", "Projekt költsége", "║");
        System.out.println("╚═════════════════════════════════════════╝");
    }

    private void startScans() {
        try {
            deliveryPrice = scanData("Szállítási költség");
            name = scanData("Üzleti költség");
            quantity = scanData("Javítási költség");
        } catch (Exception exception) {
            System.err.println("Hiba: " + exception.getMessage());
        }
    }

    private void initComponents() {
        koltseg = new Koltseg(deliveryPrice, name, quantity);
        fileHandler = new Filehandler();
        fileHandler.fileWriter(koltseg);
    }

    private String scanData(String scanText) {
        printScan(scanText);
        return scanner.nextLine();
    }

    private void printScan(String scanText) {
        System.out.println("──────────────────────────────────────────");
        System.out.print(scanText + ": ");
    }
}
