package villanova.studio.org;

import static org.junit.Assert.*;

import org.junit.Test;

public class IssueTest {

    Issue issue1 = new Issue();
    Issue issue2 = new Issue();

    @Test
    public void testEquals() {

        issue1.setId(20);
        issue2.setId(21);
        if (issue1.hashCode() == issue2.hashCode()) {
            assertTrue(issue1.equals(issue2));
        }
        else {
            assertFalse(issue1.equals(issue2));
        }

    }

    @Test
    public void testHashcode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + issue1.getId();
        assertEquals(result, issue1.hashCode());
    }
    
    @Test
    public void testToString() {
        //assertEquals
    }

}
