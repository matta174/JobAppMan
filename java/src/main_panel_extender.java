/**
 * Created by Matthew on 10/30/2016.
 */

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.plaf.basic.BasicButtonListener;
import javax.swing.plaf.basic.BasicOptionPaneUI;


public class main_panel_extender extends main_panel {
    private JButton join,host,view_active;
    private  JLabel label;
    private JPanel buttonPanel;

    //Constructor to set up the GUI

    public main_panel_extender()
    {
        host = new JButton("Host");
        join = new JButton("Join");
        view_active = new JButton("View Active Games");

        BasicButtonListener listener = new BasicButtonListener();
        host.addActionListener (listener);
        join.addActionListener(listener);
        view_active.addActionListener(listener);

        label = new JLabel("Push a button");

        buttonPanel = new JPanel();
        buttonPanel.setPreferredSize(new Dimension(200,400));

        buttonPanel.setBackground(Color.blue);
        buttonPanel.add (host);
        buttonPanel.add (join);
        buttonPanel.add (view_active);

        setPreferredSize (new Dimension(200,80));
        setBackground (Color.cyan);
        add(label);
        add (buttonPanel);

    }
    private class ButtonListener implements ActionListener
    {
        @Override
        public void actionPerformed(ActionEvent e) {
          //TODO  if(e.getSource()==)
        }
    }
}
