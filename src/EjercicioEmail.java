public class EjercicioEmail {
    public static void main(String[] args) {

        String Nombre = "Ediber Duvan Arenas";
        String Empresa = "Dagia66";
        String Dominio = ".dev";

        var NombresEspacios = Nombre.replace(" ", ".");
        var Nombresminusculas = NombresEspacios.toLowerCase();
        var Empresatransf = Empresa.toLowerCase();

        System.out.println("Correo Generado = "  + Nombresminusculas + "@" + Empresatransf  + Dominio);




    }
}
