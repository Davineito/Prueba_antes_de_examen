//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        //METODO DE BUSQUEDA SECUENCIAL

        int [] Arreglo = {4,1,5,2,3};
        int dato;
        boolean band = false;

        dato = Integer.parseInt(JOptionPane.showInputDialog("¿QUE NUMERO DESEA BUSCAR?"));

        //algoritmo de la busqueda secuencial
        int i = 0;
        while (i<5 && !band){
            if (Arreglo[i] == dato){
                band = true;
            }
            i++;
        }

        if(!band){
            JOptionPane.showMessageDialog(null,"el numero no se encuentra en el arreglo");
        }else {
            JOptionPane.showMessageDialog(null,"el numero esta en la posicion: "+ (i-1));
        }

    }
}