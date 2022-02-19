package secondQuestion;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import secondQuestion.User;

import javax.xml.namespace.QName;

public class UserTest {

    @Test
    public void should_create_user(){
        User user = new User( "Abel", "Ya3&ab");
        Assertions.assertTrue(user.getSizeValidation());
        Assertions.assertTrue(user.getUpperCaseValidation());
        Assertions.assertTrue(user.getLowerCaseValidation());
        Assertions.assertTrue(user.getNumberValidation());
        Assertions.assertTrue(user.getSpecialCharValidation());
    }

    @Test
    public void should_not_create_user_with_invalid_password_size(){
        User user = new User( "Abel", "a3&ab");
        Assertions.assertFalse(user.getSizeValidation());
        Assertions.assertFalse(user.getUpperCaseValidation());
        Assertions.assertFalse(user.getLowerCaseValidation());
        Assertions.assertFalse(user.getNumberValidation());
        Assertions.assertFalse(user.getSpecialCharValidation());
    }

    @Test
    public void should_not_create_user_without_upper_char(){
        User user = new User( "Abel", "ya3&ab");
        Assertions.assertTrue(user.getSizeValidation());
        Assertions.assertFalse(user.getUpperCaseValidation());
        Assertions.assertTrue(user.getLowerCaseValidation());
        Assertions.assertTrue(user.getNumberValidation());
        Assertions.assertTrue(user.getSpecialCharValidation());
    }

    @Test
    public void should_not_create_user_without_lower_char(){
        User user = new User( "Abel", "YA3&AB");
        Assertions.assertTrue(user.getSizeValidation());
        Assertions.assertTrue(user.getUpperCaseValidation());
        Assertions.assertFalse(user.getLowerCaseValidation());
        Assertions.assertTrue(user.getNumberValidation());
        Assertions.assertTrue(user.getSpecialCharValidation());
    }

    @Test
    public void should_not_create_user_without_number(){
        User user = new User( "Abel", "YAa&AB");
        Assertions.assertTrue(user.getSizeValidation());
        Assertions.assertTrue(user.getUpperCaseValidation());
        Assertions.assertTrue(user.getLowerCaseValidation());
        Assertions.assertFalse(user.getNumberValidation());
        Assertions.assertTrue(user.getSpecialCharValidation());
    }

    @Test
    public void should_not_create_user_without_special_char(){
        User user = new User( "Abel", "Y2aEAB");
        Assertions.assertTrue(user.getSizeValidation());
        Assertions.assertTrue(user.getUpperCaseValidation());
        Assertions.assertTrue(user.getLowerCaseValidation());
        Assertions.assertTrue(user.getNumberValidation());
        Assertions.assertFalse(user.getSpecialCharValidation());
    }


}
