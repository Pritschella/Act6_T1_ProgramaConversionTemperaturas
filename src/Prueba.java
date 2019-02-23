import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

class Calculos{
	
	public String centigradosAFahrenheit(int numero) {
		return (1.8 * numero) + 32 + "";
	}
	
	public String centigradosAKelvin(int numero) {
		return numero  + 273.15 + "";
	}
	
	public String fahrenheitACelsius(int numero) {
		return (numero -32) /1.8 + "";
	}
	
	public String fahrenheitAKelvin(int numero) {
		return(numero + 459.67)/1.8 + "";
	}
	
	public String fahrenheitARankine(int numero) {
		return numero + 459.67 + "";
	}
	
	public String kelvinAFahrenheit(int numero) {
		return ((9/5) * numero) - 459.67 + "";
	}
	
	public String rankineAFahrenheit(int numero) {
		return numero -459.67 + "";
	}
	
}//ClassCalculos

class VentanaInicio extends JFrame implements ActionListener, KeyListener{

	JTextField cajaTemperatura, cajaaResultado;
	JComboBox<String> comboT1, comboT2;
	
	public VentanaInicio() {
		getContentPane().setLayout(new FlowLayout());
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(500, 500);
		setTitle("Conversor de Temperaturas");
		setLocationRelativeTo(null);
		setVisible(true);
		
		JLabel lblConvertir = new JLabel("Convertir: ");
		add(lblConvertir);
		
		cajaTemperatura = new JTextField(10);
		cajaTemperatura.addActionListener(this);
		add(cajaTemperatura);
		
		comboT1 = new JComboBox<String>();
		comboT1.addActionListener(this);
		comboT1.addItem("Centigrados");
		comboT1.addItem("Fahrenheit");
		comboT1.addItem("Kelvin");
		comboT1.addItem("Rankine");
		add(comboT1);
		
		JLabel lblA = new JLabel("A");
		add(lblA);
		
		comboT2 = new JComboBox<String>();
		comboT2.addActionListener(this);
		add(comboT2);
		
		cajaaResultado =  new JTextField(10);
		cajaaResultado.addActionListener(this);
		add(cajaaResultado);
	}
	
	
	
	
	
	
	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}
	
	
	
}//ClassVentanaInicio

public class Prueba {

	public static void main(String[] args) {
		
		SwingUtilities.invokeLater(new Runnable() {
			
			@Override
			public void run() {
			new VentanaInicio();
				
			}
		});
		
	}

}
