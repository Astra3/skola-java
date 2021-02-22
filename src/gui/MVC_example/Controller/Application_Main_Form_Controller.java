package gui.MVC_example.Controller;

import gui.MVC_example.Model.*;
import gui.MVC_example.View.*;

public class Application_Main_Form_Controller {

    private Model model;
    private Application_Main_Form amf;

    public Application_Main_Form_Controller(Model model, Application_Main_Form amf) {
        this.model = new Model();
        this.amf = amf;
    }
    public void Application_start() {
        amf.setVisible(true);
    }
}
