/** This is used to set up the default panel setup
 * Created by Matthew on 10/30/2016.
 */
import javax.swing.JFrame;

public class main_panel
{

    public static void main (String[] args)
    {
        JFrame frame = new JFrame ("Stock App Fun!");
        frame.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);

        frame.getContentPane().add(frame, new main_panel());

        frame.pack();
        frame.setVisible(true);
    }
}