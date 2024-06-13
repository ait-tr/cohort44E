import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

class Main2Test {

    @Test
    void stringsMapToBoolean() {
        List<String> strings = List.of("Jack", "Ann", "Jack", "Lena", "Poul", "Lena");

        Map<String,Boolean> expectedMap = new HashMap<>();
        expectedMap.put("Jack", false);
        expectedMap.put("Ann", true);
        expectedMap.put("Lena", false);
        expectedMap.put("Poul", true);

        Map<String, Boolean> actualMap = Main2.stringsMapToBoolean(strings);
        Assertions.assertEquals(expectedMap,actualMap);


    }
}