import javax.swing.JOptionPane;

public class KpkFpb {

    public static void main(String[] args) {

        String input=JOptionPane.showInputDialog("Enter the first number");
        int num1=Integer.parseInt(input);
        String input2=JOptionPane.showInputDialog("Enter the second number");
        int num2=Integer.parseInt(input2);

        int a;  //variabel pembagi
        int b;  //menyimpan hasil mod
        int c;  //menyimpan hasil mod
        int FPB=0;   //Faktor persekutuan terbesar
        int KPK;     //Kelipatan persekutuan terkecil
        
        for (a=1; a <= num1 ; a++){
            b=num1 % a;
            c=num2 % a;

            if (b==c && b==0 && c==0){
                FPB=a;
            }

        }
        KPK = (num1*num2)/FPB;
        JOptionPane.showMessageDialog(null, "FPB dari ("+num1+", "+num2+") adalah "+ FPB +"\nKPK dari ("+num1+", "+num2+") adalah "+KPK);
        

    }

}
