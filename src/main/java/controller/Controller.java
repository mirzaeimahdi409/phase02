package controller;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;
import model.employee.Employee;

import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;

public class Controller {
    private static Controller controller_instance = new Controller();

    public static Controller getInstance() {
        if (controller_instance == null) controller_instance = new Controller();

        return controller_instance;
    }

    public int readFromJson(String fileAddress) {
        ObjectMapper objectMapper = new ObjectMapper();
        try {
            Employee.setEmployees(objectMapper.readValue(new URL(fileAddress),
                    new TypeReference<ArrayList<Employee>>() {
                    }));
            return 1;
        } catch (IOException e) {
            String s = e.getMessage();
            return 0;
        }
    }

    public int writeToXml(String fileAddress) {
        XmlMapper xmlMapper = new XmlMapper();
        try {
            xmlMapper.writeValue(new File(fileAddress), Employee.getEmployees());
            return 1;
        } catch (IOException e) {
            return 0;
        }

    }
}
