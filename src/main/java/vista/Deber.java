/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package vista;

import controlador.CandidatoControl;

/**
 *
 * @author LAB-2
 */
public class Deber {

    public static void main(String[] args) {
        var candidatoJuan=new CandidatoControl();
        String[]datos= new String [6];
        datos[0]="Juan";
        datos[1]="25";
        datos[2]="no binario";
        datos[3]="quito";
        datos[4]="ateo";
        datos[5]="2022";
        candidatoJuan.crear(datos);
        
        for(var candidato:candidatoJuan.listar()){
            System.out.println("candidato = "+ candidato.toString());
        }
    }
}
