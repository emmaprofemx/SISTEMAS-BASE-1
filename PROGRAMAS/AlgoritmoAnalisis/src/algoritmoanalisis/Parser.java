/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algoritmoanalisis;

import java.io.*;

/**
 *
 * @author EMMANUEL
 */
public class Parser {
      static int lookahead;
    
    public Parser() throws IOException{
       lookahead = System.in.read();
    }
    
    void expr() throws IOException{
        term();
        while(true){
            if (lookahead == '+') {
                match('+'); term(); System.out.write('+');
            } else if (lookahead == '-'){
                match('-'); term(); System.out.write('-');
            }
            else return;
        }
    }
    
    void term () throws IOException{
        if(Character.isDigit((char)lookahead)){
            System.out.write((char)lookahead);
            match(lookahead);
        }
    }
    
     void match(int t) throws IOException{
        if(lookahead == t) lookahead = System.in.read();
        else throw new Error("syntax error");
    }
}
