import java.util.Scanner;
//import org.eclipse.swt.widgets.Display;
//import org.eclipse.swt.widgets.Shell;


public class DarkScapeToolkit {

	public static void main(String[] args) {

		//Display display = new Display();
		//Shell shell = new Shell(display);
		//shell.setText("DarkScape Calculator");
		//shell.open();
		//while (!shell.isDisposed()) {
		//if (!display.readAndDispatch()) display.sleep();
		//}
		//display.dispose();
		Scanner user_input = new Scanner(System.in);
		System.out.println("Enter Your Attack: ");
		int Attack = user_input.nextInt();
		System.out.println("Enter Your Strength: ");
		int Strength = user_input.nextInt();
		System.out.println("Enter Your Defence: ");
		int Defence = user_input.nextInt();
		System.out.println("Enter Your Ranged: ");
		int Ranged = user_input.nextInt();
		System.out.println("Enter Your Constitution: ");
		int Constitution = user_input.nextInt();
		System.out.println("Enter Your Prayer: ");
		int Prayer = user_input.nextInt();
		System.out.println("Enter Your Magic: ");
		int Magic = user_input.nextInt();
		System.out.println("Enter Your Summoning: ");
		int Summoning = user_input.nextInt();
		int Max_Level = 138;
		user_input.close();
		
		int Melee_Component = Strength + Attack;
		int Magic_Component = Magic * 2;
		int Ranged_Component = Ranged * 2;
		int Root_Component = Defence + Constitution;
		int Extra_Component = (Prayer / 2) + (Summoning / 2);
		int Standard_Component = Root_Component + Extra_Component;
		
		int Combat_Level = (int)(Math.max(Melee_Component, Math.max(Magic_Component, Ranged_Component)) * 1.3 + Standard_Component) / 4;
		
		double Melee_Level = (Melee_Component * 1.3 + Standard_Component)/4;
		double Magic_Level = (Magic_Component * 1.3 + Standard_Component)/4;
		double Ranged_Level = (Ranged_Component * 1.3 + Standard_Component)/4;
		
		double Melee_Raw = (Melee_Component * 1.3 + Root_Component)/4;
		double Magic_Raw = (Magic_Component * 1.3 + Root_Component)/4;
		double Ranged_Raw = (Ranged_Component * 1.3 + Root_Component)/4;
		
		System.out.println("Your Displayed Combat Level is: " + Combat_Level);
		System.out.println("Your Melee Combat Level is: " + Melee_Level);
		System.out.println("Your Magic Combat Level is: " + Magic_Level);
		System.out.println("Your Ranged Combat Level is: " + Ranged_Level);
		System.out.println("-------------------------------------");
		System.out.println("Your raw Melee Combat Level is: " + Melee_Raw);
		System.out.println("Your raw Magic Combat Level is: " + Magic_Raw);
		System.out.println("Your raw Ranged Combat Level is: " + Ranged_Raw);
	}
}
