class Solution {
    public String intToRoman(int num) {
        
         String[] romans = {"", "I", "IV", "V", "IX", "X", "XL", "L", "XC", "C", "CD", "D", "CM", "M"};
        // 'I' IV', 'V', 'IX', 'X', 'XL', 'L', 'XC', 'C', 'CD', 'D', 'CM', 'M'
        //  1   4    5     9   10    40   50    90   100  400  500   900  1000
        int temp = num;
        int c=1, i=0;
        while (temp>=10){
            c = c*10;
            temp/=10;
            i++;
        }
       // System.out.println(c);
        StringBuilder sb = new StringBuilder();
        while(c!=0){
            int x = num/c;
            if (x<4){
                for (int j=1; j<=x; j++){
                    sb.append(romans[i*4+1]);
                }
            }
            else if (x==4){
                sb.append(romans[i*4+2]);
            }
            else if (x==5){
                sb.append(romans[i*4+3]);
            }
            else if (x<9){
                sb.append(romans[i*4+3]);
                for (int j=6; j<=x; j++){
                    sb.append(romans[i*4+1]);
                }
            }
            else if (x==9){
                sb.append(romans[i*4+4]);
            }
            num = num%c;
            c=c/10;
            i--;
        }
        return sb.toString();
       
    }
}