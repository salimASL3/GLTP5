// appli demo pour TP sur Git
public class appli {

	public static void main(String[] args) {
		vecteur v1 = new vecteur(3,5);
		vecteur v2 = new vecteur(-3,-5);
		
		// dev/1
		System.out.println("v1 = " + v1);
		System.out.println("v2 = " + v2);

		// dev/2
		System.out.println("||v1|| = " + v1.norme());
		System.out.println("||v2|| = " + v2.norme());
		
		// dev/3
		vecteur v3 = v1.plus(v2);
		System.out.println("v3 = " + v3);

		// master/1
		int res = 0;
		res =  v1.getx() * v2.getx();
		res += v1.gety() * v2.gety();
		System.out.println("v1.v2 = " + res);
	}

}
