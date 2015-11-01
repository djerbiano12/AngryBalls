package exodecorateur_angryballs.solution.vues;

import java.awt.Color;
import java.awt.Graphics;
import java.util.Vector;

import outilsvues.Outils;

import angryballs.models.Bille;

public class BillardEnPassif extends Billard {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public BillardEnPassif(Vector<Bille> billes) {
		super(billes);
	}

	@Override
	public void paint(Graphics g) {
		int i;

		for (i = 0; i < this.billes.size(); ++i)
			this.dessine(g, billes.get(i), billes.get(i).getPosition(),
					Outils.getColor(billes.get(i).getCouleur()), Color.CYAN);

	}

	@Override
	public void paint() {
		this.repaint();

	}

}
