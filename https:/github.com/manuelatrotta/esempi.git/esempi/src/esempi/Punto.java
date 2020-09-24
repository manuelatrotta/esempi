package esempi;

public class Punto {
	
	private int m_x;
	private int m_y;
	
	
	//---------
	public int getM_x() {
		return m_x;
	}
	
	public void setM_x(int m_x) {
		this.m_x = m_x;
	}
	public int getM_y() {
		return m_y;
	}
	public void setM_y(int m_y) {
		this.m_y = m_y;
	}

	public Punto(int m_x, int m_y) {
		super();
		this.m_x = m_x;
		this.m_y = m_y;
	}
	
	static double calcolaDistanza(int x, int y, int xb, int yb) {
		double quadrato = Math.pow((xb - x), 2)+ Math.pow((yb - y), 2);
		double distanza = Math.sqrt(quadrato);
		return distanza;
	}

}
