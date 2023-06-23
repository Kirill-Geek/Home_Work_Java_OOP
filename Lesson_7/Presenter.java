package Lesson_7;


public class Presenter {
    SetVal setval;
    Result result;

    public Presenter(SetVal S, Result R) {
        setval = S;
        result = R;
    }

    public void buttonClic() {
        String[] num1 = setval.Setvalue();
        String[] num2 = setval.Setvalue();
        char act = setval.Act();

        String[] printResult = result.Calculator(act, num1, num2);
        System.out.printf("Ответ : %s + %si\n",printResult[0], printResult[1]);
    }

}
