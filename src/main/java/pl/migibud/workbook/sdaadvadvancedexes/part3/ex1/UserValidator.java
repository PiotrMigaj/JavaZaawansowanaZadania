package pl.migibud.workbook.sdaadvadvancedexes.part3.ex1;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserValidator {

    public static String[] validateEmails(String email, String alternativeEmail){

        Email email1 = new Email(email);
        Email email2 = new Email(alternativeEmail);
        return new String[]{email1.email,email2.email};
    }

    private static class Email{

        private String email;
        private final static Pattern MAIL_REGEX = Pattern.compile("[a-zA-Z0-9_.]+@[a-zA-Z0-9]+(\\.com)?");

        public Email(String email) {
            this.email = email;
            this.validateEmail();
        }

        private void validateEmail(){
            if (email==null){
                email="unknown";
                return;
            }
            if (email==""){
                email="unknown";
                return;
            }
            if (!validateRegex()){
                email="unknown";
            }
        }

        private boolean validateRegex(){
            return MAIL_REGEX.matcher(email).matches();
        }
    }

}
