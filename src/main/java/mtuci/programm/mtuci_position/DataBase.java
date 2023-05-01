package mtuci.programm.mtuci_position;

import java.sql.*;
import java.util.ArrayList;

public class DataBase {
    private static final String url = "jdbc:mysql://localhost:3306/position";
    private static final String user = "root";
    private static final String password = "465231";

    // JDBC variables for opening and managing connection
    private static Connection con;
    private static Statement stmt;
    private static ResultSet rs;
    private static ArrayList<Model> modelBase ;
    public static ArrayList<Model> initMainTable (){
        // Connect to database and load data into table
        modelBase =new ArrayList<>();
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection(url, user, password);
            stmt = con.createStatement();
            String query =
                    "SELECT glossary.sname AS name, " +
                            "       table_e1.year2022 AS e1, " +
                            "       table_e2.year2022 AS e2, " +
                            "       table_e3.year2022 AS e3, " +
                            "       table_e4.year2022 AS e4, " +
                            "       table_e5.year2022 AS e5, " +
                            "       table_e8.year2022 AS e8 " +
                            "FROM glossary " +
                            "INNER JOIN table_e1 ON glossary.idglossary = table_e1.idTable_E " +
                            "INNER JOIN table_e2 ON glossary.idglossary = table_e2.idTable_E " +
                            "INNER JOIN table_e3 ON glossary.idglossary = table_e3.idTable_E " +
                            "INNER JOIN table_e4 ON glossary.idglossary = table_e4.idTable_E " +
                            "INNER JOIN table_e5 ON glossary.idglossary = table_e5.idTable_E " +
                            "INNER JOIN table_e8 ON glossary.idglossary = table_e8.idTable_E ;";
            rs = stmt.executeQuery(query);
            int i=1;

            while (rs.next()) {
                Model model = new ModelMain(i,
                        rs.getString("name"),
                        rs.getString("e1"),
                        rs.getString("e2"),
                        rs.getString("e3"),
                        rs.getString("e4"),
                        rs.getString("e5"),
                        rs.getString("e8")
                );
                i++;
                modelBase.add(model);
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if(con!=null){ con.close();
                    stmt.close();
                    rs.close();}
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return modelBase;
    }
    public static ArrayList<Model> initGraphixPosition (){
        modelBase =new ArrayList<>();

        // Connect to database and load data into table
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection(url, user, password);
            stmt = con.createStatement();
            String query ="SELECT t.nameIndicator, t.year2018, t.year2019, t.year2020, t.year2021, t.year2022, t.medialValueRF, t.medialSubject, t.medialDepartment FROM glossary g JOIN table_e1 t ON g.idglossary = t.idTable_E WHERE g.idglossary = 3 UNION SELECT t.nameIndicator, t.year2018, t.year2019, t.year2020, t.year2021, t.year2022, t.medialValueRF, t.medialSubject, t.medialDepartment FROM glossary g JOIN table_e2 t ON g.idglossary = t.idTable_E WHERE g.idglossary = 3 UNION SELECT t.nameIndicator, t.year2018, t.year2019, t.year2020, t.year2021, t.year2022, t.medialValueRF, t.medialSubject, t.medialDepartment FROM glossary g JOIN table_e3 t ON g.idglossary = t.idTable_E WHERE g.idglossary = 3 UNION SELECT t.nameIndicator, t.year2018, t.year2019, t.year2020, t.year2021, t.year2022, t.medialValueRF, t.medialSubject, t.medialDepartment FROM glossary g JOIN table_e4 t ON g.idglossary = t.idTable_E WHERE g.idglossary = 3 UNION SELECT t.nameIndicator, t.year2018, t.year2019, t.year2020, t.year2021, t.year2022, t.medialValueRF, t.medialSubject, t.medialDepartment FROM glossary g JOIN table_e5 t ON g.idglossary = t.idTable_E WHERE g.idglossary = 3 UNION SELECT table_e8.nameIndicator, table_e8.year2018, table_e8.year2019, table_e8.year2020, table_e8.year2021, table_e8.year2022, table_e8.medialValueRF, table_e8.medialSubject, table_e8.medialDepartment FROM glossary g JOIN table_e8  ON g.idglossary = table_e8.idTable_E WHERE g.idglossary = 3;";
            rs = stmt.executeQuery(query);

            while (rs.next()) {

                Model model = new ModelTablePosition(
                        rs.getString("nameIndicator"),
                        rs.getString("year2018"),
                        rs.getString("year2019"),
                        rs.getString("year2020"),
                        rs.getString("year2021"),
                        rs.getString("year2022"),
                        rs.getString("medialValueRF"),
                        rs.getString("medialSubject"),
                        rs.getString("medialDepartment")
                );

                modelBase.add(model);
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if (con != null) {
                    con.close();
                    stmt.close();
                    rs.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return  modelBase;
    }
    public static ArrayList<Model> initGraphixEducActiv () {
        modelBase =new ArrayList<>();

        // Connect to database and load data into table
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection(url, user, password);
            stmt = con.createStatement();
            String query ="SELECT f1,f2,f3,f4,f5,f6,f7,f8,f8,f9,f10,f11,f12,f13,f14,f15  FROM еducational_activities where idеducational_activities=3;";
            rs = stmt.executeQuery(query);

            while (rs.next()) {

                Model model = new ModelTableEducActiv(
                        rs.getString("f1"),
                        rs.getString("f2"),
                        rs.getString("f3"),
                        rs.getString("f4"),
                        rs.getString("f5"),
                        rs.getString("f6"),
                        rs.getString("f7"),
                        rs.getString("f8"),
                        rs.getString("f9"),
                        rs.getString("f10"),
                        rs.getString("f11"),
                        rs.getString("f12"),
                        rs.getString("f13"),
                        rs.getString("f14"),
                        rs.getString("f15")
                );

                modelBase.add(model);
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if (con != null) {
                    con.close();
                    stmt.close();
                    rs.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return  modelBase;
    }
    public static ArrayList<Model> initGraphixEducActiv11 (){

        return  null;
    }
}
