package CodeChallenges.Challenge13;

import CodeChallenges.Challenge12.AnimalShelter;
import CodeChallenges.Challenge12.Animals;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;


public class AppTest {

   ValidateBrackets validateBrackets;

   @BeforeEach
    void setUp(){
       validateBrackets = new ValidateBrackets();
   }

   @Test
    @DisplayName("Validate Brackets balance test")
    void validateBracketsTest(){

//       assertTrue(validateBrackets.validateBrackets("{}"));
//       assertTrue(validateBrackets.validateBrackets("{}(){}"));
//       assertTrue(validateBrackets.validateBrackets("()[[Extra Characters]]"));
//       assertTrue(validateBrackets.validateBrackets("(){}[[]]"));
//       assertTrue(validateBrackets.validateBrackets("{}{Code}[Fellows](())"));
//       assertFalse(validateBrackets.validateBrackets("[({}]"));
//       assertFalse(validateBrackets.validateBrackets("(]("));
//       assertFalse(validateBrackets.validateBrackets("{(})"));

   }




}
