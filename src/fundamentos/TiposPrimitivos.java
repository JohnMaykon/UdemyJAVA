package fundamentos;

public class TiposPrimitivos {
    public static void main(String[] args) {
        //Informações dos funcionários;

        //Tipos númericos inteiros;

        byte anosDeEmpresa = 23;
        short numeroDeVoos = 542;
        int id = 56789;
        long pontosAcumulados = 3_134_845_223L;
        //No tipo LONG é de boa pratica informar com um L (MAIUSCULO para não confundir com o numero 1) ao final do valor;

        //Tipos numéricos reais

        float salario = 11_445.44F;
        //Assim como no LONG, no FLOAT tambem é boa pratica informar com um F ao final do valor;
        double vendasAcumuladas = 2_991_797_103.01;

        //Tipo boleano.;

        boolean estaDeFerias = false; //True

        //Tipo caractere

        char status = 'A'; //ativo

        System.out.println("Dias de empresa: " + anosDeEmpresa * 365);
        System.out.println("Número de Viagens: " + numeroDeVoos / 2);
        System.out.println("Pontos por real: " + pontosAcumulados / vendasAcumuladas);
        System.out.println("Usuário de id: " + id + ": ganha --> " + salario);
        System.out.println("Férias? " + estaDeFerias);
        System.out.println("Status: " + status);

    }
}
