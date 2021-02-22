package gui.MVC_example;

import gui.MVC_example.Model.*;
import gui.MVC_example.View.*;
import gui.MVC_example.Controller.*;

public class Application {
    public static void main(String[] args) {
        Model model = new Model();
        Application_Main_Form anf = new Application_Main_Form();
        Application_Main_Form_Controller controller = new Application_Main_Form_Controller(model, anf);
        controller.Application_start();
    }
}
