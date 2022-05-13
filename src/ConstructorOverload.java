public class ConstructorOverload {
    public static void main(String[] args)
    {
        Book book = new Book("Gone with the wind");
        System.out.println(book);

        TvShow show = new TvShow("Friends");
        System.out.println(show);

        Animal lab = new Animal("Labrador");        
        System.out.println(lab);        
    }    
}
