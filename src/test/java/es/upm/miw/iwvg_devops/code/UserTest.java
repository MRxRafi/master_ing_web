package es.upm.miw.iwvg_devops.code;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.List;

public class UserTest {
    private User user;

    @BeforeEach
    void before() {
        List<Fraction> fractions = new ArrayList<Fraction>();
        fractions.add(new Fraction(0, 0));
        fractions.add(new Fraction(1, 0));
        fractions.add(new Fraction(1, 1));

        user = new User("1", "Paco", "Martinez", fractions);
    }

    @Test
    void testGetAttributes() {
        assertEquals("1", user.getId());
        assertEquals("Paco", user.getName());
        assertEquals("Martinez", user.getFamilyName());

    }

    @Test
    void testSetAttributes(){
        String newName = "Pepe";
        String newFamilyName = "Reina";

        user.setName(newName);
        user.setFamilyName(newFamilyName);

        assertEquals(newName, user.getName());
        assertEquals(newFamilyName, user.getFamilyName());
    }

    @Test
    void testMethods() {
        assertEquals("Paco Martinez", user.fullName());
        assertEquals("P.", user.initials());
    }

    @Test
    void testAddFraction(){
        Fraction newFraction = new Fraction(4, 8);
        user.addFraction(newFraction);

        assertEquals(true, user.getFractions().contains(newFraction));
    }
}
