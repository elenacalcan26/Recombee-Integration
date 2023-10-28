import com.recombee.api_client.exceptions.ApiException;
import dataset.Movie;
import parser.DatasetParser;
import recombee.RecombeeClientWrapper;
import user.UsersIds;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws FileNotFoundException, ApiException {
        // Milestone 1
        List<Movie> movieDataset = DatasetParser.parseMovieDataset();
        RecombeeClientWrapper recombeeClientWrapper = new RecombeeClientWrapper((ArrayList<Movie>) movieDataset);
//        recombeeClientWrapper.populateRecombeeDatabase();

        // Milestone 2
//        recombeeClientWrapper.addUsers();

//        recombeeClientWrapper.addUserInteractions();

        recombeeClientWrapper.getUserRecommendation(UsersIds.USER1, 3);
        recombeeClientWrapper.getUserRecommendation(UsersIds.USER2, 3);
    }
}
