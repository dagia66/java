public class busquedadesubcadenas {
    public static void main(String[] args) {
        String Cadena1 = "Hola mundo";

        var indice1 = Cadena1.indexOf("Hola");

        System.out.println("indice1 = " + indice1);

        var indice2 =Cadena1.lastIndexOf("mundo");
        System.out.println("indice2 = " + indice2);
    }

}
