package com.app.prctice;


@FunctionalInterface
interface I
{
    @Override
    public boolean equals(Object obj);
 
    @Override
    public abstract int hashCode();
 
    @Override
    public String toString();
    

   /* void m1();*/
    
    public void m(int i);
   // public void m1(int i);



}

/*class AA implements I
{
	
}*/

interface Drawable {
	public void draw();
}

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		I i = (ii) -> System.out.println("Mahesh "+ii);
	    i.m(10);
	
		I i1 = (ii) -> System.out.println("Mahesh "+ii+1);

	    i1.m(10);
	    
		Drawable d1 = () -> System.out.println("Drawing with lambda");
		d1.draw();	
	
	}

}
