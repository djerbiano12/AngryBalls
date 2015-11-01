package exodecorateur_angryballs.solution.Ecouteurs;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Observable;

import exodecorateur_angryballs.solution.AnimationBilles;

/**
 * ICI : IL N'Y A RIEN A CHANGER
 * 
 * */
public class EcouteurBoutonLancer extends EcouteurCadreJFrame implements
		ActionListener {

	/**
	 * @param animationsBilles
	 */
	public EcouteurBoutonLancer(AnimationBilles animationBilles) {
		super(animationBilles);
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		this.animationBilles.lancerAnimation();
	}

	@Override
	public void update(Observable arg0, Object arg1) {
		try {
			if (arg1 instanceof EcouteurBoutonLancer) {
				EcouteurBoutonLancer P = (EcouteurBoutonLancer) arg1;
				this.getCadre().lancerBilles.addActionListener(P);
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}

}
