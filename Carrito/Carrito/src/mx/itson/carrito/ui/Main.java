/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mx.itson.carrito.ui;

import java.util.Scanner;
import mx.itson.carito.enums.TipoMotor;
import mx.itson.carrito.entidades.Carro;

/**
 *
 * @author alumnog Dorantes Rogel Angel Adrian.
 * 
 */
public class Main {
   
        public static void main(String[] args) {
        
            Scanner scanner = new Scanner(System.in);
            System.out.println("Ingresa la distancia que va a recorrer el carro.");
           double distancia =  scanner.nextDouble();
            System.out.println("Ingresa la velocidad a la que avanza el carro.");
           double velocidad = scanner.nextDouble();
           
           
//Generamos una instancia de la clase Carro
    Carro ford = new Carro();
   ford.setSpeed((Double) velocidad);
   ford.setMiles((Double) distancia);
   ford.setColor("Gris");
   ford.setModel("Focus");
   ford.setKilometraje(10000);
   ford.setTipoMotor(TipoMotor.HIBRIDO);
   
           
   ford.calculateTime(distancia, velocidad);
  double  tiempo = ford.calculateTime(distancia, velocidad);
   String color = ford.getColor();
   String modelo = ford.getModel();
   System.out.println("El tiempo que le llevara al carro "+ ford.getModel()+ 
           "de color" + ford.getColor() +
           "sera" + tiempo + 
           " y ahora su kilometraje es de"+ ford.getKilometraje());
    }
    
}
