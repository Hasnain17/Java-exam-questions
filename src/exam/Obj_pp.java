/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exam;

/**
 *
 * @author Hasnain Gakhar
 */
public class Obj_pp 
{
public static void main(String args[])
{
Obj_p a1=new Obj_p(5,5,5);
Obj_p a2=new Obj_p();
Obj_p a3=new Obj_p(7);

Obj_p a4=new Obj_p(a1);
System.out.println(a1.volume());
System.out.println(a2.volume());
System.out.println(a3.volume());
System.out.println(a4.volume());
}
}
