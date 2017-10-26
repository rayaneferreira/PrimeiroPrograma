package primeiroprograma;

import java.util.Scanner;


public class PrimeiroPrograma { 
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        System.out.println("****Coisas Para Iniciante***");
              
        System.out.println("Qual o seu Nome ? ");
            String nome = leitor.next();
         
        System.out.println("Qual o sua idade ? "); 
            int idade = leitor.nextInt();
      
//Quando a Variavel já retorna o resultado o texto vem depois.
            int idadeanoquevem = idade +1;        
        System.out.println("Sua idade ano que vem é : "+ idadeanoquevem);       
            
        
        
         
       
               
        
       
    }
    
}
