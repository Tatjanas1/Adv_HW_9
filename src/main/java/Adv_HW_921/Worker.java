package Adv_HW_921;

public class Worker extends Employee{
    public Worker (double baseSalary, String name){
        super(baseSalary, name);
    }
    public final double getSalary(){
        return getBaseSalary();}
}
