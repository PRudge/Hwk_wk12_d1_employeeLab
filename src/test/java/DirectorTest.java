package Management;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DirectorTest {

    Director director;

    @Before
    public void before() {
        director = new Director("Pauline", "QQ123456C", 25000.00, "HR", 20000.00);
    }

    @Test
    public void canGetName() {
        assertEquals("Pauline", director.getName());
    }

    @Test
    public void canGetNINumber(){
        assertEquals("QQ123456C",director.getNINumber());
    }

    @Test
    public void canGetSalary(){
        assertEquals(25000.00, director.getSalary(),2 );
    }

    @Test
    public void canGetDeptName(){
        assertEquals("HR", director.getDeptName());
    }

    @Test
    public void canSetName(){
        director.setName("Brogan");
        assertEquals("Brogan", director.getName());
    }

    @Test
    public void canSetNINumber(){
        director.setNINumber("SC111111S");
        assertEquals("SC111111S",director.getNINumber());
    }

    @Test
    public void canSetSalary(){
        director.setSalary(50000.00);
        assertEquals(50000.00, director.getSalary(),2);
    }

    @Test
    public void canGetBudget(){

        assertEquals(20000.00,director.getBudget(),2 );
    }

    @Test
    public void canRaiseSalary(){
        director.raiseSalary(10000.00);
        assertEquals(35000.00, director.getSalary(),2);
    }

    @Test
    public void canPayBonus(){
        assertEquals(250,director.payBonus(),2);
    }
}

