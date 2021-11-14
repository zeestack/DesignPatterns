package com.zahid.builder;

public class MovieBuilder implements PresentationBuilder {
    private final Movie movie = new Movie();

    @Override
    public void addSlide(Slide slide) {
        movie.addFrame(slide.getText(), 4);
    }

    public Movie getMovie() {
        return movie;
    }
}
