/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package escribir;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Javi
 */
public class Fichero {

        ArrayList<Alumno> list = new ArrayList<Alumno>();
    ArrayList<Alumno> aprobados = new ArrayList<Alumno>();
    ArrayList<Alumno> suspensos = new ArrayList<Alumno>();

    File fichero;
    FileReader lectura;
    Scanner sc;

    public void engadir(String nomefich) {
        PrintWriter fichero = null;
        try {
            fichero = new PrintWriter(new FileWriter(nomefich, true));

            if (nomefich.equals("aprobados.dat")) {
                for (Alumno a : aprobados) {
                    fichero.println(a.getNome() + ' ' + a.getNota());
                }
            } else if (nomefich.equals("suspensos.dat")) {
                for (Alumno a : suspensos) {
                    fichero.println(a.getNome() + ' ' + a.getNota());
                }
            } else if (nomefich.equals("notas.dat")) {
                for (Alumno a : list) {
                    fichero.println(a.getNome() + ' ' + a.getNota());
                }
            }

        } catch (IOException ex) {
            System.out.println("Erro2" + ex.getMessage());
        } finally {
            fichero.close();
        }
    }

    public void ler(String nomefich) {
        String[] Alumnos;
        try {
            sc = new Scanner(new File(nomefich));

            while (sc.hasNextLine()) {

                String Alumno = sc.nextLine();
                Alumnos = Alumno.split(" ");

                if (Integer.parseInt(Alumnos[1]) >= 5) {
                    aprobados.add(new Alumno(Alumnos[0], Integer.parseInt(Alumnos[1])));
                } else {
                    suspensos.add(new Alumno(Alumnos[0], Integer.parseInt(Alumnos[1])));
                }
                list.add(new Alumno(Alumnos[0], Integer.parseInt(Alumnos[1])));
            }

        } catch (FileNotFoundException ex) {
            Logger.getLogger(Fichero.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
