public class PrimitivosCaracteres {
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

        //Caracteres especiales
        char espacio = ' ';  //genera un espacio
        char espacioUnicode = '\u0020'; // genera un espacio en UNICODE
        char retroceso = '\b'; //genera un retroceeso, eliminando hacia atras o adelante
        char tabulador = '\t'; //genera una tabulacion
        char nuevaLinea = '\n'; //genera una nueva linea
        char retornoCarro = '\r'; // genera una nueva linea de forma distinta

        //Salto de linea a travez del System
        //modo1
        //char nuevaLinea = '\n';
        //char retornoCarro = '\r';
        //modo 2
        //System.getProperty("line.separator");

        System.out.println("simboloChar = " + simboloChar);
        System.out.println("simboloChar = caracterChar2 " + (simboloChar == caracterChar2));

        System.out.println("char\r corresponde en byte = " + retroceso + retroceso + Character.BYTES);
        System.out.println("char corresponde en bites = " + espacioUnicode + Character.SIZE);
        System.out.println("char caracteres maximos  = " + retornoCarro + tabulador + Character.MAX_VALUE);
        System.out.println("char \tcaracteres minimos = " + nuevaLinea + espacio + Character.MIN_VALUE);

    }
}
