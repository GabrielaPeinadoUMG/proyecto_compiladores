package com.appcompilador.entidades;

import org.apache.tools.ant.filters.ReplaceTokens.Token;
import umg.compiladores.Lexer;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

import java_cup.runtime.Symbol;
import umg.compiladores.parser;

public class classLexicoSintáctico {

    public static void main(String[] args) {
        
        try {
            // Crear un lector para leer el archivo de entrada
            Reader reader = new BufferedReader(new FileReader("input.txt"));

            // Crear una instancia del lexer generado
            Lexer lexer = new Lexer(reader);

            // Crear una instancia del parser generado
            parser parser = new parser(lexer);

            // Llamar al parser para realizar el análisis sintáctico
            Symbol symbol = parser.parse();

            // Verificar si el análisis sintáctico fue exitoso
            // Aquí puedes agregar tu lógica para manejar el resultado del análisis sintáctico
            // Cerrar el lector
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
