class Box 
{
    double wd;
    double ht;
    double dt;
    Box(double w, double h, double d)
    {
        wd = w;
        ht = h;
        dt = d;
    }
    double vol()
    {
        return wd*ht*dt;
    }
}
public class Volume_of_a_Box
{
	public static void main(String[] args) {
	    Box mybox = new Box(10,20,30);
	    double vol;
	    vol = mybox.vol();
		System.out.println("Volume of the box is "+vol);
	}
}
