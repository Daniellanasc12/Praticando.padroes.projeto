package padroes.de.projeto;

import padroes.de.projeto.facade.Facade;
import padroes.de.projeto.singleton.SingletonFirst;
import padroes.de.projeto.strategy.Comportamento;
import padroes.de.projeto.strategy.ComportamentoAgressivo;
import padroes.de.projeto.strategy.ComportamentoDefensivo;
import padroes.de.projeto.strategy.ComportamentoNormal;
import padroes.de.projeto.strategy.Robo;

public class Teste {
	public static void main(String[] args) {
		// Singleton First try
		
		SingletonFirst first = SingletonFirst.getInstancia();
		System.out.println(first);
		
		//Strategy
		
		Comportamento defensivo = new ComportamentoDefensivo();
		Comportamento normal = new ComportamentoNormal();
		Comportamento agressivo = new ComportamentoAgressivo();

		Robo robo = new Robo();
		robo.setComportamento(normal);
		robo.mover();
		robo.mover();
		robo.setComportamento(defensivo);
		robo.mover();
		robo.setComportamento(agressivo);
		robo.mover();
		robo.mover();
		robo.mover();
		
		// Facade
		Facade facade = new Facade();
		facade.migrarCliente("Daniella", "00000000");
	}
}

