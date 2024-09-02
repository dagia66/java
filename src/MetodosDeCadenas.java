public class MetodosDeCadenas {
    public static void main(String[] args) {
        //Comparar cantidad de caracteres de una cadena
        String cadena1 = "Hola Mundo";

        int comparacion = cadena1.length();
        System.out.println("comparacion = " + comparacion);

        //reemplazar cadenas

        String reemplazoCadena = cadena1.replace('H', 'M');
        System.out.println(reemplazoCadena);

        //covertir a mayusculas

        String convertirMayusculas = cadena1.toUpperCase();
        System.out.println("convertirMayusculas = " + convertirMayusculas);

        System.out.println(" ");

        //convertir a minusculas
        System.out.println("conversion a minusculas = " + cadena1.toLowerCase());

        //el metodo trim elimina los espacios iniciales y los espacios finales de un string


    }
}
