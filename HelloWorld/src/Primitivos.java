public class Primitivos {

    //de esta forma podemos ver el valor por defecto de un primitivo
    static float varFlotante; // por defecto "0.0"

    public static void main(String[] args) {
        /*
        DATO TIPO ----BYTE----
        primitivo byte ---- class Byte

        1 Byte son 8 bits de almacenamiento;
        El Byte soporta desde -128 hasta 127 en tamaño

        */
        byte numeroByte = 127;
        byte numeroByte2 = -128;
        System.out.println("numeroByte = " + numeroByte);
        System.out.println("numeroByte2 = " + numeroByte2);
        System.out.println("tipo byte corresponde en byte a " + Byte.BYTES);
        System.out.println("tipo byte corresponde en byte a " + Byte.SIZE);
        System.out.println("valor maximo de un byte: " + Byte.MAX_VALUE);
        System.out.println("valor minimo de un byte: " + Byte.MIN_VALUE);

        //DATO TIPO ----SHORT----
        //primitivo short --- class Short
        short numeroShort = 32767;
        short numeroShort2 = -32768;
        System.out.println("numeroShort = " + numeroShort);
        System.out.println("numeroShort2 = " + numeroShort2);
        System.out.println("tipo short corresponde en byte a " + Short.BYTES);
        System.out.println("tipo short corresponde en byte a " + Short.SIZE);
        System.out.println("valor maximo de un short: " + Short.MAX_VALUE);
        System.out.println("valor minimo de un short; " + Short.MIN_VALUE);

        //DATO TIPO ----INT----
        //primitivo int --- class Integer
        int numeroInt = 2147483647;
        int numeroInt2 = -2147483648;
        System.out.println("numeroInt = " + numeroInt);
        System.out.println("numeroInt2 = " + numeroInt2);
        System.out.println("tipo int corresponde en byte a " + Integer.BYTES);
        System.out.println("tipo int corresponde en byte a " + Integer.SIZE);
        System.out.println("valor maximo de un int: " + Integer.MAX_VALUE);
        System.out.println("valor minimo de un int; " + Integer.MIN_VALUE);


        //Anotaciones cientificas --- L --- F --- D ---

        //DATO TIPO ---- LONG----
        //primitivo long ---- clase Long
        //Al final de la declaración se debe poner la "L" para definir que es un tipo de dato long
        long numeroLong = 9223372036854775807L;
        long numeroLong2 = -9223372036854775808L;
        System.out.println("numeroLong = " + numeroLong);
        System.out.println("numeroLong2 =" + numeroLong2);
        System.out.println("tipo long corresponde en byte a " + Long.BYTES);
        System.out.println("tipo long corresponde en byte a " + Long.SIZE);
        System.out.println("valor maximo de un long: " + Long.MAX_VALUE);
        System.out.println("valor minimo de un long; " + Long.MIN_VALUE);

        //DATO TIPO ----FLOAT----
        //primitivo float ---- clase Float
        //al final de la declaracion se debe poner la "F" para definir que es un tipo de dato float
        //La "E" o "e" es deribado de "exponente"
        float realFloat = 3.4028235e38F;
        float realFloat2 = 1.4e-45F; //00000000000000000000000000000000000000000000.14
        System.out.println("realFloat = " + realFloat);
        System.out.println("realFloat2 = " + realFloat2);
        System.out.println("tipo float corresponde en byte a " + Float.BYTES);
        System.out.println("tipo float corresponde en byte a " + Float.SIZE);
        System.out.println("valor maximo de un float: " + Float.MAX_VALUE);
        System.out.println("valor minimo de un float; " + Float.MIN_VALUE);

        //DATO TIPO ----DOUBLE----
        //primitivo double ---- clase Double
        // al final de la declaracion se debe poner la "D" para definir que es un tipo de dato double
        double realDouble = 1.7976931348623157e308D;
        double realDouble2 = 4.9e-324D;
        System.out.println("realDouble = " + realDouble);
        System.out.println("realDouble2 = " + realDouble2);
        System.out.println("tipo double corresponde en byte a " + Double.BYTES);
        System.out.println("tipo double corresponde en byte a " + Double.SIZE);
        System.out.println("valor maximo de un double: " + Double.MAX_VALUE);
        System.out.println("valor minimo de un double; " + Double.MIN_VALUE);

        //DATO TIPO ----VAR----
        //este dato es variable e automatico
        //var varFlotante = 3.1416f;
        System.out.println("varFlotante = " + varFlotante);
    }
}
