package view;

import controller.Controller;

public class View {
    public static final View view = new View();

    public void run() {
        //READ FROM JSON FILE
        int response = Controller.controller.readFromJson();
        System.out.println(response == 1 ? "The data was read successfully" : "Failed to read data");
        //WRITE XML TO NEW FILE
        response = Controller.controller.writeToXml();
        System.out.println(response == 1 ? "The data was write successfully" : "Failed to write data");

    }
}
