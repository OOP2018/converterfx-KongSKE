package converter;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;

/**
 * Controller of UI.
 * 
 * @author Varit Assavavisidchai
 *
 */
public class ConverterController {

	@FXML
	TextField textfield1;
	@FXML
	TextField textfield2;
	@FXML
	private ComboBox<Length> combobox1;
	@FXML
	private ComboBox<Length> combobox2;

	/**
	 * Calculate value of unit when press a convert button.
	 * 
	 * @param event
	 */
	public void handleConvert(ActionEvent event) {
		textfield1.setStyle("-fx-text-inner-color: black;");
		textfield2.setStyle("-fx-text-inner-color: black;");
		if (!textfield1.getText().trim().isEmpty()) {
			String text = textfield1.getText().trim();
			try {
				double unit1 = combobox1.getValue().getValue();
				double unit2 = combobox2.getValue().getValue();

				textfield2.setText(String.format("%.4g", Double.parseDouble(text) * (unit1 / unit2)));
			} catch (Exception e) {
				textfield2.setStyle("-fx-text-inner-color: red;");
				textfield2.setText("ERROR!!");
			}

		} else if (!textfield2.getText().trim().isEmpty()) {
			// read values from textfield(s)
			String text = textfield2.getText().trim();
			// This is for testing
			try {
				double unit1 = combobox1.getValue().getValue();
				double unit2 = combobox2.getValue().getValue();

				textfield1.setText(String.format("%.4g", Double.parseDouble(text) / (unit1 / unit2)));
			} catch (Exception e) {
				textfield1.setStyle("-fx-text-inner-color: red;");
				textfield1.setText("ERROR!!");
			}
		} else {
			handleClear(event);
		}
	}

	/**
	 * Clear all text in textfield and change color back while press a clear button.
	 * 
	 * @param event
	 */
	public void handleClear(ActionEvent event) {
		textfield1.setStyle("-fx-text-inner-color: black;");
		textfield2.setStyle("-fx-text-inner-color: black;");
		textfield1.setText("");
		textfield2.setText("");
	}

	/**
	 * initial all units in combo box.
	 */
	@FXML
	public void initialize() {
		if (combobox1 != null) {
			combobox1.getItems().addAll(Length.values());
			combobox1.getSelectionModel().select(0);
		}
		if (combobox2 != null) {
			combobox2.getItems().addAll(Length.values());
			combobox2.getSelectionModel().select(1);
		}

	}
}
