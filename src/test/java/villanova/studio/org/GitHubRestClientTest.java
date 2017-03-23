package villanova.studio.org;

import java.util.HashMap;
import java.util.Map;

import org.junit.Test;

public class GitHubRestClientTest {

    @Test
    public void test() {
        GitHubRestClient gc=new GitHubRestClient();
        Map<String,String> paramMap=new HashMap<String,String>();
        paramMap.put("state", "closed");
        try {
            String response=gc.requestIssues("harshinimitta", "$Harshi321", paramMap);
            System.out.println(response);
        }
        catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

}
