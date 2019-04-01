import techStaff.Developer;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DeveloperTest {

    Developer developer;

    @Before
    public void before(){
        developer = new Developer("Pauline","QQ123456C",25000.00);
    }

    @Test
    public void canGetName(){
        assertEquals("Pauline",developer.getName());
    }

    @Test
    public void canGetNINumber(){
        assertEquals("QQ123456C",developer.getNINumber());
    }

    @Test
    public void canGetSalary(){
        assertEquals(25000.00, developer.getSalary(),2 );
    }

    @Test
    public void canSetName(){
        developer.setName("Brogan");
        assertEquals("Brogan", developer.getName());
    }

    @Test
    public void canSetNINumber(){
        developer.setNINumber("SC111111S");
        assertEquals("SC111111S", developer.getNINumber());
    }

    @Test
    public void canSetSalary(){
        developer.setSalary(50000.00);
        assertEquals(50000.00, developer.getSalary(),2);
    }

    @Test
    public void canRaiseSalary(){
        developer.raiseSalary(10000.00);
        assertEquals(35000.00, developer.getSalary(),2);
    }

    @Test
    public void canPayBonus(){
        assertEquals(250, developer.payBonus(),2);
    }

}
