package pl.gregorymartin.as6.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pl.gregorymartin.as6.model.Movie;
import pl.gregorymartin.as6.service.MovieService;
import pl.gregorymartin.as6.service.VideoAnnotation;

import java.net.URI;

@RestController
@RequestMapping("/api")
class MovieController {
    private MovieService service;

    public MovieController(final MovieService service) {
        this.service = service;
    }

    @PostMapping
    @VideoAnnotation
    ResponseEntity<Movie> createTask(@RequestBody @Validated Movie toCreate) {
        service.getMovies().add(toCreate);
        return ResponseEntity.created(URI.create("/")).body(toCreate);
    }
}
