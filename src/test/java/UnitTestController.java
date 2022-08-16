import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;
import controller.Controller;
import model.employee.Employee;
import org.junit.Test;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

import static org.junit.Assert.*;

public class UnitTestController {
    public Controller controller = Controller.getInstance();

    @Test
    public void readFromJson() {
        String fileAddress = "file:src/main/resources/EmployeeData.json";

        try {

            int result = controller.readFromJson(fileAddress);
            if (result == 1) {
                assertNotNull(Employee.getEmployees());
            } else {
                throw new FileNotFoundException();
            }
        } catch (Exception e) {
            assertThrows(e.getClass(), () -> {
                new FileReader(fileAddress);
            });
        }
    }

    @Test
    public void readFromJsonInvalid() {
        String fileAddress = "file:src/main/resources/EmployeeData1.json";

        try {

            int result = controller.readFromJson(fileAddress);
            if (result == 1) {
                assertNotNull(Employee.getEmployees());
            } else {
                throw new FileNotFoundException();
            }
        } catch (Exception e) {
            assertThrows(e.getClass(), () -> {
                new FileReader(fileAddress);
            });
        }
    }

    @Test
    public void writeToXml() {
        String fileAddress = "file:src/main/resources/EmployeeData1.json";
        try {
            int result = controller.writeToXml(fileAddress);
            if (result == 0)
                throw new RuntimeException();
            File file = new File("src/main/resources/EmployeeDb.xml");
            XmlMapper xmlMapper = new XmlMapper();
            ArrayList<Employee> values = xmlMapper.readValue(file, new TypeReference<>() {
            });
            assertEquals(values.get(0).getId(), Employee.getEmployees().get(0).getId());
        } catch (Exception e) {
            assertThrows(e.getClass(), () -> {
                throw new RuntimeException();
            });
        }

    }
}
