package exodecorateur_angryballs.solution.Ecouteurs;

import java.util.Observable;

import exodecorateur_angryballs.solution.AnimationBilles;
import exodecorateur_angryballs.solution.vues.CadreAngryBalls;

public abstract class EcouteurCadreJFrame extends Ecouteur {

	public EcouteurCadreJFrame(AnimationBilles animationBilles) {
		super(animationBilles);
	}

	public CadreAngryBalls getCadre() {
		return (CadreAngryBalls) this.animationBilles.getVueBillard();

	}

	@Override
	public abstract void update(Observable arg0, Object arg1);

}
