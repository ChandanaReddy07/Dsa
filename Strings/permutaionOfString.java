package Strings;

public class permutaionOfString {
    

    private void permute(String str, int l, int r)
    {
        if (l == r)
            {
                System.out.println(str);
                return;
            }
        else
        {
            for (int i = l; i <= r; i++)
            {
                //fix
                str = swap(str,l,i);

                //kaam
                permute(str, l+1, r);

                //bacltracting
                str = swap(str,l,i);
            }
        }
    }










}
