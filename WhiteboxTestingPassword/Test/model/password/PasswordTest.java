package model.password;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertThrows;
import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;

class PasswordTest {

    private Password password;

    @BeforeEach void setUp() {
      //  password = new Password("ABCabc123");
    }

    @Test void constructornullpassword() {
        assertThrows(IllegalArgumentException.class, () -> new Password(null));
    }
    @Test void constructorlength5() {
        assertThrows(IllegalArgumentException.class, () -> new Password("12345"));
    }

    @Test void constructorlength6() {
        assertDoesNotThrow(()-> new Password("ABc12"));
    }

    @Test void constructorlength9(){
        assertDoesNotThrow(()-> new Password("ABCdef123"));
    }

    @Test void constructorzerouppercase(){
        assertThrows(IllegalArgumentException.class,()-> new Password("Aa123"));
    }

    @Test void constructorzerolowercase(){
        assertDoesNotThrow(()-> new Password("ABC123"));
    }


}