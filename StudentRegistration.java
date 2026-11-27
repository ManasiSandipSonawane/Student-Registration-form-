import javax.swing.*;
import java.awt.*;

public class StudentRegistration {
    public static void main(String[] args) {

        JFrame frame = new JFrame("Student Registration Form");
        frame.setSize(400, 400);
        frame.setLayout(new GridLayout(6, 2, 10, 10));
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JLabel nameLabel = new JLabel("Student Name:");
        JTextField nameField = new JTextField();

        JLabel rollLabel = new JLabel("Roll Number:");
        JTextField rollField = new JTextField();

        JLabel emailLabel = new JLabel("Email:");
        JTextField emailField = new JTextField();

        JLabel courseLabel = new JLabel("Course:");
        String[] courses = {"BCA", "BSc", "BTech", "MCA"};
        JComboBox<String> courseBox = new JComboBox<>(courses);

        JButton submitButton = new JButton("Register");
        JButton clearButton = new JButton("Clear");

        frame.add(nameLabel);
        frame.add(nameField);

        frame.add(rollLabel);
        frame.add(rollField);

        frame.add(emailLabel);
        frame.add(emailField);

        frame.add(courseLabel);
        frame.add(courseBox);

        frame.add(submitButton);
        frame.add(clearButton);

        submitButton.addActionListener(e -> {
            String name = nameField.getText();
            String roll = rollField.getText();
            String email = emailField.getText();
            String course = (String) courseBox.getSelectedItem();

            if (name.isEmpty() || roll.isEmpty() || email.isEmpty()) {
                JOptionPane.showMessageDialog(frame, "Please fill all fields");
            } else {
                JOptionPane.showMessageDialog(frame,
                        "Registration Successful!\n" +
                        "Name: " + name +
                        "\nRoll No: " + roll +
                        "\nEmail: " + email +
                        "\nCourse: " + course);
            }
        });

        clearButton.addActionListener(e -> {
            nameField.setText("");
            rollField.setText("");
            emailField.setText("");
        });

        frame.setVisible(true);
    }
}