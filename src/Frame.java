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
    JTextField width;
    JLabel widthLabel;
    JTextField radius;
    JLabel radiusLabel;
    JTextField height;
    JLabel heightLabel;
    JTextField base;
    JLabel baseLabel;
    JTextField sideA;
    JLabel sideALabel;
    JLabel sideBLabel;
    JTextField sideB;
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

        title = new JLabel("Area Calculator");
        title.setFont(new Font("Rubik",Font.BOLD,38));
        title.setHorizontalAlignment(JLabel.CENTER);
        title.setBorder(BorderFactory.createEmptyBorder(10, 0, 20, 0));
        title.setBackground(new Color(0x212529));
        title.setOpaque(true);
        title.setForeground(new Color(0xf8f9fa));

//        String[] choices = {"Area"};
//        computeBox = new JComboBox<>(choices);
//        computeBox.addActionListener(this);
//        computeBox.setEditable(false);
//        computeBox.setFocusable(false);
//        computeBox.setBounds(10,5,100,30);
//        computeBox.setBorder(BorderFactory.createLineBorder(new Color(0xcc5de8), 1));
//        computeBox.setFocusable(false);
//        computeBox.setBackground(new Color(0xf8f0fc));
//        computeBox.setFont(new Font("Rubik", Font.BOLD, 18));

        String[] shapes = {"Circle", "Rectangle", "Triangle"};
        shapeBox = new JComboBox<>(shapes);
        shapeBox.addActionListener(this);
        shapeBox.setEditable(false);
        shapeBox.setFocusable(false);
        shapeBox.setBounds(10,5,150,30);
        shapeBox.setBorder(BorderFactory.createLineBorder(new Color(0xcc5de8), 1));
        shapeBox.setFocusable(false);
        shapeBox.setBackground(new Color(0xf8f0fc));
        shapeBox.setFont(new Font("Rubik", Font.BOLD, 18));



        //for rectangle
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

        //for circle
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

        //for triangle
        height = new JTextField();
        height.addActionListener(this);
        height.setFont(new Font("Arial",Font.BOLD,20));
        height.setForeground(Color.black);
        height.setEditable(true);
        height.setVisible(false);
        height.setBounds(10,100,300,50);

        heightLabel = new JLabel("Height");
        heightLabel.setFont(new Font("Arial",Font.BOLD,20));
        heightLabel.setForeground(Color.black);
        heightLabel.setVisible(false);
        heightLabel.setBounds(320,100,100,50);

        base = new JTextField();
        base.addActionListener(this);
        base.setFont(new Font("Arial",Font.BOLD,20));
        base.setForeground(Color.black);
        base.setEditable(true);
        base.setVisible(false);
        base.setBounds(10,160,300,50);

        baseLabel = new JLabel("Base");
        baseLabel.setFont(new Font("Arial",Font.BOLD,20));
        baseLabel.setForeground(Color.black);
        baseLabel.setVisible(false);
        baseLabel.setBounds(320,160,100,50);

        sideA = new JTextField();
        sideA.addActionListener(this);
        sideA.setFont(new Font("Arial",Font.BOLD,20));
        sideA.setForeground(Color.black);
        sideA.setEditable(true);
        sideA.setVisible(false);
        sideA.setBounds(10,40,300,50);

        sideALabel = new JLabel("Side A");
        sideALabel.setFont(new Font("Arial",Font.BOLD,20));
        sideALabel.setForeground(Color.black);
        sideALabel.setVisible(false);
        sideALabel.setBounds(320,50,100,50);

        sideB = new JTextField();
        sideB.addActionListener(this);
        sideB.setFont(new Font("Arial",Font.BOLD,20));
        sideB.setForeground(Color.black);
        sideB.setEditable(true);
        sideB.setVisible(false);
        sideB.setBounds(10,100,300,50);

        sideBLabel = new JLabel("Side B");
        sideBLabel.setFont(new Font("Arial",Font.BOLD,20));
        sideBLabel.setForeground(Color.black);
        sideBLabel.setVisible(false);
        sideBLabel.setBounds(320,100,100,50);


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


        JTextField[] textFields = {length, width, radius, height, base, sideA, sideB};

        for (JTextField textField : textFields) {
            textField.setBorder(BorderFactory.createLineBorder(new Color(0xcc5de8), 1));
            textField.setBackground(new Color(0xf8f0fc));
            textField.setForeground(new Color(0x333333));
            textField.setFont(new Font("Rubik", Font.BOLD, 20));

        }

        JLabel[] labels = {lengthLabel, widthLabel, radiusLabel, heightLabel, baseLabel, sideALabel, sideBLabel};

        for (JLabel label : labels) {
            label.setFont(new Font("Rubik", Font.BOLD, 20));
            label.setForeground(new Color(0xf8f9fa));
        }

        calculate = new JButton("Calculate");
        calculate.setFont(new Font("Rubik",Font.BOLD,18));
        calculate.setBackground(Color.white);
        calculate.setBounds(320,220,150,50);
        calculate.addActionListener(this);
        calculate.setVisible(false);
        calculate.setBackground(new Color(0x862e9c));
        calculate.setForeground(Color.white);
        calculate.setBorder(null);
        calculate.setFocusable(false);


        interfacePanel = new JPanel();
        interfacePanel.setBackground(new Color(0x212529));
        interfacePanel.setOpaque(true);
        interfacePanel.setLayout(null);


        interfacePanel.add(length);
        interfacePanel.add(lengthLabel);
        interfacePanel.add(width);
        interfacePanel.add(widthLabel);
        interfacePanel.add(radius);
        interfacePanel.add(radiusLabel);
        interfacePanel.add(base);
        interfacePanel.add(baseLabel);
        interfacePanel.add(height);
        interfacePanel.add(heightLabel);
        interfacePanel.add(sideA);
        interfacePanel.add(sideALabel);
        interfacePanel.add(sideB);
        interfacePanel.add(sideBLabel);
        interfacePanel.add(perimeter);
        interfacePanel.add(area);
        interfacePanel.add(calculate);
        interfacePanel.add(shapeBox);
