

public class HexNumTest {




    public static void main(String args[])
    {
        HexNumTest test = new HexNumTest();
        test.testGetNumOf100();
        test.testGetNumOf50();
        test.testGetHexOf100();
        test.testGetHexOf50();

    }

    public void testGetNumOf100()
    {
        HexNum hex_num = new HexNum(100);
        if(hex_num.getNum() == 100)
        {
            System.out.println("Test for get Num of 100 Success");
        }

    }

    public void testGetNumOf50()
    {

        HexNum hex_num = new HexNum(50);
        if(hex_num.getNum() == 50)
        {
            System.out.println("Test for get Num of 50 Success");
        }
    }


    public void testGetHexOf100()
    {
        HexNum hex_num = new HexNum(100);
        if(hex_num.getHex().equals("64"))
        {
            System.out.println("Test for get Hex of 100 Success");
        }
    }

    public void testGetHexOf50()
    {
        HexNum hex_num = new HexNum(50);
        if(hex_num.getHex().equals("32"))
        {
            System.out.println("Test for get Hex of 50 Success");
        }
    }
    
}
