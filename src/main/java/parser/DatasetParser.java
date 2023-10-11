package parser;

import com.opencsv.bean.CsvToBeanBuilder;
import dataset.Movie;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.List;

public class DatasetParser {
    private final static String DATASET_CSV_FILE = "IMDB-Movie-Data.csv";

    public static List<Movie> parseMovieDataset() throws FileNotFoundException {

        return new CsvToBeanBuilder(new FileReader(DATASET_CSV_FILE))
                .withType(Movie.class)
                .build()
                .parse();

    }

}
