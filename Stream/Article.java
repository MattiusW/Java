package Stream;
import java.util.Date;
import java.util.GregorianCalendar;

class Article
{
    private double price;
    private String name;
    private Date releaseDate;

    public Article()
    {
        this.price = 0.0;
        this.name = " ";
        this.releaseDate = new GregorianCalendar().getTime();
    }

    public Article(double price, String name)
    {
        this();
        this.price = price;
        this.name = name;
    }

    public Article(double price, String name, int y, int m, int d)
    {
        this(price, name);
        GregorianCalendar calendary = new GregorianCalendar(y, m - 1, d);
        releaseDate = calendary.getTime();
    }
}

