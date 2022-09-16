public class Primitivos {
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
        float numeroFloat = 3.4028235E38F;
        float numeroFloat2 = 1.4E-45F;
        System.out.println("numeroFloat = " + numeroFloat);
        System.out.println("numeroFloat2 = " + numeroFloat2);
        System.out.println("tipo float corresponde en byte a " + Float.BYTES);
        System.out.println("tipo float corresponde en byte a " + Float.SIZE);
        System.out.println("valor maximo de un float: " + Float.MAX_VALUE);
        System.out.println("valor minimo de un float; " + Float.MIN_VALUE);

    }
}
