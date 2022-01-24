/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package binarios;

import java.io.FileInputStream;

/**
 *
 * @author paperback
 */
public class Binarios {

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
