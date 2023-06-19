package Lesson_6.Task_1;

import java.text.DecimalFormat;

public class Presenter {
    View view;
    Model model;
    public Presenter (Model m, View v){
        model = m;
        view = v;
    }
    public void buttonClic(){
        double x = view.getValue();
        char act = view.getAct();
        double y = view.getValue();
        DecimalFormat Format = new DecimalFormat("#.###");
        System.out.printf("Ответ - %s\n",Format.format(model.result(act, x, y)));
    }
}
