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
        factor();
        while(true){
            if (lookahead == '+') {
                match('+'); factor(); System.out.write('+');
            } else if (lookahead == '-'){
                match('-'); factor(); System.out.write('-');
            }
            else return;
        }
    }
    
  public void factor() throws IOException {
        atom();
        while (true) {
            if (lookahead == '*') {
                match('*');
                atom();
                System.out.write('*');
            } else if (lookahead == '/') {
                match('/');
                atom();
                System.out.write('/');
            } else {
                return;
            }
        }
    }
    
   public void atom() throws IOException {
        if (Character.isDigit((char) lookahead)) {
            System.out.write((char) lookahead);
            match(lookahead);
        } else {
            throw new Error("syntax error");
        }
    }
  
     void match(int t) throws IOException{
        if(lookahead == t) lookahead = System.in.read();
        else throw new Error("syntax error");
    }
     
    

   
     
    
}
