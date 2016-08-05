package ro.mtalexandru.client;

import org.junit.Test;
import ro.mtalexandru.model.Activity;

/**
 * Created by malexandru on 8/5/2016.
 */

import static org.junit.Assert.*;
public class ActivityClientTest {

    @Test
    public void testGet() throws Exception {
        ActivityClient activityClient = new ActivityClient();
        Activity activity = activityClient.get("1234");
        System.out.println("## test : " + activity);

        assertNotNull(activity);
    }
}