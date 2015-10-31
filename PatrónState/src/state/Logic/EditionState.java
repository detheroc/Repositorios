package state.Logic;

import java.util.ArrayList;
import java.util.List;




public class EditionState implements IState{

	@Override
	public List<String> exeAction() {
		List<String> botones = new ArrayList<String>();		
		botones.add("Guardar");
		botones.add("Cancelar");
		return botones;
	}

}
