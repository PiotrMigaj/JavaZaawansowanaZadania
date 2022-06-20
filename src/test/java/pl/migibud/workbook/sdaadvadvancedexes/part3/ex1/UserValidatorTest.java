package pl.migibud.workbook.sdaadvadvancedexes.part3.ex1;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class UserValidatorTest {

    @Test
    void shouldReturnValidatedEmails(){
        //given
        String email1 = "pmigaj@gmail.com";
        String email2 = "hello";
        //when
        String[] result = UserValidator.validateEmails(email1,email2);
        //then
        assertThat(result).containsExactly("pmigaj@gmail.com","unknown");
    }

}