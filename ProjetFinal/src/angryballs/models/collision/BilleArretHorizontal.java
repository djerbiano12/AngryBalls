package angryballs.models.collision;

import mesmaths.cinematique.Collisions;
import angryballs.models.Bille;
import angryballs.models.DecorateurBille;

public class BilleArretHorizontal extends DecorateurBille {

	public BilleArretHorizontal(Bille b) {
		super(b);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void collisionContour(double abscisseCoinHautGauche,
			double ordonn�eCoinHautGauche, double largeur, double hauteur) {

		super.collisionContour(abscisseCoinHautGauche, ordonn�eCoinHautGauche,
				largeur, hauteur);
		Collisions.collisionBilleContourAvecArretHorizontal(this.getPosition(),
				this.getRayon(), this.getVitesse(), abscisseCoinHautGauche,
				largeur);

	}

}
