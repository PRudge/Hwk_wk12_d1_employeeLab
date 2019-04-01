import techStaff.DatabaseAdmin;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DatabaseAdminTest {

    private DatabaseAdmin databaseAdmin;

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
    public void canNotSetNameToNull(){
        databaseAdmin.setName("");
        assertEquals("Pauline", databaseAdmin.getName());

    }


    @Test
    public void canRaiseSalary(){
        databaseAdmin.raiseSalary(10000.00);
        assertEquals(35000.00, databaseAdmin.getSalary(),2);
    }

    @Test
    public void canNotDropSalary(){
        databaseAdmin.raiseSalary(-10000.00);
        assertEquals(25000.00, databaseAdmin.getSalary(),2);
    }

    @Test
    public void canPayBonus(){
        assertEquals(250,databaseAdmin.payBonus(),2);
    }

}
