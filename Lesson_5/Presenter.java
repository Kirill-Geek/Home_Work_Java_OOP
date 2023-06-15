package Lesson_5;

public class Presenter {
    View view;
    Model model;
    public Presenter (Model m, View v){
        model = m;
        view = v;
    }
    public void buttonClic(){
        int x = view.getValue();
        int y = view.getValue();
        char act = view.getAct();
        model.setX(x);
        model.setY(y);
        System.out.println(model.result(act));
    }
}
