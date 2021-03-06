package designpatterns;

//Singleton 
public class Restaurant {
	
	private static Restaurant _instance = null;
	
	protected Restaurant() {} 
	
	public Restaurant getInstance(){
		
		if(_instance == null){
			_instance = new Restaurant();
		}
		
		return _instance;
	}

}
