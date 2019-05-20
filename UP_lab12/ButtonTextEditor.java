/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bsu.fpmi.educational_practice2019;

import java.beans.PropertyEditorSupport;

public class ButtonTextEditor extends PropertyEditorSupport{
    @Override
    public String[] getTags() {
	return new String[] { "OK", "push", "accept" };
    }
    
    /** Convert each of those value names into the actual value. */
    @Override
    public void setAsText(String s) { 
        if (s.equals("OK")) setValue(ButtonText.OK);
	else if (s.equals("push")) setValue(ButtonText.PUSH);
	else if (s.equals("accept")) setValue(ButtonText.ACCEPT);
	else throw new IllegalArgumentException(s); 
    }
    
    /** This is an important method for code generation. */
    @Override
    public String getJavaInitializationString() {
	Object o = getValue();
        if (o.equals("OK")) return "OK";
	else if (o.equals("push")) return "push";
	else if (o.equals("accept")) return "accept";
	return null;
    }
}
