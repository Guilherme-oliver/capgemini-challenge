package secondQuestion;

import java.util.Arrays;
import java.util.List;

public class User {
    private String name;
    private String password;
    private Boolean sizeValidation = false;
    private Boolean upperCaseValidation = false;
    private Boolean lowerCaseValidation = false;
    private Boolean numberValidation = false;
    private Boolean specialCharValidation = false;


    public User(String name, String password) {
        validatePassword(password);
        if (this.upperCaseValidation == true && this.lowerCaseValidation == true && this.numberValidation == true && this.specialCharValidation == true){
            this.name = name;
            this.password = password;
        }

    }

    public String getName() {
        return name;
    }

    public String getPassword() {
        return password;
    }

    public Boolean getSizeValidation() {
        return sizeValidation;
    }

    public Boolean getUpperCaseValidation() {
        return upperCaseValidation;
    }

    public Boolean getLowerCaseValidation() {
        return lowerCaseValidation;
    }

    public Boolean getNumberValidation() {
        return numberValidation;
    }

    public Boolean getSpecialCharValidation() {
        return specialCharValidation;
    }

    private void validatePassword(String password){
        validateSize(password);
        if (sizeValidation == true){

            char[] passwordCharacteres = password.toCharArray();
            for (int i = 0; i <= passwordCharacteres.length -1; i++){
                this.validateUpperCase(passwordCharacteres[i]);
                this.validateNumber(passwordCharacteres[i]);
                this.validateLowerCase(passwordCharacteres[i]);
                this.validateSpecialChar(passwordCharacteres[i]);

            }

        }
    }

    private void validateSize(String password){
        if (password.length() >= 6){
            this.sizeValidation = true;
        }
        else {
            System.out.println("Minimun 6 characteres");
        }

    }

    private void validateUpperCase(char passwordCharacter){
        if (Character.isUpperCase(passwordCharacter) ){
            this.upperCaseValidation = true;
        }
    }

    private void validateLowerCase(char passwordCharacter){
        if (Character.isLowerCase(passwordCharacter)){
            this.lowerCaseValidation = true;
        }
    }

    private void validateNumber(char passwordCharacter){
        if (Character.isDigit(passwordCharacter)){
            this.numberValidation = true;
        }
    }

    private void validateSpecialChar(char passwordCharacter){
        String character = String.valueOf(passwordCharacter);
        if ("!@#$%^&*()-+".contains(character)){
            this.specialCharValidation = true;
        }
    }



}
