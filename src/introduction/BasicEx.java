package introduction;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.layout.StackPane;
import javafx.scene.text.Font;
import javafx.stage.Stage;

/**
 * Created by Administrator on 2018/1/18.
 */
public class BasicEx extends Application {
	Stage window;
	GraphicsContext graphicsContext;

	@Override
	public void start(Stage primaryStage) throws Exception {
		window = primaryStage;
		window.setTitle("introduction");

		Canvas canvas = new Canvas(400, 400);
		graphicsContext = canvas.getGraphicsContext2D();
		graphicsContext.setFont(new Font(20));
		graphicsContext.fillText("java 2D", 200, 200);

		StackPane rootNode = new StackPane();
		rootNode.setAlignment(Pos.CENTER);
		rootNode.getChildren().add(canvas);

		Scene scene = new Scene(rootNode, 450, 450);
		primaryStage.setScene(scene);
		primaryStage.show();
	}


	public static void main(String[] args) {
		launch(args);
	}
}
