import static org.junit.Assert.*;

public class NewFileTest {

    @org.junit.Test
    public void incremente() {
        NewFile m=new NewFile();
        int actual=m.incremente(2);
        int exp=3;
        assertEquals(exp,actual);
    }
}