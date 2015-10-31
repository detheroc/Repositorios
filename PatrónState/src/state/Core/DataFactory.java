package state.Core;

public class DataFactory {
	public static DataInterface createData(String s){
		if(s.equals("Real")){
			return new DataReal();
		} if(s.equals("Fake")){
			return new DataFake();
		}
		throw new IllegalArgumentException("No existe tipo de dato");		
	}

}
