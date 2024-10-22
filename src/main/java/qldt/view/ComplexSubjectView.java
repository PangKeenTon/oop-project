/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package qldt.view;

/**
 *
 * @author Manh
 */


import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SpringLayout;
import javax.swing.WindowConstants;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.DefaultTableModel;

import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SpringLayout;
import javax.swing.WindowConstants;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.DefaultTableModel;
import qldt.entity.ComplexSubject;

public class ComplexSubjectView extends JFrame implements ActionListener, ListSelectionListener {
    private static final long serialVersionUID = 1L;
    private JButton addComplexSubjectBtn;
    private JButton editComplexSubjectBtn;
    private JButton deleteComplexSubjectBtn;
    private JButton clearBtn;
    private JButton sortComplexSubjectByNameBtn;
    private JButton sortComplexSubjectByBirthDateBtn;
    private JScrollPane jScrollPaneComplexSubjectTable;
    private JScrollPane jScrollPaneAddress;
    private JTable complexSubjectTable;

    private JLabel idLabel;
    private JLabel nameLabel;
    private JLabel birthDateLabel;
    private JLabel addressLabel;
    private JLabel permanentAddressLabel;
    private JLabel relativesLabel;
    private JLabel subjectTypeLabel;

    private JTextField idField;
    private JTextField nameField;
    private JTextField birthDateField;
    private JTextArea addressTA;
    private JTextField permanentAddressField;
    private JTextField relativesField;
    private JTextField subjectTypeField;

    private String[] columnNames = new String[] {
            "ID", "Name", "Birth Date", "Address", "Permanent Address", "Relatives", "Subject Type"};
    private Object[][] data = new Object[][] {};

    public ComplexSubjectView() {
        initComponents();
    }

