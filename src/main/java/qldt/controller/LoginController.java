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
import qldt.dao.UserDao;
import qldt.entity.User;
import qldt.view.ComplexSubjectView;
import qldt.view.LoginView;

public class LoginController {
    private UserDao userDao;
    private LoginView loginView;
    private ComplexSubjectView complexSubjectView;

    public LoginController(LoginView view) {
        this.loginView = view;
        this.userDao = new UserDao();
        view.addLoginListener(new LoginListener());
    }

    public void showLoginView() {
        loginView.setVisible(true);
    }

    class LoginListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            User user = loginView.getUser();
            if (userDao.checkUser(user)) {
                complexSubjectView = new ComplexSubjectView();
                ComplexSubjectController complexSubjectController = new ComplexSubjectController(complexSubjectView);
                complexSubjectController.showComplexSubjectView();
                loginView.setVisible(false);
            } else {
                loginView.showMessage("username hoặc password không đúng.");
            }
        }
    }
}
