package day45_Inheritance;


import java.util.ArrayList;
import java.util.Arrays;
class credentials {
    
     private String userName;   // admin
     private String passWord;   // 123
     
    public  credentials() {
        setuserName("admin");
        setpassWord("123");
    }
    
     // getter: 
     public String getuserName() {
         return userName;
     }
     
     public String getpassWord() {
         return passWord;
     }
     
     // setter:
     public void setuserName(String userName) {
         this.userName = userName;
     }
     
     public void setpassWord(String passWord) {
         this.passWord = passWord;
     }
     
     public void setcredentials(String userName, String passWord ) {
         // this.userName = userName;
         // this.passWord = passWord;
            setuserName(userName);
            setpassWord(passWord);
     }
     
     public void getInfo() {
            System.out.println( "username: " + getuserName() );
            System.out.println( "password: " + getpassWord() );
     }  
}
public class EncapsulationsReveiw {
    
    public static void main(String[] args) {
        credentials Zlfy = new credentials();
        System.out.println(Zlfy.getpassWord());
        System.out.println(Zlfy.getuserName());
        //  obj.userName = "Zlfy";   // private is only visible within the class
        //  obj.passWord = "123456"; // private is only visible within the class
        
        // read:
            Zlfy.setcredentials("Zlfy", "111");
        
            System.out.println( "username: "+Zlfy.getuserName() );
            System.out.println( "password: "+Zlfy.getpassWord() );
            
        credentials Nurzat = new credentials();
                    Nurzat.setuserName("9876");
                    Nurzat.setpassWord("nuri345");
            
            System.out.println( "username: "+Nurzat.getuserName());
            System.out.println( "password: "+Nurzat.getpassWord() );
            
        
        credentials Seyfo = new credentials();
            Seyfo.setcredentials("Seyfo", "456");
            Seyfo.setpassWord("789");
        
            Seyfo.getInfo();
            
            System.out.println("==============================================");
        
            credentials[]  users = { Zlfy, Nurzat, Seyfo };
                users[0].getInfo();
                users[1].getInfo();
                users[2].getInfo();
            System.out.println("=======");
        ArrayList<credentials>  CredentialsList = new ArrayList<>();
            CredentialsList.addAll(Arrays.asList(users));
            CredentialsList.get(0).getInfo();
        
            System.out.println("=======");
            
            for(credentials each:CredentialsList) {
            	each.getInfo();
            }
        
    }
}
	



