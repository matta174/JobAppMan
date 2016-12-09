package state;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import static com.sun.glass.ui.Cursor.setVisible;

/**
 * Created by Matthew on 12/8/2016.
 */
public class mainLanding {


    private JButton button1;



    public mainLanding() {
        button1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                JFrame newGameWindow = new JFrame("login");
                newGameWindow.setVisible(true);
                newGameWindow.add(new JLabel("Customize your game ui in the new window!"));
                newGameWindow.pack();
            }
        });
    }
}
