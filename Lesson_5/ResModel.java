package Lesson_5;

public class ResModel extends CalcModel{
    int res;
    public ResModel(){

    }
    @Override
    public int result(char Act){
        super.act = Act;
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

    @Override
    public void setX(int val) {
        super.x = val;
    }

    @Override
    public void setY(int val) {
        super.y = val;
    }

}
