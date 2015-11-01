package angryballs.models.collision;

import mesmaths.cinematique.Collisions;
import angryballs.models.Bille;
import angryballs.models.DecorateurBille;

public class BilleArretVertical extends DecorateurBille {

	public BilleArretVertical(Bille b) {
		super(b);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void collisionContour(double abscisseCoinHautGauche,
			double ordonnéeCoinHautGauche, double largeur, double hauteur) {
		super.collisionContour(abscisseCoinHautGauche, ordonnéeCoinHautGauche,
				largeur, hauteur);

		Collisions.collisionBilleContourAvecArretVertical(this.getPosition(),
				this.getRayon(), this.getVitesse(), ordonnéeCoinHautGauche,
				hauteur);

	}
}
