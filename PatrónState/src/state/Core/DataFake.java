package state.Core;

import java.util.ArrayList;
import java.util.List;

public class DataFake implements DataInterface{
	List<String[]> ld = new ArrayList<String[]>(); 
		
	public DataFake(){
		String[] a = {"73146713","Diego Colque Ramos","22","974535474"};
		ld.add(a);
	}
	public DataFake(String dni, String nombre, String edad, String telefono){
		String[] a = {dni,nombre,edad,telefono};
		ld.add(a);
	}
	
	
	public String[] buscaDni(String dni){		
		for(int i=0;i<ld.size();i++){
		    if( ld.get(i)[0].toString().equals(dni.toString()) ){		    	
		    	return ld.get(i);
		    }
		}
		return null;
	}
	public boolean guardarData(String dni, String nombre, String edad, String telefono, int f){//f==1->editar
		String[] a = {dni,nombre,edad,telefono};
		for(int i=0;i<ld.size();i++){
			if( ld.get(i)[0].toString().equals(dni.toString()) ){
				if(f==1){
					eliminarData(dni);
					ld.add(a);
					return true;
				}else{
					return false;
				}
		    }
		}
		ld.add(a);
		return true;		
	}
	public boolean eliminarData(String dni){
		for(int i=0;i<ld.size();i++){
			if( ld.get(i)[0].toString().equals(dni.toString()) ){
		    	ld.remove(i);
		    	return true;
		    }
		}
		return false;
	}
	/*public boolean editarData(String dni, String nombre, String edad, String telefono){
		for(int i=0;i<ld.size();i++){
			if( ld.get(i)[0].toString().equals(dni.toString()) ){
		    	eliminarData(dni);
				guardarData(dni, nombre, edad, telefono);
		    	return true;
		    }
		}		
		return false;
		
	}*/
}

