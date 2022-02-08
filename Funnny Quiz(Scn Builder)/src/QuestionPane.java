import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;

import java.awt.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @author Rashmi De Zoysa <rashmindezoysa@gmail.com>
 * @since :02-Nov-21
 **/
public class QuestionPane extends VBox {

   private Text text = new Text();
   private List<Button> buttons = new ArrayList<>();

   public QuestionPane(){
       super(20);

       HBox hBox = new HBox();
       for (int i = 0 ; i < 4  ; i++){
           Button btn = new Button();
           btn.setPrefWidth(120);

           buttons.add(btn);
           hBox.getChildren().add(btn);
       }
       getChildren().addAll(text , hBox);
   }

   public void setQuestion(Question question){
       text.setText(question.name);

       Collections.shuffle(buttons);
       for (int i =0 ;i < 4 ; i++){
           buttons.get(i).setText(question.answers.get(i));
       }

   }

}
