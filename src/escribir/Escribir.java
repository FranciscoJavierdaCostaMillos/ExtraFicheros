/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package escribir;

/**
 * 1) clase alumno : nome:String , nota:int.
 * 2) Escribir no ficheiro "notas.dat" varios alumnos (serializacion).
 * 3) ler ficheiro.dat e gardar os aprobados en "aprobados.dat" e os suspensos en "suspensos.dat".
 * 4) meter os aprobados nun arraylist.
 * 5) visualizar o arraylist ordenando campo nome.
 * 
 * 
 * 
 * @author Javi
 */
public class Escribir {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Fichero algo = new Fichero();
        //algo.alumno("Alberto");
        //algo.nota("7");
        algo.escribeFichero("ejemplo.dat");
        algo.lerFicheiro("ejemplo.dat");
    }
    
}
