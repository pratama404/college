import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.*;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.*;
import javafx.stage.Stage;
import javafx.scene.control.Alert.AlertType;
import java.time.*;
import java.time.chrono.*;
public class frame extends Application {
// launch the application
public void start(Stage st)
{
// Title setting for the stage
st.setTitle( "creation of the date picker" );
// creation of a tile pane
TilePane tp = new TilePane();
// label for displaying the date
Label lb = new Label(" Sorry. . . The date is not selected . . . ");
// creation of a date picker
DatePicker dp = new DatePicker();
// action event . .
EventHandler<ActionEvent> ev = new EventHandler<ActionEvent>()
{
//handling the event
public void handle(ActionEvent ent)
{
// Retrieve the value of date picker
LocalDate ld = dp.getValue();
// Retrieve the chosen date
lb.setText("Selected Date is :" + ld);
}
};
// display the week numbers by setting the value as true
dp.setShowWeekNumbers(true);
// even on pressing the datePicker
dp.setOnAction(ev);
// add label as well as button
tp.getChildren().add(dp);
// add label as well as button
tp.getChildren().add(lb);
// creation of a scene
Scene scn = new Scene(tp, 300, 300);
// set up the scene
st.setScene(scn);
//display the stage
st.show();
}
//main method
public static void main(String args[])
{
// application launches here
launch(args);
}
}