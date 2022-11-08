import java.util.Scanner;
public class RunBloodData{
    public static void main(String[] args) {
        Scanner SC = new Scanner(System.in);
        
        BloodData bd;
        
        System.out.print("Enter blood type of patient: ");
        String input1 = SC.nextLine();
        System.out.print("Enter the Rhesus factor (+ or -): ");
        String input2 = SC.nextLine();
        String data = input1 + input2;
        
        if(data.isEmpty()){	
        	bd = new BloodData();
        	bd.setBloodType("O");
            bd.setRhFactor("+");
            System.out.print(bd.getBloodType() + bd.getRhFactor() + " is added to the blood bank.");
        }
        else if(data.equals("A+")||data.equals("A-")|| data.equals("B+")||data.equals("B-")||data.equals("AB+")||data.equals("AB-")||data.equals("O+")||data.equals("O-")){
            bd = new BloodData();
            bd.setBloodType(input1);
            bd.setRhFactor(input2);
            System.out.println(bd.getBloodType() + bd.getRhFactor() + " is added to the blood bank.");
        }
        else{
            System.out.println("Invalid input!");
        }
        SC.close();
    }
}