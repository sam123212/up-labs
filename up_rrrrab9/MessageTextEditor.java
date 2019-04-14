package bsu.fpmi.educational_practice2019;

import java.beans.*;
import java.awt.*;

/**
 * This PropertyEditor defines the enumerated values of the alignment property
 * so that a bean box or IDE can present those values to the user for selection
 **/
public class MessageTextEditor extends PropertyEditorSupport {
    /** Return the list of value names for the enumerated type. */
    public String[] getTags() {
	return new String[] { "Текст", "Ваш текст", "Text" };
    }
    
    /** Convert each of those value names into the actual value. */
    public void setAsText(String s) { 
        setValue(s);
    }
    
    /** This is an important method for code generation. */
    public String getJavaInitializationString() {
	Object o = getValue();
        if (o.equals("Текст")) return "Текст";
	else if (o.equals("Ваш текст")) return "Ваш текст";
	else if (o.equals("Text")) return "Text";
	return null;
    }
}

