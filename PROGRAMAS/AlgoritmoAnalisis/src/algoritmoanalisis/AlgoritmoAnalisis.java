/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algoritmoanalisis;

import java.io.IOException;

/**
 *
 * @author EMMANUEL
 */
public class AlgoritmoAnalisis {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
           Parser parse = new Parser();
        parse.expr();
        System.out.write('\n');
    }
    
}
