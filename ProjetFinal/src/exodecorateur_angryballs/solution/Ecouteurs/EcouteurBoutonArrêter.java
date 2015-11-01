package exodecorateur_angryballs.solution.Ecouteurs;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Observable;

import exodecorateur_angryballs.solution.AnimationBilles;

/**
 * ICI : IL N'Y A RIEN A CHANGER
 * 
 * */

public class EcouteurBoutonArrêter extends EcouteurCadreJFrame implements
		ActionListener {

	public EcouteurBoutonArrêter(AnimationBilles animationBilles) {
		super(animationBilles);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		this.animationBilles.arrêterAnimation();
	}

	@Override
	public void update(Observable arg0, Object arg1) {
		try {
			if (arg1 instanceof EcouteurBoutonArrêter) {
				EcouteurBoutonArrêter P = (EcouteurBoutonArrêter) arg1;
				this.getCadre().arrêterBilles.addActionListener(P);
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}

}
