package state.UI;

import java.awt.Menu;
import java.util.List;
import java.util.Scanner;

import state.Logic.EditionState;
import state.Logic.IState;
import state.Logic.InitialState;
import state.Logic.ObjectState;
import state.Logic.VisualitationState;

public class Principal {

	public static void main(String[] args) {
		ObjectState os = new ObjectState();
		Scanner sc = new Scanner(System.in);
		IState is = new InitialState();
		IState es = new EditionState();
		IState vs = new VisualitationState();
		int opc;
		do{
			menuOpc();
			opc = sc.nextInt();
			switch (opc) {
				case 1:
					os.setState(is);
					break;
				case 2:
					os.setState(es);
					break;
				case 3:
					os.setState(vs);
					break;
				default:
					break;
				}
			ejecutarAccion(os);
		}while(opc<4);

	}
	public static void ejecutarAccion(ObjectState os){
		List<String> list = os.exeAction();
		System.out.println("Se ha bloqueado los siguientes botones");
		for(int i=0;i<list.size();i++){
		    System.out.println(list.get(i));
		}
		
	}
	
	public static void menuOpc(){
		System.out.println("Menu");
		System.out.println("1. Estado Inicial");
		System.out.println("2. Estado Edición");
		System.out.println("3. Estado Visualización");
	}

}
