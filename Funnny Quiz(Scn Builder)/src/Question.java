import java.util.Arrays;
import java.util.List;

/**
 * @author Rashmi De Zoysa <rashmindezoysa@gmail.com>
 * @since :02-Nov-21
 **/
public class Question {

    private String name;
    private List<String> answer;

    public Question(String name , String... answer){
        this.name = name;
        this.answer = Arrays.asList(answer);
    }

    public String getCorrectAnswer(){
        return answer.get(0);
    }
}
