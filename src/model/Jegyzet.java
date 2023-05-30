/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.io.Serializable;

/**
 *
 * @author g
 */
public class Jegyzet implements Serializable {
    /*
    
    */
    private String nev;
    private String leiras;

    public Jegyzet(String nev, String leiras) {
        this.nev = nev;
        this.leiras = leiras;
    }

    public String getNev() {
        return nev;
    }

    public String getLeiras() {
        return leiras;
    }
}
