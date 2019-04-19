import java.util.*; 
  
public class PassGen 
{ 
    public static void main(String[] args) 
    { 
        // Length of your password as I have choose here to be 8 
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your desired password length: ");
        int length = sc.nextInt(); 
        System.out.println(getPassword(length)); 
    } 
  
    // Password generating method
    static char[] getPassword(int len) 
    { 
        System.out.println("\nGenerating password using random() : "); 
        System.out.print("Your new password is : "); 
  
        // A strong password has Cap_chars, Lower_chars, numeric value and symbols.
        String Capital_chars = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"; 
        String Small_chars = "abcdefghijklmnopqrstuvwxyz"; 
        String numbers = "0123456789"; 
                String symbols = "!@#$%^&*_=+-/.?<>)"; 
  
  
        String values = Capital_chars + Small_chars + 
                        numbers + symbols; 
  
        // Using random method 
        Random rndm_method = new Random(); 
  
        char[] password = new char[len]; 
  
        for (int i = 0; i < len; i++) 
        { 
            // Use of charAt() method to get character value 
            // Use of nextInt() for scanning the value as int 
            password[i] = 
              values.charAt(rndm_method.nextInt(values.length())); 
  
        } 
        return password; 
    } 
}