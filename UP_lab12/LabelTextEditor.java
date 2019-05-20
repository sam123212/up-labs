/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bsu.fpmi.educational_practice2019;

import java.beans.PropertyEditorSupport;

public class LabelTextEditor extends PropertyEditorSupport{
    @Override
    public String[] getTags() {
	return new String[] { "Press button", "Enter symbol", "Press button and enter symbol" };
    }
    
    /** Convert each of those value names into the actual value. */
    @Override
    public void setAsText(String s) { 
        if (s.equals("Press button")) setValue(LabelText.ENTER);
	else if (s.equals("Enter symbol")) setValue(LabelText.PRESS);
	else if (s.equals("Press button and enter symbol")) setValue(LabelText.ENTER_PRESS);
	else throw new IllegalArgumentException(s); 
    }
    
    /** This is an important method for code generation. */
    @Override
    public String getJavaInitializationString() {
	Object o = getValue();
        if (o.equals("Press button")) return "Press button";
	else if (o.equals("Enter symbol")) return "Enter symbol";
	else if (o.equals("Press button and enter symbol")) return "Press button and enter symbol";
	return null;
    }
    
}
