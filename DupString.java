public class DupString {
    static void dupString()
    {
        String str="shabnAm";
        char []arr = str.toCharArray();
        boolean flag=false;
        for(int i=0;i<str.length();i++)
        {
            for(int j=i+1;j<str.length();j++)
            {
                if(str.charAt(i) == str.charAt(j))
                {
                    flag=true;
                    break;
                }
            }
        }
        if(flag == true)
        {
            System.out.println("not unique string");
        }
        else{
            System.out.println(" unique string");
        }
    }
    public static void main(String[] args) {
        dupString();
        
    }
    
}
