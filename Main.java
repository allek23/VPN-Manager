import java.awt.Color;
import java.awt.Component;
import java.awt.event.ActionListener;

import javax.swing.ComboBoxEditor;

import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.events.SelectionListener;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Combo;

public class Main {

	public static void main(String[] args) {
		InitUI();
	}
	static void InitUI() {
		Display display = new Display();
		Shell shell = new Shell(display);
		shell.setText("SWT demo");
		shell.setSize(300,300);
		shell.setBackground(display.getSystemColor(SWT.COLOR_WHITE));
		shell.open();
		
		Combo combo1 = new Combo(shell,SWT.READ_ONLY); 
		combo1.setBounds(10, 10, 100, 65);
		String items[] = { "Nummer_1", "Nummer_2", "Nummer_3" };
		combo1.setItems(items);
		
		Button button1 = new Button(shell,SWT.PUSH); 
		button1.setText("close");
		button1.setBounds(75, 40, 80, 30);
		button1.addSelectionListener(new SelectionListener() {
			
			@Override
			public void widgetSelected(SelectionEvent e) {
				display.dispose();
			}
			
			@Override
			public void widgetDefaultSelected(SelectionEvent e) {
				// TODO Auto-generated method stub
				
			}
		});
		
		Button button2 = new Button(shell, SWT.PUSH);
		button2.setText("cancel");
		button2.setSize(80, 30);
		button2.setLocation(75,75);
		button2.setBackground(display.getSystemColor(SWT.COLOR_RED));
		button2.addSelectionListener(new SelectionListener() {
			
			@Override
			public void widgetSelected(SelectionEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void widgetDefaultSelected(SelectionEvent e) {
				// TODO Auto-generated method stub
				
			}
		});
		while(!shell.isDisposed()) {
			if(!display.readAndDispatch()) {
				display.sleep();
			}
		}
	}
}
