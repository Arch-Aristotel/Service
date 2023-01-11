import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class DB {
    String url="jdbc:mysql://31.31.196.85:3306/u1867350_listquest";
    String usr="u1867350_admin";
    String passwd="xxxxxxxx";

    private String line ="{";

    public void startDB(){
        try {
        Connection to_connect = DriverManager.getConnection(url, usr, passwd);
        System.out.println("Server to connect");
        Statement ec = to_connect.createStatement();
        ResultSet permiss = ec.executeQuery("SELECT * FROM list");
        while (permiss.next()){

            System.out.println(permiss.getString("NEXTPOINTX"));
        }
    }
        catch (Exception e){
        System.out.println(e.getMessage());
    }
}
}
