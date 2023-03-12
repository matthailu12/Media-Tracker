import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class MainSceneController implements Initializable{

    @FXML
    private TextField tfTitle;

    

    //ObservableList<String> names = FXCollections.observableArrayList(
      //  "Julia", "Ian", "Sue", "Matthew", "Hannah", "Stephan", "Denise");
    
    ArrayList<String> names = new ArrayList<String>();

    @FXML
    private ListView<String> tfListView1;// = new ListView<String>(names); not necessary?
    
    @FXML
    void btnOkClicked(ActionEvent event) {
        Stage mainWindow = (Stage) tfTitle.getScene().getWindow();
        String title = tfTitle.getText();
        mainWindow.setTitle(title);


        tfListView1.getItems().add(title);
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        // TODO Auto-generated method stub
        //throw new UnsupportedOperationException("Unimplemented method 'initialize'");

        //tfListView1.getItems().add("hi");
        //tfListView1.getItems().addAll(names);
    }

}