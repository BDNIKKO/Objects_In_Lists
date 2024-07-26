public class TvShow {
    private final String name;
    private final int numEpisodes;
    private final String genre;

    public TvShow(String name, int numEpisodes, String genre) {
        this.name = name;
        this.numEpisodes = numEpisodes;
        this.genre = genre;
    }

    public String getName() {
        return name;
    }
    public int getNumEpisodes() {
        return numEpisodes;
    }
    public String getGenre() {
        return genre;
    }

    @Override
    public String toString() {
        return "The TV show '" + name + "' has " + numEpisodes + " episodes and belongs to the " + genre + " genre.";
    }
}
