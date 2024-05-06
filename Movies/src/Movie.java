public class Movie {
    String title;
    int year;
    String director;
    String genre;
    int rating;
    public Movie(String title, int year, String director, String genre, int rating) {
        this.title = title;
        this.year = year;
        this.director = director;
        this.genre = genre;
        this.rating = rating;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    @Override
    public String toString() {
        return "Movie:" +
                "title='" + title + '\'' +
                ", year=" + year +
                ", director='" + director + '\'' +
                ", genre='" + genre + '\'' +
                ", rating=" + rating
                ;
    }
}
