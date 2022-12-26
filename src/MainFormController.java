import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;

public class MainFormController {

    public TextField sId;
    public TextField sIdOut;
    public TextField nameInput;
    public TextField nameOut;
    public TextField prfMarksInput;
    public TextField prfMarksOut;
    public TextField dbmsMarksInput;
    public TextField dbmsMarksOut;

    public void OnMouseClick(MouseEvent mouseEvent) {
        String value=sId.getText();
        sIdOut.setText(value);
        sId.clear();

        String value1=nameInput.getText();
        nameOut.setText(value1);
        nameInput.clear();

        String value2=prfMarksInput.getText();
        prfMarksOut.setText(value2);
        prfMarksInput.clear();

        String value3=dbmsMarksInput.getText();
        dbmsMarksOut.setText(value3);
        dbmsMarksInput.clear();



    }
}
