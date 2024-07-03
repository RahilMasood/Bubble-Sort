import java.util.*;
class movieMagic
{
    int year;
    String title;
    float rating;
    movieMagic()
    {
        year = 0;
        title = "";
        rating = 0.0f;
    }
    void accept()
    {
        Scanner Sc = new Scanner(System.in);
        System.out.println("Enter the year movie was released in");
        year = Sc.nextInt();
        System.out.println("Enter the name of the movie");
        title = Sc.next();
        System.out.println("Enter the rating of the movie(Lowest being 0 and Highest being 5)");
        rating = Sc.nextFloat();
    }
    void display()
    {
        System.out.println("Year       : "+year);
        System.out.println("Name       : "+title);
        System.out.println("Rating     : "+rating);
        System.out.print("Movie type : ");
        if(rating <= 2)
        {
            System.out.println("Flop");
        }
        else if(rating <= 3.4)
        {
            System.out.println("Semi - Hit");
        }
        else if(rating <= 4.5)
        {
            System.out.println("Hit");
        }
        else
        {
            System.out.println("Super - Hit");
        }
    }
    public static void main(String args[])
    {
        movieMagic ob = new movieMagic();
        ob.accept();
        ob.display();
    }
}
