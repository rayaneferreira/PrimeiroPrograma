package primeiroprograma;

import java.util.Scanner;


public class O_if_e_else {

  public static void main(String[] args){
    Scanner leitor = new Scanner(System.in);

 /*   System.out.println("Qual a sua Idade? ");
       int idade = leitor.nextInt();
       
       if(idade >= 18){
    System.out.println("Então você é maior de Idade !!");
    } else{
    System.out.println("Você anda não é de Maior !! ");
    }
  */
 

 /* OPERADORES && || "e" é "ou"*/
 
    System.out.println("Qual a sua Idade? ");
       int idade = leitor.nextInt();
       
       boolean amigoDoDono = true;
      
    if (idade >= 18 && amigoDoDono ==true) {
  System.out.println("PODE ENTRAR");
}
    else {
  System.out.println("NÃO Pode entrar");
}

  }
       
  }

