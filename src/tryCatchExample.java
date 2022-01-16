import java.util.Scanner;

import javax.swing.JOptionPane;

public class tryCatchExample {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Cual es tu numero favorito: ");
        
        try{
            int n = scan.nextInt();
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "No ingreso un numero", "Error!", JOptionPane.ERROR_MESSAGE);
        }

        // int a[] = {4, 5, 1};

        // try{
        //     System.out.println(a[3]);
        // }catch(Exception e){
        //     JOptionPane.showMessageDialog(null, "No existe ese indice", "Error!", JOptionPane.ERROR_MESSAGE);
        // }
    }
}
