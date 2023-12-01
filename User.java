/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


/**
 *
 * @author Dimas Rachmat Rizki_630
 */
package uas_projek_pbo;
public class User {
    protected UserType userType;

    public User(UserType userType) {
        this.userType = userType;
    }

    public UserType getUserType() {
        return userType;
    }

    public void greet() {
        System.out.println("Selamat datang, pengguna tipe: " + userType);
    }

    public void displayUserType() {
        System.out.println("Tipe Pengguna: " + userType);
    }
}
