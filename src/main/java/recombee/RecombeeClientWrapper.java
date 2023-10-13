package recombee;

import com.recombee.api_client.RecombeeClient;
import com.recombee.api_client.api_requests.SetItemValues;
import com.recombee.api_client.exceptions.ApiException;
import com.recombee.api_client.util.Region;
import dataset.Movie;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class RecombeeClientWrapper {
    private static String DB_NAME = "acs-sac-dev";
    private static String TOKEN = "4T5H1KFRt73jEJaOipJCrV8jtl56gSQqnZYCa1iUVIcihj6WMU7kurzgdZgr6SuD";

    private RecombeeClient client;

    private ArrayList<Movie> movieDataset;

    public RecombeeClientWrapper(ArrayList<Movie> movieDataset) {
        client = new RecombeeClient(DB_NAME, TOKEN).setRegion(Region.EU_WEST);
        this.movieDataset = movieDataset;
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
}
