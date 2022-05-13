public class Book {
    private String title;
    private Integer numberOfPages;
    private Integer year;

    public Book(String title, Integer pages, Integer year)
    {
        this.title = title;
        this.numberOfPages = pages;
        this.year = year;
    }

    public Book(String title)
    {
        this.title = title;
    }

    public String getTitle() {
        return this.title;
    }

    public Integer getYear()
    {
        return this.year;
    }

    public Integer getNumberOfPages() {
        return this.numberOfPages;
    }


    @Override
    public String toString()
    {
        return getTitle() + " " + getYear() + " " + getNumberOfPages();
    }
    
}
