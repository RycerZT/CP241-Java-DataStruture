import javax.swing.*;

public class StatTest2 {
    public static void main(String[] args){
        int Total;
        int number=0;

        Stat statAdt = new Stat();
        Total = Integer.parseInt(JOptionPane.showInputDialog(null,"Enter number of element:"));
        for (int i=0;i < Total;i++){
            number = Integer.parseInt(JOptionPane.showInputDialog(null,"Input number:"));
        }
        statAdt.setTotal(Total);
        System.out.println();
        System.out.println("Input data are:");
        for(int j=0;j<statAdt.getTotal();j++){
            System.out.print(statAdt.getData(j)+"");
        }
        System.out.println("\n");
        System.out.format("%-15s %3d number is %6.1f\n","Mean of these",statAdt.getTotal(),statAdt.getMean());
        System.out.format("%-15s %3d number is %6.1f\n","Max of these",statAdt.getTotal(),statAdt.getMax());
        System.out.format("%-15s %3d number is %6.1f\n","Min of these",statAdt.getTotal(),statAdt.getMin());
        System.out.format("%-15s %3d number is %6.1f\n","SD of these",statAdt.getTotal(),statAdt.getSD());

    }
}
