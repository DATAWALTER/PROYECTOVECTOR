package misrc;
public class Main5 {
    public static void main(String[] args) {
        int[] edad = {15,45,34};//Vector
        //MATRIZ ESTATICA(ARRAY BIDIMENSIONALES)
        String[][] nombre = {{"Luis","Miguel"},
                             {"Carlos","Juan"},
                             {"Arturo","Lucho"}};//3x2=filaxColumna
        //RECORRER LA MATRIZ
        for(int i=0; i<nombre.length; i++) {//FILAS
            for(int j=0; j<nombre[0].length; j++) {//COLUMNAS
                System.out.print(nombre[i][j] + "\t");
            }
            System.out.println();
        }
    }
    
}
