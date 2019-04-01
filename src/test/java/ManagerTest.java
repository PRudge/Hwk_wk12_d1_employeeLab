import Management.Manager;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ManagerTest {

    private Manager manager;


    @Before

    public void before(){
        manager = new Manager("Pauline","QQ123456C",25000.00, "HR");
    }

    @Test
    public void canGetName(){
        assertEquals("Pauline",manager.getName());
    }

    @Test
    public void canGetNINumber(){
        assertEquals("QQ123456C",manager.getNINumber());
    }

    @Test
    public void canGetSalary(){
        assertEquals(25000.00, manager.getSalary(),2 );
    }

    @Test
    public void canGetDeptName(){
        assertEquals("HR", manager.getDeptName());
    }

    @Test
    public void canSetName(){
        manager.setName("Brogan");
        assertEquals("Brogan", manager.getName());
    }

    @Test
    public void canNotSetNameToNull(){
        manager.setName("");
        assertEquals("Pauline", manager.getName());

    }

    @Test
    public void canRaiseSalary(){
        manager.raiseSalary(10000.00);
        assertEquals(35000.00, manager.getSalary(),2);
    }

    @Test
    public void canNotDropSalary(){
        manager.raiseSalary(-10000.00);
        assertEquals(25000.00, manager.getSalary(),2);
    }

    @Test
    public void canPayBonus(){
        assertEquals(250,manager.payBonus(),2);
    }

}
