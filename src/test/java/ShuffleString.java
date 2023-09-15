import org.testng.Assert;
import org.testng.annotations.Test;

/*
01:30
@input - String, int[]
@output - String

01:31
testdata 1 = s = "codeleet", indices = [4,5,6,7,0,2,1,3] => leetcode
testdata 2 = s = "agarp" , indices[4,3,2,1,0]


//2 approaches - char[] / StringBuilder
01:33
Psuedo code
1. variables
2. Use a for loop to iterate
3. set the String char at the position of the indices
3.1 return String with char array
*/
public class ShuffleString {

    public String restoreString(String s, int[] indices) {
        char[] ch = new char[s.length()];
        for(int j=0;j<s.length();j++){
            ch[indices[j]] = s.charAt(j);
        }
        return new String(ch);
    }

    @Test
    public void testOne(){
        String s = "codeleet"; int[] indices = new int[]{4,5,6,7,0,2,1,3};
        Assert.assertEquals(restoreString(s,indices),"leetcode");
    }

    @Test
    public void testTwo(){
        String s = "agarp"; int[] indices = new int[]{4,3,2,1,0};
        Assert.assertEquals(restoreString(s,indices),"praga");
    }
}
