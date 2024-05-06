import java.util.ArrayList;

public class Main {
    public static void main(String[] args){
        ArrayList<Movie> movies = new ArrayList<>();
        System.out.println("Movies Added");
        movies.add(new Movie("Main Hon Na", 2001, "SRK", "Romantic", 10));
        movies.add(new Movie("Ek Tha Tiger", 2012, "SKF", "Action", 9));

        movies.add(new Movie("K.G.F", 2021, "Hash", "Action, Romance", 7));
        System.out.println("Your Favourite Movies Include\n");
          for (Movie movie : movies) {
            System.out.println(movie);
        }
        System.out.println("Now The Size Of The Movie Is: " + movies.size());
        movies.removeFirst();
        System.out.println("The Movie List After Removing Is: \n");
        for (Movie movie : movies) {
            System.out.println(movie);
        }
        movies.set(0, new Movie("Salaar", 2023, "Prabhas", "Action", 10));
        System.out.println("The Movie List After Updating Is: \n");
        for (Movie movie : movies) {
            System.out.println(movie);
        }
        System.out.println("List After Updating The Rating Is: \n");
        for (Movie movie : movies) {
            movie.setRating(movie.getRating() + 1);
            System.out.println(movie);
        }
    }
}
