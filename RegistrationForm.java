
package registrationform;

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class RegistrationForm {
   static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";  
   static final String DB_URL = "jdbc:mysql://localhost/userregistration";

   static final String USER = "username";
   static final String PASS = "password";
   
   public static void main(String[] args) {
      Connection conn = null;
      Statement stmt = null;
     
          try {
              Class.forName("com.mysql.jdbc.Driver");
          } catch (ClassNotFoundException ex) {
              Logger.getLogger(RegistrationForm.class.getName()).log(Level.SEVERE, null, ex);
          }

         System.out.println("Connecting to database...");
         conn = DriverManager.getConnection(DB_URL,USER,PASS);

         System.out.println("Creating statement...");
         stmt = conn.createStatement();
         String sql;
         sql = "SELECT username, password, first_name, middle_name, last_name, age, birthdate, sex, civil_status, mother's_maiden_name, father's_name, spouse_name, occupation, course, section, height, width, school_name FROM users";
         ResultSet rs = stmt.executeQuery(sql);

         while(rs.next()){
            String username = rs.getString("username");
            String password = rs.getString("password");
            String firstName = rs.getString("first_name");
            String middleName = rs.getString("middle_name");
            String lastName = rs.getString("last_name");
            int age = rs.getInt("age");
            String birthDate = rs.getString("birthdate");
            String sex = rs.getString("sex");
            String civilStatus = rs.getString("civil_status");
            String motherMaidenName = rs.getString("mother's_maiden_name");
            String fatherName = rs.getString("father's_name");
            String spouseName = rs.getString("spouse_name");
            String occupation = rs.getString("occupation");
            String course = rs.getString("course");
            String section = rs.getString("section");
            int height = rs.getInt("height");
            int width = rs.getInt("width");
            String schoolName = rs.getString("school_name");

            System.out.print("Username: " + username);
    }
    
}
