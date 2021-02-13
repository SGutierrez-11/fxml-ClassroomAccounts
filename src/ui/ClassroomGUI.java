package ui;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.control.CheckBox;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;


public class ClassroomGUI{
	
	@FXML
    private Pane painMain;

	@FXML
    private Label txtUsername;

    @FXML
    private Label txtPassword;

    @FXML
    private Label txtMessage;

    @FXML
    private TextField loginUsername;

    @FXML
    private TextField loginPassword;
    
    @FXML
    private Label txtGender;

    @FXML
    private Label txtCareer;

    @FXML
    private Label txtBirthday;

    @FXML
    private Label txtBrowser;

    @FXML
    private TextField createUsername;

    @FXML
    private TextField createPassword;

    @FXML
    private DatePicker date;

    @FXML
    private RadioButton chooseFemale;

    @FXML
    private RadioButton chooseMale;

    @FXML
    private RadioButton chooseOther;

    @FXML
    private CheckBox chooseSoft;

    @FXML
    private CheckBox chooseTele;

    @FXML
    private CheckBox chooseIndustrial;

    @FXML
    private ChoiceBox<String> favBrowser;

    @FXML
    private TextField profilePhoto;

    @FXML
    private TableView<userAccount> accountList;

    @FXML
    private TableColumn<userAccount, String> listUsername;

    @FXML
    private TableColumn<userAccount, String> listGender;

    @FXML
    private TableColumn<userAccount, String> listCareer;

    @FXML
    private TableColumn<userAccount, String> listBirthday;

    @FXML
    private TableColumn<userAccount, String> listBrowser;
    
    private Classroom classroom;
    
    public ClassroomGUI(Classroom cr) {
    	classroom = cr;
    }
    
    @FXML
    void loginAccount(ActionEvent event) {

    }

    @FXML
    void registerAccount(ActionEvent event) {

    }
    
    @FXML
    void accountCreated(ActionEvent event) {

    }

    @FXML
    void joinAccount(ActionEvent event) {

    }
    
    
    
}
