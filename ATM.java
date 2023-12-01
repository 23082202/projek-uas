/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


/**
 *
 * @author Dimas Rachmat Rizki_630
 */
package uas_projek_pbo;
import java.util.Scanner;

public class ATM {
    private ATMSystem atmSystem;
    private Scanner scanner;

    public ATM(ATMSystem atmSystem) {
        this.atmSystem = atmSystem;
        this.scanner = new Scanner(System.in);
    }

    public void insertCard(Kartu card) {
        atmSystem.insertCard(card);
    }

    public void ejectCard() {
        atmSystem.ejectCard();
    }

    public void startSession(String pin) {
        atmSystem.startSession(pin);
    }

    public void showMainMenu() {
        atmSystem.showMainMenu();
    }

    public void closeScanner() {
        scanner.close();
    }
}
