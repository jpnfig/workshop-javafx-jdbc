module workshop_javafx_jdbc {
	
	requires javafx.fxml;
	requires javafx.graphics;
	requires javafx.controls;
	
	exports gui; 
	exports model.entities;

    opens gui to javafx.fxml, javafx.base;
    opens model.entities to javafx.base;
	opens application to javafx.graphics, javafx.controls, javafx.fxml;
}
