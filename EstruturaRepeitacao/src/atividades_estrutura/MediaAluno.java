package atividades_estrutura;

import java.util.Scanner;


//Faça um sistema que leia as 3 notas de um aluno e calcule a média final destealuno. Considerar que a
//média é ponderada e que o peso das notas é: 2,3 e5,respectivamente.


//Resolução3
public class MediaAluno {
	
	
	public static void main(String args[]) {

	       Scanner in = new Scanner(System.in);

	       float[] pesos = {2,3,5};

	       float total = 0;

	       float totalPesos = 0;

	       float[] notas = new float[3];

	       String[] classificacoes = {"APROVADO", "RECUPERAÇÃO", "REPROVADO"};

	       for(int i = 0; i < notas.length; i++){

	           System.out.println("Digite a nota: ");

	           notas[i] = in.nextFloat();

	           total += notas[i]*pesos[i];

	           totalPesos += pesos[i];

	       }

	      float mediaFinal = total/totalPesos;

	      String classificacao = "";

	      if(mediaFinal >= 7f){

	          classificacao = classificacoes[0];

	      }else if(mediaFinal >= 5f){

	          classificacao = classificacoes[1];

	      }

	      else{

	          classificacao = classificacoes[2];

	      }

	      System.out.println("A media final foi: " + mediaFinal+ " "+classificacao);

	   }

	}


