package angryballs.models.acceleration;

import java.util.Vector;

import angryballs.models.Bille;
import angryballs.models.DecorateurBille;
import exodecorateur_angryballs.solution.modele.OutilsBille;

public class Newton extends DecorateurBille {

	public Newton(Bille b) {
		super(b);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void gestionAccélération(Vector<Bille> billes) {
		super.gestionAccélération(billes);
		this.getAccélération().ajoute(
				OutilsBille.gestionAccélérationNewton(this, billes));// contribution
																		// de
																		// l'accélération
																		// due à
																		// l'attraction
																		// des
																		// autres
																		// billes

	}

}
