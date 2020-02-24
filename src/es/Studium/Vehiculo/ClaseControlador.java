package es.Studium.Vehiculo;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class ClaseControlador implements ActionListener, WindowListener {
	ClaseVista objVista = null; 
	ClaseModelo objModelo = null;
	public ClaseControlador(ClaseVista objVista, ClaseModelo objModelo)  {
		this.objVista = objVista;
		this.objModelo = objModelo;
		objVista.addWindowListener(this);
		objVista.btnBoton1.addActionListener(this);
	}
 
	public void actionPerformed(ActionEvent evento) { 
		int presupuesto=0;
		if(objVista.chkMotor1.getState()==true) {
			presupuesto=objModelo.presupuesto(7000);
		}
		if (objVista.chkMotor2.getState()== true) {
			presupuesto=objModelo.presupuesto(8000);
		}
		if (objVista.chkMotor3.getState()== true) {
			presupuesto=objModelo.presupuesto(9000);
		}
		if (objVista.chkMotor4.getState()== true) {
			presupuesto=objModelo.presupuesto(8500);
		}
		if (objVista.chkPuerta3.getState()== true) {
			presupuesto=objModelo.presupuesto(2000);
		}
		if (objVista.chkPuerta4.getState()== true) {
			presupuesto=objModelo.presupuesto(3000);
		}
		if (objVista.chkPuerta5.getState()== true) {
			presupuesto=objModelo.presupuesto(2500);
		}
		if (objVista.chkPinturaS.getState()== true) {
			presupuesto=objModelo.presupuesto(1500);
		}
		if (objVista.chkPinturaN.getState()== true) {
			presupuesto=objModelo.presupuesto(1500);
		}
		System.out.println(presupuesto);
	}
	public void windowActivated(WindowEvent we){} 
	public void windowClosed(WindowEvent we){} 
	public void windowClosing(WindowEvent we) {
		System.exit(0); 
	} 
	public void windowDeactivated(WindowEvent we){} 
	public void windowDeiconified(WindowEvent we){} 
	public void windowIconified(WindowEvent we){} 
	public void windowOpened(WindowEvent we){} 
}