package recombee;

import com.recombee.api_client.RecombeeClient;
import com.recombee.api_client.util.Region;

public class RecombeeClientWrapper {
    private static String DB_NAME = "acs-sac-dev";
    private static String TOKEN = "4T5H1KFRt73jEJaOipJCrV8jtl56gSQqnZYCa1iUVIcihj6WMU7kurzgdZgr6SuD";

    private RecombeeClient client;

    public RecombeeClientWrapper() {
        client = new RecombeeClient(DB_NAME, TOKEN).setRegion(Region.EU_WEST);
    }


}
