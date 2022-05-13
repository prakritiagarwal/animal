public class  TvShow {
    private String theShowName;
    private Integer numberofEpisodes;
    private String theGenre;

    public TvShow(String theShowName, Integer numberOfEpisodes, String theGenre ) {        
        this.theShowName = theShowName;
        this.numberofEpisodes = numberOfEpisodes;
        this.theGenre=theGenre;   
    }

    public TvShow(String theShowName)
    {
        this.theShowName = theShowName;
    }

    public String getName() {
        return this.theShowName;
    }
    public void setName(String theShowName) {
        this.theShowName = theShowName;
    }

    public Integer getEpisodes() {
        return numberofEpisodes;
    }

    public void setEpisodes(Integer numberOfEpisodes) {
        this.numberofEpisodes = numberOfEpisodes;
    }

    public String getGenre() {
        return theGenre;
    }

    public void setGenre(String theGenre) {
        this.theGenre = theGenre;
    }

    @Override
    public String toString()
    {
        return "Name:" + getName() + " NumberOfEpisodes:" + getEpisodes() + " Genre:" + getGenre();
    }
}
