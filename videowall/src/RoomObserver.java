import java.util.Observable;
import java.util.Observer;
import java.util.Scanner;
import edu.purdue.cs.Message;

public class RoomObserver implements Observer
{
	QuizApp app;
	public RoomObserver(QuizApp app) {
		this.app = app;
	}
	public void update(Observable arg0, Object arg1) {
		Message message = (Message) arg1;
		String text = message.getText();
		System.out.println(text);
	}
}
