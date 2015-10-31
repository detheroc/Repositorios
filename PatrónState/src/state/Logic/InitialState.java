package state.Logic;


import java.util.ArrayList;
import java.util.List;



public class InitialState implements IState{

	@Override
	public List<String> exeAction() {
		List<String> botones = new ArrayList<String>();
		botones.add("Buscar");
		botones.add("Nuevo");		
		return botones;
	}

}
