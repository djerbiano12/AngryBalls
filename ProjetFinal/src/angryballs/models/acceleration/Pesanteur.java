package angryballs.models.acceleration;

import java.util.Vector;

import mesmaths.geometrie.base.Vecteur;
import angryballs.models.Bille;
import angryballs.models.DecorateurBille;

public class Pesanteur extends DecorateurBille {
	Vecteur pesanteur;

	public Pesanteur(Bille b, Vecteur pesanteur) {
		super(b);
		this.pesanteur = pesanteur;
	}

	@Override
	public void gestionAccélération(Vector<Bille> billes) {
		super.gestionAccélération(billes);
		this.getAccélération().ajoute(this.pesanteur);

	}

	public Vecteur getPesanteur() {
		return pesanteur;
	}

	public void setPesanteur(Vecteur pesanteur) {
		this.pesanteur = pesanteur;
	}

}
