package CurrencyConverter;



import javax.swing.*;
//
public class Ep01Runner {
    public static void main(String[] args) {
        Ep01Function f = new Ep01Function();
        Object [] option1 = {"NOK","YEN","Quit"}; // this is massive
        Object [] option2 = {"Try again","Quit"};
        String input = JOptionPane.showInputDialog(null,"Enter a value:  "); // this is UI
        double Minput = Double.parseDouble(input); // Он превращает String в числа парс







        while (true){ // Если все работает гладко он будет выводить на экран курс этих валют

            System.out.println(input);
            // Это и есть основной механизм нашего приложения, он уже сразу спрашивает сколько долларов нужно перевести в другую валюту


            if (f.check(input) == true){

                int choice1 = JOptionPane.showOptionDialog(null,"Choose wich currency you want to converte","Curency Converter",
                        JOptionPane.YES_NO_CANCEL_OPTION,JOptionPane.QUESTION_MESSAGE,null,option1,option1[2]);

                if (choice1 == 0){
                    f.dollarToNok(Minput);
                    JOptionPane.showMessageDialog(null,"Invalid Output"); // если же что-то пойдет не так, то будет выводить на экран это
                    int choice2 = JOptionPane.showOptionDialog(null,"What do you wish to do","Curency converter",
                            JOptionPane.YES_NO_CANCEL_OPTION,JOptionPane.QUESTION_MESSAGE,null,option2,option2[1]);
                    if(choice2 == 0){

                    }else {
                        break;
                    }
                    break;
                } else if (choice1 == 1) {
                    f.dollarToJpy(Minput);
                    break;
                }else {break;}



            }
            else {
                JOptionPane.showMessageDialog(null,"Invalid Output"); // если же что-то пойдет не так, то будет выводить на экран это
                int choice2 = JOptionPane.showOptionDialog(null,"What do you wish to do","Curency converter",
                        JOptionPane.YES_NO_CANCEL_OPTION,JOptionPane.QUESTION_MESSAGE,null,option2,option2[1]);
                if(choice2 == 0){

                }else {
                    break;
                }
            }

        }


    }
}
