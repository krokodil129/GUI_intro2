package guiintro;

import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Text;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.widgets.Label;

public class test {

	protected Shell shell;
	private Text entryField;
	private Text resultField;

	/**
	 * Launch the application.
	 * @param args
	 */
	public static void main(String[] args) {
		try {
			test window = new test();
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
		shell.open();
		shell.layout();
		while (!shell.isDisposed()) {
			if (!display.readAndDispatch()) {
				display.sleep();
			}
		}
	}

	/**
	 * Create contents of the window.
	 */
	protected void createContents() {
		shell = new Shell();
		shell.setSize(450, 300);
		shell.setText("SWT Application");
		
		entryField = new Text(shell, SWT.BORDER);
		entryField.setBounds(272, 118, 76, 21);
		
		resultField = new Text(shell, SWT.BORDER);
		resultField.setBounds(57, 118, 76, 21);
		
		Button button = new Button(shell, SWT.NONE);
		button.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {

				int ergebnis = Integer.parseInt(getResultField().getText());

				int wert = Integer.parseInt(getEntryField().getText());

				//

				ergebnis = ergebnis + wert;

				//

				getResultField().setText(Integer.toString(ergebnis));

				getEntryField().setText("");
			}
		});
		button.setBounds(118, 168, 75, 25);
		button.setText("+");
		
		Button button_1 = new Button(shell, SWT.NONE);
		button_1.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {

				int ergebnis = Integer.parseInt(getResultField().getText());

				int wert = Integer.parseInt(getEntryField().getText());

				//

				ergebnis = ergebnis - wert;

				//

				getResultField().setText(Integer.toString(ergebnis));

				getEntryField().setText("");
			}
		});
		button_1.setBounds(118, 199, 75, 25);
		button_1.setText("-");
		
		Button button_2 = new Button(shell, SWT.NONE);
		button_2.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {

				int ergebnis = Integer.parseInt(getResultField().getText());

				int wert = Integer.parseInt(getEntryField().getText());

				//

				ergebnis = ergebnis * wert;

				//

				getResultField().setText(Integer.toString(ergebnis));

				getEntryField().setText("");
			}
		});
		button_2.setBounds(226, 168, 75, 25);
		button_2.setText("*");
		
		Button button_3 = new Button(shell, SWT.NONE);
		button_3.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {

				int ergebnis = Integer.parseInt(getResultField().getText());

				int wert = Integer.parseInt(getEntryField().getText());

				//

				ergebnis = ergebnis / wert;

				//

				getResultField().setText(Integer.toString(ergebnis));

				getEntryField().setText("");
	
			}
		});
		button_3.setBounds(226, 199, 75, 25);
		button_3.setText("/");
		
		Label lblZahl = new Label(shell, SWT.NONE);
		lblZahl.setBounds(57, 86, 55, 15);
		lblZahl.setText("Zahl 1");
		
		Label lblZahl_1 = new Label(shell, SWT.NONE);
		lblZahl_1.setBounds(293, 86, 55, 15);
		lblZahl_1.setText("Zahl 2");
		
		Button btnClear = new Button(shell, SWT.NONE);
		btnClear.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				resultField.setText("");		
				entryField.setText("");
			}
		});
		btnClear.setBounds(172, 230, 75, 25);
		btnClear.setText("Clear");

	}

	public Text getEntryField() {
		return entryField;
	}
	public Text getResultField() {
		return resultField;
	}
}
