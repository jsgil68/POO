package com.mycompany.calificaciones;
/**
 *Juan Sebastian Gil Coy
 */
public class Operaciones {
    
    private float prom;
    private String estado;
    
    public void calcular_promedio(float n1,float n2,float n3,float n4){
           prom=(n1+n2+n3+n4)/4;
 
    }
 
    public void evaluar_estado(){
        if(prom<6){
            estado ="usted reprobo la materia";
        }else{
            if(prom>=6){
                estado="usted aprobo la materia";
            }
        }
        
    }
    
    public void mostrar_mensaje(String nombre){
        System.out.println("El promedio del estudiante " + nombre+ " es: " + prom);
        System.out.println(estado);
        
    }
}