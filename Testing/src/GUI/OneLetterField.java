package GUI;

import java.awt.Font;

import javax.swing.JTextField;
import javax.swing.text.AttributeSet;
import javax.swing.text.BadLocationException;
import javax.swing.text.DocumentFilter;
import javax.swing.text.AbstractDocument;

public class OneLetterField extends JTextField {

	/**
	 * Creates a text field to display only one character.
	 */
	public OneLetterField() {
		super("");
		((AbstractDocument) this.getDocument()).setDocumentFilter(new OneLetterFilter());
	}

	private class OneLetterFilter extends DocumentFilter {	   	   
		OneLetterFilter() {	    
			super();
			setHorizontalAlignment(JTextField.CENTER);
			setFont(new Font(getFont().getName(), Font.BOLD, 20));
		} 	   

		public void insertString(FilterBypass fb, int offset, String  str, AttributeSet attr) throws BadLocationException {	    
			if ((fb.getDocument().getLength() + str.length()) > 1) {
				return;
			}
			if (! str.isEmpty() && ! Character.isLetter(str.charAt(0))) {
				return;
			}
			fb.insertString(offset, str, attr);	         
		}
		
		public void replace(FilterBypass fb, int offset, int length, String  str, AttributeSet attr) throws BadLocationException {	    
			if ((fb.getDocument().getLength() + str.length() - length) > 1) {
				return;
			}
			if (! str.isEmpty() && ! Character.isLetter(str.charAt(0))) {
				return;
			}
			fb.replace(offset, length, str, attr);	         
		}
	}
}
