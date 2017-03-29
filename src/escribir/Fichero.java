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

/**
 *
 * @author Javi
 */
public class Fichero {

    public void escribeFichero(String ficheiro) {
        ObjectOutputStream fich = null;
        try {
            fich = new ObjectOutputStream(new FileOutputStream(ficheiro));
            for (int i = 0; i < 3; i++)
            {
                Alumno alum = new Alumno(alumno("nome :"), nota("nota :"));
                fich.writeObject(alum);
            }

        } catch (Exception e) {
           // e.printStackTrace();
            System.out.println("Algo va mal");
        } finally {
            if (fich != null) {
                try {
                    fich.close();
                } catch (IOException ex) {
                    Logger.getLogger(Fichero.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
    }

    public void engadeFicheiro(String ficheiro) {
        MeuObjectOutputStream esc = null;
        ObjectOutputStream fich = null;
        try {
            esc = new MeuObjectOutputStream(
                    new FileOutputStream(ficheiro, true));

            for (int i = 0; i < 2; i++) // engadimos por exemplo 2 obxectos
            {
                // ollo ! instanciamos os obxectos tipo persoa dentro do bucle

                Alumno al = new Alumno(alumno("nome :"), nota("nota :"));
                fich.writeObject(al);

            }

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (esc != null) {
                try {
                    esc.close();
                } catch (IOException ex) {
                    Logger.getLogger(Fichero.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
    }

    public String alumno(String s) {
        return JOptionPane.showInputDialog(s);
    }

    public int nota(String s) {
        return Integer.parseInt(JOptionPane.showInputDialog(s));
    }

    public void lerFicheiro(String ficheiro) {
        ObjectInputStream ler = null;
        Alumno aux = null;
        try {
            ler = new ObjectInputStream(new FileInputStream(ficheiro));

            aux = (Alumno) ler.readObject();
            while (aux != null) {
                System.out.println(aux.toString());
                aux = (Alumno) ler.readObject();
            }
        } catch (ClassNotFoundException ex) {
            System.out.println("erro 1" + ex.getMessage());

        } catch (IOException ex) {
            System.out.println("erro 2" + ex.getMessage());
        } finally {
            if (ler != null) {
                try {
                    ler.close();
                } catch (IOException ex) {
                    System.out.println("erro de peche " + ex.getMessage());
                }
            }
        }
    }
}
