package Vererbung;

import Vererbung.ChefKoch;
import Vererbung.ItalienChefkoch;
import Vererbung.chinesischerChefkoch;

public class Main {
    public static void main(String[] args) {

        ChefKoch vertretterChefKoch = new ChefKoch();
        vertretterChefKoch.makeChicken();
        vertretterChefKoch.makeSpecialDisch();
        vertretterChefKoch.makeSalat();

        System.out.println("************************************");
        System.out.println("");
        System.out.println("************************************");


        ItalienChefkoch italienerChefKoch = new ItalienChefkoch();
        italienerChefKoch.makeChicken();
        italienerChefKoch.makeSpecialDisch();
        italienerChefKoch.makeSalat();
        italienerChefKoch.makeSpaghetti();

        System.out.println("************************************");
        System.out.println("");
        System.out.println("************************************");


        chinesischerChefkoch chinesischerChefkoch = new chinesischerChefkoch();
        chinesischerChefkoch.makeChicken();
        chinesischerChefkoch.makeSpecialDisch();
        chinesischerChefkoch.makeSalat();
        chinesischerChefkoch.makeGebrateneEnte();

        System.out.println("");
        System.out.println("");
    }
}
