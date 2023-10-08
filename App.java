/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany;

/**
 *
 * @author Ваня
 */
public class App {

    public static void main(String[] args) {
        int array[][]={{1,2},{4,5,6},{12,8,1,8},{0,12,3,5,8},{3}};
        int totalNumbers=0;
        for(int i=0;i<array.length;i++){
            totalNumbers+=array[i].length;
        }
        int meanIndex=totalNumbers/array.length;
        int sum=0;
        for(int i=0;i<array.length;i++){
            if(array[i].length==meanIndex){
                for(int j=0;j<array[i].length;j++){
                    sum+=array[i][j];
                }
            }
        }
        System.out.println("Sumata na chislata s index "+meanIndex+" v masivite e: "+sum);
    }
}
