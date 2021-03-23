
/********************************************
*  Final Project: BeBes Backyard Landscaping*                          
*  Jennifer Lis                             *				
*  Date: 2-15-21                            *			
*********************************************/

import java.sql.*;
import java.util.ArrayList;

/**
 *
 * @author LisJennifer
 */
public class DataIO {
    //attributes 
    private final String CONNECTION_STRING = "jdbc:mysql://localhost:3306/ceis355a";        //constants
    private final String USER_NAME = "root";
    private final String PASSWORD = "Dashlis1!";
    
    //constructors
   public DataIO() {
    }
   
       //behaviors
    public void add(int ID, String name, String address, String landscapeType
        , double prjLength, double prjWidth, double landscapeCost) 
        throws ClassNotFoundException, SQLException{
       //check for the driver
       Class.forName("com.mysql.cj.jdbc.Driver");
       
          //connect to the database
          Connection conn = DriverManager.getConnection(CONNECTION_STRING
            , USER_NAME, PASSWORD);
          
    //write contact information to the database
    String sqlStr = "INSERT INTO bebeslandscaping (ID, Name, Address"
            + ", LandscapeType, YardLength, YardWidth, LandscapeCost)"
            + " VALUES (?, ?, ?, ?, ?, ?, ?)";
   
    PreparedStatement pstmt = conn.prepareStatement(sqlStr);
    pstmt.setInt(1, ID);
    pstmt.setString(2, name);
    pstmt.setString(3, address);
    pstmt.setString(4, landscapeType);
    pstmt.setDouble(5, prjLength);
    pstmt.setDouble(6, prjWidth);
    pstmt.setDouble(7, landscapeCost);
   
    pstmt.execute();
    
    //close connection
    conn.close(); 
   }
   
   public ArrayList<Contact> getAll() throws ClassNotFoundException, SQLException {
    //create empty ArrayList
   ArrayList<Contact>data = new ArrayList<Contact>();
   
   //check for the driver
   Class.forName("com.mysql.cj.jdbc.Driver");
   
   //connect to the database
   Connection conn = DriverManager.getConnection(CONNECTION_STRING, USER_NAME, PASSWORD);

return data;
}

   public void delete( Contact cnt) throws SQLException, ClassNotFoundException
   {
     Class.forName("com.mysql.cj.jdbc.Driver");
      Connection conn = DriverManager.getConnection(CONNECTION_STRING, USER_NAME, PASSWORD);
     
      String query = "DELETE FROM landscape WHERE CustomerID = ?";
      PreparedStatement pstmt = conn.prepareStatement(query);
      pstmt.setInt(1, cnt.getID());

      // execute the prepared statement
      pstmt.execute();
      
      conn.close();
   }

}
