package org.training.mercedes.scanner;

import java.util.Scanner;

public class ScannerRunner {

    public void eski(){
        Scanner scanner = null;
        try {
            scanner = new Scanner(System.in);
            System.out.println("girdi:");
            scanner.nextInt();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (scanner != null){
                scanner.close();
            }
        }

    }
    public static void main(String[] args) {
        try (Scanner scanner1 = new Scanner(System.in)) {
            System.out.println("girdi:");
            int i = scanner1.nextInt();
            System.out.println("adınızı giriniz :");
            String name = scanner1.next();
            System.out.println("Girdi : " + i + " adınız : " + name);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
