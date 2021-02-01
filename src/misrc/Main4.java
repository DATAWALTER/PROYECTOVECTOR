package misrc;

public class Main4 {

    public static void main(String[] args) {

        //ARRAY DINAMICO
        int[] edad;
        //INGRESE EL TAMAÑO DEL ARRAY
        System.out.print("Tamaño array : ");
        int longitud = Entrada.readInt();
        edad = new int[longitud];
        //INGRESAR LOS DATOS POR EL TECLADO
        for (int i = 0; i < longitud; i++) {
            System.out.print("Elemento " + (i + 1) + "? ");
            edad[i] = Entrada.readInt();
        }
        //MOSTRAR LOS DATOS INGRESADOS
        for (int i = 0; i < longitud; i++) {
            System.out.println("Elemento " + (i + 1) +":"+ edad[i]);
        }

    }

}
