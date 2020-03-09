package guiintro;

import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Text;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;

public class FirstWindow2 {
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
		
		Label lblNewLabel = new Label(shell, SWT.NONE);
		lblNewLabel.setBounds(72, 107, 152, 15);
		lblNewLabel.setText("Do not click the button");
		text = new Text(shell, SWT.BORDER);
		text.setBounds(72, 135, 314, 67);
		
		Button btnButton = new Button(shell, SWT.NONE);
		btnButton.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				System.out.println("I TOLD YOU NOT TO CLICK IT");
				text.setText("NOW I AM BECOME DEATH, THE DESTROYER OF WORLDS");
			}
		});
		btnButton.setBounds(100, 76, 75, 25);
		btnButton.setText("MyButton");

		shell.open();
		shell.layout();
		while (!shell.isDisposed()) {
			if (!display.readAndDispatch()) {
				display.sleep();
			}
		}
	}
}
