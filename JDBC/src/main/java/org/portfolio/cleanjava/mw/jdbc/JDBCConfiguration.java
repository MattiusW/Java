package org.portfolio.cleanjava.mw.jdbc;

import org.portfolio.cleanjava.mw.jpa.H2Configuration;
import org.portfolio.cleanjava.mw.model.Hero;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;
import java.util.ArrayList;

public class JDBCConfiguration {

    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        createTableForHero();

        Hero leo = new Hero(1, "Leo", 1);
        Hero ber = new Hero(2, "Ber", 1);

        insertHero(leo);
        insertHero(ber);

        List<Hero> heroes = getHeros();

        heroes.forEach(System.out::println);

    }

    private static void createTableForHero() throws SQLException, ClassNotFoundException {

        Connection connection = H2Configuration.getDBConnection();

        //SQL query
        Statement statement = connection.createStatement();

        String createTableHero = "CREATE TABLE HERO(id int primary key, name varchar(255), level int)";

        statement.execute(createTableHero);

        connection.commit();

    }

    private static void insertHero(Hero hero) throws SQLException, ClassNotFoundException {

        Connection connection = H2Configuration.getDBConnection();

        Statement statement = connection.createStatement();

        String insert = "INSERT INTO HERO VALUES(" + hero.getId() + ", '" + hero.getName() + "', "
                + hero.getLevel() + ")";

        statement.execute(insert);

        connection.commit();
    }

    public static List<Hero> getHeros() throws SQLException, ClassNotFoundException {
        List<Hero> heroes = new ArrayList<>();

        Connection connection = H2Configuration.getDBConnection();

        Statement statement = connection.createStatement();

        ResultSet resultSet = statement.executeQuery("SELECT * FROM HERO");

        while (resultSet.next()){

            int id = resultSet.getInt("id");
            String name = resultSet.getNString("name");
            int level = resultSet.getInt("level");

            heroes.add(new Hero(id, name, level));
        }

        return heroes;
    }

}
