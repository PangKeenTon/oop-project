/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package qldt.controller;

/**
 *
 * @author Manh
 */

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import qldt.dao.ComplexSubjectDao;
import qldt.entity.ComplexSubject;
import qldt.view.ComplexSubjectView;

public class ComplexSubjectController {
    private ComplexSubjectDao complexSubjectDao;
    private ComplexSubjectView complexSubjectView;

    public ComplexSubjectController(ComplexSubjectView view) {
        this.complexSubjectView = view;
        complexSubjectDao = new ComplexSubjectDao();

        view.addAddComplexSubjectListener(new AddComplexSubjectListener());
        view.addEditComplexSubjectListener(new EditComplexSubjectListener());
        view.addDeleteComplexSubjectListener(new DeleteComplexSubjectListener());
        view.addClearListener(new ClearComplexSubjectListener());
        view.addSortComplexSubjectByNameListener(new SortComplexSubjectByNameListener());
        view.addSortComplexSubjectByBirthDateListener(new SortComplexSubjectByBirthDateListener());
        view.addListComplexSubjectSelectionListener(new ListComplexSubjectSelectionListener());
    }

    public void showComplexSubjectView() {
        List<ComplexSubject> complexSubjectList = complexSubjectDao.getListComplexSubjects();
        complexSubjectView.setVisible(true);
        complexSubjectView.showListComplexSubjects(complexSubjectList);
    }

    class AddComplexSubjectListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            ComplexSubject complexSubject = complexSubjectView.getComplexSubjectInfo();
            if (complexSubject != null) {
                complexSubjectDao.add(complexSubject);
                complexSubjectView.showComplexSubject(complexSubject);
                complexSubjectView.showListComplexSubjects(complexSubjectDao.getListComplexSubjects());
                complexSubjectView.showMessage("Thêm thành công!");
            }
        }
    }

    class EditComplexSubjectListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            ComplexSubject complexSubject = complexSubjectView.getComplexSubjectInfo();
            if (complexSubject != null) {
                complexSubjectDao.edit(complexSubject);
                complexSubjectView.showComplexSubject(complexSubject);
                complexSubjectView.showListComplexSubjects(complexSubjectDao.getListComplexSubjects());
                complexSubjectView.showMessage("Cập nhật thành công!");
            }
        }
    }

    class DeleteComplexSubjectListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            ComplexSubject complexSubject = complexSubjectView.getComplexSubjectInfo();
            if (complexSubject != null) {
                complexSubjectDao.delete(complexSubject);
                complexSubjectView.clearComplexSubjectInfo();
                complexSubjectView.showListComplexSubjects(complexSubjectDao.getListComplexSubjects());
                complexSubjectView.showMessage("Xóa thành công!");
            }
        }
    }

    class ClearComplexSubjectListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            complexSubjectView.clearComplexSubjectInfo();
        }
    }

    class SortComplexSubjectByNameListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            complexSubjectDao.sortComplexSubjectByName();
            complexSubjectView.showListComplexSubjects(complexSubjectDao.getListComplexSubjects());
        }
    }

    class SortComplexSubjectByBirthDateListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            complexSubjectDao.sortComplexSubjectByBirthDate();
            complexSubjectView.showListComplexSubjects(complexSubjectDao.getListComplexSubjects());
        }
    }

    class ListComplexSubjectSelectionListener implements ListSelectionListener {
        public void valueChanged(ListSelectionEvent e) {
            complexSubjectView.fillComplexSubjectFromSelectedRow();
        }
    }
}
