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
	public void gestionAccélération(Vector<Bille> billes) {
		super.gestionAccélération(billes);
		this.getAccélération().ajoute(
				MecaniquePoint.freinageFrottement(this.masse(),
						this.getVitesse())); // contribution de l'accélération
												// due au frottement dans l'air

	}
}
