package pl.migibud.mysqlpmig.ex1;

import java.sql.*;

public class Main {
    public static void main(String[] args) {

        Connection connection = null;
        Statement statement = null;

        try{
            connection = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/ksiegarnia","root","migi987");
            statement = connection.createStatement();
            String sql = "select id,imie,nazwisko from autor";
            ResultSet rs = statement.executeQuery(sql);
            while (rs.next()){
                int id = rs.getInt("id");
                String imie = rs.getString("imie");
                String nazwisko = rs.getString("nazwisko");
                System.out.println(id + " | "+imie+" | "+nazwisko);
            }


            if (connection==null){
                System.out.println("Brak połączenia z bazą danych");
            }else{
                System.out.println("Mamy to!");
            }
        }catch (SQLException e){
            e.printStackTrace();
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            try{
                connection.close();
            }catch (Exception e){
                e.printStackTrace();
            }
        }
    }
}
