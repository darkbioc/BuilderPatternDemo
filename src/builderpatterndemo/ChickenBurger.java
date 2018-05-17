/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package builderpatterndemo;

/**
 *
 * @author alu20919409n
 */
public class ChickenBurger extends Hamburguer {

    @Override
    public float price() {
        return 50.5f;
    }

    @Override
    public String name() {
        return "Chicken burger";
    }

}
