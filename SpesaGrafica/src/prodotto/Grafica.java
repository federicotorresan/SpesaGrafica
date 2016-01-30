package prodotto;

import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Text;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.DateTime;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.graphics.GC;
import org.eclipse.swt.widgets.List;
import org.eclipse.swt.custom.StyledText;
import org.eclipse.swt.widgets.Combo;
import org.eclipse.jface.viewers.ListViewer;
import org.eclipse.swt.widgets.Table;
import org.eclipse.swt.widgets.TableColumn;
import org.eclipse.swt.widgets.Canvas;
import org.eclipse.wb.swt.SWTResourceManager;

public class Grafica {

	protected Shell shlSwtApplication;
	public boolean tessera=false;
	public listaSpesa ls = new listaSpesa(tessera);
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
		
		Button btnSalva = new Button(shlSwtApplication, SWT.NONE);
		btnSalva.setBounds(387, 477, 75, 25);
		btnSalva.setText("Salva");
		
		Button btnCarica = new Button(shlSwtApplication, SWT.NONE);
		btnCarica.setBounds(468, 477, 75, 25);
		btnCarica.setText("Carica");
		
		Button btnTotale = new Button(shlSwtApplication, SWT.NONE);
		btnTotale.setBounds(549, 477, 75, 25);
		btnTotale.setText("Totale");
		
		Label lblTessera = new Label(shlSwtApplication, SWT.NONE);
		lblTessera.setBounds(10, 186, 55, 15);
		lblTessera.setText("Tessera");
		
		Button btnSi = new Button(shlSwtApplication, SWT.CHECK);
		btnSi.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				
			}
		});
		btnSi.setBounds(136, 184, 30, 16);
		btnSi.setText("Si");
		
		Button btnNo = new Button(shlSwtApplication, SWT.CHECK);
		btnNo.setBounds(179, 185, 42, 16);
		btnNo.setText("No");
		
		List list = new List(shlSwtApplication, SWT.BORDER);
		list.setBounds(364, 30, 214, 365);
		list.add("Codice" + "  | " + " Descrizione"  +  " | " + "Prezzo");
		
		Button btnAggiungi = new Button(shlSwtApplication, SWT.NONE);
		btnAggiungi.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
			 Prodotti p = new Prodotti(codice.getText(),descrizione.getText(),Integer.parseInt(prezzo.getText()));
			 try {
				ls.aggiungiProdotto(p);
			} catch (Exception e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			 list.add(codice.getText() + "  |  " + descrizione.getText() + "  |  " + prezzo.getText());
			}
		});
		btnAggiungi.setBounds(306, 477, 75, 25);
		btnAggiungi.setText("Aggiungi");
		
		
		Label lblListaSpesa = new Label(shlSwtApplication, SWT.NONE);
		lblListaSpesa.setBounds(284, 372, 69, 15);
		lblListaSpesa.setText("Lista Spesa");
		
		Button btnAlimentare = new Button(shlSwtApplication, SWT.RADIO);
		btnAlimentare.setSelection(true);
		btnAlimentare.setText("Alimentare");
		btnAlimentare.setBounds(10, 225, 90, 16);
		
		Button btnNonAlimentare = new Button(shlSwtApplication, SWT.RADIO);
		btnNonAlimentare.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				
			}
		});
		btnNonAlimentare.setBounds(10, 280, 111, 16);
		btnNonAlimentare.setText("Non alimentare");
		
		Label lblMateriale = new Label(shlSwtApplication, SWT.NONE);
		lblMateriale.setBounds(38, 302, 55, 15);
		lblMateriale.setText("Materiale");
		
		Text materiale = new Text(shlSwtApplication, SWT.BORDER);
		materiale.setBounds(136, 299, 111, 21);
		
		Label lblDataScadenza = new Label(shlSwtApplication, SWT.NONE);
		lblDataScadenza.setBounds(38, 247, 83, 15);
		lblDataScadenza.setText("Data scadenza");
		
		DateTime dateTime = new DateTime(shlSwtApplication, SWT.BORDER);
		dateTime.setBounds(136, 247, 80, 24);
		
		Button btnElimina = new Button(shlSwtApplication, SWT.NONE);
		btnElimina.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				try {
					ls.eliminaProdotto(list.getSelectionIndex());
					list.remove(list.getSelectionIndex());
				} catch (Exception e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		btnElimina.setBounds(220, 477, 75, 25);
		btnElimina.setText("Elimina");
		
	

	}
}
