package es.upm.miw.iwvg_devops.code;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;

public class UserTest {
    private User user;

    @BeforeEach
    void before() {
        List<Fraction> fractions = List.of(
                new Fraction(0, 0),
                new Fraction(1, 0),
                new Fraction(1, 1)
        );

        user = new User("1", "Paco", "Martinez", fractions);
    }

    @Test
    void testGetAttributes() {
        assertEquals("1", user.getId());
        assertEquals("Paco", user.getName());
        assertEquals("Martinez", user.getFamilyName());

    }

    @Test
    void testMethods() {
        assertEquals("Paco Martinez", user.fullName());
        assertEquals("P.", user.initials());
    }
}
