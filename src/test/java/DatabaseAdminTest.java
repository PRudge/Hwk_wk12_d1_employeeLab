import techStaff.DatabaseAdmin;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DatabaseAdminTest {

    DatabaseAdmin databaseAdmin;

    @Before
    public void before(){
        databaseAdmin = new DatabaseAdmin("Pauline","QQ123456C",25000.00);
    }

    @Test
    public void canGetName(){
        assertEquals("Pauline",databaseAdmin.getName());
    }

    @Test
    public void canGetNINumber(){
        assertEquals("QQ123456C",databaseAdmin.getNINumber());
    }

    @Test
    public void canGetSalary(){
        assertEquals(25000.00, databaseAdmin.getSalary(),2 );
    }


    @Test
    public void canSetName(){
        databaseAdmin.setName("Brogan");
        assertEquals("Brogan", databaseAdmin.getName());
    }

    @Test
    public void canSetNINumber(){
        databaseAdmin.setNINumber("SC111111S");
        assertEquals("SC111111S",databaseAdmin.getNINumber());
    }

    @Test
    public void canSetSalary(){
        databaseAdmin.setSalary(50000.00);
        assertEquals(50000.00, databaseAdmin.getSalary(),2);
    }

    @Test
    public void canRaiseSalary(){
        databaseAdmin.raiseSalary(10000.00);
        assertEquals(35000.00, databaseAdmin.getSalary(),2);
    }

    @Test
    public void canPayBonus(){
        assertEquals(250,databaseAdmin.payBonus(),2);
    }

}
