import java.util.Scanner;

class Dec2Hex
{

    public static int Arg1;

    public static void main(String args[]) {

        if (args.length > 0) {
            try {
                Arg1 = Integer.parseInt(args[0]);
            } catch (NumberFormatException e) {
                System.err.println("Argument" + args[0] + " must be an integer.");
                System.exit(1);
            }
        }

        HexNum hex = new HexNum(Arg1);
        hex.getNum();
        hex.displayNum();
        hex.getHex();
        hex.displayHex();

    }


}