    private void initComponents() {
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        addComplexSubjectBtn = new JButton("Add");
        editComplexSubjectBtn = new JButton("Edit");
        deleteComplexSubjectBtn = new JButton("Delete");
        clearBtn = new JButton("Clear");
        sortComplexSubjectByNameBtn = new JButton("Sort By Name");
        sortComplexSubjectByBirthDateBtn = new JButton("Sort By Birth Date");

        jScrollPaneComplexSubjectTable = new JScrollPane();
        complexSubjectTable = new JTable();

        idLabel = new JLabel("Id");
        nameLabel = new JLabel("Name");
        birthDateLabel = new JLabel("Birth Date");
        addressLabel = new JLabel("Address");
        permanentAddressLabel = new JLabel("Permanent Address");
        relativesLabel = new JLabel("Relatives");
        subjectTypeLabel = new JLabel("Subject Type");

        idField = new JTextField(6);
        idField.setEditable(false);
        nameField = new JTextField(15);
        birthDateField = new JTextField(10);
        addressTA = new JTextArea();
        addressTA.setColumns(15);
        addressTA.setRows(5);
        jScrollPaneAddress = new JScrollPane();
        jScrollPaneAddress.setViewportView(addressTA);
        permanentAddressField = new JTextField(15);
        relativesField = new JTextField(15);
        subjectTypeField = new JTextField(15);

        complexSubjectTable.setModel(new DefaultTableModel(data, columnNames));
        jScrollPaneComplexSubjectTable.setViewportView(complexSubjectTable);
        jScrollPaneComplexSubjectTable.setPreferredSize(new Dimension(480, 300));

        SpringLayout layout = new SpringLayout();
        JPanel panel = new JPanel();
        panel.setSize(800, 420);
        panel.setLayout(layout);
        panel.add(jScrollPaneComplexSubjectTable);

        panel.add(addComplexSubjectBtn);
        panel.add(editComplexSubjectBtn);
        panel.add(deleteComplexSubjectBtn);
        panel.add(clearBtn);
        panel.add(sortComplexSubjectByNameBtn);
        panel.add(sortComplexSubjectByBirthDateBtn);

        panel.add(idLabel);
        panel.add(nameLabel);
        panel.add(birthDateLabel);
        panel.add(addressLabel);
        panel.add(permanentAddressLabel);
        panel.add(relativesLabel);
        panel.add(subjectTypeLabel);

        panel.add(idField);
        panel.add(nameField);
        panel.add(birthDateField);
        panel.add(jScrollPaneAddress);
        panel.add(permanentAddressField);
        panel.add(relativesField);
        panel.add(subjectTypeField);

        layout.putConstraint(SpringLayout.WEST, idLabel, 10, SpringLayout.WEST, panel);
        layout.putConstraint(SpringLayout.NORTH, idLabel, 10, SpringLayout.NORTH, panel);
        layout.putConstraint(SpringLayout.WEST, nameLabel, 10, SpringLayout.WEST, panel);
        layout.putConstraint(SpringLayout.NORTH, nameLabel, 40, SpringLayout.NORTH, panel);
        layout.putConstraint(SpringLayout.WEST, birthDateLabel, 10, SpringLayout.WEST, panel);
        layout.putConstraint(SpringLayout.NORTH, birthDateLabel, 70, SpringLayout.NORTH, panel);
        layout.putConstraint(SpringLayout.WEST, addressLabel, 10, SpringLayout.WEST, panel);
        layout.putConstraint(SpringLayout.NORTH, addressLabel, 100, SpringLayout.NORTH, panel);
        layout.putConstraint(SpringLayout.WEST, permanentAddressLabel, 10, SpringLayout.WEST, panel);
        layout.putConstraint(SpringLayout.NORTH, permanentAddressLabel, 170, SpringLayout.NORTH, panel);
        layout.putConstraint(SpringLayout.WEST, relativesLabel, 10, SpringLayout.WEST, panel);
        layout.putConstraint(SpringLayout.NORTH, relativesLabel, 200, SpringLayout.NORTH, panel);
        layout.putConstraint(SpringLayout.WEST, subjectTypeLabel, 10, SpringLayout.WEST, panel);
        layout.putConstraint(SpringLayout.NORTH, subjectTypeLabel, 230, SpringLayout.NORTH, panel);

        layout.putConstraint(SpringLayout.WEST, idField, 150, SpringLayout.WEST, panel);
        layout.putConstraint(SpringLayout.NORTH, idField, 10, SpringLayout.NORTH, panel);
        layout.putConstraint(SpringLayout.WEST, nameField, 150, SpringLayout.WEST, panel);
        layout.putConstraint(SpringLayout.NORTH, nameField, 40, SpringLayout.NORTH, panel);
        layout.putConstraint(SpringLayout.WEST, birthDateField, 150, SpringLayout.WEST, panel);
        layout.putConstraint(SpringLayout.NORTH, birthDateField, 70, SpringLayout.NORTH, panel);
        layout.putConstraint(SpringLayout.WEST, jScrollPaneAddress, 150, SpringLayout.WEST, panel);
        layout.putConstraint(SpringLayout.NORTH, jScrollPaneAddress, 100, SpringLayout.NORTH, panel);
        layout.putConstraint(SpringLayout.WEST, permanentAddressField, 150, SpringLayout.WEST, panel);
        layout.putConstraint(SpringLayout.NORTH, permanentAddressField, 170, SpringLayout.NORTH, panel);
        layout.putConstraint(SpringLayout.WEST, relativesField, 150, SpringLayout.WEST, panel);
        layout.putConstraint(SpringLayout.NORTH, relativesField, 200, SpringLayout.NORTH, panel);
        layout.putConstraint(SpringLayout.WEST, subjectTypeField, 150, SpringLayout.WEST, panel);
        layout.putConstraint(SpringLayout.NORTH, subjectTypeField, 230, SpringLayout.NORTH, panel);

        layout.putConstraint(SpringLayout.WEST, jScrollPaneComplexSubjectTable, 300, SpringLayout.WEST, panel);
        layout.putConstraint(SpringLayout.NORTH, jScrollPaneComplexSubjectTable, 10, SpringLayout.NORTH, panel);

        layout.putConstraint(SpringLayout.WEST, addComplexSubjectBtn, 20, SpringLayout.WEST, panel);
        layout.putConstraint(SpringLayout.NORTH, addComplexSubjectBtn, 270, SpringLayout.NORTH, panel);
        layout.putConstraint(SpringLayout.WEST, editComplexSubjectBtn, 60, SpringLayout.WEST, addComplexSubjectBtn);
        layout.putConstraint(SpringLayout.NORTH, editComplexSubjectBtn, 270, SpringLayout.NORTH, panel);
        layout.putConstraint(SpringLayout.WEST, deleteComplexSubjectBtn, 60, SpringLayout.WEST, editComplexSubjectBtn);
        layout.putConstraint(SpringLayout.NORTH, deleteComplexSubjectBtn, 270, SpringLayout.NORTH, panel);
        layout.putConstraint(SpringLayout.WEST, clearBtn, 80, SpringLayout.WEST, deleteComplexSubjectBtn);
        layout.putConstraint(SpringLayout.NORTH, clearBtn, 270, SpringLayout.NORTH, panel);
        layout.putConstraint(SpringLayout.WEST, sortComplexSubjectByNameBtn, 300, SpringLayout.WEST, panel);
        layout.putConstraint(SpringLayout.NORTH, sortComplexSubjectByNameBtn, 330, SpringLayout.NORTH, panel);
        layout.putConstraint(SpringLayout.WEST, sortComplexSubjectByBirthDateBtn, 115, SpringLayout.WEST, sortComplexSubjectByNameBtn);
        layout.putConstraint(SpringLayout.NORTH, sortComplexSubjectByBirthDateBtn, 330, SpringLayout.NORTH, panel);

        this.add(panel);
        this.pack();
        this.setTitle("Complex Subject Information");
        this.setSize(800, 420);
        editComplexSubjectBtn.setEnabled(false);
        deleteComplexSubjectBtn.setEnabled(false);
        addComplexSubjectBtn.setEnabled(true);
    }

