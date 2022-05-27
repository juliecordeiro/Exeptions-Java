package br.dio.exceptions;

import javax.swing.*;
import java.io.*;

public class CreckedExeption {

    public static void main(String[] args)  {

        String nomeDoArquivo = "C:/Users/julie.santos/Documents/Projetos/DIO/ExeptionsJava/romances-blake-crouch.txt";
        try {
            imprimirArquivonoConsole( nomeDoArquivo );
        } catch (FileNotFoundException e) {
            JOptionPane.showMessageDialog( null, "Revise o nome do arquivo." + e.getCause() );
            e.printStackTrace();
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, "Ocorreu um erro inesperado, entre em contato com o suporte." + e.getCause());
            e.printStackTrace();
        } finally {
            System.out.println("Finally");
        }

        System.out.println("Continue");
    }

    public static void imprimirArquivonoConsole(String nomeDoArquivo) throws IOException {

        File file = new File( nomeDoArquivo );

        BufferedReader br = new BufferedReader( new FileReader( file.getName() ) );
        String line = br.readLine();

        BufferedWriter bw = new BufferedWriter( new OutputStreamWriter(System.out ) );

        do{
            bw.write(line);
            bw.newLine();
            line=br.readLine();
        } while(line != null);
        bw.flush();
        br.close();



    }

}
