package angryballs.models;

import java.util.Vector;

import mesmaths.geometrie.base.Vecteur;

public class DecorateurBille extends Bille {

	protected Bille bille_deco;

	public DecorateurBille(Bille b) {

		this.bille_deco = b;
	}

	@Override
	public Vecteur getPosition() {
		// TODO Auto-generated method stub
		return this.bille_deco.getPosition();
	}

	@Override
	public double getRayon() {
		// TODO Auto-generated method stub
		return this.bille_deco.getRayon();
	}

	@Override
	public Vecteur getVitesse() {
		// TODO Auto-generated method stub
		return this.bille_deco.getVitesse();
	}

	@Override
	public Vecteur getAccélération() {
		// TODO Auto-generated method stub
		return this.bille_deco.getAccélération();
	}

	@Override
	public int getClef() {
		// TODO Auto-generated method stub
		return this.bille_deco.getClef();
	}

	@Override
	public void setCouleur(String couleur) {
		this.bille_deco.setCouleur(couleur);

	}

	@Override
	public String getCouleur() {
		// TODO Auto-generated method stub
		return this.bille_deco.getCouleur();
	}

	@Override
	public Vecteur getAncienne() {
		// TODO Auto-generated method stub
		return this.bille_deco.getAncienne();
	}

	@Override
	public void setAncienne(Vecteur v) {
		this.bille_deco.setAncienne(v);

	}

	@Override
	public void gestionAccélération(Vector<Bille> billes) {
		this.bille_deco.gestionAccélération(billes);
	}

	@Override
	public void collisionContour(double abscisseCoinHautGauche,
			double ordonnéeCoinHautGauche, double largeur, double hauteur) {
		this.bille_deco.collisionContour(abscisseCoinHautGauche,
				ordonnéeCoinHautGauche, largeur, hauteur);
	}

}
