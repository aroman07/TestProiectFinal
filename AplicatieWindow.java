import javax.swing.*; //folosim pachetul Swing pentru interfete grafice
import java.awt.*; //pentru alte clase pe care le folosim in interfata grafica (de exemplu, Color)

import java.awt.event.*; //pentru implementarea evenimentelor

class AplicatieWindow{

	public static void main(String args[])
	{
		JFrame frame = new JFrame("Aplicatie"); //instantierea unui obiect din clasa
					//JFrame -> fereastra aplicatiei

		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //setam ca atunci cand
			//se inchide fereastra sa se inchida si aplicatia

		JPanel panel = new JPanel();
		frame.add(panel); //adaugam panelul in fereastra

		panel.setBackground(Color.RED); //modificam culoarea de fundal a panelului

		JButton buton = new JButton("Apasa-ma!");
		panel.add(buton);

		JLabel label = new JLabel("Un text ...");
		panel.add(label);

		buton.addActionListener(new ActionListener() {

            		public void actionPerformed(ActionEvent e) {

				//instructiuni care se vor executa cand se da click pe buton
                		buton.setBackground(Color.BLUE);

				label.setText("A fost apasat butonul!");

                	}
		});

		

		frame.pack(); //aranjeaza controalele in fereastra
		frame.setVisible(true); //afisarea ferestrei
		
	}

}