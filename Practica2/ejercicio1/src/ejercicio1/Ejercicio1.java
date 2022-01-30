/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio1;

import java.io.FileInputStream;

/**
 *
 * @author paperback
 */
public class Ejercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        analyze("entrada.txt");
    }
    
    private static void analyze(String path) {
        analyzer.Parser parse;
        try {
            parse = new analyzer.Parser(new analyzer.lexical(new FileInputStream(path)));
            parse.parse();
        } catch(Exception e) {
            System.out.println("Error fatal en compilación de entrada.");
            System.out.println("Causa: "+e.getCause());
        }
    }
    
}
