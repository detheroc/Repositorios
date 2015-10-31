package state.Logic;

import java.util.ArrayList;
import java.util.List;

public class VisualitationState implements IState {

	@Override
	public List<String> exeAction() {
		List<String> botones = new ArrayList<String>();
		botones.add("Buscar");
		botones.add("Nuevo");
		botones.add("Editar");
		botones.add("Eliminar");		
		return botones;
	}

}
