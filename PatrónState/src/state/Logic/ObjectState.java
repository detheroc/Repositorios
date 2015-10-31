package state.Logic;

import java.util.List;

public class ObjectState {
	IState botonState;
	
	public void setState(IState bS){
		botonState = bS;
	}
	
	public List<String> exeAction() {
		return botonState.exeAction();	
	}

}
