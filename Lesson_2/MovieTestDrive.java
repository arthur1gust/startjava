public class MovieTestDrive {
  public static void main (String[] args) {
    Movie one = new Movie();
    one.title = "Inception";
    one.genre = "Army";
    one.rating = 8;
    Movie two = new Movie();
    two.title = "The race";
    two.genre = "Arcade";
    two.rating = 6;
    two.playIt();
  }
}

class Movie {
 String title;
 String genre;
 int rating;

 void playIt() {
    System.out.println("Проигрывание Фильма");
 }
}