package view;

import controller.Controller;

public class View {
    private static View view_instance = new View();

    public static View getInstance() {
        if (view_instance == null) view_instance = new View();
        return view_instance;
    }

    public void run() {
        Controller controller = Controller.getInstance();
        //READ FROM JSON FILE
        String fileAddress = "file:src/main/resources/EmployeeData.json";
        int response = controller.readFromJson(fileAddress);
        System.out.println(response == 1 ? "The data was read successfully" : "Failed to read data");
        //WRITE XML TO NEW FILE
        fileAddress = "src/main/resources/EmployeeDb.xml";
        response = controller.writeToXml(fileAddress);
        System.out.println(response == 1 ? "The data was write successfully" : "Failed to write data");

    }
}
