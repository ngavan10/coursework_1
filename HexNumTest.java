import junit.framework.TestCase;

public class HexNumTest extends TestCase {

    //private HexNum hex_num = new HexNum(100);
    //@org.junit.jupiter.api.Test
    public void testGetNumOf100()
    {
        HexNum hex_num = new HexNum(100);
        assertEquals(hex_num.getNum(), 100);
    }

    public void testGetNumOf50()
    {
        HexNum hex_num = new HexNum(50);
        assertEquals(hex_num.getNum(), 50);
    }

    //@org.junit.jupiter.api.Test
    public void testGetHexOf100()
    {
        HexNum hex_num = new HexNum(100);
        assertEquals(hex_num.getHex(), "64");
    }

    public void testGetHexOf50()
    {
        HexNum hex_num = new HexNum(50);
        assertEquals(hex_num.getHex(), "32");
    }
    
}
