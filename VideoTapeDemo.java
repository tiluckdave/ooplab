// "Write a program, to implement the following hierarchy. Displays information of each class the rectangle represents the classes. The classes Movie and MusicVideo inherits all the members of the class VideoTape.

//                       VideoTape
        //             Title, Length, Available
        //             Show()


        // Movie                           MusicVideo
        // Director, Rating                Artist, category
        // Show()                          Show()    

import java.util.Scanner;

class VideoTape {
    private String title;
    private int length;
    private boolean available;

    public VideoTape(String title, int length, boolean available) {
        this.title = title;
        this.length = length;
        this.available = available;
    }

    public String getTitle() {
        return title;
    }

    public int getLength() {
        return length;
    }

    public boolean isAvailable() {
        return available;
    }

    public void show() {
        System.out.println("Title: " + title);
        System.out.println("Length: " + length);
        System.out.println("Available: " + available);
    }
}

class Movie extends VideoTape {
    private String director;
    private String rating;

    public Movie(String title, int length, boolean available, String director, String rating) {
        super(title, length, available);
        this.director = director;
        this.rating = rating;
    }

    public String getDirector() {
        return director;
    }

    public String getRating() {
        return rating;
    }

    @Override
    public void show() {
        super.show();
        System.out.println("Director: " + director);
        System.out.println("Rating: " + rating);
    }
}

class MusicVideo extends VideoTape {
    private String artist;
    private String category;

    public MusicVideo(String title, int length, boolean available, String artist, String category) {
        super(title, length, available);
        this.artist = artist;
        this.category = category;
    }

    public String getArtist() {
        return artist;
    }

    public String getCategory() {
        return category;
    }

    @Override
    public void show() {
        super.show();
        System.out.println("Artist: " + artist);
        System.out.println("Category: " + category);
    }
}

public class VideoTapeDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        VideoTape[] videoTapes = new VideoTape[2];

        // Accept data for 5 VideoTapes
        for (int i = 0; i < 2; i++) {
            System.out.println("Enter details for VideoTape " + (i + 1));
            System.out.print("Title: ");
            String title = scanner.nextLine();
            System.out.print("Length: ");
            int length = Integer.parseInt(scanner.nextLine());
            System.out.print("Available: ");
            boolean available = Boolean.parseBoolean(scanner.nextLine());

            System.out.println("Enter 1 for Movie, 2 for MusicVideo");
            int choice = Integer.parseInt(scanner.nextLine());

            if (choice == 1) {
                System.out.print("Director: ");
                String director = scanner.nextLine();
                System.out.print("Rating: ");
                String rating = scanner.nextLine();

                videoTapes[i] = new Movie(title, length, available, director, rating);
            } else if (choice == 2) {
                System.out.print("Artist: ");
                String artist = scanner.nextLine();
                System.out.print("Category: ");
                String category = scanner.nextLine();

                videoTapes[i] = new MusicVideo(title, length, available, artist, category);
            }
        }

        // Display details of all VideoTapes
        for (int i = 0; i < 2; i++) {
            System.out.println("Details of VideoTape " + (i + 1));
            videoTapes[i].show();
            System.out.println();
        }
    }
}

