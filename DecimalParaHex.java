public class DecimalParaHex {

    public static String decimalParaHex(int decimal) {
        if (decimal == 0) return "";

        int resto = decimal % 16;
        char hexChar;

        if (resto < 10) {
            hexChar = (char) ('0' + resto); // 0–9
        } else {
            hexChar = (char) ('A' + (resto - 10)); // A–F
        }

        return decimalParaHex(decimal / 16) + hexChar;
    }

    public static void main(String[] args) {
        int numero = 1789;
        String resultado = decimalParaHex(numero);
        if (resultado.isEmpty()) resultado = "0"; // trata caso do número 0
        System.out.println("Decimal " + numero + " em hexadecimal é: " + resultado);
    }
}
