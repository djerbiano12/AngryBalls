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
	public void gestionAcc�l�ration(Vector<Bille> billes) {
		super.gestionAcc�l�ration(billes);
		this.getAcc�l�ration().ajoute(
				OutilsBille.gestionAcc�l�rationNewton(this, billes));// contribution
																		// de
																		// l'acc�l�ration
																		// due �
																		// l'attraction
																		// des
																		// autres
																		// billes

	}

}
