package exodecorateur_angryballs.solution.vues;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.image.BufferStrategy;
import java.util.Vector;

import outilsvues.Outils;

import mesmaths.geometrie.base.Vecteur;

import angryballs.models.Bille;

public class BillardEnActif extends Billard {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public BillardEnActif(Vector<Bille> billes) {
		super(billes);
		this.setIgnoreRepaint(true);
		createBufferStrategy(1);

	}

	@Override
	public void paint() {
		int i;
		BufferStrategy strategie = this.getBufferStrategy();
		Graphics g = strategie.getDrawGraphics();
		for (i = 0; i < this.billes.size(); ++i) {
			if (i == 0) {
				try {
					Thread.sleep(1);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
			if (billes.get(i).getAncienne() != null)
				this.dessine(g, billes.get(i), billes.get(i).getAncienne(),
						Color.WHITE, Color.WHITE);
			this.dessine(g, billes.get(i), billes.get(i).getPosition(),
					Outils.getColor(billes.get(i).getCouleur()), Color.CYAN);
			this.billes.get(i).setAncienne(
					new Vecteur(this.billes.get(i).getPosition().x, this.billes
							.get(i).getPosition().y));
		}
		strategie.show();
		g.dispose();

	}

}
