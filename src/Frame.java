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
    JLabel lengthLabel;
    JLabel widthLabel;
    JLabel radiusLabel;
    JTextField width;
    JTextField radius;
    JButton calculate;
    JTextField perimeter;
    JTextField area;
    JPanel interfacePanel;

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
        computeBox = new JComboBox<>(choices);
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
        length.setEditable(true);
        length.setVisible(false);
        length.setBounds(10,100,300,50);

        lengthLabel = new JLabel("Length");
        lengthLabel.setFont(new Font("Arial",Font.BOLD,20));
        lengthLabel.setForeground(Color.black);
        lengthLabel.setVisible(false);
        lengthLabel.setBounds(320,100,100,50);

        width = new JTextField();
        width.addActionListener(this);
        width.setFont(new Font("Arial",Font.BOLD,20));
        width.setForeground(Color.black);
        width.setEditable(true);
        width.setVisible(false);
        width.setBounds(10,160,300,50);

        widthLabel = new JLabel("Width");
        widthLabel.setFont(new Font("Arial",Font.BOLD,20));
        widthLabel.setForeground(Color.black);
        widthLabel.setVisible(false);
        widthLabel.setBounds(320,160,100,50);

        radius = new JTextField();
        radius.addActionListener(this);
        radius.setFont(new Font("Arial",Font.BOLD,20));
        radius.setForeground(Color.black);
        radius.setEditable(true);
        radius.setVisible(false);
        radius.setBounds(10,160,300,50);

        radiusLabel = new JLabel("Radius");
        radiusLabel.setFont(new Font("Arial",Font.BOLD,20));
        radiusLabel.setForeground(Color.black);
        radiusLabel.setVisible(false);
        radiusLabel.setBounds(320,160,100,50);

        perimeter = new JTextField("Perimeter: ");
        perimeter.setFont(new Font("Arial",Font.BOLD,20));
        perimeter.setEditable(false);
        perimeter.setFocusable(false);
        perimeter.setVisible(false);
        perimeter.setBounds(10,220,300,50);

        area = new JTextField("Area: ");
        area.setEditable(false);
        area.setFont(new Font("Arial",Font.BOLD,20));
        area.setFocusable(false);
        area.setVisible(false);
        area.setBounds(10,220,300,50);

        calculate = new JButton("Calculate");
        calculate.setFont(new Font("Arial",Font.BOLD,12));
        calculate.setBackground(Color.white);
        calculate.setBounds(320,220,100,50);
        calculate.addActionListener(this);
        calculate.setVisible(false);

        interfacePanel = new JPanel();
        interfacePanel.setBackground(Color.orange);
        interfacePanel.setOpaque(true);
        interfacePanel.setLayout(null);


        interfacePanel.add(length);
        interfacePanel.add(lengthLabel);
        interfacePanel.add(width);
        interfacePanel.add(widthLabel);
        interfacePanel.add(radius);
        interfacePanel.add(radiusLabel);
        interfacePanel.add(perimeter);
        interfacePanel.add(area);
        interfacePanel.add(calculate);
        interfacePanel.add(shapeBox);
        interfacePanel.add(computeBox);

        frame.add(title, BorderLayout.NORTH);
        frame.add(interfacePanel, BorderLayout.CENTER);
        frame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if(shapeBox.getSelectedItem() == "Rectangle"){
            length.setVisible(true);
            width.setVisible(true);
            lengthLabel.setVisible(true);
            widthLabel.setVisible(true);
            radius.setVisible(false);
            radiusLabel.setVisible(false);


            if(computeBox.getSelectedItem() == "Perimeter"){
                area.setVisible(false);
                perimeter.setVisible(true);
                calculate.setVisible(true);

                if(e.getSource() == calculate) {
                    try {
                        Shape rectangle = new Rectangle(Double.parseDouble(length.getText()), Double.parseDouble(width.getText()));

                        perimeter.setText("Perimeter: " + rectangle.calculatePerimeter());
                    } catch (NumberFormatException ex) {
                        JOptionPane.showMessageDialog(frame, "Not a valid length or width");
                        length.setText("");
                        width.setText("");
                    }
                }
            }

            if(computeBox.getSelectedItem() == "Area"){
                perimeter.setVisible(false);
                area.setVisible(true);
                calculate.setVisible(true);

                if(e.getSource() == calculate) {
                    try {
                        Shape rectangle = new Rectangle(Double.parseDouble(length.getText()), Double.parseDouble(width.getText()));

                        area.setText("Area: " + rectangle.calculateArea());
                    } catch (NumberFormatException ex) {
                        JOptionPane.showMessageDialog(frame, "Not a valid length or width");
                        length.setText("");
                        width.setText("");
                    }
                }
            }
        }

        if(shapeBox.getSelectedItem() == "Circle"){
            length.setVisible(false);
            width.setVisible(false);
            radius.setVisible(true);
            radiusLabel.setVisible(true);
            lengthLabel.setVisible(false);
            widthLabel.setVisible(false);

            if(computeBox.getSelectedItem() == "Perimeter"){
                area.setVisible(false);
                perimeter.setVisible(true);
                radius.setVisible(true);
                calculate.setVisible(true);

                if(e.getSource() == calculate){
                    try{
                        Shape circle =  new Circle(Double.parseDouble(radius.getText()));

                        perimeter.setText("Perimeter: " + circle.calculatePerimeter());
                    }
                    catch(NumberFormatException ex){
                        JOptionPane.showMessageDialog(frame, "Not a valid radius");
                        radius.setText("");
                    }
                }

            }

            if(computeBox.getSelectedItem() == "Area"){
                perimeter.setVisible(false);
                area.setVisible(true);
                radius.setVisible(true);
                calculate.setVisible(true);

                if(e.getSource() == calculate){
                    try{
                        Shape circle =  new Circle(Double.parseDouble(radius.getText()));

                        area.setText("area: " + circle.calculateArea());
                    }
                    catch(NumberFormatException ex){
                        JOptionPane.showMessageDialog(frame, "Not a valid radius");
                        radius.setText("");
                    }
                }
            }
        }
    }
}

