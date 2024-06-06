import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {
    List<User> users;

    @BeforeEach
    void setUp() {
        System.out.println("setUp");
        users = List.of(
                new User("john", "john_sobaka@mail.com"),
                new User("gena", "crocodail@mail.com"),
                new User("tom", "cat@mail.com"),
                new User("jerry", "mause@mail.com"),
                new User("bob", "bobik@mail.com")
        );
        Main.initSet(users);
    }


    @Test
    void isUserOk() {

        Assertions.assertAll(
                ()->Assertions.assertFalse(Main.isUserOk(new User("tom", "catty@mail.com")), "nickname exists test"),
                ()->Assertions.assertFalse(Main.isUserOk(new User("sam", "mause@mail.com")),"email exists test"),
                ()->Assertions.assertTrue(Main.isUserOk(new User("tommy", "lee@mail.com")),"all is ok"),
                ()->Assertions.assertFalse(Main.isUserOk(new User("", "catty@mail.com")),"empty nickname test"),
                ()->Assertions.assertFalse(Main.isUserOk(new User("hacker", "")),"empty email test")
    );

    }


    @Test
    void isUserOk1() {

        Assertions.assertAll(
                ()->Assertions.assertFalse(Main.isUserOk(new User("tom", "catty@mail.com")), "nickname exists test"),
                ()->Assertions.assertFalse(Main.isUserOk(new User("sam", "mause@mail.com")),"email exists test"),
                ()->Assertions.assertTrue(Main.isUserOk(new User("tommy", "lee@mail.com")),"all is ok"),
                ()->Assertions.assertFalse(Main.isUserOk(new User("", "catty@mail.com")),"empty nickname test"),
                ()->Assertions.assertFalse(Main.isUserOk(new User("hacker", "")),"empty email test")
        );

    }

}