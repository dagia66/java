public class ReemplazarSubCadenas {
    public static void main(String[] args) {

        //reemplazar cadena de texto

        String Cadena = "Hola Mundo";
        System.out.println("Cadena original = " + Cadena);

        var NuevaCadena = Cadena.replace("Hola" , "Tu Madre");
        System.out.println("Nueva Cadena = " + NuevaCadena);

        var NuevaCadena2 = Cadena.replace("Mundo", "todos");
        System.out.println("Nueva Cadena2 = " + NuevaCadena2);


    }
}