    public void showMessage(String message) {
        JOptionPane.showMessageDialog(this, message);
    }

public void showListComplexSubjects(List<ComplexSubject> list) {
    int size = list.size();
    Object[][] complexSubjects = new Object[size][7];  // Mảng 2 chiều chứa dữ liệu
    for (int i = 0; i < size; i++) {
        complexSubjects[i][0] = list.get(i).getId();
        complexSubjects[i][1] = list.get(i).getName();
        complexSubjects[i][2] = list.get(i).getBirthDate();
        complexSubjects[i][3] = list.get(i).getAddress();
        complexSubjects[i][4] = list.get(i).getPermanentAddress();
        complexSubjects[i][5] = list.get(i).getRelatives();
        complexSubjects[i][6] = list.get(i).getSubjectType();
    }
    complexSubjectTable.setModel(new DefaultTableModel(complexSubjects, columnNames));
}


    public void fillComplexSubjectFromSelectedRow() {
        int row = complexSubjectTable.getSelectedRow();
        if (row >= 0) {
            idField.setText(complexSubjectTable.getModel().getValueAt(row, 0).toString());
            nameField.setText(complexSubjectTable.getModel().getValueAt(row, 1).toString());
            birthDateField.setText(complexSubjectTable.getModel().getValueAt(row, 2).toString());
            addressTA.setText(complexSubjectTable.getModel().getValueAt(row, 3).toString());
            permanentAddressField.setText(complexSubjectTable.getModel().getValueAt(row, 4).toString());
            relativesField.setText(complexSubjectTable.getModel().getValueAt(row, 5).toString());
            subjectTypeField.setText(complexSubjectTable.getModel().getValueAt(row, 6).toString());
            editComplexSubjectBtn.setEnabled(true);
            deleteComplexSubjectBtn.setEnabled(true);
            addComplexSubjectBtn.setEnabled(false);
        }
    }

    public void clearComplexSubjectInfo() {
        idField.setText("");
        nameField.setText("");
        birthDateField.setText("");
        addressTA.setText("");
        permanentAddressField.setText("");
        relativesField.setText("");
        subjectTypeField.setText("");
        editComplexSubjectBtn.setEnabled(false);
        deleteComplexSubjectBtn.setEnabled(false);
        addComplexSubjectBtn.setEnabled(true);
    }

