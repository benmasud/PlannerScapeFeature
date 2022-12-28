package r.masud.plannerscapefeature;

// for importing and connecting database

import java.sql.Connection;
import java.sql.DriverManager;


public class DatabaseConnection {
    public Connection databaseLink;
    public Connection getConnection(){
        String databaseName = "pocoBase";
        String databaseUser ="r.masud";
        String databasePassword="SSc@167528";
        String url="jdbc:mysql://localhost/"+databaseName;

        try{
            Class.forName("com.mysql.cj.Driver");
            databaseLink = DriverManager.getConnection(url,databaseUser,databasePassword);
        } catch (Exception e){
            e.printStackTrace();
        }
        return databaseLink;

    }


}
