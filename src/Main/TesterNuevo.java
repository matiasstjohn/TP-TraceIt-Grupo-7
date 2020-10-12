package Main;

import Events.DiseaseController;
import Logins.AdminLogin;
import Logins.UserLogin;
import Users.Administrator;
import Users.Citizen;
import Users.UserController;
import Util.Scanner;

public class TesterNuevo {
    public static void main(String[] args) {

        UserController userController = new UserController();
        DiseaseController diseaseController = new DiseaseController();

        Administrator admin = new Administrator("admin", "admin");
        userController.addAdministrator(admin);

        UserLogin userLogin = new UserLogin();
        AdminLogin adminLogin = new AdminLogin();

        //usuarios creados para testear

        Citizen blockedCitizen = new Citizen("aaa","aaa");
        userController.addCitizen(blockedCitizen);
        //blockedCitizen.blockUser();

        Citizen blockedCitizen2 = new Citizen("bbb","bbb");
        userController.addCitizen(blockedCitizen2);
        //blockedCitizen2.blockUser();

        Citizen blockedCitizen3 = new Citizen("ccc","ccc");
        userController.addCitizen(blockedCitizen3);
        //blockedCitizen2.blockUser();

        while(true){
            int action = Scanner.getInt("Seleccione 1 para ingresar como ciudadano, 2 para ingresar como administrador o 3 para salir: ");
            if(action == 1){
                userLogin.citizenInterfaze(userController);
            }else if(action == 2){
                adminLogin.adminInterfaze(userController, diseaseController);
            }else if(action == 3){
                return;
            }
        }

    }
}