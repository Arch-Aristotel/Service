import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

@SpringBootApplication

public class Main {


    public static void main(String[] args) {
       DB e = new DB();
       e.startDB();
       SpringApplication.run(Main.class, args);
    }
}
