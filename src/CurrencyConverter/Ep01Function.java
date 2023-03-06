package CurrencyConverter;



import javax.swing.*;

public class Ep01Function {


    public boolean check (String minput){
        try {
            double x = Double.parseDouble(minput); // x is an input, он превращает стринг в числа
            if (x >= 0 || x < 0){
                return true;
            }
        }catch (NumberFormatException e){
            return false;
        }

        return true;
    }




    public void dollarToNok(double minput){
        double nok = minput * 9.91; // This is norway crons official course
        JOptionPane.showMessageDialog(null,"Amount of nok is " + nok);

    }
    public void dollarToJpy(double minput){
        double jpy = minput * 139.24; // This is norway crons official course
        JOptionPane.showMessageDialog(null,"Amount of Jpy is " + jpy);

    }
}
