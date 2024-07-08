package fundamentos;

public class Inferencia {
    //O java vai fazer um inferncia do tipo da variavel quando tal não for informada.

    public static void main(String[] args) {
        var a = 4;
        //inferencia fo tipo INT;

        var b = 4.5;
        //Inferencia do tipo DOUBLE;

        var c = "texto";
        //Inferencia do tipo STRING;

        System.out.println(a);

        System.out.println(b);

        System.out.println(c);
    }
}
