/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio41;

public class Mayor {
    public static int calcularMayor(int[] numeros){
        int i, mayor = numeros[0];
        for(i=0;i<numeros.length;i++){
            if(numeros[i]>mayor){
                mayor = numeros[i];
            }
        }
        return mayor;
    }
}
