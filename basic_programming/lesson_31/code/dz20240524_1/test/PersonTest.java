import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PersonTest {

    @Test
    @DisplayName("of: regular case")
    void of() {
        String data = "John,18";
        Person expectedResult = new Person("John",18);

        Person actualResult = Person.of(data);

        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Test
    @DisplayName("of: null input")
    void of_ifNullInput_returnNull() {

        Person actualResult = Person.of(null);
        Assertions.assertNull(actualResult);
    }

    @Test
    @DisplayName("of: empty input")
    void of_ifEmptyInput_returnNull() {

        Person actualResult = Person.of("   ");
        Assertions.assertNull(actualResult);
    }

    @Test
    @DisplayName("of: incorrect data input")
    void of_incorrectData_returnNull() {
        String data = "John18";

        Person actualResult = Person.of(data);
        Assertions.assertNull(actualResult);
    }


}