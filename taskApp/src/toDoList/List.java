package toDoList;

import javax.swing.*;
import java.awt.*;

public class List extends JPanel {

    List(){
        GridLayout layout = new GridLayout(10,1);

        this.setLayout(layout);
        this.setBackground(Color.red);
    }
}