//        interfacePanel.add(computeBox);

        radius.setVisible(true);
        radiusLabel.setVisible(true);
        area.setText("area: ");
        perimeter.setText("perimeter: ");
        perimeter.setVisible(false);
        area.setVisible(true);
        radius.setVisible(true);
        calculate.setVisible(true);

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
            base.setVisible(false);
            baseLabel.setVisible(false);
            height.setVisible(false);
            heightLabel.setVisible(false);
            sideA.setVisible(false);
            sideALabel.setVisible(false);
            sideB.setVisible(false);
            sideBLabel.setVisible(false);
            area.setText("area: ");
            perimeter.setText("perimeter: ");



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

        if(shapeBox.getSelectedItem() == "Circle"){
            length.setVisible(false);
            lengthLabel.setVisible(false);
            width.setVisible(false);
            widthLabel.setVisible(false);
            base.setVisible(false);
            baseLabel.setVisible(false);
            height.setVisible(false);
            heightLabel.setVisible(false);
            sideA.setVisible(false);
            sideALabel.setVisible(false);
            sideB.setVisible(false);
            sideBLabel.setVisible(false);
            radius.setVisible(true);
            radiusLabel.setVisible(true);
            area.setText("area: ");
            perimeter.setText("perimeter: ");




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

        if(shapeBox.getSelectedItem() == "Triangle"){
            length.setVisible(false);
            lengthLabel.setVisible(false);
            width.setVisible(false);
            widthLabel.setVisible(false);
            radius.setVisible(false);
            radiusLabel.setVisible(false);
            base.setVisible(true);
            baseLabel.setVisible(true);
            calculate.setVisible(true);
            area.setText("area: ");
            perimeter.setText("perimeter: ");



                sideA.setVisible(false);
                sideALabel.setVisible(false);
                sideB.setVisible(false);
                sideBLabel.setVisible(false);
                height.setVisible(true);
                heightLabel.setVisible(true);

                area.setVisible(true);

                if(e.getSource() == calculate){
                    try{
                        Shape triangle =  new Triangle(Double.parseDouble(base.getText()), Double.parseDouble(height.getText()));


                        area.setText("Area: " + triangle.calculateArea());
                    }
                    catch(NumberFormatException ex){
                        JOptionPane.showMessageDialog(frame, "Not a valid base or height");
                        radius.setText("");
                    }
            }
        }
    }
}

