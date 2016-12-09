package state;

/**
 * Created by Matthew on 12/8/2016.
 */

import javax.swing.*;
import state.mainLanding;

        import javax.swing.*;

public class main{
    public static void main(String[] args) {

        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                mainLanding gui = new mainLanding();
                JFrame frame = new JFrame();
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

                frame.getContentPane().add(gui);
                frame.pack();
                frame.setVisible(true);
            }
        });
    }
}
