package hodito.Controller;

import java.net.URL;
import java.util.ResourceBundle;

import hodito.Enum.FajEnum;
import hodito.Enum.SzemelyisegEnum;
import hodito.Unit.ComboBoxSelect;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;

/**
 * @author http://stackoverflow.com/questions/10699655/combo-box-key-value-pair-in-javafx-2
 */
public class CharacterController implements Initializable {

    @FXML
    private TextField hektar;

    @FXML
    private ComboBox<ComboBoxSelect<FajEnum>> faj;

    @FXML
    private ComboBox<ComboBoxSelect<SzemelyisegEnum>> szemelyiseg;

    private ObservableList<ComboBoxSelect<FajEnum>> dataFaj;

    private ObservableList<ComboBoxSelect<SzemelyisegEnum>> dataSzemelyiseg;

    @Override
    public void initialize(URL location, ResourceBundle resources) {

	fillSzemelyisegComboBox();
	fillFajComboBox();

	faj.getItems().addAll(dataFaj);
	szemelyiseg.getItems().addAll(dataSzemelyiseg);

	faj.getSelectionModel().selectedItemProperty().addListener(new ChangeListener<ComboBoxSelect<FajEnum>>() {

	    @Override
	    public void changed(ObservableValue<? extends ComboBoxSelect<FajEnum>> arg0, ComboBoxSelect<FajEnum> arg1,
		    ComboBoxSelect<FajEnum> arg2) {
		if (arg2 != null) {
		    System.out.println("Selected Faj: " + arg2.getKey());
		}
	    }
	});

	szemelyiseg.getSelectionModel().selectedItemProperty()
		.addListener(new ChangeListener<ComboBoxSelect<SzemelyisegEnum>>() {

		    @Override
		    public void changed(ObservableValue<? extends ComboBoxSelect<SzemelyisegEnum>> arg0,
			    ComboBoxSelect<SzemelyisegEnum> arg1, ComboBoxSelect<SzemelyisegEnum> arg2) {
			if (arg2 != null) {
			    System.out.println("Selected Szemelyiseg: " + arg2.getKey());
			}

		    }
		});
    }

    private void fillSzemelyisegComboBox() {
	dataSzemelyiseg = FXCollections.observableArrayList();
	for (SzemelyisegEnum szemelyiseg : SzemelyisegEnum.values()) {
	    dataSzemelyiseg.add(new ComboBoxSelect<SzemelyisegEnum>(szemelyiseg, szemelyiseg.name()));
	}
    }

    private void fillFajComboBox() {
	dataFaj = FXCollections.observableArrayList();
	for (FajEnum faj : FajEnum.values()) {
	    dataFaj.add(new ComboBoxSelect<FajEnum>(faj, faj.name()));
	}
    }
}
