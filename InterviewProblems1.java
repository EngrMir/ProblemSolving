// Interview Problems-1
import java.math.*;
public class InterviewProblems1
{
    
    public static void main(String[] args)
    {
        int n = 4;
        System.out.println(possibleWays(n));
    }

    public static BigInteger possibleWays(int n)
    {
        BigInteger[] dp = new BigInteger[n+1];
        dp[0] = BigInteger.valueOf(1);
        dp[1] = BigInteger.valueOf(1);
        
        for(int i = 2; i <= n; i++)
        {
            dp[i] = BigInteger.valueOf(0);
        }
        
        for(int i = 2; i <= n; i++)
        {
            for(int j = 1; j <= 6; j++)
            {
                if(i - j >= 0)
                {
                    dp[i] = dp[i].add(dp[i - j]);
                }
            }
        }
        
        return dp[n].subtract(BigInteger.valueOf(1));
    }
}
// The selected file is the solution tool file but its newer than the application it was created with the newer version and can not be opened visual studio.



