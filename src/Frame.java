import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Frame implements ActionListener {
    JFrame frame;
    JLabel title;
    JComboBox<String> computeBox;
    JComboBox<String> shapeBox;
    JTextField length;
    JTextField width;
    JTextField radius;
    JTextField perimeter;
    JTextField area;

    Frame(){
        frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new BorderLayout());
        frame.setSize(500,500);
        frame.setResizable(false);
        frame.setLocationRelativeTo(null);

        title = new JLabel("    Perimeter Area Calculator");
        title.setFont(new Font("Arial",Font.BOLD,20));

        String[] choices = {"Perimeter", "Area"};
        computeBox = new JComboBox<String>(choices);
        computeBox.addActionListener(this);
        computeBox.setEditable(false);
        computeBox.setFocusable(false);
        computeBox.setBounds(10,5,100,30);

        String[] shapes = {"Circle", "Rectangle"};
        shapeBox = new JComboBox<>(shapes);
        shapeBox.addActionListener(this);
        shapeBox.setEditable(false);
        shapeBox.setFocusable(false);
        shapeBox.setBounds(120,5,100,30);

        length = new JTextField();
        length.addActionListener(this);
        length.setFont(new Font("Arial",Font.BOLD,20));
        length.setForeground(Color.black);
        length.setText("Length: ");
        length.setEditable(true);
        length.setBounds(10,100,300,50);

        width = new JTextField("Width: ");
        width.addActionListener(this);
        width.setFont(new Font("Arial",Font.BOLD,20));
        width.setForeground(Color.black);
        width.setEditable(true);
        width.setBounds(10,160,300,50);

        perimeter = new JTextField("Perimeter: ");
        perimeter.addActionListener(this);
        perimeter.setEditable(false);
        perimeter.setFocusable(false);
        perimeter.setBounds(10,220,300,50);

        area = new JTextField("Area: ");
        area.setEditable(false);
        area.setFocusable(false);
        area.setBounds(10,280,300,50);

        JPanel interfacePanel = new JPanel();
        interfacePanel.setBackground(Color.orange);
        interfacePanel.setOpaque(true);
        interfacePanel.setLayout(null);

        interfacePanel.add(length);
        interfacePanel.add(width);
        interfacePanel.add(area);
        interfacePanel.add(perimeter);
        interfacePanel.add(shapeBox);
        interfacePanel.add(computeBox);

        frame.add(title, BorderLayout.NORTH);
        frame.add(interfacePanel, BorderLayout.CENTER);
        frame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }
}

