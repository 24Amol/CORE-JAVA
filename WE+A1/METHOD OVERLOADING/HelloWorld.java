import javax.swing.JOptionPane;
class HelloWorld extends JOptionPane {
	public static void main(String[] args) {
    int menuChoice = 4;
switch (menuChoice)
{
 case 1:
 JOptionPane.showMessageDialog(null, "You chose number 1.");
 break;
 case 2:
 JOptionPane.showMessageDialog(null, "You chose number 2.");
 break;
 case 3:
 JOptionPane.showMessageDialog(null, "You chose number 3.");
 break;
 //This option gets chosen because the value 4 matches the value of
 //the menuChoise variable
case 4: JOptionPane.showMessageDialog(null, "You chose number 4."); break;
 default:
 JOptionPane.showMessageDialog(null, "Something went wrong!");
 break;
}
    }
}