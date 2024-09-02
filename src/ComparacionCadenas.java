public class ComparacionCadenas {
    public static void main(String[] args) {
        String cadena1 = "HOLA";
        String cadena2 = "HOLA";
        String cadena3 = new String("HOLa");

        System.out.print("¿las cadenas son iguales? ");
        System.out.println(cadena1 == cadena2);

        System.out.print("¿las cadenas son iguales? ");
        System.out.println(cadena1.equals(cadena3));
    }
}
