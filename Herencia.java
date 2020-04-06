/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herencia;

import java.util.Scanner;

/**
 *
 * @author OHMASTER
 */
public class Herencia {

    public static void main(String[] args) {
        System.out.println(" herencia ");
        System.out.println(" Programacion Orientada A Objetos ");
        System.out.println(" Cisneros Morales Abraham ");
        System.out.println(" 2s12 ");
        Dog doguno = new Dog();
        doguno.LlenarDatosPerro();
        doguno.VerSalida();
        
        Dog dogdos = new Dog();
        dogdos.LlenarDatosPerro();
        dogdos.VerSalida();
        
        Dog dogtres = new Dog();
        dogtres.LlenarDatosPerro();
        dogtres.VerSalida();
        
        Dog dogcuatro = new Dog();
        dogcuatro.LlenarDatosPerro();
        dogcuatro.VerSalida();
        
        Dog dogcinco = new Dog();
        dogcinco.LlenarDatosPerro();
        dogcinco.VerSalida();
        /*Dog2 perro = new Dog2();
        Scanner SC= new Scanner (System.in);
        System.out.println("ingresa parte");
        perro.portion=SC.nextDouble();*/
        
    }
}


