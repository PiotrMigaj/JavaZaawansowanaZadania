package pl.migibud.designpattern.chainofresponsibility.ex1;

public class Main {
    public static void main(String[] args) {

        Helper helper = getHelper();
        helper.handle("Otrzymuję info, że hasło jest błędne");
        helper.handle("Otrzymuję komunikat BusinessException");
        helper.handle("Otrzymuję komunikat Exception");
        helper.handle("Marudzi");

    }

    public static Helper getHelper(){
        Helper faqHelper = new FAQHelper();
        Helper consultantHelper = new ConsultantHelper();
        Helper programmerHelper = new ProgrammertHelper();

        faqHelper.setNextHelper(consultantHelper);
        consultantHelper.setNextHelper(programmerHelper);

        return faqHelper;
    }
}
