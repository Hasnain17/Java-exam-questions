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
import javax.swing.JOptionPane;
public class E12 
{
 public static void main (String args[])
 {
 String a=JOptionPane.showInputDialog("Enter no");
 String b=JOptionPane.showInputDialog("Enter no 2");
 int c=Integer.parseInt(a);
 int d=Integer.parseInt(b);
 JOptionPane.showMessageDialog(null, "Sum is "+(c+d));
 }
}
