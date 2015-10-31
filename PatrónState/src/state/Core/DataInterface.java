package state.Core;

import java.util.ArrayList;
import java.util.List;

public interface DataInterface {
	List<String[]> ld = new ArrayList<String[]>(); 
	
		
	public String[] buscaDni(String a);
	
	public boolean guardarData(String dni, String nombre, String edad, String telefono, int f);
	public boolean eliminarData(String dni);
}
