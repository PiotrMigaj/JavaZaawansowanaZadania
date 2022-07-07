package pl.migibud.designpattern.interpreter.ex1;

public abstract class Interpreter {

//    public void calculate(Context context){
//        if (context.getRomanNumber().length()==0){
//            return;
//        }
//
//        context.getRomanNumber().startsWith(nine()){
//            context.setArabicNumber(context.getArabicNumber()+(9*factor()));
//            context.setRomanNumber(context.getRomanNumber().substring(2));
//        }
//    }

    public abstract  String one();
    public abstract  String four();
    public abstract  String five();
    public abstract  String nine();
    public abstract  int factor();

}
