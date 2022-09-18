import javax.swing.*;

public class SistemasNumericosConEntradasDeUsuarios {
        public static void main(String[] args) {

            String numeroStr = JOptionPane.showInputDialog(null, "Ingrese un numero entero");
            int numeroDecimal = Integer.parseInt(numeroStr);
            System.out.println("numeroDecimal = " + numeroDecimal);

            System.out.println("numero BINARIO DE = " + numeroDecimal + " = " + Integer.toBinaryString(numeroDecimal));

            //Con "0b" el compilador de java entiende que es un numero binario, y no entero
            int numeroBinario = 0b111110100; //esto es lo mismo a 500, pero en binario
            System.out.println("numeroBinario = " + numeroBinario);

            System.out.println("numero octal de = " + numeroDecimal + " = " + Integer.toOctalString(numeroDecimal));

            //Para el Octal es necesario anteponer un "0" para que el compilador de java entienda que es un numero octal
            int numeroOctal = 0764;
            System.out.println("numeroOctal = " + numeroOctal);

            System.out.println("numero hexadecimal de = " + numeroDecimal + " = " + Integer.toHexString(numeroDecimal));

            //para un numero Hexadecimal, se debe anteponer el "0x" para que el compilador de java entienda que es un numero hexadecimal
            int numeroHex = 0x1f4;
             System.out.println("numeroHex = " + numeroHex);
    }

}
