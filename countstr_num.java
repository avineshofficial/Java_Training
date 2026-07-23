
class countstr_num {
    public static void main(String[] args) {
        String a = "Java123";
        int countN = 0;
        int countC = 0;
        
        for(int i = 0; i<a.length(); i++)
        {
            char ch = a.charAt(i);
            if((ch>='a' && ch<='z') || (ch>='A' && ch<='Z'))
            {
                countC += 1;
            }
            else if(ch>='0' && ch <= '9')
            {
                countN += 1;
            }
        }
        System.out.println("Char : " + countC);
        System.out.println("Number : " + countN);
    }
}