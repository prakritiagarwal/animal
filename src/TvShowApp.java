
import java.util.ArrayList;
import java.util.Scanner;

public class TvShowApp
 {
    public static void main(String[] args){
        System.out.println("Animal Menu");
        System.out.println("Entering nothing will stop the loop");
        Scanner scanner = new Scanner (System.in);
        ArrayList<TvShow> shows = new ArrayList<TvShow>();
        String showName;
        String genre;
        Integer numberOfEpisodes;
        do {
            System.out.println("Please enter show name");
            showName = scanner.nextLine();
            if(showName.isEmpty())
                break;
            System.out.println("Please enter Show Genre");
            genre = scanner.nextLine();
            
            System.out.println("Please enter number of episodes");
            numberOfEpisodes = Integer.valueOf(scanner.nextLine());
            TvShow show = new TvShow(showName, numberOfEpisodes, genre);
            shows.add(show);
        } while(true);

        for (TvShow show : shows) {
            System.out.println(show);
        }        
        scanner.close();
    }

}
