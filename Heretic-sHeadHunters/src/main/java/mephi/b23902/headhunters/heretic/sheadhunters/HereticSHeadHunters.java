/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package mephi.b23902.headhunters.heretic.sheadhunters;

/**
 *
 * @author Настя
 */
public class HereticSHeadHunters {

    public static void main(String[] args) {
        Controller controller = new Controller();
        controller.createHeretic();
        controller.createHeretic();
        controller.createHeretic();
        controller.createHeretic();
        new View(controller).setVisible(true);
    }
}
