package primeiroprograma;

import java.util.Scanner;

public class Classe_While {
    public static void main(String[] args){
        Scanner leitor = new Scanner(System.in);  

        System.out.println("Qual a sua Idade? ");
        int idade = leitor.nextInt();
           
        while (idade <18){
            if (idade <18){
        System.out.println("** MENOR DE IDADE **");
                    
        System.out.println("Novamente, qual é a sua idade ? ");
        idade = leitor.nextInt();
        
        }   if(idade >18)
            {
        System.out.println("** Parabéns você já é MAIOR de idade **");
            }
            
            
    } 
    } 
}
