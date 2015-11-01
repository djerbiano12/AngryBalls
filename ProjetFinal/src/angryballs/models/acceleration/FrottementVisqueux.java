package angryballs.models.acceleration;

import java.util.Vector;

import angryballs.models.Bille;
import angryballs.models.DecorateurBille;

import mesmaths.mecanique.MecaniquePoint;

public class FrottementVisqueux extends DecorateurBille {

	public FrottementVisqueux(Bille b) {
		super(b);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void gestionAcc�l�ration(Vector<Bille> billes) {
		super.gestionAcc�l�ration(billes);
		this.getAcc�l�ration().ajoute(
				MecaniquePoint.freinageFrottement(this.masse(),
						this.getVitesse())); // contribution de l'acc�l�ration
												// due au frottement dans l'air

	}
}
