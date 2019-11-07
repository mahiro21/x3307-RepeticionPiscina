/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.japo.java.main;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author Mario Merlos Abella - mario.merlos.alum@iescamp.es
 */
public class Main {

    public static final Scanner SCN
            = new Scanner(System.in, "Windows-1252")
                    .useLocale(Locale.ENGLISH).useDelimiter("\\s+");

    public static void main(String[] args) {

        //Variables
        String objeto;
        boolean obj1 = false;
        boolean obj2 = false;
        boolean obj3 = false;
        boolean obj4 = false;
        boolean obj5 = false;
        boolean obj6 = false;
        boolean todo;

        //inicio
        todo = false;

        do {
            System.out.print("Insertar objeto..: ");
            objeto = SCN.nextLine();

            switch (objeto) {
                case "toalla":
                    obj1 = true;
                    break;
                case "chanclas":
                    obj2 = true;
                    break;
                case "gafas":
                    obj3 = true;
                    break;
                case "tapones":
                    obj4 = true;
                    break;
                case "gel":
                    obj5 = true;
                    break;
                case "gorro":
                    obj6 = true;
                    break;
            }
            if (obj1 && obj2 && obj3 && obj4 && obj5 && obj6) {
                todo = true;
                System.out.println("---");
                System.out.println("Lo tienes todo, ¡Vamos a la piscina!");
            }

        } while (todo == false);
    }

}
