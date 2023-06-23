package Lesson_7;


public class Result {

    public String[] Calculator(char Act, String[] Num1, String[] Num2) {
        String[] saveResult = new String[Num1.length]; 
        char act = Act;
        String[] num1 = Num1;
        String[] num2 = Num2;
        if (act == '+' || act == '1') {
            for (int i = 0; i < num1.length; i++) {
                int number1 = Integer.parseInt(num1[i]);
                int number2 = Integer.parseInt(num2[i]);
                saveResult[i] = Integer.toString(number1 + number2);
            }

        }
        if (act == '-'|| act == '2') {
            for (int i = 0; i < num1.length; i++) {
                int number1 = Integer.parseInt(num1[i]);
                int number2 = Integer.parseInt(num2[i]);
                int r = number1 - number2;
                if (r < 0) {
                    String rnew = Integer.toString(r);
                    saveResult[i] = "(" + rnew + ")";   
                }
                else {
                    saveResult[i] = Integer.toString(r);
                }
            }
        }
        return saveResult;
    } 

}
