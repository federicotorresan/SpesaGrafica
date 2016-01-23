package prodotto;

import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Text;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.DateTime;

public class Grafica {

	protected Shell shlSwtApplication;
	private Text codice;
	private Text prezzo;
	private Text descrizione;

	/**
	 * Launch the application.
	 * @param args
	 */
	public static void main(String[] args) {
		try {
			Grafica window = new Grafica();
			window.open();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Open the window.
	 */
	public void open() {
		Display display = Display.getDefault();
		createContents();
		shlSwtApplication.open();
		shlSwtApplication.layout();
		while (!shlSwtApplication.isDisposed()) {
			if (!display.readAndDispatch()) {
				display.sleep();
			} 
		}
	}

	/**
	 * Create contents of the window.
	 */
	protected void createContents() {
		shlSwtApplication = new Shell();
		shlSwtApplication.setSize(650, 550);
		shlSwtApplication.setText("SWT Application");
		
		Label lblCodice = new Label(shlSwtApplication, SWT.NONE);
		lblCodice.setBounds(10, 30, 55, 15);
		lblCodice.setText("Codice");
		
		codice = new Text(shlSwtApplication, SWT.BORDER);
		codice.setBounds(100, 24, 76, 21);
		
		Label lblNewLabel = new Label(shlSwtApplication, SWT.NONE);
		lblNewLabel.setBounds(10, 59, 55, 15);
		lblNewLabel.setText("Prezzo");
		
		prezzo = new Text(shlSwtApplication, SWT.BORDER);
		prezzo.setBounds(100, 53, 76, 21);
		
		Label lblDescrizione = new Label(shlSwtApplication, SWT.NONE);
		lblDescrizione.setBounds(10, 103, 69, 15);
		lblDescrizione.setText("Descrizione");
		
		descrizione = new Text(shlSwtApplication, SWT.BORDER);
		descrizione.setBounds(100, 103, 177, 58);
		
		Label lblAlimentare = new Label(shlSwtApplication, SWT.NONE);
		lblAlimentare.setBounds(10, 207, 69, 15);
		lblAlimentare.setText("Alimentare");
		
		Button btnS = new Button(shlSwtApplication, SWT.CHECK);
		btnS.setBounds(100, 207, 93, 16);
		btnS.setText("S\u00EC");
		
		Button btnNo = new Button(shlSwtApplication, SWT.CHECK);
		btnNo.setBounds(145, 207, 93, 16);
		btnNo.setText("No");

	}
}
