module workshop_javafx_jdbc {
	
	requires javafx.fxml;
	requires javafx.graphics;
	requires javafx.controls;
	requires java.sql;
	
	exports gui;
	exports db;
	exports model.entities;

    opens gui            to javafx.fxml, javafx.base;
    opens db             to javafx.fxml, javafx.base;
    opens model.entities to javafx.base;
    opens model.services to javafx.base;
    opens model.dao      to javafx.base;
    opens model.dao.impl to javafx.base;
	opens application    to javafx.graphics, javafx.controls, javafx.fxml;
}
 