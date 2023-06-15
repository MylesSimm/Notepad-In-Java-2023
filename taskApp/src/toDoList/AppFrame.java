package toDoList;

import javax.swing.*;
import java.awt.BorderLayout;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;


public class AppFrame extends JFrame{
    private TitleBar title;
    private List list;
    private Button btnPanel;

    private JButton addTask;
    private JButton clearTask;
    //constructor
    AppFrame() {
        this.setSize(400,600);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);

        title = new TitleBar();
        list = new List();
        btnPanel = new Button();

        this.add(title, BorderLayout.NORTH);
        this.add(btnPanel, BorderLayout.SOUTH);
        this.add(list, BorderLayout.CENTER);

        addTask = btnPanel.getAddTask();
        clearTask = btnPanel.getClearTask();

        addListener();
    }

    public void addListener() {
        addTask.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                Task task = new Task();
                list.add(task);
                revalidate();
            }
        });
    }
}

