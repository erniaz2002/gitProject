package sample;
import java.sql.*;
import java.util.ArrayList;
import java.util.logging.ConsoleHandler;

import static java.sql.DriverManager.getConnection;

public class DatabaseHandler extends Configs {
    private static Connection connection;
    private static String s = "";
    private static String D = "";


    /* public Connection getDbConnection() throws ClassNotFoundException, SQLException {
         String connectionString = "jdbc:mysql://localhost/rakhat?serverTimezone=Europe/Moscow&useSSL=false";
         Class.forName("com.mysql.cj.jdbc.Driver");



         dbConnection = DriverManager.getConnection(connectionString, dbUser, dbPass);

         return dbConnection;
     }*/
   /* public static Connection getDbConnection() throws ClassNotFoundException, SQLException {
        String connectionString = "jdbc:mysql://localhost/rakhat?serverTimezone=Europe/Moscow&useSSL=false";
        Class.forName("com.mysql.cj.jdbc.Driver");



        dbConnection = DriverManager.getConnection(connectionString, dbUser, dbPass);

        return dbConnection;
    }*/
    public static Connection connect() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");///
            connection = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/rakhat?serverTimezone=Europe/Moscow&useSSL=false", dbUser, dbPass
            );
        } catch (Exception e) {
            e.printStackTrace();
        }
        return connection;
    }

    public static void SignUpUsers(Student student) {


        try {
            String insert = "INSERT " + Const.USER_TABLE + "(" + Const.USER_NAME + ", " + Const.USER_SURNAME + ", " + Const.USER_LOGIN + ", " +
                    Const.USER_PASSWORD + ", " + Const.USER_GENDER + ")" + "VALUES(?,?,?,?,?)";
            PreparedStatement PrSt = connect().prepareStatement(insert);
            PrSt.setString(1, student.getName());
            PrSt.setString(2, student.getSurname());
            PrSt.setString(3, student.getLogin());
            PrSt.setString(4, student.getPassword());
            PrSt.setString(5, student.getGender());
            PrSt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }


    }

   /* public static ArrayList<Student> getAllStudents() {
        ArrayList<Student> studentList = new ArrayList<>();

        try {
           PreparedStatement statement = connect().prepareStatement("SELECT * FROM users");
            ResultSet resultSet = statement.executeQuery();/// Select

            while (resultSet.next()) {

                Integer id = resultSet.getInt("id");

                String name = resultSet.getString("Name");

                String surname = resultSet.getString("surname");

                String login = resultSet.getString("login");

                String password = resultSet.getString("password");

                String gender = resultSet.getString("gender");


                studentList.add(new Student(id, name, surname, login, password, gender));
}


            statement.close();


        } catch (Exception e) {
            e.printStackTrace();
        }

        return studentList;
    }*/
    public static String getAllStudents() {
        ArrayList<Student> studentList = new ArrayList<>();

        try {

            PreparedStatement statement = connect().prepareStatement("SELECT * FROM users");
            ResultSet resultSet = statement.executeQuery();/// Select

            while(resultSet.next()){

                Integer id = resultSet.getInt("id");
                s += "\n" + id;
                String name = resultSet.getString("Name");
                s += " " + name;
                String surname = resultSet.getString("surname");
                s += " " + surname;
                String login = resultSet.getString("login");
                s+=" "+login;
                String password = resultSet.getString("password");
                s+=" "+password;
                String gender = resultSet.getString("gender");
                s += " " + gender+"  ";
                s+="\n";
                studentList.add(new Student(id, name, surname, login, password, gender));




            }
          /*  for(int i=0;i<studentList.size();i++) {
                D = D + studentList.get(i)+ "\n";
            }*/


                String s="";

                for (int i=0;i<studentList.size();i++){
                    s+=studentList.get(i).toString()+"\n";

                }
              /*  SoutList.TextList.setText(s);*/
           /* SoutList.TextList.setText(D);*/
            statement.close();


        } catch (Exception e) {
            e.printStackTrace();
        }

        return s;
    }


}