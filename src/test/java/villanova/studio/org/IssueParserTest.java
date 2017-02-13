package villanova.studio.org;

import static org.junit.Assert.assertEquals;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
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
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

    @Test
    public void testparseIssues() {
        if (fileContents.length() != 0) {
            List<Issue> issues = issueParser.parseIssues(fileContents);
            assertEquals(3, issues.size());
        }
    }

}
