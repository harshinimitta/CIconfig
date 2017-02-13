package villanova.studio.org;

import static org.junit.Assert.*;

import org.junit.Test;

public class UserTest {

    User user1 = new User();
    User user2 = new User();

    @Test
    public void testEquals() {
        user1.setId(20);
        user2.setId(21);
        if (user1.hashCode() == user2.hashCode()) {
            assertTrue(user1.equals(user2));
        }
        else {
            assertFalse(user1.equals(user2));
        }
    }

    @Test
    public void testHashcode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + user2.getId();
        assertEquals(result, user2.hashCode());
    }

}
