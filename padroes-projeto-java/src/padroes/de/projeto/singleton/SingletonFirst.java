package padroes.de.projeto.singleton;

public class SingletonFirst {
	
	private static SingletonFirst instancia;
		
		private SingletonFirst()  {
			super();
			
		}
		 
		public static SingletonFirst getInstancia() {
			if (instancia == null) {
				instancia = new SingletonFirst();
			}
			return instancia;
		}
}
