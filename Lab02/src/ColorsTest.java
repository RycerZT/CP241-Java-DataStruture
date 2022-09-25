import javax.swing.*;
public class ColorsTest {
    public static void main (String arg[]){
        char choice;
        String inpStr;
        MyColor.ColorEnum color1, color2;
        MyColor.ColorEnum color3[] = new MyColor.ColorEnum[2];
        MyColor mixColor = new MyColor(MyColor.ColorEnum.RED);
        MyColor pColor = new MyColor(MyColor.ColorEnum.RED);
        MyColor formColor = new MyColor(MyColor.ColorEnum.RED);
        MyColor assignColor = new MyColor(MyColor.ColorEnum.RED);
        choice = 0;
        while (choice != '9'){
            boolean result1, result2;
            inpStr = JOptionPane.showInputDialog(null, "Test Operations of ADT Color"+"\n"+"1 Mix"+"\n"+"2 Primary Color"+"\n"+"3 Form"+"\n"+"4 Assign"+"\n"+"9 Quit"+"\n");
            choice = inpStr.charAt(0);
            if (choice =='1'){
                color1 = ColorADT.ColorEnum.valueOf(JOptionPane.showInputDialog(null,"Enter hte first primary color:"));
                while (pColor.primary(color1) == false){
                    color1 = ColorADT.ColorEnum.valueOf(JOptionPane.showInputDialog(null,"Invalid Color! Ennter the color that is not primary:"));
                }
                color2 = ColorADT.ColorEnum.valueOf(JOptionPane.showInputDialog(null,"Enter the second primary color:"));
                while ((pColor.primary(color2))== false){
                    color2 = ColorADT.ColorEnum.valueOf(JOptionPane.showInputDialog(null,"Invalid Color! Ennter the color that is not primary:"));
                }
                System.out.println(mixColor.Mix(color1,color2));
            } else if (choice == '2') {
                color1 = ColorADT.ColorEnum.valueOf(JOptionPane.showInputDialog(null, "Enter The Color:"));
                if(pColor.primary(color1)){
                    System.out.println("A primary color");
                }else{
                    System.out.println(color1);
                    System.out.println("Not a primary color");

                }
            } else if (choice == '3') {
                color1 = ColorADT.ColorEnum.valueOf(JOptionPane.showInputDialog(null, "Enter The Color:"));
                while (pColor.primary(color1)== true){
                    ColorADT.ColorEnum.valueOf(JOptionPane.showInputDialog(null,"Invalid Color! Enter the color that not primary:"));
                }
                color3 = formColor.form(color1);
                System.out.println(color3[0] +" "+ color3[1] +"That from the color "+ color1);
            }else if (choice == '4'){
                color1 = ColorADT.ColorEnum.valueOf(JOptionPane.showInputDialog(null, "Enter The Color:"));
                while(pColor.primary(color1)==false){
                    color1 = ColorADT.ColorEnum.valueOf(JOptionPane.showInputDialog(null, "Invalid Color! Enter the pirmary color:"));
                }
                color2 = ColorADT.ColorEnum.valueOf((JOptionPane.showInputDialog(null, "Enter The Second Color;")));
                while(pColor.primary(color2)==false){
                    color2 = ColorADT.ColorEnum.valueOf(JOptionPane.showInputDialog(null, "Invalid Color! Enter the primary color:"));
                }
            }
        }


    }
}
