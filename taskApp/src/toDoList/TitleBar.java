package toDoList;

import java.awt.*;

import javax.swing.*;

public class TitleBar extends JPanel {

    //constructor
    TitleBar () {
        this.setPreferredSize(new Dimension(400, 50));

        //title text
        JLabel titleText = new JLabel("To Do List");
        titleText.setPreferredSize(new Dimension(200,50));
        titleText.setFont(new Font("Sans-serif",Font.BOLD,20));
        titleText.setHorizontalAlignment(JLabel.CENTER);

        this.add(titleText);
    }
}
