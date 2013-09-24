package edu.tallerweb.pptls;

/**
 * Representa una de las Manos involucradas en el juego
 */
public class Mano {

	/**
	 * Toda Mano debe crearse con una forma dada, que será
	 * la que determine su condición en el juego.
	 * @param forma, la Forma que adopta la Mano.
	 */
	/* Se crea un atributo 'fActual' de tipo Forma */
	Forma fActual;
	/* Se crea una matriz de resultados posibles */
	Resultado [][] resMatriz;
	public Mano(final Forma forma) {
		fActual = forma;
		/* Se iniciliza una matriz temporal con los resultados posibles */
		/* La fila representa la forma elegida del jugador 1 y la columna representa
		 * la forma elegida del jugador 2
		 * */
		Resultado[][] temp = {{Resultado.EMPATA, Resultado.GANA,Resultado.PIERDE,Resultado.GANA,Resultado.PIERDE},
							
							  {Resultado.PIERDE, Resultado.EMPATA,Resultado.GANA,Resultado.PIERDE,Resultado.GANA},
							  
							  {Resultado.GANA, Resultado.PIERDE,Resultado.EMPATA,Resultado.GANA,Resultado.PIERDE},
							  
							  {Resultado.PIERDE, Resultado.GANA,Resultado.PIERDE,Resultado.EMPATA,Resultado.GANA},
							  
							  {Resultado.GANA, Resultado.PIERDE,Resultado.GANA,Resultado.PIERDE,Resultado.EMPATA}};
		/* Se asigna la matriz temporal al atributo de resMatriz */
		resMatriz = temp;
		/* throw new RuntimeException("No implementado aún"); */	
		}

	/**
	 * Evaluará el resultado de la partida según las reglas
	 * del juego.
	 * @param otra, la otra Mano.
	 * @return un Resultado, de acuerdo al estado del juego.
	 */
	public Resultado jugarCon(final Mano otra) {
		/* Se realiza una doble indexacion de la matriz segun las formas de las manos */ 
		return resMatriz[this.fActual.getValor()][otra.fActual.getValor()];
		/* throw new RuntimeException("No implementado aún"); */
	}

}
