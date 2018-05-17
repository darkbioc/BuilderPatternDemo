/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package builderpatterndemo;

/**
 *
 * @author alu20493243j
 */
public class NormalFrenchFries extends FrenchFries
{
    @Override
    public float price() {
        return 2.0f;
    }

    @Override
    public String name() {
        return "French Fries";
    }
}
