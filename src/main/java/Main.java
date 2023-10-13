import com.recombee.api_client.exceptions.ApiException;
import dataset.Movie;
import parser.DatasetParser;
import recombee.RecombeeClientWrapper;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws FileNotFoundException, ApiException {
        List<Movie> movieDataset = DatasetParser.parseMovieDataset();
        RecombeeClientWrapper recombeeClientWrapper = new RecombeeClientWrapper((ArrayList<Movie>) movieDataset);
//        recombeeClientWrapper.sendItemValues();
    }
}
