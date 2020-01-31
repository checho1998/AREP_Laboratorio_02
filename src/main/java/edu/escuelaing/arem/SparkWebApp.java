package edu.escuelaing.arem;

import edu.escuelaing.arem.LinkedList.Calculos;
import edu.escuelaing.arem.LinkedList.LinkedList;
import edu.escuelaing.arem.LinkedList.Nodo;
import spark.Request;
import spark.Response;

import static spark.Spark.*;

public class SparkWebApp {

	/**
	 * This main method uses SparkWeb static methods and lambda functions to
	 * create a simple Hello World web app. It maps the lambda function to the
	 * /hello relative URL.
	 */
	public static void main(String[] args) {
		port(getPort());
		get("/inputdata", (req, res) -> inputDataPage(req, res));
		get("/results", (req, res) -> resultsPage(req, res));
	}

	/**
	 * Este metodo crea el principal html que se observa en la pagina web.
	 * @param req
	 * @param res
	 * @return  Retorna un html
	 */
	private static String inputDataPage(Request req, Response res) {
		String pageContent
				= "<!DOCTYPE html>"
				+ "<html>"
				+ "<body>"
				+ "<h2>Mostrar Media y Desviacion estandar </h2>"
				+ "<form action=\"/results\">"
				+ "  Ingrese los datos de la lista, separados por espacios : <br>"
				+ "  <input type=\"text\" name='lista'>"
				+ "  <br>"
				+ "  <br><br>"
				+ "<input type=\"submit\" value=\"Submit\">"
				+ "</form>"
				+ "</body>"
				+ "</html>";
		return pageContent;
	}

	/**
	 * Metodo que crea el html de la respuesta
	 * @param req
	 * @param res
	 * @return  Retorna el html con la respuesta de la media y la desviacion estandar
	 */
	private static String resultsPage(Request req, Response res) {
		Calculos cal = new Calculos();
		LinkedList list = new LinkedList();
		String lista = req.queryParams("lista");
		String[] lista2 = lista.split(" ");
		for(int i=0;i<lista2.length;i++){
			Nodo nod = new Nodo(Double.parseDouble(lista2[i]));
			list.add(nod);
		}
		Double laMitad = cal.media(list);
		Double desviacionEstan = cal.desviacionEstandar(list);

		String resultado
				= "<!DOCTYPE html>"
				+ "<html>"
				+ "<body>"
				+ "<h2>  Resultado Media </h2>"
				+ laMitad
				+ "<h2>  Desviacion estandar </h2>"
				+ desviacionEstan
				+ "</form>"
				+ "</body>"
				+ "</html>";
		return resultado;
	}

	/**
	 * This method reads the default port as specified by the PORT variable in
	 * the environment.
	 *
	 * Heroku provides the port automatically so you need this to run the
	 * project on Heroku.
	 */
	static int getPort() {
		if (System.getenv("PORT") != null) {
			return Integer.parseInt(System.getenv("PORT"));
		}
		return 4567; //returns default port if heroku-port isn't set (i.e. on localhost)
	}


}
