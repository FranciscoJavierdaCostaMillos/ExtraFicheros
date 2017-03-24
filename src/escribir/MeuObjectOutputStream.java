/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package escribir;

import java.io.IOException;
import java.io.OutputStream;

/**
 *
 * @author erodriguez-lepinamartinez
 */
public class MeuObjectOutputStream {
     // constructores :
    public MeuObjectOutputStream()throws IOException{
        
    }
    
    public MeuObjectOutputStream(OutputStream ou)throws IOException{
        super(ou);
    }
    /* redefinición do método que escribe a cabeceira para que non faga nada */
    
    @Override
    protected void writeStreamHeader() throws IOException
    {
    }

}
