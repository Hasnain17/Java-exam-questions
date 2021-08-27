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
public class Obj_p 
{
double width;
double height;
double depth;
Obj_p (Obj_p ob)
{
    depth=ob.depth;
    height=ob.height;
    width=ob.width;
}
Obj_p (double d,double h,double w )
{
width=w;
height=h;
depth=d;
}
Obj_p ()
{
width=-1;
height=-1;
depth=-1;
}
Obj_p (double len)
{
    width=height=depth=len;
}
double volume()
{
    return (width*height*depth);
}
}
