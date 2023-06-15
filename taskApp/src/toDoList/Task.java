package toDoList;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;

public class Task extends JPanel {

    private JLabel index;
    private JTextField taskName;
    private JButton done;

    private boolean checked;
    //constructor
    Task(){
        this.setPreferredSize(new Dimension(40, 20));
        this.setBackground(Color.red);

        this.setLayout(new BorderLayout());

        checked = false;
        //index design
        index = new JLabel("");
        index.setPreferredSize(new Dimension(20,20));
        index.setHorizontalAlignment(JLabel.CENTER);
        this.add(index, BorderLayout.WEST);
        //task field design
        taskName = new JTextField("Your Task Here");
        taskName.setBorder(BorderFactory.createEmptyBorder());
        taskName.setBackground(Color.green);

        this.add(taskName, BorderLayout.CENTER);
        //done button design
        done = new JButton("Done");
        done.setPreferredSize(new Dimension(40,20));
        done.setBorder(BorderFactory.createEmptyBorder());

        this.add(done, BorderLayout.EAST);
    }
}
