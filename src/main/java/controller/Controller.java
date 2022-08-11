package controller;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;
import model.Employee;

import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;

public class Controller {
    public static final Controller controller = new Controller();

    public int readFromJson() {
        ObjectMapper objectMapper = new ObjectMapper();
        try {
            Employee.setEmployees(objectMapper.readValue(new URL("file:src/main/resources/EmployeeData.json"),
                    new TypeReference<ArrayList<Employee>>() {
                    }));
            return 1;
        } catch (IOException e) {
            return 0;
        }
    }

    public int writeToXml() {
        XmlMapper xmlMapper = new XmlMapper();
        try {
            xmlMapper.writeValue(new File("src/main/resources/EmployeeDb.xml"), Employee.getEmployees());
            return 1;
        } catch (IOException e) {
            return 0;
        }

    }
}
