package core;

public class Player {
	//This is the SINGLETON pattern

	private Inventory inventory;
	
	private static Player onePlayer;
	
	private Player(){
		super();
	}
	
	public static Player getInstance(){
		if(onePlayer==null){
			onePlayer = new Player();
		}
		return onePlayer;
	}

}
