package StudentUIProject;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.*;
import java.util.List;
import java.util.Map.Entry;

public class StudentManager {
    private HashMap<Integer, Student> studentMap = new HashMap<>();
    private JFrame frame;
    private JTextArea textArea;
    private JTextField idField, nameField, addressField;
    private JComboBox<String> sortByComboBox;
    private String lastSortedField = ""; // To track last sorted field

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new StudentManager().createUI());
    }

    public void createUI() {
        // Create the JFrame
        frame = new JFrame("Student Management");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500, 500);
        frame.setLayout(new BorderLayout());

        // Create the input panel
        JPanel inputPanel = new JPanel(new GridLayout(3, 2));
        inputPanel.add(new JLabel("Student ID:"));
        idField = new JTextField();
        inputPanel.add(idField);
        inputPanel.add(new JLabel("Student Name:"));
        nameField = new JTextField();
        inputPanel.add(nameField);
        inputPanel.add(new JLabel("Student Address:"));
        addressField = new JTextField();
        inputPanel.add(addressField);
        frame.add(inputPanel, BorderLayout.NORTH);

        // Create buttons panel
        JPanel buttonPanel = new JPanel();
        JButton addButton = new JButton("Add Student");
        JButton sortButton = new JButton("Sort Students");

        // Create a dropdown to select the sorting field
        String[] sortOptions = {"sId", "sName", "sAddress"};
        sortByComboBox = new JComboBox<>(sortOptions);
        buttonPanel.add(new JLabel("Sort By:"));
        buttonPanel.add(sortByComboBox);
        buttonPanel.add(addButton);
        buttonPanel.add(sortButton);
        frame.add(buttonPanel, BorderLayout.CENTER);

        // Create text area to display students
        textArea = new JTextArea();
        JScrollPane scrollPane = new JScrollPane(textArea);
        frame.add(scrollPane, BorderLayout.SOUTH);

        // Add student button functionality
        addButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                addStudent();
            }
        });

        // Sort students button functionality
        sortButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                sortAndDisplayStudents();
            }
        });

        frame.setVisible(true);
    }

    // Method to add a student to the HashMap
    private void addStudent() {
        try {
            int sId = Integer.parseInt(idField.getText());
            String sName = nameField.getText();
            String sAddress = addressField.getText();

            Student student = new Student(sId, sName, sAddress);
            studentMap.put(sId, student);
            textArea.append("Student Added: " + student + "\n");

            // Clear the input fields after adding
            idField.setText("");
            nameField.setText("");
            addressField.setText("");
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(frame, "Invalid ID. Please enter a number.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    // Method to sort and display students by the selected field
    private void sortAndDisplayStudents() {
        String selectedField = (String) sortByComboBox.getSelectedItem();

        // Avoid repeated sorting by the same field
        if (selectedField.equals(lastSortedField)) {
            textArea.append("\nAlready sorted by " + selectedField + ".\n");
            return;
        }

        // Convert the HashMap values to a List and sort based on selected field
        List<Entry<Integer, Student>> studentList = new ArrayList<>(studentMap.entrySet());
        switch (selectedField) {
            case "sId":
                studentList.sort(Comparator.comparingInt(entry -> entry.getValue().getsId()));
                break;
            case "sName":
                studentList.sort(Comparator.comparing(entry -> entry.getValue().getsName()));
                break;
            case "sAddress":
                studentList.sort(Comparator.comparing(entry -> entry.getValue().getsAddress()));
                break;
        }

        // Display sorted students
        textArea.append("\nSorted Students by " + selectedField + ":\n");
        for (Entry<Integer, Student> entry : studentList) {
            textArea.append(entry.getValue().toString() + "\n");
        }

        // Update the last sorted field
        lastSortedField = selectedField;
    }
}
