package org.example;

import java.util.Arrays;
import java.util.Scanner;

public class BoletimEscolar {
    public void media(){
        Scanner s = new Scanner(System.in);
        String nome = "";
        double nota = 0;
        double media = 0;
        int numNota = 0;
        double soma = 0;

        System.out.println("----------------BOLETIM ESCOLAR-----------------");

        System.out.println("Nome do aluno: ");
        nome = s.nextLine();
        System.out.println("Quantas notas são? ");
        numNota = s.nextInt();

        double notas[] = new double[numNota];

        for(int i=0; i < numNota; i++){
            System.out.println("\nDigite a "+ (i+1) +"ª nota? ");
            nota = s.nextDouble();
            soma += nota;
            notas[i] = nota;
        }
        media = soma/numNota;

        if(media>=7){
            System.out.println("Aluno: "+nome);
            System.out.println("Notas: " + Arrays.toString(notas));
            System.out.println("Média: "+ media);
            System.out.println("Aprovado");

        }else if(media >= 5 && media < 7){
            System.out.println("Aluno: "+nome);
            System.out.println("Notas: " + Arrays.toString(notas));
            System.out.println("Média: "+ media);
            System.out.println("Recuperação");

        }else{
            System.out.println("Aluno: "+nome);
            System.out.println("Notas: " + Arrays.toString(notas));
            System.out.println("Média: "+ media);
            System.out.println("Reprovado");

        }
    }

}
