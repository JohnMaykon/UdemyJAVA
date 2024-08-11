package fundamentos;

import java.sql.SQLOutput;

public class TipoString {
    public static void main(String[] args) {
        //Tipos de strings e suas modificações

        System.out.println("Olá pessoal".charAt(2));
            //escolhe a letra de acordo com a posição dela na string;
        String s = "Boa tarde";
            //Adiciona um valor a variavel;
        System.out.println(s.concat("!!!"));
            // concatena a string;
        System.out.println(s + "!!!");
            //concatena a string;
        System.out.println(s.toUpperCase().startsWith("Boa"));
            //Esta perguntando se a palavra inicia  ou não com a palavra "Boa";
        System.out.println(s.toLowerCase().endsWith("tarde"));
            // Esta perguntando se o final da palavra termina com a palavra tarde;
        System.out.println(s.length());
            //Para saber a quantidade de caracteres na string;
        System.out.println(s.equals("boa tarde"));
            // Para saber se a string é igual
        System.out.println(s.equalsIgnoreCase("boa tarde"));
            //Para saber se a string é igual a string ignorando a caixa alta ou baixa;

        //o JAVA IDENTIFICA QUAL VARIAVEL ESTA SENDO CRIADA (MAS NÃO É DE BOA PRATICA)
        var nome = "Pedro";
        var sobrenome = "Santos";
        var idade = 33;
        var salario = 12334.568;

        System.out.println("Nome:" + nome + "\nSobrenome: " + sobrenome + "\nIdade: " + idade + "\nSakario: " + salario + "\n\n");
            //O: \n é para quebrar a linha
        System.out.printf("O senhor %s %s tem %d anos e ganha R$%.2f.", nome, sobrenome, idade, salario);
            //%s para representar uma string, %d para valores inteiros, %f para float o .2 é pra indicar quantas casas decimais quer exibir
    }
}
