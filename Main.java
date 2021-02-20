import javax.swing.JFrame:
	
public class Main extends JFrame {
	
	private static final long serialVersionUID = 1L;
	
	public static void main(String[] args) {
		new Main().setVisible(true);
	}
	
	private Main() {
		super("");
	}
}


//import java.io.*;
//import java.awt.GraphicsEnvironment;
//import java.net.URISyntaxException;
//public class Main{
//    public static void main (String [] args) throws IOException, InterruptedException, URISyntaxException{
//        Console console = System.console();
//        if(console == null && !GraphicsEnvironment.isHeadless()){
//            String filename = Main.class.getProtectionDomain().getCodeSource().getLocation().toString().substring(6);
//            Runtime.getRuntime().exec(new String[]{"cmd","/c","start","cmd","/k","java -jar \"" + filename + "\""});
//        }else{
//            DarkScapeToolkit.main(new String[0]);
//            System.out.println("Program has ended, please type 'exit' to close the console");
//        }
//    }
//}