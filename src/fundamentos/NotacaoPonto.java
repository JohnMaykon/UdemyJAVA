package fundamentos;

public class NotacaoPonto {
    public static void main(String[] args) {
        //Todas as palavra que não são primitivas podem ser utilizadas com a notação ponto
        String s = "Bom dia X";
        // Anotação da plataforma dio
        s = s.replace("X", "Senhora");
        s = s.concat(", tenha uma boa estadia.");
        s = s.toUpperCase();
        System.out.println(s);

        String x = "Leo".toUpperCase();
        System.out.println(x);

        String y ="Bom dia X"
                .replace("X", "Gui")
                .toUpperCase()
                .concat("!!!");
        System.out.println(y);
    }
}
