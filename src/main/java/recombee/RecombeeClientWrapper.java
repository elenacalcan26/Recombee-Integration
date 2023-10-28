package recombee;

import com.recombee.api_client.RecombeeClient;
import com.recombee.api_client.api_requests.AddItemProperty;
import com.recombee.api_client.api_requests.AddUser;
import com.recombee.api_client.api_requests.SetItemValues;
import com.recombee.api_client.exceptions.ApiException;
import com.recombee.api_client.util.Region;
import dataset.Movie;
import user.UsersIds;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.logging.*;

public class RecombeeClientWrapper {
    private static String DB_NAME = "acs-sac-dev";
    private static String TOKEN = "4T5H1KFRt73jEJaOipJCrV8jtl56gSQqnZYCa1iUVIcihj6WMU7kurzgdZgr6SuD";

    private static String PRIVATE_TOKEN = "qBvPhSEUkpkAt4GkFsxyeeG58QSjmD6gbrpfICSPyaY3ryRGfHHHfcEvczxsuCH9";

    private RecombeeClient client;

    private ArrayList<Movie> movieDataset;
    private Logger logger = Logger.getLogger(RecombeeClientWrapper.class.getName());

    public RecombeeClientWrapper(ArrayList<Movie> movieDataset) {
        client = new RecombeeClient(DB_NAME, PRIVATE_TOKEN).setRegion(Region.EU_WEST);
        this.movieDataset = movieDataset;
    }

    public void populateRecombeeDatabase() throws ApiException {
        addItemProperties();
        sendItemValues();
    }

    public void addItemProperties() throws ApiException {
        client.send(new AddItemProperty("title", "string"));
        client.send(new AddItemProperty("genre", "string"));
        client.send(new AddItemProperty("description", "string"));
        client.send(new AddItemProperty("director", "string"));
        client.send(new AddItemProperty("actors", "string"));
        client.send(new AddItemProperty("year", "int"));
        client.send(new AddItemProperty("runtime", "int"));
        client.send(new AddItemProperty("rating", "double"));
        client.send(new AddItemProperty("votes", "int"));
        client.send(new AddItemProperty("revenue", "double"));
        client.send(new AddItemProperty("metascore", "int"));
    }

    public void sendItemValues() throws ApiException {
        for (Movie movie : movieDataset) {
            client.send(new SetItemValues(String.valueOf(movie.getRank()),
                new HashMap<String, Object>() {{
                    put("title", movie.getTitle());
                    put("genre", movie.getGenre());
                    put("description",movie.getDescription());
                    put("director", movie.getDirector());
                    put("actors", movie.getActors());
                    put("year", movie.getYear());
                    put("runtime", movie.getRuntime());
                    put("rating", movie.getRating());
                    put("votes", movie.getVotes());
                    put("revenue", movie.getRevenue());
                    put("metascore", movie.getMetascore());
                }}
            ).setCascadeCreate(true));
        }
    }

    public void addUsers() throws ApiException {
      logger.info("Add Users Ids to the database!");

      client.send(new AddUser(UsersIds.USER1));
      client.send(new AddUser(UsersIds.USER2));
      client.send(new AddUser(UsersIds.USER3));
      client.send(new AddUser(UsersIds.USER4));
      client.send(new AddUser(UsersIds.USER5));

      logger.info("Done! Users Ids are added to the database!");
    }

}
