import dataset.Movie;
import parser.DatasetParser;

import java.io.FileNotFoundException;
import java.util.List;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        List<Movie> movieDataset = DatasetParser.parseMovieDataset();
    }
}
