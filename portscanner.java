import java.io.*; 
import java.util.Scanner;

public class oscommand
{ 
public static void main(String args[]) 
{ 
try 
{ 
    Scanner input = new Scanner(System.in);
    System.out.println("Power Rangers gibiyim - H4WK OFCX");
    System.out.println("* Java ile Örnek otomasyon scripti çalan olursa ecdadını bellerim aga *");
    System.out.println("----------------------------------------------------");
    System.out.println("         A-  NMAP                                   ");
    System.out.println("         A-  PİNG                                   ");
    System.out.println("----------------------------------------------------");
    System.out.print(" 1 mi \n 2 mi \n =>  ");
    int ilk = input.nextInt();
      if(ilk == 1){
        Scanner input1 = new Scanner(System.in);
        System.out.print("DOMAİN please  =>  ");
        String ilk3 = input1.nextLine();
        Process p=Runtime.getRuntime().exec("nmap "+ilk3); 
    p.waitFor(); 
    BufferedReader reader=new BufferedReader(new InputStreamReader(p.getInputStream())); 
    String line=reader.readLine(); 
    while(line!=null) 
    { 
    System.out.println(line); 
    line=reader.readLine(); 
    } 
}   if(ilk == 2){
    Scanner input3 = new Scanner(System.in);
    System.out.print("İP ADDRESS please  =>  ");
    String ilk5 = input3.nextLine();
    Process p=Runtime.getRuntime().exec("ping "+ilk5); 
    p.waitFor(); 
    BufferedReader reader=new BufferedReader(new InputStreamReader(p.getInputStream())); 
    String line=reader.readLine(); 
    while(line!=null) 
    { 
    System.out.println(line); 
    line=reader.readLine(); 
    } 
}
    } 
    catch(IOException e1) {} 
    catch(InterruptedException e2) {} 

    System.out.println("Done"); 
} 
} 
