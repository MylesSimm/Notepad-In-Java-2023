package toDoList;

import java.awt.*;

import javax.swing.*;
import javax.swing.border.Border;

public class Button extends JPanel {
    private JButton addTask;
    private JButton clearTask;

    Border emptyBorder = BorderFactory.createEmptyBorder();

    //constructor
    Button() {
        this.setPreferredSize(new Dimension(40,40));

        //add task button
        addTask = new JButton("Another One");
        addTask.setBorder(emptyBorder);
        addTask.setFont(new Font("Sans-serif",Font.PLAIN,20));

        this.add(addTask);

        //space between buttons
        this.add(Box.createHorizontalStrut(20));

        //clear task button
        clearTask = new JButton("Done");
        clearTask.setBorder(emptyBorder);
        clearTask.setFont(new Font("Sans-serif",Font.PLAIN,20));

        this.add(clearTask);
    }

    //public methods to get buttons
    public JButton getClearTask(){
        return clearTask;
    }

    public JButton getAddTask(){
        return addTask;
    }

}
