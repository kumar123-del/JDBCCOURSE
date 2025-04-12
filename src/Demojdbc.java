import java.sql.*;
public class Demojdbc
{
    public static void main(String[] args)throws ClassNotFoundException,SQLException
    {
        int sid = 103;
        String sname = "surya";
        int marks = 89;
        String url ="jdbc:postgresql://localhost:5432/demo";
        String uname = "postgres";
        String pass = "tarun@123";
        String sql = "insert into Student values(?,?,?)";
        Connection con = DriverManager.getConnection(url,uname,pass);
        PreparedStatement st =  con.prepareStatement(sql);
        st.setInt(1,sid);
        st.setString(2,sname);
        st.setInt(3,marks);
        st.execute();
        con.close();
    }
}