    public void showComplexSubject(ComplexSubject complexSubject) {
        idField.setText("" + complexSubject.getId());
        nameField.setText(complexSubject.getName());
        birthDateField.setText(complexSubject.getBirthDate());
        addressTA.setText(complexSubject.getAddress());
        permanentAddressField.setText(complexSubject.getPermanentAddress());
        relativesField.setText(complexSubject.getRelatives());
        subjectTypeField.setText(complexSubject.getSubjectType());
        editComplexSubjectBtn.setEnabled(true);
        deleteComplexSubjectBtn.setEnabled(true);
        addComplexSubjectBtn.setEnabled(false);
    }

    public ComplexSubject getComplexSubjectInfo() {
        if (!validateName() || !validateBirthDate() || !validateAddress() || !validatePermanentAddress() || !validateRelatives() || !validateSubjectType()) {
            return null;
        }
        try {
            ComplexSubject complexSubject = new ComplexSubject();
            if (idField.getText() != null && !"".equals(idField.getText())) {
                complexSubject.setId(Integer.parseInt(idField.getText()));
            }
            complexSubject.setName(nameField.getText().trim());
            complexSubject.setBirthDate(birthDateField.getText().trim());
            complexSubject.setAddress(addressTA.getText().trim());
            complexSubject.setPermanentAddress(permanentAddressField.getText().trim());
            complexSubject.setRelatives(relativesField.getText().trim());
            complexSubject.setSubjectType(subjectTypeField.getText().trim());
            return complexSubject;
        } catch (Exception e) {
            showMessage(e.getMessage());
        }
        return null;
    }

    private boolean validateName() {
        String name = nameField.getText();
        if (name == null || "".equals(name.trim())) {
            nameField.requestFocus();
            showMessage("Name không được trống.");
            return false;
        }
        return true;
    }

    private boolean validateBirthDate() {
        String birthDate = birthDateField.getText();
        if (birthDate == null || "".equals(birthDate.trim())) {
            birthDateField.requestFocus();
            showMessage("Birth Date không được trống.");
            return false;
        }
        return true;
    }

    private boolean validateAddress() {
        String address = addressTA.getText();
        if (address == null || "".equals(address.trim())) {
            addressTA.requestFocus();
            showMessage("Address không được trống.");
            return false;
        }
        return true;
    }

    private boolean validatePermanentAddress() {
        String permanentAddress = permanentAddressField.getText();
        if (permanentAddress == null || "".equals(permanentAddress.trim())) {
            permanentAddressField.requestFocus();
            showMessage("Permanent Address không được trống.");
            return false;
        }
        return true;
    }

    private boolean validateRelatives() {
        String relatives = relativesField.getText();
        if (relatives == null || "".equals(relatives.trim())) {
            relativesField.requestFocus();
            showMessage("Relatives không được trống.");
            return false;
        }
        return true;
    }

    private boolean validateSubjectType() {
        String subjectType = subjectTypeField.getText();
        if (subjectType == null || "".equals(subjectType.trim())) {
            subjectTypeField.requestFocus();
            showMessage("Subject Type không được trống.");
            return false;
        }
        return true;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        // Implement action handling logic here if needed
    }

    @Override
    public void valueChanged(ListSelectionEvent e) {
        // Implement list selection handling logic here if needed
    }

    public void addAddComplexSubjectListener(ActionListener listener) {
        addComplexSubjectBtn.addActionListener(listener);
    }

    public void addEditComplexSubjectListener(ActionListener listener) {
        editComplexSubjectBtn.addActionListener(listener);
    }

    public void addDeleteComplexSubjectListener(ActionListener listener) {
        deleteComplexSubjectBtn.addActionListener(listener);
    }

    public void addClearListener(ActionListener listener) {
        clearBtn.addActionListener(listener);
    }

    public void addSortComplexSubjectByNameListener(ActionListener listener) {
        sortComplexSubjectByNameBtn.addActionListener(listener);
    }

    public void addSortComplexSubjectByBirthDateListener(ActionListener listener) {
        sortComplexSubjectByBirthDateBtn.addActionListener(listener);
    }

    public void addListComplexSubjectSelectionListener(ListSelectionListener listener) {
        complexSubjectTable.getSelectionModel().addListSelectionListener(listener);
    }
}