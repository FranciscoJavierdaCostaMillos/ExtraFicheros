/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package escribir;

import javax.swing.JOptionPane;

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
        
        Fichero metodos = new Fichero();
        Alumno alumnos = new Alumno();
        Boolean seguir = true;

        while (seguir == true) {
            String opt = JOptionPane.showInputDialog("Pulse una opcion");
            switch (opt) {
                case "a":
                    metodos.list.add(new Alumno("JJ", 1));
                    metodos.list.add(new Alumno("Arturo", 9));
                    metodos.engadir("notas.dat");
                    metodos.engadir("aprobados.dat");
                    metodos.engadir("suspensos.dat");

                    break;
                case "b":
                    metodos.ler("notas.dat");
                    break;
                case "c":
                    seguir = false;
                    break;
            }
        }

    }
    }
    

