package br.dio.exceptions;

import javax.swing.*;

public class UncheckedException {

    public static void main(String[] args) {

        boolean continueLooping = true;
        do {

            String a = JOptionPane.showInputDialog( "Numerador: " );
            String b = JOptionPane.showInputDialog( "Denominador" );

            try{
                int resultado = dividir(Integer.parseInt( a ), Integer.parseInt( b ));
                System.out.println("Resultado: " + resultado);
                continueLooping = false;
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog( null, "Entrada Inválida, informe um número inteiro! " + e.getMessage() );
                // e.printStackTrace();
            } catch (ArithmeticException e) {
                JOptionPane.showMessageDialog( null, "Impossível dividir por 0!! " + e.getMessage() );
            }
            finally {
                System.out.println("Finally");
            }

        }while(continueLooping);



    }

    public static int dividir (int a, int b) { return a/ b; }

}
