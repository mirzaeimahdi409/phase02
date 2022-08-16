import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;
import model.employee.Employee;
import org.junit.Test;

import static org.junit.Assert.*;

import java.io.File;
import java.io.IOException;
import java.text.ParseException;
import java.util.ArrayList;

public class UnitTestView {
    @Test
    public void testView() throws IOException {

        Main.main(null);
        assertNotNull(Employee.getEmployees());
        File file = new File("src/main/resources/EmployeeDb.xml");
        XmlMapper xmlMapper = new XmlMapper();
        ArrayList<Employee> values = xmlMapper.readValue(file, new TypeReference<>() {
        });
        assertEquals(values.get(0).getId(), Employee.getEmployees().get(0).getId());
    }
}
