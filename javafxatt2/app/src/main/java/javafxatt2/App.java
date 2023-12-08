package javafxatt2;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class App extends Application {

 
    public static void main(String[] args) {
    	launch(args);
      
    }

	@Override
	public void start(Stage primaryStage) throws Exception {
	primaryStage.setTitle("Esse é o meu Palco");
	VBox vbox = new VBox();
	
	Text inputUser = new Text();
	inputUser.setText("Usuario:");
    vbox.getChildren().add(inputUser);
	
  
	TextField campoUser = new TextField();
	campoUser.setText("");
	vbox.getChildren().add(campoUser);
	
	Text inputPassword = new Text();
	inputPassword.setText("Senha:");
	vbox.getChildren().add(inputPassword);
	
	TextField campoPassword = new TextField();
	campoPassword.setText ("");
	vbox.getChildren().add(campoPassword);
   
	 Button button = new Button();
    button.setText("ENTRAR");
    
    
    vbox.getChildren().add(button);
    
    primaryStage.setScene(new  Scene(vbox,800,600));
    primaryStage.show();
 
	}
}