package misrc;

public class Main3 {

    public static void main(String[] args) {
       int[] numero = {4,5,10,24,1,9,8};
       int menor = 99999;
       int mayor = -9999;
       for(int i=0; i<numero.length; i++) {
           if(menor > numero[i]) menor = numero[i];
           if(mayor < numero[i]) mayor = numero[i];
       }
       System.out.println("Mayor = " + mayor);
       System.out.println("Menor = " + menor);
    }
    
}
