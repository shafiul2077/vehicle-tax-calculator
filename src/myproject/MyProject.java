
package myproject;
import javax.swing.JOptionPane;
public class MyProject {

    public static void main(String[] args) {
        String  name = JOptionPane.showInputDialog("Brand Name of bike");
        String  modle = JOptionPane.showInputDialog("Modle of bike");
        String  serialNumber = JOptionPane.showInputDialog("SerialNumber of bike");
        String  Price = JOptionPane.showInputDialog("Price of bike");
        String  CC = JOptionPane.showInputDialog("CC of bike");
        Double price = Double.parseDouble(Price);
        Double cc = Double.parseDouble(CC);
        Bike x = new Bike(name,modle,serialNumber,price,cc);
        JOptionPane.showMessageDialog(null,"Bike\n"+x,"Input of Bike",1);
        System.out.println(x);
        System.out.println(x.text());
        JOptionPane.showMessageDialog(null,""+x.text(),"Text of Bike",1); 
         
                        String  nam = JOptionPane.showInputDialog("Brand Name of bus");
                        String  modl = JOptionPane.showInputDialog("Modle of bus");
                        String  serialNumbe = JOptionPane.showInputDialog("SerialNumber of bus");
                        String  Pric = JOptionPane.showInputDialog("Price of bus");
                        String  C = JOptionPane.showInputDialog("CC of bus");                                 
                        Double pric = Double.parseDouble(Pric);
                        Double c = Double.parseDouble(C);
                        Bus y = new Bus(nam,modl,serialNumbe,pric,c);
                        JOptionPane.showMessageDialog(null,"Bus\n"+y,"Input of Bus",1);
                        System.out.println(y);
                        System.out.println(y.text());
                        JOptionPane.showMessageDialog(null,""+y.text(),"Text of Bus",1);
                         
        String  na = JOptionPane.showInputDialog("Brand Name of private car");
        String  mod = JOptionPane.showInputDialog("Modle of private car");
        String  serialNumb = JOptionPane.showInputDialog("SerialNumber of private car");
        String  Pri = JOptionPane.showInputDialog("Price of private car");
        String  CCC = JOptionPane.showInputDialog("CC of private car");               
        Double pri = Double.parseDouble(Pri);
        Double ccc = Double.parseDouble(CCC);                      
        PrivateCar z= new PrivateCar(na,mod,serialNumb,pri,ccc);
        JOptionPane.showMessageDialog(null,"Private Car\n"+z,"Input of Private Car",1);
        System.out.println(z);
        System.out.println(z.text());   
        JOptionPane.showMessageDialog(null,"Private Car\n"+z.text(),"Input of Private Car",1);
    }
}
