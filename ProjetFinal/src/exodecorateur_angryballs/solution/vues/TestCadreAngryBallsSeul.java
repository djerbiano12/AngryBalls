package exodecorateur_angryballs.solution.vues;

import java.util.Vector;

import angryballs.models.Bille;

public class TestCadreAngryBallsSeul {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Vector<Bille> billes = new Vector<Bille>();
		CadreAngryBalls cadre = new CadreAngryBalls("angry balls",
				"animation de billes marrantes", billes, new BillardEnActif(
						billes));
		cadre.montrer();
	}

}
