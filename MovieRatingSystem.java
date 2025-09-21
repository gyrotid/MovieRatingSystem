import java.util.Scanner;
//Class that actually collects all the info and gives reccomendations
public class MovieRatingSystem
{
    public static void main(String[] arg)
    {
        Scanner scanner = new Scanner(System.in)

        //Get user name
        System.out.println("Enter your name: ");
        String name = scanner.nextLine();

        //get movie name
        String[] movieNames = new String[5];
        int[] movieRatings = new int[5];

        for (int i = 0; i < 5; i++) {
            System.out.println("\nMovie #" + (i + 1));
            System.out.print("Enter the name of a movie: ");
            movieNames[i] = scanner.nextLine();

        do
        {
            System.out.println("What is your rating (1-10) of this movie?: ");
            rating = scanner.nextInt();
            scanner.nextLine;
        }
        while (rating < 1 || rating > 10)

        return new MovieRating(movie, rating);
    }

    //average rating
    int sum = 0;
    for (int rating : movieRating)
    {
        sum += rating;
    }
    double average = sum / 5.0;
    System.out.println("Average rating: ", average);

    //classification
    if (average >= 9)
    {
        System.out.println("You are a cinephile!")
    }
    else if (average >= 7)
    {
        System.out.println("You enjoy movies quite a bit.")
    }
    else if (average >= 5)
    {
        System.out.println("You have mixed feeling about movies.")
    }
    else
    {
        System.out.println("You are a tough critic!")
    }
    //favorite moive or disliked movie
    boolean movieIs10 = false;
    boolen movieIs4orWorse = false;

    for (int rating : movieRating)
    {
        if (rating == 10)
        {
            movieIs10 = true;
        }
        if (rating < 4)
        {
            movieIs4orWorse = true;
        }
    }

    if (movieIs10)
    {
        System.out.println("Wow! You found a masterpiece!")
    }
    if (movieIs4orWorse)
    {
        System.out.println("That movie didn't impress you much.")
    }

    boolean allGood = true;
    boolean anyStinkers = false;

    for (int rating : movieRating)
    {
        if (rating < 7)
        {
            allGood = false;
        }
        if (rating < 3)
        {
            anyStinkers = true;
        }
    }

    if (allGood)
    {
        System.out.println("You seem to enjoy most movies.");
    }
    else if (anyStinkers)
    {
        System.out.println("You have strong opinions on movies!")
    }

    //genre preferences & recommendation
    System.out.print("What is your favorite genre of movie? (Action, Commedy, Horror, Sci-Fi, etc.)")
    String genre = scanner.nextLine();

    switch (genre)
    {
        case "Action":
            System.out.println("You love excitement and thrills!");
            break;
        case "Comedy":
            System.out.println("You enjoy a good laugh.");
            break;
        case "Horror":
            System.out.println("You have a taste for fear!");
            break;
        case "Drama":
            System.out.println("You appreciate deep storytelling.")
            break;
        case "Sci-Fi":
            System.out.println("You love futuristic and imaginative worlds!");
            break;
        default:
            System.out.println("Good choice!");
    }

    String recommendation = genre("Sci-Fi") ? "We recommend watching 'Interstellar'." : "We recommend watching 'The Dark Knight'.";
    System.out.println(recommendation);
}
