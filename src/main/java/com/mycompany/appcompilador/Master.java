/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.appcompilador;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.Reader;
import java.util.logging.Level;
import java.util.logging.Logger;
import umg.compiladores.Lexer;
import umg.compiladores.parser;
//import umg.compiladores.Lexer;
//import umg.compiladores.parser;
/**
 *
 * @author JSIMP
 */
public class Master {

    public static void main(String[] args) throws FileNotFoundException {
        try {  
            Reader r = new FileReader("C:\\Users\\usuario\\Desktop\\prueba.txt");
            Lexer lex = new Lexer(r);
            parser p = new parser(lex);
            p.parse();
        } catch (Exception ex) {
            Logger.getLogger(Master.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
