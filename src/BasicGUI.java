import javax.swing.JOptionPane;

public class BasicGUI {

	public static void main(String[] args) {
		
		String name = JOptionPane.showInputDialog("Enter your name");
		JOptionPane.showMessageDialog(null, "Hello " + name);
		
		int age = Integer.parseInt(JOptionPane.showInputDialog("Enter your age"));
		JOptionPane.showMessageDialog(null, "Your are " + age + "years old");
		
		double height = Double.parseDouble(JOptionPane.showInputDialog("Enter your Height"));
		JOptionPane.showMessageDialog(null, "Your are " + height + " cm tall");
	}

}
