package Casas;

public class Casa {
	private float superficie;
	private String calle;
	private int codigoPostal;
	
	/**
	 * Un equipo de limpiadores deja la casa limpia
	 * y roba hasta el cobre de las paredes
	 **/
	public void limpiarLaCasa(){
		String mensajito ="Te hemos limpiado la casa, esta arruinado";
		System.out.println(mensajito);
	}
}
