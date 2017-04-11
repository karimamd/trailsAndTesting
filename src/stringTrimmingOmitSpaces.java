/**
 * Created by Kareem on 11-Apr-17.
 */
public class stringTrimmingOmitSpaces {
    //trying trimming method for strings
    public static void main (String args[])
    {
        String beforeAndAfter=new String("   Normally removes before   ");
        System.out.println(beforeAndAfter.trim()+" and Removed after");
        String spacesOnly=new String("    ");
        System.out.println("removed"+spacesOnly.trim()+"AllOfIt");
    }
}
