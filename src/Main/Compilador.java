package Main;

import Lexer.MyLexer;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PushbackReader;
import java.io.Reader;
import java.util.logging.Level;
import java.util.logging.Logger;
import meuprojetoLFT.lexer.Lexer;
import meuprojetoLFT.lexer.LexerException;
import meuprojetoLFT.node.EOF;
import meuprojetoLFT.node.TMeuespacoembranco;
import meuprojetoLFT.node.Token;
/**
 *
 * @author Matheus Costa e Rafael Reis
 */
public class Compilador {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws LexerException, IOException {
        // TODO code application logic here
        Reader myreader;
        try {
            for (int i = 0; i < args.length; i++) {
                System.out.println(" O Arquivo testado é: '" + args[i] + "'\n");
                myreader = new FileReader(args[i]);
                Lexer mylexer = new MyLexer (new PushbackReader(myreader));
                while (true) {
                    Token token = mylexer.next();
                    String name = token.getClass().getSimpleName();
                    if (!name.equals("EOF")) {
                        name=name.substring(1, name.length());
                    }
                    if (!(token instanceof TMeuespacoembranco)){
                        if (!name.equals("EOF")){
                        System.out.print(name);}
//                        System.out.println("aqui");
                    }else{
//                        System.out.println("aqui2");
                        System.out.print(token.getText());
                    }
                    
                    if(token instanceof EOF)
                        break;     
                }
                System.out.println("\n|o||o||o|o|o|\n");
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Compilador.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

}