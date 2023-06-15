package Lesson_5;

public class Presenter {
    View view;
    Model model;
    public Presenter (Model m, View v){
        model = m;
        view = v;
    }
    public void buttonClic(){
        //int x = view.getValue();
        //int y = view.getValue();
        //char act = view.getAct();
        model.setX(view.getValue());
        model.setY(view.getValue());
        double result = model.result(view.getAct());
        System.out.println(result);
    }
}
