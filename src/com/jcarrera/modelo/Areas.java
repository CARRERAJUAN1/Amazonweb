/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jcarrera.modelo;

import java.util.InputMismatchException;
import java.util.Scanner;
import javax.swing.JOptionPane;


/**
 *
 * @author PC
 */
public class Areas {
    private double base;
    private double altura;
    private double radio;
    
public void areaCuadra(){
    base=solicitarValor("Indica la base o altura: ");
    System.out.println("\nEl area del cuadrado es " + (base*base));	
}
public void areaCirculo(){
    radio=solicitarValor("Indica el radio: ");
    System.out.printf("\nEl area de la circunferencia es %1.2f\n", Math.PI*(Math.pow(radio,2)));
}
public void areaTriangulo(){
    base=solicitarValor("Indica la base: ");
    altura=solicitarValor("Indica la altura: ");
    System.out.printf("\nEl area del triangulo es %1.2f\n", (base*altura)/2);
}
 public  double solicitarValor(String texto) {
      Scanner entrada=new Scanner(System.in);
 
		while(true){
			try {
				System.out.print(texto);
				return entrada.nextDouble();
			}catch(InputMismatchException e) {
				// Controlamos que siempre introduzca un valor numerico
				System.out.println("El valor tiene que ser numerico...");
				entrada.nextLine();
			}
		}
	}
        
 public  void menu(){
    
     int opcion;
     do{
	  opcion=Integer.parseInt(JOptionPane.showInputDialog(""
                    + "1.- Area del Cuadrado\n"
                    + "2.- Area del circulo\n"
                    + "3.- Area del triangulo\n"
                    + "7.- Salir"
                    + "ingrese opcion"));
            switch(opcion){
                case 1:
                    areaCuadra();
                    break;
                case 2:
                    areaCirculo();
                    break;
                case 3:
                    areaTriangulo();
                    break;
                
            		
			
		}
     }while(opcion!=4);
 }
    }
     
     
         

