package r.masud.plannerscapefeature;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.stage.Stage;
import javafx.scene.control.TextField;
import javafx.scene.control.*;
import javafx.scene.control.PasswordField;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


public class Controller {
    @FXML
    private Button enterButton; // log in button
    @FXML
    private Label loginMessage; // log in message
    @FXML
    private TextField usernameTextField; // username text box
    @FXML
    private PasswordField passwordPasswordField; // password field



    public void enterButtonOnAction(ActionEvent e){

    }

    public  void loginMessageOnAction(ActionEvent e) {
        if (usernameTextField.getText().isBlank() == false && passwordPasswordField.getText().isBlank() == false) {
            validateLogin();

            //loginMessage.setText("logging in ");

        } else {
            loginMessage.setText("Please Enter your Email and Password Correctly");
        }
    }

        public void validateLogin() {
        DatabaseConnection connectNow = new DatabaseConnection();
        Connection connectDB = connectNow.getConnection();

        String verifyLogin ="select count(1)from UserAccounts Where username ='"+ usernameTextField.getText() +"' AND password = '" + passwordPasswordField.getText() + " '";



        try{
            Statement statement = connectDB.createStatement();
            ResultSet queryResult = statement.executeQuery(verifyLogin);

            while(queryResult.next()){
                if(queryResult.getInt(1) ==1){
                    loginMessage.setText("Welcome Aboard"+usernameTextField);
                } else{
                    loginMessage.setText("Invalid Login. Please try again.");
                }
            }

        } catch (Exception e){
            e.printStackTrace();


        }
        }
    }
