package mtuci.programm.mtuci_position;

import mtuci.programm.mtuci_position.Model.*;

import java.sql.*;
import java.util.*;

public class DataBase {
    private static final String url = "jdbc:mysql://localhost:3306/position";
    private static final String user = "root";
    private static final String password = "465231";

    // JDBC variables for opening and managing connection
    private static Connection con;
    private static Statement stmt;
    private static ResultSet rs;
    private static ArrayList<Model> modelBase ;
    private static HashMap<String,Double> data;
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
    public static ArrayList<Model> initMainTableSortE1 (){

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
                            "       table_e8.year2022 AS e8, " +
                            " table_e1.medialSubject AS e1_subject "+
                            "FROM glossary " +
                            "INNER JOIN table_e1 ON glossary.idglossary = table_e1.idTable_E " +
                            "INNER JOIN table_e2 ON glossary.idglossary = table_e2.idTable_E " +
                            "INNER JOIN table_e3 ON glossary.idglossary = table_e3.idTable_E " +
                            "INNER JOIN table_e4 ON glossary.idglossary = table_e4.idTable_E " +
                            "INNER JOIN table_e5 ON glossary.idglossary = table_e5.idTable_E " +
                            "INNER JOIN table_e8 ON glossary.idglossary = table_e8.idTable_E ;";
            rs = stmt.executeQuery(query);
            int i=1;
            String name ;
            String e1 ;
            String e2 ;
            String e3 ;
            String e4 ;
            String e5 ;
            String e8 ;
            String e_subject ;
            Double e;
            while (rs.next()) {
                name=rs.getString("name");
                e1 =rs.getString("e1");
                e2=rs.getString("e2");
                e3=rs.getString("e3");
                e4=rs.getString("e4");
                e5=rs.getString("e5");
                e8=rs.getString("e8");
                e_subject=rs.getString("e1_subject");
                e= Double.parseDouble(e1.replace(',','.')) /Double.parseDouble(e_subject.replace(',','.'));
                Model model = new ModelTableESort(i,name,e1,e2,e3,e4,e5,e8,e);
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
    public static ArrayList<Model> initMainTableSortE2 (){
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
                            "       table_e8.year2022 AS e8, " +
                            " table_e2.medialSubject AS e2_subject "+ ///Замена
                            "FROM glossary " +
                            "INNER JOIN table_e1 ON glossary.idglossary = table_e1.idTable_E " +
                            "INNER JOIN table_e2 ON glossary.idglossary = table_e2.idTable_E " +
                            "INNER JOIN table_e3 ON glossary.idglossary = table_e3.idTable_E " +
                            "INNER JOIN table_e4 ON glossary.idglossary = table_e4.idTable_E " +
                            "INNER JOIN table_e5 ON glossary.idglossary = table_e5.idTable_E " +
                            "INNER JOIN table_e8 ON glossary.idglossary = table_e8.idTable_E ;";
            rs = stmt.executeQuery(query);
            int i=1;
            String name ;
            String e1 ;
            String e2 ;
            String e3 ;
            String e4 ;
            String e5 ;
            String e8 ;
            String e_subject ;
            Double e;
            while (rs.next()) {
                name=rs.getString("name");
                e1 =rs.getString("e1");
                e2=rs.getString("e2");
                e3=rs.getString("e3");
                e4=rs.getString("e4");
                e5=rs.getString("e5");
                e8=rs.getString("e8");
                e_subject=rs.getString("e2_subject");
                e= Double.parseDouble(e2.replace(',','.')) /Double.parseDouble(e_subject.replace(',','.'));
                Model model = new ModelTableESort(i,
                        name,
                        e1,
                        e2,
                        e3,
                        e4,
                        e5,
                        e8,
                        e //замена
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
    public static ArrayList<Model> initMainTableSortE3 (){
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
                            "       table_e8.year2022 AS e8, " +
                            " table_e3.medialSubject AS e3_subject "+ ///Замена
                            "FROM glossary " +
                            "INNER JOIN table_e1 ON glossary.idglossary = table_e1.idTable_E " +
                            "INNER JOIN table_e2 ON glossary.idglossary = table_e2.idTable_E " +
                            "INNER JOIN table_e3 ON glossary.idglossary = table_e3.idTable_E " +
                            "INNER JOIN table_e4 ON glossary.idglossary = table_e4.idTable_E " +
                            "INNER JOIN table_e5 ON glossary.idglossary = table_e5.idTable_E " +
                            "INNER JOIN table_e8 ON glossary.idglossary = table_e8.idTable_E ;";
            rs = stmt.executeQuery(query);
            int i=1;
            String name ;
            String e1 ;
            String e2 ;
            String e3 ;
            String e4 ;
            String e5 ;
            String e8 ;
            String e_subject ;
            Double e;
            while (rs.next()) {
                name=rs.getString("name");
                e1 =rs.getString("e1");
                e2=rs.getString("e2");
                e3=rs.getString("e3");
                e4=rs.getString("e4");
                e5=rs.getString("e5");
                e8=rs.getString("e8");
                e_subject=rs.getString("e3_subject");
                e= Double.parseDouble(e3.replace(',','.')) /Double.parseDouble(e_subject.replace(',','.'));
                Model model = new ModelTableESort(i,
                        name,
                        e1,
                        e2,
                        e3,
                        e4,
                        e5,
                        e8,
                        e //замена
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
    public static ArrayList<Model> initMainTableSortE4 (){
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
                            "       table_e8.year2022 AS e8, " +
                            " table_e4.medialSubject AS e4_subject "+ ///Замена
                            "FROM glossary " +
                            "INNER JOIN table_e1 ON glossary.idglossary = table_e1.idTable_E " +
                            "INNER JOIN table_e2 ON glossary.idglossary = table_e2.idTable_E " +
                            "INNER JOIN table_e3 ON glossary.idglossary = table_e3.idTable_E " +
                            "INNER JOIN table_e4 ON glossary.idglossary = table_e4.idTable_E " +
                            "INNER JOIN table_e5 ON glossary.idglossary = table_e5.idTable_E " +
                            "INNER JOIN table_e8 ON glossary.idglossary = table_e8.idTable_E ;";
            rs = stmt.executeQuery(query);
            int i=1;
            String name ;
            String e1 ;
            String e2 ;
            String e3 ;
            String e4 ;
            String e5 ;
            String e8 ;
            String e_subject ;
            Double e;
            while (rs.next()) {
                name=rs.getString("name");
                e1 =rs.getString("e1");
                e2=rs.getString("e2");
                e3=rs.getString("e3");
                e4=rs.getString("e4");
                e5=rs.getString("e5");
                e8=rs.getString("e8");
                e_subject=rs.getString("e4_subject");
                e= Double.parseDouble(e4.replace(',','.')) /Double.parseDouble(e_subject.replace(',','.'));
                Model model = new ModelTableESort(i,
                        name,
                        e1,
                        e2,
                        e3,
                        e4,
                        e5,
                        e8,
                        e //замена
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
    public static ArrayList<Model> initMainTableSortE5 (){
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
                            "       table_e8.year2022 AS e8, " +
                            " table_e5.medialSubject AS e5_subject "+ ///Замена
                            "FROM glossary " +
                            "INNER JOIN table_e1 ON glossary.idglossary = table_e1.idTable_E " +
                            "INNER JOIN table_e2 ON glossary.idglossary = table_e2.idTable_E " +
                            "INNER JOIN table_e3 ON glossary.idglossary = table_e3.idTable_E " +
                            "INNER JOIN table_e4 ON glossary.idglossary = table_e4.idTable_E " +
                            "INNER JOIN table_e5 ON glossary.idglossary = table_e5.idTable_E " +
                            "INNER JOIN table_e8 ON glossary.idglossary = table_e8.idTable_E ;";
            rs = stmt.executeQuery(query);
            int i=1;
            String name ;
            String e1 ;
            String e2 ;
            String e3 ;
            String e4 ;
            String e5 ;
            String e8 ;
            String e_subject ;
            Double e;
            while (rs.next()) {
                name=rs.getString("name");
                e1 =rs.getString("e1");
                e2=rs.getString("e2");
                e3=rs.getString("e3");
                e4=rs.getString("e4");
                e5=rs.getString("e5");
                e8=rs.getString("e8");
                e_subject=rs.getString("e5_subject");
                e= Double.parseDouble(e5.replace(',','.')) /Double.parseDouble(e_subject.replace(',','.'));
                Model model = new ModelTableESort(i,
                        name,
                        e1,
                        e2,
                        e3,
                        e4,
                        e5,
                        e8,
                        e //замена
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
    public static ArrayList<Model> initMainTableSortE8 (){
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
                            "       table_e8.year2022 AS e8, " +
                            " table_e8.medialSubject AS e8_subject "+ ///Замена
                            "FROM glossary " +
                            "INNER JOIN table_e1 ON glossary.idglossary = table_e1.idTable_E " +
                            "INNER JOIN table_e2 ON glossary.idglossary = table_e2.idTable_E " +
                            "INNER JOIN table_e3 ON glossary.idglossary = table_e3.idTable_E " +
                            "INNER JOIN table_e4 ON glossary.idglossary = table_e4.idTable_E " +
                            "INNER JOIN table_e5 ON glossary.idglossary = table_e5.idTable_E " +
                            "INNER JOIN table_e8 ON glossary.idglossary = table_e8.idTable_E ;";
            rs = stmt.executeQuery(query);
            int i=1;
            String name ;
            String e1 ;
            String e2 ;
            String e3 ;
            String e4 ;
            String e5 ;
            String e8 ;
            String e_subject ;
            Double e;
            while (rs.next()) {
                name=rs.getString("name");
                e1 =rs.getString("e1");
                e2=rs.getString("e2");
                e3=rs.getString("e3");
                e4=rs.getString("e4");
                e5=rs.getString("e5");
                e8=rs.getString("e8");
                e_subject=rs.getString("e8_subject");
                e= Double.parseDouble(e8.replace(',','.')) /Double.parseDouble(e_subject.replace(',','.'));
                System.out.println("e9=" + e8 + " e_subj=" + e_subject + " e="+ e);
                Model model = new ModelTableESort(i,
                        name,
                        e1,
                        e2,
                        e3,
                        e4,
                        e5,
                        e8,
                        e //замена
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
    public static ArrayList<Model> initGraphixResrch_Activ(){
        modelBase =new ArrayList<>();

        // Connect to database and load data into table
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection(url, user, password);
            stmt = con.createStatement();
            String query ="SELECT b1,b2,b3,b4,b5,b6,b7,b8,b8,b9,b10,b11,b12,b13,b14,b15,b16 FROM research_activities where idresearch_activities=3;";
            rs = stmt.executeQuery(query);

            while (rs.next()) {

                Model model = new ModelTableResrch_Activ(
                        rs.getString("b1"),
                        rs.getString("b2"),
                        rs.getString("b3"),
                        rs.getString("b4"),
                        rs.getString("b5"),
                        rs.getString("b6"),
                        rs.getString("b7"),
                        rs.getString("b8"),
                        rs.getString("b9"),
                        rs.getString("b10"),
                        rs.getString("b11"),
                        rs.getString("b12"),
                        rs.getString("b13"),
                        rs.getString("b14"),
                        rs.getString("b15"),
                        rs.getString("b16")
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
    public static ArrayList<Model> initGraphixInternational_activities(){
        modelBase =new ArrayList<>();

        // Connect to database and load data into table
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection(url, user, password);
            stmt = con.createStatement();
            String query ="SELECT d1,d2,d3,d4,d5,d6,d7,d8,d8,d9,d10,d11,d12,d13 FROM international_activities where idinternational_activities=3;";
            rs = stmt.executeQuery(query);

            while (rs.next()) {

                Model model = new ModelTableInter_Act(
                        rs.getString("d1"),
                        rs.getString("d2"),
                        rs.getString("d3"),
                        rs.getString("d4"),
                        rs.getString("d5"),
                        rs.getString("d6"),
                        rs.getString("d7"),
                        rs.getString("d8"),
                        rs.getString("d9"),
                        rs.getString("d10"),
                        rs.getString("d11"),
                        rs.getString("d12"),
                        rs.getString("d13")
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
    public static ArrayList<Model> initGraphixFInance_and_Economic (){
        modelBase =new ArrayList<>();

        // Connect to database and load data into table
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection(url, user, password);
            stmt = con.createStatement();
            String query ="SELECT IncomeEducationalOrganization,IncomeGeneratingActivities,averageSalaryNPR,incomOrganization FROM financial_and_economic_activity where idfinancial_and_economic_activity=3;";
            rs = stmt.executeQuery(query);

            while (rs.next()) {

                Model model = new ModelTableFInance_and_Economic(
                        rs.getString("IncomeEducationalOrganization"),
                        rs.getString("IncomeGeneratingActivities"),
                        rs.getString("averageSalaryNPR"),
                        rs.getString("incomOrganization")
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
    public static ArrayList<Model> initGraphixInfrastract (){
        modelBase =new ArrayList<>();

        // Connect to database and load data into table
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection(url, user, password);
            stmt = con.createStatement();
            String query ="SELECT  c1,c2,c3,c4,c5,c6,c7,c8 FROM infrastructure where idinfrastructure=3;";
            rs = stmt.executeQuery(query);

            while (rs.next()) {

                Model model = new ModelTableInfrastract(
                        rs.getString("c1"),
                        rs.getString("c2"),
                        rs.getString("c3"),
                        rs.getString("c4"),
                        rs.getString("c5"),
                        rs.getString("c6"),
                        rs.getString("c7"),
                        rs.getString("c8")
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
    public static ArrayList<Model> initGraphixPersonel (){
        modelBase =new ArrayList<>();

        // Connect to database and load data into table
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection(url, user, password);
            stmt = con.createStatement();
            String query ="SELECT a1,a2,a3,a4,a5 FROM personel where idpersonel=3;";
            rs = stmt.executeQuery(query);

            while (rs.next()) {

                Model model = new ModelTablePersonel(
                        rs.getString("a1"),
                        rs.getString("a2"),
                        rs.getString("a3"),
                        rs.getString("a4"),
                        rs.getString("a5")
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
    public static ArrayList<Model> initGraphixUGNS(){
        modelBase =new ArrayList<>();

        // Connect to database and load data into table
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection(url, user, password);
            stmt = con.createStatement();
            String query ="SELECT nameUgns, shareStud, shareUgnsFromTotalStud, shareFromTotalStud, numberUniverImplEducation, numberOfBranches FROM `42.00.00` WHERE idugns = 3 UNION ALL SELECT nameUgns, shareStud, shareUgnsFromTotalStud, shareFromTotalStud, numberUniverImplEducation, numberOfBranches FROM `01.00.00` WHERE idugns = 3 UNION ALL SELECT nameUgns, shareStud, shareUgnsFromTotalStud, shareFromTotalStud, numberUniverImplEducation, numberOfBranches FROM `02.00.00` WHERE idugns = 3 UNION ALL SELECT nameUgns, shareStud, shareUgnsFromTotalStud, shareFromTotalStud, numberUniverImplEducation, numberOfBranches FROM `09.00.00` WHERE idugns = 3 UNION ALL SELECT nameUgns, shareStud, shareUgnsFromTotalStud, shareFromTotalStud, numberUniverImplEducation, numberOfBranches FROM `10.00.00` WHERE idugns = 3 UNION ALL SELECT nameUgns, shareStud, shareUgnsFromTotalStud, shareFromTotalStud, numberUniverImplEducation, numberOfBranches FROM `11.00.00` WHERE idugns = 3 UNION ALL SELECT nameUgns, shareStud, shareUgnsFromTotalStud, shareFromTotalStud, numberUniverImplEducation, numberOfBranches FROM `15.00.00` WHERE idugns = 3 UNION ALL SELECT nameUgns, shareStud, shareUgnsFromTotalStud, shareFromTotalStud, numberUniverImplEducation, numberOfBranches  FROM `27.00.00` WHERE idugns = 3 UNION ALL SELECT nameUgns, shareStud, shareUgnsFromTotalStud, shareFromTotalStud, numberUniverImplEducation, numberOfBranches  FROM `38.00.00`WHERE idugns = 3 UNION ALL SELECT nameUgns, shareStud, shareUgnsFromTotalStud, shareFromTotalStud, numberUniverImplEducation, numberOfBranches  FROM `02.00.00` WHERE idugns = 3;";
            rs = stmt.executeQuery(query);

            while (rs.next()) {

                Model model = new ModelTableUGNS(
                        rs.getString("nameUgns"),
                        rs.getString("shareStud"),
                        rs.getString("shareUgnsFromTotalStud"),
                        rs.getString("shareFromTotalStud"),
                        rs.getString("numberUniverImplEducation"),
                        rs.getString("numberOfBranches")
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
    public static ArrayList<Model> initGraphixAddit_Educ_Act (){
        modelBase =new ArrayList<>();

        // Connect to database and load data into table
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection(url, user, password);
            stmt = con.createStatement();
            String query ="SELECT students_enrolled_in_bachelo,includingFullTimeEducation,fullTimeEvening,correspondence_education,AverageScoreExam,proportionStudentsBachelor,n_the_total,share_of_students_enrolled_in_master,totalNumberStudentsAdditional,totalNumberStudentsEnrolledSecondaryVocational,numberEnterprisesContracts,numberEnterprisesContractsBasesPractice FROM addition_еducational_activities where idaddition_еducational_activities=3;";
            rs = stmt.executeQuery(query);

            while (rs.next()) {

                Model model = new ModelTableAddit_Educ_Act(
                        rs.getString("students_enrolled_in_bachelo"),
                        rs.getString("includingFullTimeEducation"),
                        rs.getString("fullTimeEvening"),
                        rs.getString("correspondence_education"),
                        rs.getString("AverageScoreExam"),
                        rs.getString("proportionStudentsBachelor"),
                        rs.getString("n_the_total"),
                        rs.getString("share_of_students_enrolled_in_master"),
                        rs.getString("totalNumberStudentsAdditional"),
                        rs.getString("totalNumberStudentsEnrolledSecondaryVocational"),
                        rs.getString("numberEnterprisesContracts"),
                        rs.getString("numberEnterprisesContractsBasesPractice")
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
    public static ArrayList<Model> initGraphixAddit_research_activities (){
        modelBase =new ArrayList<>();

        // Connect to database and load data into table
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection(url, user, password);
            stmt = con.createStatement();
            String query ="SELECT amountFundsReceived,fundsPerformanceWorks,totalNumberPublications,NumberBusinessIncubators,NumberTechnoparks,NumberCentersScientific,NumberSmallEnterprises,NumberGraduateStudents,PercentagePostgraduates,numberDoctoral,NumberDissertation FROM addition_research_activities where idaddresearsh=3;";
            rs = stmt.executeQuery(query);

            while (rs.next()) {

                Model model = new ModelTableAddit_research_activities(
                        rs.getString("amountFundsReceived"),
                        rs.getString("amountFundsReceived"),
                        rs.getString("totalNumberPublications"),
                        rs.getString("NumberBusinessIncubators"),
                        rs.getString("NumberTechnoparks"),
                        rs.getString("NumberCentersScientific"),
                        rs.getString("NumberSmallEnterprises"),
                        rs.getString("NumberGraduateStudents"),
                        rs.getString("PercentagePostgraduates"),
                        rs.getString("numberDoctoral"),
                        rs.getString("NumberDissertation")
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
    public static ArrayList<Model> initGraphixAddition_personnel (){
        modelBase =new ArrayList<>();

        // Connect to database and load data into table
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection(url, user, password);
            stmt = con.createStatement();
            String query ="SELECT totalNumberEmployees,TotalNumberTeaching,TotalNumberResearchers,PercentageTeachingStaff,researchersWithAcademic,PercentageTeachingStaffThan65Years,PercentageTeachingStaffThan40Years,AverageSalaryTeaching,AverageSalaryResearchers FROM addition_personnel where idaddition_personnel=3;";
            rs = stmt.executeQuery(query);

            while (rs.next()) {

                Model model = new ModelTableAddition_personnel(
                        rs.getString("totalNumberEmployees"),
                        rs.getString("TotalNumberTeaching"),
                        rs.getString("TotalNumberResearchers"),
                        rs.getString("PercentageTeachingStaff"),
                        rs.getString("researchersWithAcademic"),
                        rs.getString("PercentageTeachingStaffThan65Years"),
                        rs.getString("PercentageTeachingStaffThan40Years"),
                        rs.getString("AverageSalaryTeaching"),
                        rs.getString("AverageSalaryResearchers")
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
    public static ArrayList<Model> initGraphixAddition_international_activities (){
        modelBase =new ArrayList<>();

        // Connect to database and load data into table
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection(url, user, password);
            stmt = con.createStatement();
            String query ="SELECT studentsEnrolledBachelor,foreignStudents,higherEducation,obtainingTwoDiplomas,foreignGraduateStudents,jointlyWithForeignOrganizations,IncomeForeignSources,activitiesFromForeignSources,intellectualActivity FROM addition_international_activities where idaddition_international_activities=3;";
            rs = stmt.executeQuery(query);

            while (rs.next()) {

                Model model = new ModelTableAddition_international_activities(
                        rs.getString("studentsEnrolledBachelor"),
                        rs.getString("foreignStudents"),
                        rs.getString("higherEducation"),
                        rs.getString("obtainingTwoDiplomas"),
                        rs.getString("foreignGraduateStudents"),
                        rs.getString("jointlyWithForeignOrganizations"),
                        rs.getString("IncomeForeignSources"),
                        rs.getString("activitiesFromForeignSources"),
                        rs.getString("intellectualActivity")
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
    public static ArrayList<Model> initGraphixAddition_infrastructure (){
        modelBase =new ArrayList<>();

        // Connect to database and load data into table
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection(url, user, password);
            stmt = con.createStatement();
            String query ="SELECT TotalAreaBuildings,AreaEducationalLaboratory,AreaDesignatedResearch,AreaDormitories,AreaSports,studentsNotProvidedHostel,NumberPersonalComputers,personalComputersWithInternet,electronicLibrary FROM addition_infrastructure where idaddition_infrastructure=3;";
            rs = stmt.executeQuery(query);

            while (rs.next()) {

                Model model = new ModelTableAddition_infrastructure(
                        rs.getString("TotalAreaBuildings"),
                        rs.getString("AreaEducationalLaboratory"),
                        rs.getString("AreaDesignatedResearch"),
                        rs.getString("AreaDormitories"),
                        rs.getString("AreaSports"),
                        rs.getString("studentsNotProvidedHostel"),
                        rs.getString("NumberPersonalComputers"),
                        rs.getString("personalComputersWithInternet"),
                        rs.getString("electronicLibrary")
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
    public static ArrayList<Model> initGraphixAddition_financial_and_economic_activity(){
        modelBase =new ArrayList<>();

        // Connect to database and load data into table
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection(url, user, password);
            stmt = con.createStatement();
            String query ="SELECT UnivАllSources,extraBudgetarySources,shareextraBudgetarySources,federalBudget,localBudget,incomeEducationalActivities,total_income,extraBudgetaryFunds,extraBudgetaryResearch FROM addition_financial_and_economic_activity where idaddition_financial_and_economic_activity =3;";
            rs = stmt.executeQuery(query);

            while (rs.next()) {

                Model model = new ModelAddition_financial_and_economic_activity(
                        rs.getString("UnivАllSources"),
                        rs.getString("extraBudgetarySources"),
                        rs.getString("shareextraBudgetarySources"),
                        rs.getString("federalBudget"),
                        rs.getString("localBudget"),
                        rs.getString("incomeEducationalActivities"),
                        rs.getString("total_income"),
                        rs.getString("extraBudgetaryFunds"),
                        rs.getString("extraBudgetaryResearch")
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
    public static HashMap<String,Double> getDataForResearchR1(){
        data = new HashMap<>();
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection(url, user, password);
            stmt = con.createStatement();
            String query ="SELECT abbrevName,b3 FROM research_activities  inner join glossary where idglossary= idresearch_activities;";
            rs = stmt.executeQuery(query);
            String name;
            String param;
            Double paramParse;
            while (rs.next()) {
                name=rs.getString("abbrevName");
                param=rs.getString("b3");
                param=param.trim().replaceAll("\\s+","");
                paramParse = (param.contains(",") ? Double.parseDouble(param.replace(",", ".")) : Double.parseDouble(param));

                data.put(name,paramParse);
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
        return (HashMap<String, Double>) sortByValue(data);
    }
    public static HashMap<String,Double> getDataForResearchR2(){
        data = new HashMap<>();
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection(url, user, password);
            stmt = con.createStatement();
            String query ="SELECT abbrevName,b6 FROM research_activities  inner join glossary where idglossary= idresearch_activities;";
            rs = stmt.executeQuery(query);
            String name;
            String param;
            Double paramParse;
            while (rs.next()) {
                name=rs.getString("abbrevName");
                param=rs.getString("b6");
                param=param.trim().replaceAll("\\s+","");
                paramParse = (param.contains(",") ? Double.parseDouble(param.replace(",", ".")) : Double.parseDouble(param));

                data.put(name,paramParse);
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
        return (HashMap<String, Double>) sortByValue(data);
    }
    public static HashMap<String,Double> getDataForResearchR3(){
        data = new HashMap<>();
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection(url, user, password);
            stmt = con.createStatement();
            String query ="SELECT abbrevName,b8 FROM research_activities  inner join glossary where idglossary= idresearch_activities;";
            rs = stmt.executeQuery(query);
            String name;
            String param;
            Double paramParse;
            while (rs.next()) {
                name=rs.getString("abbrevName");
                param=rs.getString("b8");
                param=param.trim().replaceAll("\\s+","");
                paramParse = (param.contains(",") ? Double.parseDouble(param.replace(",", ".")) : Double.parseDouble(param));

                data.put(name,paramParse);
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
        return (HashMap<String, Double>) sortByValue(data);
    }
    public static HashMap<String,Double> getDataForResearchR4(){
        data = new HashMap<>();
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection(url, user, password);
            stmt = con.createStatement();
            String query ="SELECT abbrevName,b7 FROM research_activities  inner join glossary where idglossary= idresearch_activities;";
            rs = stmt.executeQuery(query);
            String name;
            String param;
            Double paramParse;
            while (rs.next()) {
                name=rs.getString("abbrevName");
                param=rs.getString("b7");
                param=param.trim().replaceAll("\\s+","");
                paramParse = (param.contains(",") ? Double.parseDouble(param.replace(",", ".")) : Double.parseDouble(param));

                data.put(name,paramParse);
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
        return (HashMap<String, Double>) sortByValue(data);
    }
    public static HashMap<String,Double> getDataForResearchR5(){
        data = new HashMap<>();
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection(url, user, password);
            stmt = con.createStatement();
            String query ="SELECT abbrevName,b9 FROM research_activities  inner join glossary where idglossary= idresearch_activities;";
            rs = stmt.executeQuery(query);
            String name;
            String param;
            Double paramParse;
            while (rs.next()) {
                name=rs.getString("abbrevName");
                param=rs.getString("b9");
                param=param.trim().replaceAll("\\s+","");
                paramParse = (param.contains(",") ? Double.parseDouble(param.replace(",", ".")) : Double.parseDouble(param));

                data.put(name,paramParse);
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
        return (HashMap<String, Double>) sortByValue(data);
    }
    public static HashMap<String,Double> getDataForResearchR6(){
        data = new HashMap<>();
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection(url, user, password);
            stmt = con.createStatement();
            String query ="SELECT abbrevName,b10 FROM research_activities  inner join glossary where idglossary= idresearch_activities;";
            rs = stmt.executeQuery(query);
            String name;
            String param;
            Double paramParse;
            while (rs.next()) {
                name=rs.getString("abbrevName");
                param=rs.getString("b10");
                param=param.trim().replaceAll("\\s+","");
                paramParse = (param.contains(",") ? Double.parseDouble(param.replace(",", ".")) : Double.parseDouble(param));

                data.put(name,paramParse);
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
        return (HashMap<String, Double>) sortByValue(data);
    }
    public static HashMap<String,Double> getDataForResearchR7(){
        data = new HashMap<>();
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection(url, user, password);
            stmt = con.createStatement();
            String query ="SELECT abbrevName,b11 FROM research_activities  inner join glossary where idglossary= idresearch_activities;";
            rs = stmt.executeQuery(query);
            String name;
            String param;
            Double paramParse;
            while (rs.next()) {
                name=rs.getString("abbrevName");
                param=rs.getString("b11");
                param=param.trim().replaceAll("\\s+","");
                paramParse = (param.contains(",") ? Double.parseDouble(param.replace(",", ".")) : Double.parseDouble(param));

                data.put(name,paramParse);
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
        return (HashMap<String, Double>) sortByValue(data);
    }
    public static HashMap<String,Double> getDataForResearchR8(){
        data = new HashMap<>();
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection(url, user, password);
            stmt = con.createStatement();
            String query ="SELECT abbrevName,b12 FROM research_activities  inner join glossary where idglossary= idresearch_activities;";
            rs = stmt.executeQuery(query);
            String name;
            String param;
            Double paramParse;
            while (rs.next()) {
                name=rs.getString("abbrevName");
                param=rs.getString("b12");
                param=param.trim().replaceAll("\\s+","");
                paramParse = (param.contains(",") ? Double.parseDouble(param.replace(",", ".")) : Double.parseDouble(param));

                data.put(name,paramParse);
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
        return (HashMap<String, Double>) sortByValue(data);
    }
    public static HashMap<String,Double> getDataForResearchR9(){
        data = new HashMap<>();
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection(url, user, password);
            stmt = con.createStatement();
            String query ="SELECT abbrevName,b15 FROM research_activities  inner join glossary where idglossary= idresearch_activities;";
            rs = stmt.executeQuery(query);
            String name;
            String param;
            Double paramParse;
            while (rs.next()) {
                name=rs.getString("abbrevName");
                param=rs.getString("b15");
                param=param.trim().replaceAll("\\s+","");
                paramParse = (param.contains(",") ? Double.parseDouble(param.replace(",", ".")) : Double.parseDouble(param));

                data.put(name,paramParse);
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
        return (HashMap<String, Double>) sortByValue(data);
    }
    public static HashMap<String,Double> getDataForResearchR10(){
        data = new HashMap<>();
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection(url, user, password);
            stmt = con.createStatement();
            String query ="SELECT abbrevName,b16 FROM research_activities  inner join glossary where idglossary= idresearch_activities;";
            rs = stmt.executeQuery(query);
            String name;
            String param;
            Double paramParse;
            while (rs.next()) {
                name=rs.getString("abbrevName");
                param=rs.getString("b16");
                param=param.trim().replaceAll("\\s+","");
                paramParse = (param.contains(",") ? Double.parseDouble(param.replace(",", ".")) : Double.parseDouble(param));

                data.put(name,paramParse);
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
        return (HashMap<String, Double>) sortByValue(data);
    }
    public static HashMap<String,Double> getDataForEducActivE1(){
        data = new HashMap<>();
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection(url, user, password);
            stmt = con.createStatement();
            String query ="SELECT abbrevName,f1 FROM еducational_activities  inner join glossary where idglossary= idеducational_activities;";
            rs = stmt.executeQuery(query);
            String name;
            String param;
            Double paramParse;
            while (rs.next()) {
                name=rs.getString("abbrevName");
                param=rs.getString("f1");
                param=param.trim().replaceAll("\\s+","");
                paramParse = (param.contains(",") ? Double.parseDouble(param.replace(",", ".")) : Double.parseDouble(param));

                data.put(name,paramParse);
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
        return (HashMap<String, Double>) sortByValue(data);
    }
    public static HashMap<String,Double> getDataForEducActivE2(){
        data = new HashMap<>();
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection(url, user, password);
            stmt = con.createStatement();
            String query ="SELECT abbrevName,f2 FROM еducational_activities  inner join glossary where idglossary= idеducational_activities;";
            rs = stmt.executeQuery(query);
            String name;
            String param;
            Double paramParse;
            while (rs.next()) {
                name=rs.getString("abbrevName");
                param=rs.getString("f2");
                param=param.trim().replaceAll("\\s+","");
                paramParse = (param.contains(",") ? Double.parseDouble(param.replace(",", ".")) : Double.parseDouble(param));

                data.put(name,paramParse);
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
        return (HashMap<String, Double>) sortByValue(data);
    }
    public static HashMap<String,Double> getDataForEducActivE3(){
        data = new HashMap<>();
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection(url, user, password);
            stmt = con.createStatement();
            String query ="SELECT abbrevName,f3 FROM еducational_activities  inner join glossary where idglossary= idеducational_activities;";
            rs = stmt.executeQuery(query);
            String name;
            String param;
            Double paramParse;
            while (rs.next()) {
                name=rs.getString("abbrevName");
                param=rs.getString("f3");
                param=param.trim().replaceAll("\\s+","");
                paramParse = (param.contains(",") ? Double.parseDouble(param.replace(",", ".")) : Double.parseDouble(param));

                data.put(name,paramParse);
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
        return (HashMap<String, Double>) sortByValue(data);
    }
    public static HashMap<String,Double> getDataForEducActivE4(){
        data = new HashMap<>();
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection(url, user, password);
            stmt = con.createStatement();
            String query ="SELECT abbrevName,f7 FROM еducational_activities  inner join glossary where idglossary= idеducational_activities;";
            rs = stmt.executeQuery(query);
            String name;
            String param;
            Double paramParse;
            while (rs.next()) {
                name=rs.getString("abbrevName");
                param=rs.getString("f7");
                param=param.trim().replaceAll("\\s+","");
                paramParse = (param.contains(",") ? Double.parseDouble(param.replace(",", ".")) : Double.parseDouble(param));

                data.put(name,paramParse);
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
        return (HashMap<String, Double>) sortByValue(data);
    }
    public static HashMap<String,Double> getDataForEducActivE5(){
        data = new HashMap<>();
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection(url, user, password);
            stmt = con.createStatement();
            String query ="SELECT abbrevName,f15 FROM еducational_activities  inner join glossary where idglossary= idеducational_activities;";
            rs = stmt.executeQuery(query);
            String name;
            String param;
            Double paramParse;
            while (rs.next()) {
                name=rs.getString("abbrevName");
                param=rs.getString("f15");
                param=param.trim().replaceAll("\\s+","");
                paramParse = (param.contains(",") ? Double.parseDouble(param.replace(",", ".")) : Double.parseDouble(param));

                data.put(name,paramParse);
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
        return (HashMap<String, Double>) sortByValue(data);
    }
    public static HashMap<String,Double> getDataForEducActivE6(){
        data = new HashMap<>();
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection(url, user, password);
            stmt = con.createStatement();
            String query ="SELECT abbrevName,students_enrolled_in_bachelo FROM addition_еducational_activities  inner join glossary where idglossary= idaddition_еducational_activities;";
            rs = stmt.executeQuery(query);
            String name;
            String param;
            Double paramParse;
            while (rs.next()) {
                name=rs.getString("abbrevName");
                param=rs.getString("students_enrolled_in_bachelo");
                param=param.trim().replaceAll("\\s+","");
                paramParse = (param.contains(",") ? Double.parseDouble(param.replace(",", ".")) : Double.parseDouble(param));

                data.put(name,paramParse);
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
        return (HashMap<String, Double>) sortByValue(data);
    }
    public static HashMap<String,Double> getDataForEducActivE7(){
        data = new HashMap<>();
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection(url, user, password);
            stmt = con.createStatement();
            String query ="SELECT abbrevName,includingFullTimeEducation FROM addition_еducational_activities  inner join glossary where idglossary= idaddition_еducational_activities;";
            rs = stmt.executeQuery(query);
            String name;
            String param;
            Double paramParse;
            while (rs.next()) {
                name=rs.getString("abbrevName");
                param=rs.getString("includingFullTimeEducation");
                param=param.trim().replaceAll("\\s+","");
                paramParse = (param.contains(",") ? Double.parseDouble(param.replace(",", ".")) : Double.parseDouble(param));

                data.put(name,paramParse);
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
        return (HashMap<String, Double>) sortByValue(data);
    }
    public static HashMap<String,Double> getDataForEducActivE8(){
        data = new HashMap<>();
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection(url, user, password);
            stmt = con.createStatement();
            String query ="SELECT abbrevName,fullTimeEvening FROM addition_еducational_activities  inner join glossary where idglossary= idaddition_еducational_activities;";
            rs = stmt.executeQuery(query);
            String name;
            String param;
            Double paramParse;
            while (rs.next()) {
                name=rs.getString("abbrevName");
                param=rs.getString("fullTimeEvening");
                param=param.trim().replaceAll("\\s+","");
                paramParse = (param.contains(",") ? Double.parseDouble(param.replace(",", ".")) : Double.parseDouble(param));

                data.put(name,paramParse);
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
        return (HashMap<String, Double>) sortByValue(data);
    }
    public static HashMap<String,Double> getDataForEducActivE9(){
        data = new HashMap<>();
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection(url, user, password);
            stmt = con.createStatement();
            String query ="SELECT abbrevName,correspondence_education FROM addition_еducational_activities  inner join glossary where idglossary= idaddition_еducational_activities;";
            rs = stmt.executeQuery(query);
            String name;
            String param;
            Double paramParse;
            while (rs.next()) {
                name=rs.getString("abbrevName");
                param=rs.getString("correspondence_education");
                param=param.trim().replaceAll("\\s+","");
                paramParse = (param.contains(",") ? Double.parseDouble(param.replace(",", ".")) : Double.parseDouble(param));

                data.put(name,paramParse);
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
        return (HashMap<String, Double>) sortByValue(data);
    }
    public static HashMap<String,Double> getDataForEducActivE10(){
        data = new HashMap<>();
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection(url, user, password);
            stmt = con.createStatement();
            String query ="SELECT abbrevName,n_the_total FROM addition_еducational_activities  inner join glossary where idglossary= idaddition_еducational_activities;";
            rs = stmt.executeQuery(query);
            String name;
            String param;
            Double paramParse;
            while (rs.next()) {
                name=rs.getString("abbrevName");
                param=rs.getString("n_the_total");
                param=param.trim().replaceAll("\\s+","");
                paramParse = (param.contains(",") ? Double.parseDouble(param.replace(",", ".")) : Double.parseDouble(param));

                data.put(name,paramParse);
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
        return (HashMap<String, Double>) sortByValue(data);
    }
    public static HashMap<String,Double> getDataForEducActivE11(){
        data = new HashMap<>();
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection(url, user, password);
            stmt = con.createStatement();
            String query ="SELECT abbrevName,share_of_students_enrolled_in_master FROM addition_еducational_activities  inner join glossary where idglossary= idaddition_еducational_activities;";
            rs = stmt.executeQuery(query);
            String name;
            String param;
            Double paramParse;
            while (rs.next()) {
                name=rs.getString("abbrevName");
                param=rs.getString("share_of_students_enrolled_in_master");
                param=param.trim().replaceAll("\\s+","");
                paramParse = (param.contains(",") ? Double.parseDouble(param.replace(",", ".")) : Double.parseDouble(param));

                data.put(name,paramParse);
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
        return (HashMap<String, Double>) sortByValue(data);
    }


    public static HashMap<String,Double> getDataForInterActivI1(){
        data = new HashMap<>();
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection(url, user, password);
            stmt = con.createStatement();
            String query ="SELECT abbrevName,d1  FROM international_activities  inner join glossary where idglossary= idinternational_activities;";
            rs = stmt.executeQuery(query);
            String name;
            String param;
            Double paramParse;
            while (rs.next()) {
                name=rs.getString("abbrevName");
                param=rs.getString("d1");
                param=param.trim().replaceAll("\\s+","");
                paramParse = (param.contains(",") ? Double.parseDouble(param.replace(",", ".")) : Double.parseDouble(param));

                data.put(name,paramParse);
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
        return (HashMap<String, Double>) sortByValue(data);
    }
    public static HashMap<String,Double> getDataForInterActivI2(){
        data = new HashMap<>();
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection(url, user, password);
            stmt = con.createStatement();
            String query ="SELECT abbrevName,d2  FROM international_activities  inner join glossary where idglossary= idinternational_activities;";
            rs = stmt.executeQuery(query);
            String name;
            String param;
            Double paramParse;
            while (rs.next()) {
                name=rs.getString("abbrevName");
                param=rs.getString("d2");
                param=param.trim().replaceAll("\\s+","");
                paramParse = (param.contains(",") ? Double.parseDouble(param.replace(",", ".")) : Double.parseDouble(param));

                data.put(name,paramParse);
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
        return (HashMap<String, Double>) sortByValue(data);
    }
    public static HashMap<String,Double> getDataForInterActivI3(){
        data = new HashMap<>();
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection(url, user, password);
            stmt = con.createStatement();
            String query ="SELECT abbrevName,d3  FROM international_activities  inner join glossary where idglossary= idinternational_activities;";
            rs = stmt.executeQuery(query);
            String name;
            String param;
            Double paramParse;
            while (rs.next()) {
                name=rs.getString("abbrevName");
                param=rs.getString("d3");
                param=param.trim().replaceAll("\\s+","");
                paramParse = (param.contains(",") ? Double.parseDouble(param.replace(",", ".")) : Double.parseDouble(param));

                data.put(name,paramParse);
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
        return (HashMap<String, Double>) sortByValue(data);
    }
    public static HashMap<String,Double> getDataForInterActivI4(){
        data = new HashMap<>();
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection(url, user, password);
            stmt = con.createStatement();
            String query ="SELECT abbrevName,d4  FROM international_activities  inner join glossary where idglossary= idinternational_activities;";
            rs = stmt.executeQuery(query);
            String name;
            String param;
            Double paramParse;
            while (rs.next()) {
                name=rs.getString("abbrevName");
                param=rs.getString("d4");
                param=param.trim().replaceAll("\\s+","");
                paramParse = (param.contains(",") ? Double.parseDouble(param.replace(",", ".")) : Double.parseDouble(param));

                data.put(name,paramParse);
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
        return (HashMap<String, Double>) sortByValue(data);
    }
    public static HashMap<String,Double> getDataForInterActivI5(){
        data = new HashMap<>();
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection(url, user, password);
            stmt = con.createStatement();
            String query ="SELECT abbrevName,d6  FROM international_activities  inner join glossary where idglossary= idinternational_activities;";
            rs = stmt.executeQuery(query);
            String name;
            String param;
            Double paramParse;
            while (rs.next()) {
                name=rs.getString("abbrevName");
                param=rs.getString("d6");
                param=param.trim().replaceAll("\\s+","");
                paramParse = (param.contains(",") ? Double.parseDouble(param.replace(",", ".")) : Double.parseDouble(param));

                data.put(name,paramParse);
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
        return (HashMap<String, Double>) sortByValue(data);
    }
    public static HashMap<String,Double> getDataForInterActivI6(){
        data = new HashMap<>();
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection(url, user, password);
            stmt = con.createStatement();
            String query ="SELECT abbrevName,d7  FROM international_activities  inner join glossary where idglossary= idinternational_activities;";
            rs = stmt.executeQuery(query);
            String name;
            String param;
            Double paramParse;
            while (rs.next()) {
                name=rs.getString("abbrevName");
                param=rs.getString("d7");
                param=param.trim().replaceAll("\\s+","");
                paramParse = (param.contains(",") ? Double.parseDouble(param.replace(",", ".")) : Double.parseDouble(param));

                data.put(name,paramParse);
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
        return (HashMap<String, Double>) sortByValue(data);
    }
    public static HashMap<String,Double> getDataForInterActivI7(){
        data = new HashMap<>();
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection(url, user, password);
            stmt = con.createStatement();
            String query ="SELECT abbrevName,d9  FROM international_activities  inner join glossary where idglossary= idinternational_activities;";
            rs = stmt.executeQuery(query);
            String name;
            String param;
            Double paramParse;
            while (rs.next()) {
                name=rs.getString("abbrevName");
                param=rs.getString("d9");
                param=param.trim().replaceAll("\\s+","");
                paramParse = (param.contains(",") ? Double.parseDouble(param.replace(",", ".")) : Double.parseDouble(param));

                data.put(name,paramParse);
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
        return (HashMap<String, Double>) sortByValue(data);
    }
    public static HashMap<String,Double> getDataForInterActivI8(){
        data = new HashMap<>();
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection(url, user, password);
            stmt = con.createStatement();
            String query ="SELECT abbrevName,d10  FROM international_activities  inner join glossary where idglossary= idinternational_activities;";
            rs = stmt.executeQuery(query);
            String name;
            String param;
            Double paramParse;
            while (rs.next()) {
                name=rs.getString("abbrevName");
                param=rs.getString("d10");
                param=param.trim().replaceAll("\\s+","");
                paramParse = (param.contains(",") ? Double.parseDouble(param.replace(",", ".")) : Double.parseDouble(param));

                data.put(name,paramParse);
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
        return (HashMap<String, Double>) sortByValue(data);
    }
    public static HashMap<String,Double> getDataForInterActivI9(){
        data = new HashMap<>();
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection(url, user, password);
            stmt = con.createStatement();
            String query ="SELECT abbrevName,d11  FROM international_activities  inner join glossary where idglossary= idinternational_activities;";
            rs = stmt.executeQuery(query);
            String name;
            String param;
            Double paramParse;
            while (rs.next()) {
                name=rs.getString("abbrevName");
                param=rs.getString("d11");
                param=param.trim().replaceAll("\\s+","");
                paramParse = (param.contains(",") ? Double.parseDouble(param.replace(",", ".")) : Double.parseDouble(param));

                data.put(name,paramParse);
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
        return (HashMap<String, Double>) sortByValue(data);
    }
    public static HashMap<String,Double> getDataForInterActivI10(){
        data = new HashMap<>();
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection(url, user, password);
            stmt = con.createStatement();
            String query ="SELECT abbrevName,d13  FROM international_activities  inner join glossary where idglossary= idinternational_activities;";
            rs = stmt.executeQuery(query);
            String name;
            String param;
            Double paramParse;
            while (rs.next()) {
                name=rs.getString("abbrevName");
                param=rs.getString("d13");
                param=param.trim().replaceAll("\\s+","");
                paramParse = (param.contains(",") ? Double.parseDouble(param.replace(",", ".")) : Double.parseDouble(param));

                data.put(name,paramParse);
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
        return (HashMap<String, Double>) sortByValue(data);
    }
    public static HashMap<String,Double> getDataForInterActivI11(){
        data = new HashMap<>();
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection(url, user, password);
            stmt = con.createStatement();
            String query ="SELECT abbrevName,studentsEnrolledBachelor  FROM addition_international_activities inner join glossary where idglossary= idaddition_international_activities;";
            rs = stmt.executeQuery(query);
            String name;
            String param;
            Double paramParse;
            while (rs.next()) {
                name=rs.getString("abbrevName");
                param=rs.getString("studentsEnrolledBachelor");
                param=param.trim().replaceAll("\\s+","");
                paramParse = (param.contains(",") ? Double.parseDouble(param.replace(",", ".")) : Double.parseDouble(param));

                data.put(name,paramParse);
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
        return (HashMap<String, Double>) sortByValue(data);
    }
    public static HashMap<String,Double> getDataForInterActivI12(){
        data = new HashMap<>();
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection(url, user, password);
            stmt = con.createStatement();
            String query ="SELECT abbrevName,foreignStudents  FROM addition_international_activities inner join glossary where idglossary= idaddition_international_activities;";
            rs = stmt.executeQuery(query);
            String name;
            String param;
            Double paramParse;
            while (rs.next()) {
                name=rs.getString("abbrevName");
                param=rs.getString("foreignStudents");
                param=param.trim().replaceAll("\\s+","");
                paramParse = (param.contains(",") ? Double.parseDouble(param.replace(",", ".")) : Double.parseDouble(param));

                data.put(name,paramParse);
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
        return (HashMap<String, Double>) sortByValue(data);
    }
    public static HashMap<String,Double> getDataForInterActivI13(){
        data = new HashMap<>();
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection(url, user, password);
            stmt = con.createStatement();
            String query ="SELECT abbrevName,higherEducation  FROM addition_international_activities inner join glossary where idglossary= idaddition_international_activities;";
            rs = stmt.executeQuery(query);
            String name;
            String param;
            Double paramParse;
            while (rs.next()) {
                name=rs.getString("abbrevName");
                param=rs.getString("higherEducation");
                param=param.trim().replaceAll("\\s+","");
                paramParse = (param.contains(",") ? Double.parseDouble(param.replace(",", ".")) : Double.parseDouble(param));

                data.put(name,paramParse);
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
        return (HashMap<String, Double>) sortByValue(data);
    }
    public static HashMap<String,Double> getDataForInterActivI14(){
        data = new HashMap<>();
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection(url, user, password);
            stmt = con.createStatement();
            String query ="SELECT abbrevName,obtainingTwoDiplomas  FROM addition_international_activities inner join glossary where idglossary= idaddition_international_activities;";
            rs = stmt.executeQuery(query);
            String name;
            String param;
            Double paramParse;
            while (rs.next()) {
                name=rs.getString("abbrevName");
                param=rs.getString("obtainingTwoDiplomas");
                param=param.trim().replaceAll("\\s+","");
                paramParse = (param.contains(",") ? Double.parseDouble(param.replace(",", ".")) : Double.parseDouble(param));

                data.put(name,paramParse);
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
        return (HashMap<String, Double>) sortByValue(data);
    }
    public static HashMap<String,Double> getDataForInterActivI15(){
        data = new HashMap<>();
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection(url, user, password);
            stmt = con.createStatement();
            String query ="SELECT abbrevName,jointlyWithForeignOrganizations  FROM addition_international_activities inner join glossary where idglossary= idaddition_international_activities;";
            rs = stmt.executeQuery(query);
            String name;
            String param;
            Double paramParse;
            while (rs.next()) {
                name=rs.getString("abbrevName");
                param=rs.getString("jointlyWithForeignOrganizations");
                param=param.trim().replaceAll("\\s+","");
                paramParse = (param.contains(",") ? Double.parseDouble(param.replace(",", ".")) : Double.parseDouble(param));

                data.put(name,paramParse);
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
        return (HashMap<String, Double>) sortByValue(data);
    }
    public static HashMap<String,Double> getDataForInterActivI16(){
        data = new HashMap<>();
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection(url, user, password);
            stmt = con.createStatement();
            String query ="SELECT abbrevName,IncomeForeignSources  FROM addition_international_activities inner join glossary where idglossary= idaddition_international_activities;";
            rs = stmt.executeQuery(query);
            String name;
            String param;
            Double paramParse;
            while (rs.next()) {
                name=rs.getString("abbrevName");
                param=rs.getString("IncomeForeignSources");
                param=param.trim().replaceAll("\\s+","");
                paramParse = (param.contains(",") ? Double.parseDouble(param.replace(",", ".")) : Double.parseDouble(param));

                data.put(name,paramParse);
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
        return (HashMap<String, Double>) sortByValue(data);
    }
    public static HashMap<String,Double> getDataForInterActivI17(){
        data = new HashMap<>();
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection(url, user, password);
            stmt = con.createStatement();
            String query ="SELECT abbrevName,activitiesFromForeignSources  FROM addition_international_activities inner join glossary where idglossary= idaddition_international_activities;";
            rs = stmt.executeQuery(query);
            String name;
            String param;
            Double paramParse;
            while (rs.next()) {
                name=rs.getString("abbrevName");
                param=rs.getString("activitiesFromForeignSources");
                param=param.trim().replaceAll("\\s+","");
                paramParse = (param.contains(",") ? Double.parseDouble(param.replace(",", ".")) : Double.parseDouble(param));

                data.put(name,paramParse);
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
        return (HashMap<String, Double>) sortByValue(data);
    }

    public static HashMap<String,Double> getDataForAdditEconomActivF1(){
        data = new HashMap<>();
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection(url, user, password);
            stmt = con.createStatement();
            String query ="SELECT abbrevName,UnivАllSources  FROM addition_financial_and_economic_activity inner join glossary where idglossary= idaddition_financial_and_economic_activity;";
            rs = stmt.executeQuery(query);
            String name;
            String param;
            Double paramParse;
            while (rs.next()) {
                name=rs.getString("abbrevName");
                param=rs.getString("UnivАllSources");
                param=param.trim().replaceAll("\\s+","");
                paramParse = (param.contains(",") ? Double.parseDouble(param.replace(",", ".")) : Double.parseDouble(param));

                data.put(name,paramParse);
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
        return (HashMap<String, Double>) sortByValue(data);
    }
    public static HashMap<String,Double> getDataForAdditEconomActivF2(){
        data = new HashMap<>();
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection(url, user, password);
            stmt = con.createStatement();
            String query ="SELECT abbrevName,shareextraBudgetarySources  FROM addition_financial_and_economic_activity inner join glossary where idglossary= idaddition_financial_and_economic_activity;";
            rs = stmt.executeQuery(query);
            String name;
            String param;
            Double paramParse;
            while (rs.next()) {
                name=rs.getString("abbrevName");
                param=rs.getString("shareextraBudgetarySources");
                param=param.trim().replaceAll("\\s+","");
                paramParse = (param.contains(",") ? Double.parseDouble(param.replace(",", ".")) : Double.parseDouble(param));

                data.put(name,paramParse);
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
        return (HashMap<String, Double>) sortByValue(data);
    }
    public static HashMap<String,Double> getDataForAdditEconomActivF3(){
        data = new HashMap<>();
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection(url, user, password);
            stmt = con.createStatement();
            String query ="SELECT abbrevName,federalBudget  FROM addition_financial_and_economic_activity inner join glossary where idglossary= idaddition_financial_and_economic_activity;";
            rs = stmt.executeQuery(query);
            String name;
            String param;
            Double paramParse;
            while (rs.next()) {
                name=rs.getString("abbrevName");
                param=rs.getString("federalBudget");
                param=param.trim().replaceAll("\\s+","");
                paramParse = (param.contains(",") ? Double.parseDouble(param.replace(",", ".")) : Double.parseDouble(param));

                data.put(name,paramParse);
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
        return (HashMap<String, Double>) sortByValue(data);
    }
    public static HashMap<String,Double> getDataForAdditEconomActivF4(){
        data = new HashMap<>();
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection(url, user, password);
            stmt = con.createStatement();
            String query ="SELECT abbrevName,localBudget  FROM addition_financial_and_economic_activity inner join glossary where idglossary= idaddition_financial_and_economic_activity;";
            rs = stmt.executeQuery(query);
            String name;
            String param;
            Double paramParse;
            while (rs.next()) {
                name=rs.getString("abbrevName");
                param=rs.getString("localBudget");
                param=param.trim().replaceAll("\\s+","");
                paramParse = (param.contains(",") ? Double.parseDouble(param.replace(",", ".")) : Double.parseDouble(param));

                data.put(name,paramParse);
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
        return (HashMap<String, Double>) sortByValue(data);
    }
    public static HashMap<String,Double> getDataForAdditEconomActivF5(){
        data = new HashMap<>();
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection(url, user, password);
            stmt = con.createStatement();
            String query ="SELECT abbrevName,incomeEducationalActivities FROM addition_financial_and_economic_activity inner join glossary where idglossary= idaddition_financial_and_economic_activity;";
            rs = stmt.executeQuery(query);
            String name;
            String param;
            Double paramParse;
            while (rs.next()) {
                name=rs.getString("abbrevName");
                param=rs.getString("incomeEducationalActivities");
                param=param.trim().replaceAll("\\s+","");
                paramParse = (param.contains(",") ? Double.parseDouble(param.replace(",", ".")) : Double.parseDouble(param));

                data.put(name,paramParse);
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
        return (HashMap<String, Double>) sortByValue(data);
    }

    public static HashMap<String,Double> getDataForInfrastractInf1(){
        data = new HashMap<>();
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection(url, user, password);
            stmt = con.createStatement();
            String query ="SELECT abbrevName,c1 FROM infrastructure inner join glossary where idglossary= idinfrastructure;";
            rs = stmt.executeQuery(query);
            String name;
            String param;
            Double paramParse;
            while (rs.next()) {
                name=rs.getString("abbrevName");
                param=rs.getString("c1");
                param=param.trim().replaceAll("\\s+","");
                paramParse = (param.contains(",") ? Double.parseDouble(param.replace(",", ".")) : Double.parseDouble(param));

                data.put(name,paramParse);
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
        return (HashMap<String, Double>) sortByValue(data);
    }
    public static HashMap<String,Double> getDataForInfrastractInf2(){
        data = new HashMap<>();
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection(url, user, password);
            stmt = con.createStatement();
            String query ="SELECT abbrevName,c6 FROM infrastructure inner join glossary where idglossary= idinfrastructure;";
            rs = stmt.executeQuery(query);
            String name;
            String param;
            Double paramParse;
            while (rs.next()) {
                name=rs.getString("abbrevName");
                param=rs.getString("c6");
                param=param.trim().replaceAll("\\s+","");
                paramParse = (param.contains(",") ? Double.parseDouble(param.replace(",", ".")) : Double.parseDouble(param));

                data.put(name,paramParse);
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
        return (HashMap<String, Double>) sortByValue(data);
    }
    public static HashMap<String,Double> getDataForInfrastractInf3(){
        data = new HashMap<>();
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection(url, user, password);
            stmt = con.createStatement();
            String query ="SELECT abbrevName,c7 FROM infrastructure inner join glossary where idglossary= idinfrastructure;";
            rs = stmt.executeQuery(query);
            String name;
            String param;
            Double paramParse;
            while (rs.next()) {
                name=rs.getString("abbrevName");
                param=rs.getString("c7");
                param=param.trim().replaceAll("\\s+","");
                paramParse = (param.contains(",") ? Double.parseDouble(param.replace(",", ".")) : Double.parseDouble(param));

                data.put(name,paramParse);
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
        return (HashMap<String, Double>) sortByValue(data);
    }
    public static HashMap<String,Double> getDataForInfrastractInf4(){
        data = new HashMap<>();
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection(url, user, password);
            stmt = con.createStatement();
            String query ="SELECT abbrevName,c8 FROM infrastructure inner join glossary where idglossary= idinfrastructure;";
            rs = stmt.executeQuery(query);
            String name;
            String param;
            Double paramParse;
            while (rs.next()) {
                name=rs.getString("abbrevName");
                param=rs.getString("c8");
                param=param.trim().replaceAll("\\s+","");
                paramParse = (param.contains(",") ? Double.parseDouble(param.replace(",", ".")) : Double.parseDouble(param));

                data.put(name,paramParse);
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
        return (HashMap<String, Double>) sortByValue(data);
    }
    public static HashMap<String,Double> getDataForInfrastractInf5(){
        data = new HashMap<>();
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection(url, user, password);
            stmt = con.createStatement();
            String query ="SELECT abbrevName,AreaEducationalLaboratory FROM addition_infrastructure inner join glossary where idglossary= idaddition_infrastructure;";
            rs = stmt.executeQuery(query);
            String name;
            String param;
            Double paramParse;
            while (rs.next()) {
                name=rs.getString("abbrevName");
                param=rs.getString("AreaEducationalLaboratory");
                param=param.trim().replaceAll("\\s+","");
                paramParse = (param.contains(",") ? Double.parseDouble(param.replace(",", ".")) : Double.parseDouble(param));

                data.put(name,paramParse);
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
        return (HashMap<String, Double>) sortByValue(data);
    }
    public static HashMap<String,Double> getDataForInfrastractInf6(){
        data = new HashMap<>();
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection(url, user, password);
            stmt = con.createStatement();
            String query ="SELECT abbrevName,AreaDesignatedResearch FROM addition_infrastructure inner join glossary where idglossary= idaddition_infrastructure;";
            rs = stmt.executeQuery(query);
            String name;
            String param;
            Double paramParse;
            while (rs.next()) {
                name=rs.getString("abbrevName");
                param=rs.getString("AreaDesignatedResearch");
                param=param.trim().replaceAll("\\s+","");
                paramParse = (param.contains(",") ? Double.parseDouble(param.replace(",", ".")) : Double.parseDouble(param));

                data.put(name,paramParse);
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
        return (HashMap<String, Double>) sortByValue(data);
    }
    public static HashMap<String,Double> getDataForInfrastractInf7(){
        data = new HashMap<>();
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection(url, user, password);
            stmt = con.createStatement();
            String query ="SELECT abbrevName, AreaDormitories FROM addition_infrastructure inner join glossary where idglossary= idaddition_infrastructure;";
            rs = stmt.executeQuery(query);
            String name;
            String param;
            Double paramParse;
            while (rs.next()) {
                name=rs.getString("abbrevName");
                param=rs.getString("AreaDormitories");
                param=param.trim().replaceAll("\\s+","");
                paramParse = (param.contains(",") ? Double.parseDouble(param.replace(",", ".")) : Double.parseDouble(param));

                data.put(name,paramParse);
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
        return (HashMap<String, Double>) sortByValue(data);
    }
    public static HashMap<String,Double> getDataForInfrastractInf8(){
        data = new HashMap<>();
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection(url, user, password);
            stmt = con.createStatement();
            String query ="SELECT abbrevName, studentsNotProvidedHostel FROM addition_infrastructure inner join glossary where idglossary= idaddition_infrastructure;";
            rs = stmt.executeQuery(query);
            String name;
            String param;
            Double paramParse;
            while (rs.next()) {
                name=rs.getString("abbrevName");
                param=rs.getString("studentsNotProvidedHostel");
                param=param.trim().replaceAll("\\s+","");
                paramParse = (param.contains(",") ? Double.parseDouble(param.replace(",", ".")) : Double.parseDouble(param));

                data.put(name,paramParse);
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
        return (HashMap<String, Double>) sortByValue(data);
    }
    public static HashMap<String,Double> getDataForPersonellP1(){
        data = new HashMap<>();
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection(url, user, password);
            stmt = con.createStatement();
            String query ="SELECT abbrevName, a1 FROM personel inner join glossary where idglossary= idpersonel;";
            rs = stmt.executeQuery(query);
            String name;
            String param;
            Double paramParse;
            while (rs.next()) {
                name=rs.getString("abbrevName");
                param=rs.getString("a1");
                param=param.trim().replaceAll("\\s+","");
                paramParse = (param.contains(",") ? Double.parseDouble(param.replace(",", ".")) : Double.parseDouble(param));

                data.put(name,paramParse);
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
        return (HashMap<String, Double>) sortByValue(data);
    }
    public static HashMap<String,Double> getDataForPersonellP2(){
        data = new HashMap<>();
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection(url, user, password);
            stmt = con.createStatement();
            String query ="SELECT abbrevName, a2 FROM personel inner join glossary where idglossary= idpersonel;";
            rs = stmt.executeQuery(query);
            String name;
            String param;
            Double paramParse;
            while (rs.next()) {
                name=rs.getString("abbrevName");
                param=rs.getString("a2");
                param=param.trim().replaceAll("\\s+","");
                paramParse = (param.contains(",") ? Double.parseDouble(param.replace(",", ".")) : Double.parseDouble(param));

                data.put(name,paramParse);
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
        return (HashMap<String, Double>) sortByValue(data);
    }
    public static HashMap<String,Double> getDataForPersonellP3(){
        data = new HashMap<>();
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection(url, user, password);
            stmt = con.createStatement();
            String query ="SELECT abbrevName, a3 FROM personel inner join glossary where idglossary= idpersonel;";
            rs = stmt.executeQuery(query);
            String name;
            String param;
            Double paramParse;
            while (rs.next()) {
                name=rs.getString("abbrevName");
                param=rs.getString("a3");
                param=param.trim().replaceAll("\\s+","");
                paramParse = (param.contains(",") ? Double.parseDouble(param.replace(",", ".")) : Double.parseDouble(param));

                data.put(name,paramParse);
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
        return (HashMap<String, Double>) sortByValue(data);
    }
    public static HashMap<String,Double> getDataForPersonellP4(){
        data = new HashMap<>();
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection(url, user, password);
            stmt = con.createStatement();
            String query ="SELECT abbrevName, a4 FROM personel inner join glossary where idglossary= idpersonel;";
            rs = stmt.executeQuery(query);
            String name;
            String param;
            Double paramParse;
            while (rs.next()) {
                name=rs.getString("abbrevName");
                param=rs.getString("a4");
                param=param.trim().replaceAll("\\s+","");
                paramParse = (param.contains(",") ? Double.parseDouble(param.replace(",", ".")) : Double.parseDouble(param));

                data.put(name,paramParse);
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
        return (HashMap<String, Double>) sortByValue(data);
    }
    public static HashMap<String,Double> getDataForPersonellP5(){
        data = new HashMap<>();
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection(url, user, password);
            stmt = con.createStatement();
            String query ="SELECT abbrevName, a5 FROM personel inner join glossary where idglossary= idpersonel;";
            rs = stmt.executeQuery(query);
            String name;
            String param;
            Double paramParse;
            while (rs.next()) {
                name=rs.getString("abbrevName");
                param=rs.getString("a5");
                param=param.trim().replaceAll("\\s+","");
                paramParse = (param.contains(",") ? Double.parseDouble(param.replace(",", ".")) : Double.parseDouble(param));

                data.put(name,paramParse);
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
        return (HashMap<String, Double>) sortByValue(data);
    }
    public static HashMap<String,Double> getDataForPersonellP6(){
        data = new HashMap<>();
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection(url, user, password);
            stmt = con.createStatement();
            String query ="SELECT abbrevName, TotalNumberTeaching FROM addition_personnel inner join glossary where idglossary= idaddition_personnel;";
            rs = stmt.executeQuery(query);
            String name;
            String param;
            Double paramParse;
            while (rs.next()) {
                name=rs.getString("abbrevName");
                param=rs.getString("TotalNumberTeaching");
                param=param.trim().replaceAll("\\s+","");
                paramParse = (param.contains(",") ? Double.parseDouble(param.replace(",", ".")) : Double.parseDouble(param));

                data.put(name,paramParse);
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
        return (HashMap<String, Double>) sortByValue(data);
    }
    public static HashMap<String,Double> getDataForPersonellP7(){
        data = new HashMap<>();
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection(url, user, password);
            stmt = con.createStatement();
            String query ="SELECT abbrevName,TotalNumberResearchers FROM addition_personnel inner join glossary where idglossary= idaddition_personnel;";
            rs = stmt.executeQuery(query);
            String name;
            String param;
            Double paramParse;
            while (rs.next()) {
                name=rs.getString("abbrevName");
                param=rs.getString("TotalNumberResearchers");
                param=param.trim().replaceAll("\\s+","");
                paramParse = (param.contains(",") ? Double.parseDouble(param.replace(",", ".")) : Double.parseDouble(param));

                data.put(name,paramParse);
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
        return (HashMap<String, Double>) sortByValue(data);
    }
    public static HashMap<String,Double> getDataForPersonellP8(){
        data = new HashMap<>();
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection(url, user, password);
            stmt = con.createStatement();
            String query ="SELECT abbrevName,AverageSalaryTeaching FROM addition_personnel inner join glossary where idglossary= idaddition_personnel;";
            rs = stmt.executeQuery(query);
            String name;
            String param;
            Double paramParse;
            while (rs.next()) {
                name=rs.getString("abbrevName");
                param=rs.getString("AverageSalaryTeaching");
                param=param.trim().replaceAll("\\s+","");
                paramParse = (param.contains(",") ? Double.parseDouble(param.replace(",", ".")) : Double.parseDouble(param));

                data.put(name,paramParse);
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
        return (HashMap<String, Double>) sortByValue(data);
    }
    public static HashMap<String,Double> getDataForPersonellP9(){
        data = new HashMap<>();
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection(url, user, password);
            stmt = con.createStatement();
            String query ="SELECT abbrevName,AverageSalaryResearchers FROM addition_personnel inner join glossary where idglossary= idaddition_personnel;";
            rs = stmt.executeQuery(query);
            String name;
            String param;
            Double paramParse;
            while (rs.next()) {
                name=rs.getString("abbrevName");
                param=rs.getString("AverageSalaryResearchers");
                param=param.trim().replaceAll("\\s+","");
                paramParse = (param.contains(",") ? Double.parseDouble(param.replace(",", ".")) : Double.parseDouble(param));

                data.put(name,paramParse);
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
        return (HashMap<String, Double>) sortByValue(data);
    }
    public static ArrayList<Model> sortModelsByESubject(ArrayList<Model> models) {
        Collections.sort(models, new Comparator<Model>() {
            @Override
            public int compare(Model m1, Model m2) {
                return -Double.compare(((ModelTableESort)m1).getE_subject(), ((ModelTableESort)m2).getE_subject());
            }
        });
        return models;
    }
    public static Map<String, Double> sortByValue(Map<String, Double> hm) {
        // Создаем список для сортировки
        List<Map.Entry<String, Double>> list =
                new LinkedList<>(hm.entrySet());

        // Сортируем элементы по значению в порядке убывания
        Collections.sort(list, new Comparator<Map.Entry<String, Double>>() {
            public int compare(Map.Entry<String, Double> o1,
                               Map.Entry<String, Double> o2) {
                return (o2.getValue()).compareTo(o1.getValue());
            }
        });

        // Создаем новый LinkedHashMap для сохранения упорядоченных данных
        Map<String, Double> result = new LinkedHashMap<>();
        for (Map.Entry<String, Double> entry : list) {
            // Помещаем элементы из списка в LinkedHashMap
            result.put(entry.getKey(), entry.getValue());
        }

        // Возвращаем упорядоченную Map
        return result;
    }
}
