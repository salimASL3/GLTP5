
public class vecteur {
	
	private int x=0;
	private int y=0;
	
	public vecteur(int i, int j) {
		// modif dev/1
		this.x = i;
		this.y = j;
	}
	
	public double norme() {
		double norme = 0.0;
		// modif dev/2
	    norme = Math.sqrt(this.x * this.x + this.y * this.y);
		return norme;
	}
	
	public vecteur plus(vecteur vin) {
		int xout = 0;
		int yout = 0;
		// modif dev/3
		//xout = this.x + vin.x;
		//yout = this.y + vin.y;
		vecteur vout = new vecteur(xout, yout);
		return vout;
	}

	public int getx() { return this.x; };
	public int gety() { return this.y; };
	public String toString() { return "("+this.x+" , "+this.y+")"; }
	
}
