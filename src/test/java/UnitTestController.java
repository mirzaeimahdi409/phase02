import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;
import controller.Controller;
import model.Employee;
import org.junit.Test;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

import static org.junit.Assert.*;

public class UnitTestController {
    @Test
    public void readFromJson() {
        int result = Controller.controller.readFromJson();
        if (result == 1) {
            assertNotNull(Employee.getEmployees());
        } else {
            assertNull(Employee.getEmployees());
        }
    }

    @Test
    public void writeToXml() throws IOException {
        Controller.controller.readFromJson();
        File file = new File("src/main/resources/EmployeeDb.xml");
        XmlMapper xmlMapper = new XmlMapper();
        ArrayList<Employee> values = xmlMapper.readValue(file, new TypeReference<>() {
        });
        assertEquals(values.get(0).getId(), Employee.getEmployees().get(0).getId());
    }
}
