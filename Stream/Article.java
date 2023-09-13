package Stream;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.io.*;

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
        this.releaseDate = calendary.getTime();
    }

    public double getPrice()
    {
        return this.price;
    }

    public String getName()
    {
        return this.name;
    }

    public Date getDate()
    {
        return this.releaseDate;
    }

    public void setArticle(double price, String name, int y, int m, int d)
    {
        this.price = price;
        this.name = name;
        GregorianCalendar calendary = new GregorianCalendar(y, m - 1, d);
        this.releaseDate = calendary.getTime();
    }

    public static void saveToFile(Article[] article, PrintWriter outS)
    {
        outS.println(article.length);
        GregorianCalendar calendary = new GregorianCalendar();
        for (int i = 0; i < article.length; i++)
        {   
            calendary.setTime(article[i].getDate());
            outS.println(article[i].getPrice() + "|" + article[i].getName() 
                + "|" + calendary.get(calendary.YEAR) + "|" + calendary.get((calendary.MONTH) + 1) 
                + "|" + calendary.get(calendary.DAY_OF_MONTH) + "|");
        }
    }

    public static Article[] readForFile(BufferedReader inS) throws IOException
    {
        int len = Integer.parseInt(inS.readLine());
        Article[] goods = new Article[len];

        for (int i = 0; i < len; i++)
        {
            goods[i] = new Article();
        }

        return goods;
    }

    @Override
    public String toString()
    {   
        GregorianCalendar calendary = new GregorianCalendar();
        calendary.setTime(this.releaseDate);
        return this.price + " zl, nazwa: " + this.name + " : " + 
            calendary.get(calendary.YEAR) + " rok " + calendary.get(calendary.MONTH) 
            + " miesiac " + calendary.get(calendary.DAY_OF_MONTH) + " dzien";
    }
}

