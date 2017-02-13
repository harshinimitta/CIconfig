package villanova.studio.org;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

public class IssueParserTest {

    IssueParser issueParser = new IssueParser();
    String fileContents = null;

    @Before
    public void testSetUp() {
        File file = new File("sample-output.txt");

        try {
            BufferedReader br = new BufferedReader(new FileReader(file));
            String currentLine = null;
            while ((currentLine = br.readLine()) != null) {
                fileContents += currentLine;
            }
            // System.out.println(fileContents);
        }
        catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void testparseIssues() {
        if (fileContents.length() != 0) {
            List<Issue> issues = issueParser.parseIssues(fileContents);
            assertEquals(3, issues.size());
            Issue issueOne=issues.get(0);
            assertEquals(2302895, issueOne.getId());
            assertEquals(1, issueOne.getNumber());
            assertEquals("hw2", issueOne.getTitle());
            assertEquals("open", issueOne.getState());
            assertEquals("Issue3 created as part of Hw2", issueOne.getBody());
            assertEquals("2017-02-06T14:56:05Z", issueOne.getCreatedAt());
            assertNull(issueOne.getClosedAt());
            assertEquals(19966199, issueOne.getUser().getId());
            assertEquals("harshinimitta", issueOne.getAssignee().getLogin());
        }
    }

}
