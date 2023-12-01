/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


/**
 *
 * @author Dimas Rachmat Rizki_630
 */
package uas_projek_pbo;
public class Kartu {
    private String cardNumber;
    private String expiryDate;
    private String cvv;

    public Kartu(String cardNumber, String expiryDate, String cvv) {
        this.cardNumber = cardNumber;
        this.expiryDate = expiryDate;
        this.cvv = cvv;
    }

    public String getCardNumber() {
        return cardNumber;
    }

    public String getExpiryDate() {
        return expiryDate;
    }

    public boolean validateCard(String enteredCvv) {
        return cvv.equals(enteredCvv);
    }
}
