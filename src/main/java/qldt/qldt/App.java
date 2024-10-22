/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package qldt.qldt;

import qldt.controller.LoginController;
import qldt.view.LoginView;

/**
 *
 * @author Manh
 */
public class App {
    public static void main(String[] args) {
        LoginView loginView = new LoginView();
        LoginController loginController = new LoginController(loginView);
        loginController.showLoginView();
    }
}
