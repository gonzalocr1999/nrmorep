/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arreglos;

/**
 *
 * @author l11m05
 */
public class Arreglos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int []listNumeros = {3,4,6,3,8,4,5,7,6,8,4};
        int evaNros = 0;
        for (int i= 0; i<listNumeros.length; i++)
        {
            boolean seRpte = false;
            //System.out.println(listNumeros[i]);
            for(int j=0; j<listNumeros.length; j++){
                
                if(listNumeros[i]== listNumeros[j] && i!=j){
                    seRpte= true;
                    break;
                    //System.out.println("El numero " +listNumeros[i]+ "se repite" +j);
                }
            }
            if(!seRpte){
                System.out.println("El primer numero que no se repite es " +listNumeros[i]+ " y se encuentra en la posicion " +i);
                break;
            }
        }

    }
    
}
