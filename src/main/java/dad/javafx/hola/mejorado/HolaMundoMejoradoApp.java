package dad.javafx.hola.mejorado;





import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import javafx.scene.control.Label;

public class HolaMundoMejoradoApp extends Application {
	private TextField nombreText;
	private Button saludarButton;
	private Label saludoLablel;
	@Override
	public void start(Stage primaryStage) throws Exception {
		
		nombreText = new TextField();
		nombreText.setPromptText("Introduce una sentencia");
		nombreText.setMaxWidth(150);
		
		saludoLablel= new Label();
		
		saludarButton = new Button("Comprobar");
		saludarButton.setDefaultButton(true);
		saludarButton.setOnAction(e -> onSaludarButtonAction(e));
		
		VBox root =  new VBox();
		root.setSpacing(5);
		root.setAlignment(Pos.CENTER);
		root.getChildren().addAll(nombreText,saludarButton,saludoLablel);
		
		Scene scene = new Scene(root, 320, 200);
		
		primaryStage.setTitle("CheckPalindrome");
		primaryStage.setScene(scene);
		primaryStage.show();

	}
	private void onSaludarButtonAction(ActionEvent e) {
		String nombre = nombreText.getText();
		saludoLablel.setText("¡hola "+nombre+ "!");
		saludoLablel.setStyle("-fx-text-fill: green; -fx-font: italic bold 30 consolas");
	}
	public static void main(String[] args) {
		launch(args);
	}

}
