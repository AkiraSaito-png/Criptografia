package br.unaerp.criptografia;

import javax.swing.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Crypto {


    public static String crypto(String mensagem){
        Integer[] code = {8,3,2,4,7,4};
        String[] words = mensagem.split("");

        int sum = 0;
        int total = 0;
        int r;
        int i = 0;

        for (int s : code ) {
            sum += s;
            total ++;
        }

        r = sum%26;

        ArrayList<Integer>newcode = new ArrayList<>();

        System.out.println("Texto normal: " + "\n" + mensagem);

        // transformar a mensagem em ACII
        for(String d : words){
            i++;
            char ch =  d.charAt(0);
            char letra = ch;
            int b = letra;
            int f = b+r;

            newcode.add(f);
        }

        ArrayList<String>newCodeLetter = new ArrayList<>();

        System.out.println("\n\nTexto criptografado: ");
        for(int b : newcode){
            String mens_crip = Character.toString(b);

            newCodeLetter.add(mens_crip);
            System.out.print(mens_crip);
        }
        System.out.println("\n\nTexto descriptografado: ");

        for(int q :newcode){
            int retorno = q - r;
            int codigo = retorno;
            char ex_codigo = (char) codigo;
            System.out.print(ex_codigo);
        }

        return "\n\nsuccess";
    }

}
