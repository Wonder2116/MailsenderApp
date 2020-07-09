package pl.gregorymartin.as6.service;

import org.springframework.stereotype.Service;
import pl.gregorymartin.as6.model.Movie;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Service
public
class MovieService {
    private List<Movie> movies;

    public MovieService() {
        movies = new ArrayList<>();
        movies.add(new Movie("Titanic", LocalDate.of(2002,10,10),"Cameron"));
        movies.add(new Movie("Terminator", LocalDate.of(2012,7,20),"JJ Abrams"));
        movies.add(new Movie("Sherlock Holmes", LocalDate.of(2015,11,15),"Afleck"));
        movies.add(new Movie("Matrix", LocalDate.of(2005,12,21),"Wachowski"));
        movies.add(new Movie("Hulk", LocalDate.of(2011,1,12),"Uwe"));
    }

    public List<Movie> getMovies() {
        return movies;
    }
}
