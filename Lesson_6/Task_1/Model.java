package Lesson_6.Task_1;

public class Model {
    double res;

    public Model(){
    }

    public double result(char Act,double x, double y){
        char act = Act;
        if (act == '+'){
            res = x + y;
        }
        if(act == '-'){
            res = x - y;
        }
        if(act == '*'){
            res = x * y;
        }
        if(act == '/' ){
            try {
                if (y == 0) throw new Exception("Делить на 0 нельзя");
                res = x / y;
            }
            catch (Exception ex){
                System.out.println(ex.getMessage());
            }
        }
        return res;
    }
}
