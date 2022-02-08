import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

/**
 * @author Rashmi De Zoysa <rashmindezoysa@gmail.com>
 * @since :02-Nov-21
 **/
public class AppInitializer extends Application {

    private QuestionPane questionPane = new QuestionPane();


    private Parent createContent(){
        HBox root = new HBox();
        root.setPrefSize(600,500);
        return root;

        questionPane.setQuestion(new Question("What is sun","2","4","7","8"));
    }

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        primaryStage.setScene(new Scene(FXMLLoader.load(this.getClass().getResource("Quiz.fxml"))));
        primaryStage.show();

    }
}
