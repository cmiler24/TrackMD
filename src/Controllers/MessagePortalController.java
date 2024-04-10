package Controllers;

import application.ViewFactory;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.scene.control.TextArea;

public class MessagePortalController {

    @FXML
    private ListView<?> contactList;

    @FXML
    private TextArea inputMsgBtn;

    @FXML
    private Button logOutBtn;

    @FXML
    private ListView<?> messagesListView;

    @FXML
    private Button sendBtn;

    MessagePortalController() {}
    
    public void initialize() {
    	logOutBtn.setOnAction(e -> {
    		ViewFactory.getViewFactoryInstance().showLoginView(e);
    	});
    }
    
}
