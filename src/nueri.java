import javax.swing.*;

public class nueri {


    public void numerito(){

    int n1 = Integer.parseInt(JOptionPane.showInputDialog("ingrese el numero 1"));
    int n2 = Integer.parseInt(JOptionPane.showInputDialog("ingrese el numero 2"));
    int suma = 0;

    for(int q = n1; q<=n2;q++)

    {
        suma = suma + q;


                  JOptionPane.showMessageDialog(null,"el decimal es   "+(suma));
}}
}
