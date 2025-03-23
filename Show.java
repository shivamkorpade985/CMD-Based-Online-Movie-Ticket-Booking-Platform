package entity;

public class Show {

    private int showId;
    private int movieId;
    private int threaterId;
    private String timing;
    private int avilableSeats;

    public Show(int showId, int movieId, int threaterId, String timing, int avilableSeats) {
        this.showId = showId;
        this.movieId = movieId;
        this.threaterId = threaterId;
        this.timing = timing;
        this.avilableSeats = avilableSeats;
    }

    public int getShowId() {
        return showId;
    }

    public void setShowId(int showId) {
        this.showId = showId;
    }

    public int getMovieId() {
        return movieId;
    }

    public void setMovieId(int movieId) {
        this.movieId = movieId;
    }

    public int getThreaterId() {
        return threaterId;
    }

    public void setThreaterId(int threaterId) {
        this.threaterId = threaterId;
    }

    public String getTiming() {
        return timing;
    }

    public void setTiming(String timing) {
        this.timing = timing;
    }

    public int getAvilableSeats() {
        return avilableSeats;
    }

    public void setAvilableSeats(int avilableSeats) {
        this.avilableSeats = avilableSeats;
    }
}
