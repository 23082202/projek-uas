/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


/**
 *
 * @author Dimas Rachmat Rizki_630
 */
package uas_projek_pbo;
public class Admin extends User {
    private ATMSystem atmSystem;

    public Admin(ATMSystem atmSystem) {
        super(UserType.ADMIN);
        this.atmSystem = atmSystem;
    }

    public void showAllCustomerInfo() {
        atmSystem.showAllCustomerInfo();
    }

    public void manageUsers() {
        System.out.println("Admin dapat mengelola pengguna lainnya.");
    }
}
