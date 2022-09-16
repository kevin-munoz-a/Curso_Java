public class Caracteres {
    public static void main(String[] args){

        //TIPO DATO ----char----
        //primitivo ----char---- class Caracter
        //Stardar UNICODE
        //char un solo caracter
        char caracterChar = 'a';
        char caracterChar2 = '\u0040'; //Caracter UNICODE @ en codigo Unicode
        char decimalChar = 64; //Caraccter UNICODE @ en decimal
        System.out.println("caracterChar = " + caracterChar);
        System.out.println("caracterChar2 = " + caracterChar2);
        System.out.println("decimalChar = " + decimalChar);
        //Bolean, si decimalChar es igual a caracterChar2 osea los 2 son @, sera "True"
        //Los parentecis "()" dan prioridad a la concatenacion, osea se resuelven primero.
        System.out.println("decimalChar = caracterChar2 " + (decimalChar == caracterChar2));
        //Bolean, si decimalChar es distinto a caracterChar, osea distintos a @. seran "False"
        System.out.println("decimalChar = caracterChar " + (decimalChar == caracterChar));
        char simboloChar = '@';
        System.out.println("simboloChar = " + simboloChar);
        System.out.println("simboloChar = caracterChar2 " + (simboloChar == caracterChar2));

        System.out.println("char corresponde en byte = " + Character.BYTES);
        System.out.println("char corresponde en bites = " + Character.SIZE);
        System.out.println("char caracteres maximos  = " + Character.MAX_VALUE);
        System.out.println("char caracteres minimos = " + Character.MIN_VALUE);
    }
}
