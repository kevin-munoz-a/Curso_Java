public class PrimitivosBoolean {
    public static void main(String[] args) {

        //DATO TIPO boolean
        //primitivo boolean ---- clase Boolean
        boolean datoLogico = false;
        boolean datoLogico2 = true;
        System.out.println("datoLogico = " + datoLogico);
        System.out.println("datoLogico2 = " + datoLogico2);

        boolean datoLogico3 = Boolean.FALSE.booleanValue();
        double d = 98765.43e-3; // 98.765543
        System.out.println("d = " + d);
        float f =1.2345e2f; // 123.45
        System.out.println("f = " + f);

        datoLogico = d < f;
        System.out.println("datoLogico = " + datoLogico);

        //Comparando Boolean
        boolean esIugal = 3-2 == 1;
        System.out.println("esIugal = " + esIugal);
        boolean esIgual2 = 3+1 == 1;
        System.out.println("esIgual2 = " + esIgual2);
    }
}
