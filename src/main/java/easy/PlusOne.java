package easy;

public class PlusOne {
    public int[] plusOne(int[] digits) {
        StringBuilder sb = new StringBuilder();

        for(int i=0;i<digits.length;i++){
            sb.append(digits[i]);
        }
        int num = Integer.valueOf(sb.toString());
        num=num+1;

        String s = Integer.toString(num);
            int [] k = new int[s.length()];
        for(int i=0;i<s.length();i++){
            k[i]=Integer.valueOf(s.charAt(i));
            Integer.parseInt(String.valueOf(s.charAt(i)));
            s.charAt(i);
        }
    return k;
    }
    public int[] plusOne1(int[] digits) {
        int carry=1;
        for(int i=digits.length-1;i>=0;i--){
            if(carry==1){
                if(digits[i]==9){
                    digits[i]=0;
                    carry=1;
                    if(i==0){
                        int[] dig = new int[digits.length+1];
                        dig[0]=1;
                        for(int j=1;j<digits.length;j++){
                            dig[j+1]=digits[j];
                        }
                        return dig;
                    }
                }else{
                    digits[i]=digits[i+1];
                    carry=0;
                }
            }
        }
    return digits;
    }
}
