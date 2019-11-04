public class HexNum
{

    //private int arg1 = Dec2Hex.Arg1;

    char ch[]={'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'};
    int rem, num;
    String hexadecimal="";

    public HexNum(int num)
    {
        this.num = num;
    }

    public int getNum()
    {
        return num;
    }

    public void displayNum()
    {

        System.out.println("Converting the Decimal Value " + num + " to Hex...");

    }

    public String getHex()
    {
        while(num != 0)
        {
            rem=num%16;
            hexadecimal= ch[rem] + hexadecimal;
            num= num/16;
        }
        return hexadecimal;


    }

    public void displayHex()
    {

        System.out.println("Hexadecimal representation is : " + hexadecimal);

    }

}
