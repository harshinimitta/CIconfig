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
        int hashcode1 = issue1.hashCode();
        int hashcode2 = issue1.hashCode();
        assertEquals(hashcode1, hashcode2);
    }

    @Test
    public void testToString() {
        issue1.setState("Open");
        assertTrue(issue1.toString().contains("Open"));
        Issue issue=new Issue();
        assertNull(issue);
    }
}
