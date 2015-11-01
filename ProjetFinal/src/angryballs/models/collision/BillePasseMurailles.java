package angryballs.models.collision;

import mesmaths.cinematique.Collisions;
import angryballs.models.Bille;
import angryballs.models.DecorateurBille;

public class BillePasseMurailles extends DecorateurBille {

	public BillePasseMurailles(Bille b) {
		super(b);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void collisionContour(double abscisseCoinHautGauche,
			double ordonnéeCoinHautGauche, double largeur, double hauteur) {
		super.collisionContour(abscisseCoinHautGauche, ordonnéeCoinHautGauche,
				largeur, hauteur);
		Collisions.collisionBilleContourPasseMuraille(this.getPosition(),
				abscisseCoinHautGauche, ordonnéeCoinHautGauche, largeur,
				hauteur);

	}

}
