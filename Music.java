public class Music {
    String title;
    String artist;
    int releaseYear;
    double sumNote;
    double totalNote;

    void displayDatasheet() {
        System.out.println("Music: " + title);
        System.out.println("Artist: " + artist);
        System.out.println("Release year: " + releaseYear);
        System.out.println("Popularity: " + totalNote);
    }

    void userNote (double note) {
        sumNote += note;
        totalNote++;
    }
    double returnNotes() {
        return sumNote / totalNote;
    }


    public static void main(String[] args) {
        Music firstArtist = new Music();

        firstArtist.title = "Lunch";
        firstArtist.artist = "Billie Eilish";
        firstArtist.releaseYear = 2024;

        firstArtist.userNote(5);
        firstArtist.userNote(4.2);
        firstArtist.userNote(5);

        firstArtist.displayDatasheet();
    }
}
