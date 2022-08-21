public class Evidencia {
    public static void main(String[] args) {
        saludar("Nicolas ");
        evidenciar();
    }

    public static void saludar(String nombre){
        System.out.println("Hola soy "+nombre);
    }

    public static void evidenciar(){
        for (int i = 0; i < 3; i++) {
            System.out.println("Ejecutando ...");
        }
    }
}
