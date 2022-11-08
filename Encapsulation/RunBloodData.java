import java.util.*;
public class RunBloodData {
    public static void main(String[] args) {
        Scanner SC = new Scanner(System.in);
        
            System.out.print("Enter Blood type of Patient: ");
            String entBt = SC.nextLine();

            System.out.print("Enter the Rhesus factor (+ or -): ");
            String entRh = SC.nextLine();

            if (entBt.equalsIgnoreCase("A") || entBt.equalsIgnoreCase("B") || entBt.equalsIgnoreCase("O") || entBt.equalsIgnoreCase("AB")) {
                BloodData bd = new BloodData(entBt, entRh);
                bd.display();
            }
            else if (entBt.isEmpty()){
            	BloodData bd = new BloodData();
                bd.display();
            }
            else {
            	System.out.println("Invalid Input!");
            }
    }
}