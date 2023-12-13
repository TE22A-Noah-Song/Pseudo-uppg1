import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
    
        // System.out.println("Ange Användarnamn:");
    // String Användarnamn=t.nextLine();
    //   System.out.println("Ange Lösenord:");
    // String Lösenord=t.nextLine();
    // if(Användarnamn.equals("root") && Lösenord.equals("pass"))
    // {
    //     System.out.println("Ditt bankkonto har 0 kr");
    // }

    // else
    // {
    //     System.out.println("Fel namn eller lösenord");
    // }
    Scanner t=new Scanner(System.in);
    System.out.println("Ange ett heltal:");
    int tal=t.nextInt();
    if (tal>10)
    {
        System.out.println("talet "+tal+" är större än 10");
    }

    else if(tal<=10);
    {
        System.out.println("talet "+tal+" är mindre eller lika med 10");
    }
    }
}
