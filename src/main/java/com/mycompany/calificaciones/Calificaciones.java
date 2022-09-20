package com.mycompany.calificaciones;
/**
 *Juan Sebastian Gil Coy
 *Kevin Alexis Osorio Herrera
 *Oscar Jhamir Rivera Mayorga 
 */

import java.util.Scanner;

public class Calificaciones{

    public static void main(String[] args) {
        
        Scanner captura = new Scanner(System.in);
        Operaciones operar = new Operaciones();
        
        System.out.println("digite su nombre: ");
        String nombre = captura.next();
        
        System.out.println("digite la nota de quiz: ");
        float nota1=captura.nextFloat();
        
        System.out.println("digite la nota de Taller: ");
        float nota2=captura.nextFloat();
        
        System.out.println("digite la nota de Proyecto: ");
        float nota3=captura.nextFloat();
        
        System.out.println("digite la nota de Parcial: ");
        float nota4=captura.nextFloat();
     
        
        operar.calcular_promedio(nota1, nota2, nota3, nota4);
        operar.evaluar_estado();
        operar.mostrar_mensaje(nombre);
    }
}