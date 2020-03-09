package guiintro;

import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Text;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;

public class MeinErstesFenster {
	private static Text text;

	/**
	 * Launch the application.
	 * @param args
	 */
	public static void main(String[] args) {
		Display display = Display.getDefault();
		Shell shell = new Shell();
		shell.setSize(450, 300);
		shell.setText("SWT Application"); 
		
		Button btnButton = new Button(shell, SWT.NONE);
		btnButton.addSelectionListener(new SelectionAdapter() {
			@Override
			
			public void widgetSelected(SelectionEvent e) {
				System.out.println("Knopf war gedrueckt");
			}
		});
		btnButton.setBounds(43, 72, 75, 25);
		btnButton.setText("button1");
		
		Label lblSchreibWasHin = new Label(shell, SWT.NONE);
		lblSchreibWasHin.setBounds(66, 145, 93, 15);
		lblSchreibWasHin.setText("Schreib was hin");
		
		text = new Text(shell, SWT.BORDER);
		text.setBounds(165, 139, 76, 21);

		shell.open();
		shell.layout();
		while (!shell.isDisposed()) {
			if (!display.readAndDispatch()) {
				display.sleep();
			}
		}
	}
}
