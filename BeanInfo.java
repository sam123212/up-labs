/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bsu.fpmi.educational_practice;

import java.beans.*;


public class BeanInfo extends SimpleBeanInfo {

    // Bean descriptor//GEN-FIRST:BeanDescriptor
    /*lazy BeanDescriptor*/
    private static BeanDescriptor getBdescriptor(){
        BeanDescriptor beanDescriptor = new BeanDescriptor  ( bsu.fpmi.educational_practice.MyBean.class , null ); // NOI18N//GEN-HEADEREND:BeanDescriptor
        // Here you can add code for customizing the BeanDescriptor.

        return beanDescriptor;     }//GEN-LAST:BeanDescriptor


    // Property identifiers//GEN-FIRST:Properties
    private static final int PROPERTY_accessibleContext = 0;
    private static final int PROPERTY_alignmentX = 1;
    private static final int PROPERTY_alignmentY = 2;
    private static final int PROPERTY_background = 3;
    private static final int PROPERTY_backgroundSet = 4;
    private static final int PROPERTY_baselineResizeBehavior = 5;
    private static final int PROPERTY_bounds = 6;
    private static final int PROPERTY_bufferStrategy = 7;
    private static final int PROPERTY_color = 8;
    private static final int PROPERTY_colorModel = 9;
    private static final int PROPERTY_componentListeners = 10;
    private static final int PROPERTY_componentOrientation = 11;
    private static final int PROPERTY_cursor = 12;
    private static final int PROPERTY_cursorSet = 13;
    private static final int PROPERTY_displayable = 14;
    private static final int PROPERTY_doubleBuffered = 15;
    private static final int PROPERTY_dropTarget = 16;
    private static final int PROPERTY_enabled = 17;
    private static final int PROPERTY_focusable = 18;
    private static final int PROPERTY_focusCycleRootAncestor = 19;
    private static final int PROPERTY_focusListeners = 20;
    private static final int PROPERTY_focusOwner = 21;
    private static final int PROPERTY_focusTraversable = 22;
    private static final int PROPERTY_focusTraversalKeys = 23;
    private static final int PROPERTY_focusTraversalKeysEnabled = 24;
    private static final int PROPERTY_font = 25;
    private static final int PROPERTY_fontSet = 26;
    private static final int PROPERTY_foreground = 27;
    private static final int PROPERTY_foregroundSet = 28;
    private static final int PROPERTY_graphics = 29;
    private static final int PROPERTY_graphicsConfiguration = 30;
    private static final int PROPERTY_height = 31;
    private static final int PROPERTY_hierarchyBoundsListeners = 32;
    private static final int PROPERTY_hierarchyListeners = 33;
    private static final int PROPERTY_ignoreRepaint = 34;
    private static final int PROPERTY_inputContext = 35;
    private static final int PROPERTY_inputMethodListeners = 36;
    private static final int PROPERTY_inputMethodRequests = 37;
    private static final int PROPERTY_keyListeners = 38;
    private static final int PROPERTY_lightweight = 39;
    private static final int PROPERTY_locale = 40;
    private static final int PROPERTY_location = 41;
    private static final int PROPERTY_locationOnScreen = 42;
    private static final int PROPERTY_maximumSize = 43;
    private static final int PROPERTY_maximumSizeSet = 44;
    private static final int PROPERTY_minimumSize = 45;
    private static final int PROPERTY_minimumSizeSet = 46;
    private static final int PROPERTY_mouseListeners = 47;
    private static final int PROPERTY_mouseMotionListeners = 48;
    private static final int PROPERTY_mousePosition = 49;
    private static final int PROPERTY_mouseWheelListeners = 50;
    private static final int PROPERTY_name = 51;
    private static final int PROPERTY_opaque = 52;
    private static final int PROPERTY_parent = 53;
    private static final int PROPERTY_peer = 54;
    private static final int PROPERTY_preferredSize = 55;
    private static final int PROPERTY_preferredSizeSet = 56;
    private static final int PROPERTY_propertyChangeListeners = 57;
    private static final int PROPERTY_showing = 58;
    private static final int PROPERTY_size = 59;
    private static final int PROPERTY_toolkit = 60;
    private static final int PROPERTY_treeLock = 61;
    private static final int PROPERTY_valid = 62;
    private static final int PROPERTY_visible = 63;
    private static final int PROPERTY_width = 64;
    private static final int PROPERTY_x = 65;
    private static final int PROPERTY_y = 66;

    // Property array 
    /*lazy PropertyDescriptor*/
    private static PropertyDescriptor[] getPdescriptor(){
        PropertyDescriptor[] properties = new PropertyDescriptor[67];
    
        try {
            properties[PROPERTY_accessibleContext] = new PropertyDescriptor ( "accessibleContext", bsu.fpmi.educational_practice.MyBean.class, "getAccessibleContext", null ); // NOI18N
            properties[PROPERTY_alignmentX] = new PropertyDescriptor ( "alignmentX", bsu.fpmi.educational_practice.MyBean.class, "getAlignmentX", null ); // NOI18N
            properties[PROPERTY_alignmentY] = new PropertyDescriptor ( "alignmentY", bsu.fpmi.educational_practice.MyBean.class, "getAlignmentY", null ); // NOI18N
            properties[PROPERTY_background] = new PropertyDescriptor ( "background", bsu.fpmi.educational_practice.MyBean.class, "getBackground", "setBackground" ); // NOI18N
            properties[PROPERTY_background].setPreferred ( true );
            properties[PROPERTY_backgroundSet] = new PropertyDescriptor ( "backgroundSet", bsu.fpmi.educational_practice.MyBean.class, "isBackgroundSet", null ); // NOI18N
            properties[PROPERTY_baselineResizeBehavior] = new PropertyDescriptor ( "baselineResizeBehavior", bsu.fpmi.educational_practice.MyBean.class, "getBaselineResizeBehavior", null ); // NOI18N
            properties[PROPERTY_bounds] = new PropertyDescriptor ( "bounds", bsu.fpmi.educational_practice.MyBean.class, "getBounds", "setBounds" ); // NOI18N
            properties[PROPERTY_bufferStrategy] = new PropertyDescriptor ( "bufferStrategy", bsu.fpmi.educational_practice.MyBean.class, "getBufferStrategy", null ); // NOI18N
            properties[PROPERTY_color] = new PropertyDescriptor ( "color", bsu.fpmi.educational_practice.MyBean.class, "getColor", "setColor" ); // NOI18N
            properties[PROPERTY_color].setPreferred ( true );
            properties[PROPERTY_colorModel] = new PropertyDescriptor ( "colorModel", bsu.fpmi.educational_practice.MyBean.class, "getColorModel", null ); // NOI18N
            properties[PROPERTY_componentListeners] = new PropertyDescriptor ( "componentListeners", bsu.fpmi.educational_practice.MyBean.class, "getComponentListeners", null ); // NOI18N
            properties[PROPERTY_componentOrientation] = new PropertyDescriptor ( "componentOrientation", bsu.fpmi.educational_practice.MyBean.class, "getComponentOrientation", "setComponentOrientation" ); // NOI18N
            properties[PROPERTY_cursor] = new PropertyDescriptor ( "cursor", bsu.fpmi.educational_practice.MyBean.class, "getCursor", "setCursor" ); // NOI18N
            properties[PROPERTY_cursorSet] = new PropertyDescriptor ( "cursorSet", bsu.fpmi.educational_practice.MyBean.class, "isCursorSet", null ); // NOI18N
            properties[PROPERTY_displayable] = new PropertyDescriptor ( "displayable", bsu.fpmi.educational_practice.MyBean.class, "isDisplayable", null ); // NOI18N
            properties[PROPERTY_doubleBuffered] = new PropertyDescriptor ( "doubleBuffered", bsu.fpmi.educational_practice.MyBean.class, "isDoubleBuffered", null ); // NOI18N
            properties[PROPERTY_dropTarget] = new PropertyDescriptor ( "dropTarget", bsu.fpmi.educational_practice.MyBean.class, "getDropTarget", "setDropTarget" ); // NOI18N
            properties[PROPERTY_enabled] = new PropertyDescriptor ( "enabled", bsu.fpmi.educational_practice.MyBean.class, "isEnabled", "setEnabled" ); // NOI18N
            properties[PROPERTY_focusable] = new PropertyDescriptor ( "focusable", bsu.fpmi.educational_practice.MyBean.class, "isFocusable", "setFocusable" ); // NOI18N
            properties[PROPERTY_focusCycleRootAncestor] = new PropertyDescriptor ( "focusCycleRootAncestor", bsu.fpmi.educational_practice.MyBean.class, "getFocusCycleRootAncestor", null ); // NOI18N
            properties[PROPERTY_focusListeners] = new PropertyDescriptor ( "focusListeners", bsu.fpmi.educational_practice.MyBean.class, "getFocusListeners", null ); // NOI18N
            properties[PROPERTY_focusOwner] = new PropertyDescriptor ( "focusOwner", bsu.fpmi.educational_practice.MyBean.class, "isFocusOwner", null ); // NOI18N
            properties[PROPERTY_focusTraversable] = new PropertyDescriptor ( "focusTraversable", bsu.fpmi.educational_practice.MyBean.class, "isFocusTraversable", null ); // NOI18N
            properties[PROPERTY_focusTraversalKeys] = new IndexedPropertyDescriptor ( "focusTraversalKeys", bsu.fpmi.educational_practice.MyBean.class, null, null, "getFocusTraversalKeys", null ); // NOI18N
            properties[PROPERTY_focusTraversalKeysEnabled] = new PropertyDescriptor ( "focusTraversalKeysEnabled", bsu.fpmi.educational_practice.MyBean.class, "getFocusTraversalKeysEnabled", "setFocusTraversalKeysEnabled" ); // NOI18N
            properties[PROPERTY_font] = new PropertyDescriptor ( "font", bsu.fpmi.educational_practice.MyBean.class, "getFont", "setFont" ); // NOI18N
            properties[PROPERTY_fontSet] = new PropertyDescriptor ( "fontSet", bsu.fpmi.educational_practice.MyBean.class, "isFontSet", null ); // NOI18N
            properties[PROPERTY_foreground] = new PropertyDescriptor ( "foreground", bsu.fpmi.educational_practice.MyBean.class, "getForeground", "setForeground" ); // NOI18N
            properties[PROPERTY_foregroundSet] = new PropertyDescriptor ( "foregroundSet", bsu.fpmi.educational_practice.MyBean.class, "isForegroundSet", null ); // NOI18N
            properties[PROPERTY_graphics] = new PropertyDescriptor ( "graphics", bsu.fpmi.educational_practice.MyBean.class, "getGraphics", null ); // NOI18N
            properties[PROPERTY_graphicsConfiguration] = new PropertyDescriptor ( "graphicsConfiguration", bsu.fpmi.educational_practice.MyBean.class, "getGraphicsConfiguration", null ); // NOI18N
            properties[PROPERTY_height] = new PropertyDescriptor ( "height", bsu.fpmi.educational_practice.MyBean.class, "getHeight", "setHeight" ); // NOI18N
            properties[PROPERTY_height].setPreferred ( true );
            properties[PROPERTY_hierarchyBoundsListeners] = new PropertyDescriptor ( "hierarchyBoundsListeners", bsu.fpmi.educational_practice.MyBean.class, "getHierarchyBoundsListeners", null ); // NOI18N
            properties[PROPERTY_hierarchyListeners] = new PropertyDescriptor ( "hierarchyListeners", bsu.fpmi.educational_practice.MyBean.class, "getHierarchyListeners", null ); // NOI18N
            properties[PROPERTY_ignoreRepaint] = new PropertyDescriptor ( "ignoreRepaint", bsu.fpmi.educational_practice.MyBean.class, "getIgnoreRepaint", "setIgnoreRepaint" ); // NOI18N
            properties[PROPERTY_inputContext] = new PropertyDescriptor ( "inputContext", bsu.fpmi.educational_practice.MyBean.class, "getInputContext", null ); // NOI18N
            properties[PROPERTY_inputMethodListeners] = new PropertyDescriptor ( "inputMethodListeners", bsu.fpmi.educational_practice.MyBean.class, "getInputMethodListeners", null ); // NOI18N
            properties[PROPERTY_inputMethodRequests] = new PropertyDescriptor ( "inputMethodRequests", bsu.fpmi.educational_practice.MyBean.class, "getInputMethodRequests", null ); // NOI18N
            properties[PROPERTY_keyListeners] = new PropertyDescriptor ( "keyListeners", bsu.fpmi.educational_practice.MyBean.class, "getKeyListeners", null ); // NOI18N
            properties[PROPERTY_lightweight] = new PropertyDescriptor ( "lightweight", bsu.fpmi.educational_practice.MyBean.class, "isLightweight", null ); // NOI18N
            properties[PROPERTY_locale] = new PropertyDescriptor ( "locale", bsu.fpmi.educational_practice.MyBean.class, "getLocale", "setLocale" ); // NOI18N
            properties[PROPERTY_location] = new PropertyDescriptor ( "location", bsu.fpmi.educational_practice.MyBean.class, "getLocation", "setLocation" ); // NOI18N
            properties[PROPERTY_locationOnScreen] = new PropertyDescriptor ( "locationOnScreen", bsu.fpmi.educational_practice.MyBean.class, "getLocationOnScreen", null ); // NOI18N
            properties[PROPERTY_maximumSize] = new PropertyDescriptor ( "maximumSize", bsu.fpmi.educational_practice.MyBean.class, "getMaximumSize", "setMaximumSize" ); // NOI18N
            properties[PROPERTY_maximumSizeSet] = new PropertyDescriptor ( "maximumSizeSet", bsu.fpmi.educational_practice.MyBean.class, "isMaximumSizeSet", null ); // NOI18N
            properties[PROPERTY_minimumSize] = new PropertyDescriptor ( "minimumSize", bsu.fpmi.educational_practice.MyBean.class, "getMinimumSize", "setMinimumSize" ); // NOI18N
            properties[PROPERTY_minimumSizeSet] = new PropertyDescriptor ( "minimumSizeSet", bsu.fpmi.educational_practice.MyBean.class, "isMinimumSizeSet", null ); // NOI18N
            properties[PROPERTY_mouseListeners] = new PropertyDescriptor ( "mouseListeners", bsu.fpmi.educational_practice.MyBean.class, "getMouseListeners", null ); // NOI18N
            properties[PROPERTY_mouseMotionListeners] = new PropertyDescriptor ( "mouseMotionListeners", bsu.fpmi.educational_practice.MyBean.class, "getMouseMotionListeners", null ); // NOI18N
            properties[PROPERTY_mousePosition] = new PropertyDescriptor ( "mousePosition", bsu.fpmi.educational_practice.MyBean.class, "getMousePosition", null ); // NOI18N
            properties[PROPERTY_mouseWheelListeners] = new PropertyDescriptor ( "mouseWheelListeners", bsu.fpmi.educational_practice.MyBean.class, "getMouseWheelListeners", null ); // NOI18N
            properties[PROPERTY_name] = new PropertyDescriptor ( "name", bsu.fpmi.educational_practice.MyBean.class, "getName", "setName" ); // NOI18N
            properties[PROPERTY_opaque] = new PropertyDescriptor ( "opaque", bsu.fpmi.educational_practice.MyBean.class, "isOpaque", null ); // NOI18N
            properties[PROPERTY_parent] = new PropertyDescriptor ( "parent", bsu.fpmi.educational_practice.MyBean.class, "getParent", null ); // NOI18N
            properties[PROPERTY_peer] = new PropertyDescriptor ( "peer", bsu.fpmi.educational_practice.MyBean.class, "getPeer", null ); // NOI18N
            properties[PROPERTY_preferredSize] = new PropertyDescriptor ( "preferredSize", bsu.fpmi.educational_practice.MyBean.class, "getPreferredSize", "setPreferredSize" ); // NOI18N
            properties[PROPERTY_preferredSizeSet] = new PropertyDescriptor ( "preferredSizeSet", bsu.fpmi.educational_practice.MyBean.class, "isPreferredSizeSet", null ); // NOI18N
            properties[PROPERTY_propertyChangeListeners] = new PropertyDescriptor ( "propertyChangeListeners", bsu.fpmi.educational_practice.MyBean.class, "getPropertyChangeListeners", null ); // NOI18N
            properties[PROPERTY_showing] = new PropertyDescriptor ( "showing", bsu.fpmi.educational_practice.MyBean.class, "isShowing", null ); // NOI18N
            properties[PROPERTY_size] = new PropertyDescriptor ( "size", bsu.fpmi.educational_practice.MyBean.class, "getSize", "setSize" ); // NOI18N
            properties[PROPERTY_toolkit] = new PropertyDescriptor ( "toolkit", bsu.fpmi.educational_practice.MyBean.class, "getToolkit", null ); // NOI18N
            properties[PROPERTY_treeLock] = new PropertyDescriptor ( "treeLock", bsu.fpmi.educational_practice.MyBean.class, "getTreeLock", null ); // NOI18N
            properties[PROPERTY_valid] = new PropertyDescriptor ( "valid", bsu.fpmi.educational_practice.MyBean.class, "isValid", null ); // NOI18N
            properties[PROPERTY_visible] = new PropertyDescriptor ( "visible", bsu.fpmi.educational_practice.MyBean.class, "isVisible", "setVisible" ); // NOI18N
            properties[PROPERTY_width] = new PropertyDescriptor ( "width", bsu.fpmi.educational_practice.MyBean.class, "getWidth", "setWidth" ); // NOI18N
            properties[PROPERTY_width].setPreferred ( true );
            properties[PROPERTY_x] = new PropertyDescriptor ( "x", bsu.fpmi.educational_practice.MyBean.class, "getX", null ); // NOI18N
            properties[PROPERTY_y] = new PropertyDescriptor ( "y", bsu.fpmi.educational_practice.MyBean.class, "getY", null ); // NOI18N
        }
        catch(IntrospectionException e) {
            e.printStackTrace();
        }//GEN-HEADEREND:Properties
        // Here you can add code for customizing the properties array.

        return properties;     }//GEN-LAST:Properties

    // EventSet identifiers//GEN-FIRST:Events
    private static final int EVENT_componentListener = 0;
    private static final int EVENT_focusListener = 1;
    private static final int EVENT_hierarchyBoundsListener = 2;
    private static final int EVENT_hierarchyListener = 3;
    private static final int EVENT_inputMethodListener = 4;
    private static final int EVENT_keyListener = 5;
    private static final int EVENT_mouseListener = 6;
    private static final int EVENT_mouseMotionListener = 7;
    private static final int EVENT_mouseWheelListener = 8;
    private static final int EVENT_propertyChangeListener = 9;

    // EventSet array
    /*lazy EventSetDescriptor*/
    private static EventSetDescriptor[] getEdescriptor(){
        EventSetDescriptor[] eventSets = new EventSetDescriptor[10];
    
        try {
            eventSets[EVENT_componentListener] = new EventSetDescriptor ( bsu.fpmi.educational_practice.MyBean.class, "componentListener", java.awt.event.ComponentListener.class, new String[] {"componentResized", "componentMoved", "componentShown", "componentHidden"}, "addComponentListener", "removeComponentListener" ); // NOI18N
            eventSets[EVENT_focusListener] = new EventSetDescriptor ( bsu.fpmi.educational_practice.MyBean.class, "focusListener", java.awt.event.FocusListener.class, new String[] {"focusGained", "focusLost"}, "addFocusListener", "removeFocusListener" ); // NOI18N
            eventSets[EVENT_hierarchyBoundsListener] = new EventSetDescriptor ( bsu.fpmi.educational_practice.MyBean.class, "hierarchyBoundsListener", java.awt.event.HierarchyBoundsListener.class, new String[] {"ancestorMoved", "ancestorResized"}, "addHierarchyBoundsListener", "removeHierarchyBoundsListener" ); // NOI18N
            eventSets[EVENT_hierarchyListener] = new EventSetDescriptor ( bsu.fpmi.educational_practice.MyBean.class, "hierarchyListener", java.awt.event.HierarchyListener.class, new String[] {"hierarchyChanged"}, "addHierarchyListener", "removeHierarchyListener" ); // NOI18N
            eventSets[EVENT_inputMethodListener] = new EventSetDescriptor ( bsu.fpmi.educational_practice.MyBean.class, "inputMethodListener", java.awt.event.InputMethodListener.class, new String[] {"inputMethodTextChanged", "caretPositionChanged"}, "addInputMethodListener", "removeInputMethodListener" ); // NOI18N
            eventSets[EVENT_keyListener] = new EventSetDescriptor ( bsu.fpmi.educational_practice.MyBean.class, "keyListener", java.awt.event.KeyListener.class, new String[] {"keyTyped", "keyPressed", "keyReleased"}, "addKeyListener", "removeKeyListener" ); // NOI18N
            eventSets[EVENT_mouseListener] = new EventSetDescriptor ( bsu.fpmi.educational_practice.MyBean.class, "mouseListener", java.awt.event.MouseListener.class, new String[] {"mouseClicked", "mousePressed", "mouseReleased", "mouseEntered", "mouseExited"}, "addMouseListener", "removeMouseListener" ); // NOI18N
            eventSets[EVENT_mouseMotionListener] = new EventSetDescriptor ( bsu.fpmi.educational_practice.MyBean.class, "mouseMotionListener", java.awt.event.MouseMotionListener.class, new String[] {"mouseDragged", "mouseMoved"}, "addMouseMotionListener", "removeMouseMotionListener" ); // NOI18N
            eventSets[EVENT_mouseWheelListener] = new EventSetDescriptor ( bsu.fpmi.educational_practice.MyBean.class, "mouseWheelListener", java.awt.event.MouseWheelListener.class, new String[] {"mouseWheelMoved"}, "addMouseWheelListener", "removeMouseWheelListener" ); // NOI18N
            eventSets[EVENT_propertyChangeListener] = new EventSetDescriptor ( bsu.fpmi.educational_practice.MyBean.class, "propertyChangeListener", java.beans.PropertyChangeListener.class, new String[] {"propertyChange"}, "addPropertyChangeListener", "removePropertyChangeListener" ); // NOI18N
        }
        catch(IntrospectionException e) {
            e.printStackTrace();
        }//GEN-HEADEREND:Events
        // Here you can add code for customizing the event sets array.

        return eventSets;     }//GEN-LAST:Events

    // Method identifiers//GEN-FIRST:Methods
    private static final int METHOD_action0 = 0;
    private static final int METHOD_add1 = 1;
    private static final int METHOD_addNotify2 = 2;
    private static final int METHOD_addPropertyChangeListener3 = 3;
    private static final int METHOD_applyComponentOrientation4 = 4;
    private static final int METHOD_areFocusTraversalKeysSet5 = 5;
    private static final int METHOD_bounds6 = 6;
    private static final int METHOD_checkImage7 = 7;
    private static final int METHOD_checkImage8 = 8;
    private static final int METHOD_contains9 = 9;
    private static final int METHOD_contains10 = 10;
    private static final int METHOD_createBufferStrategy11 = 11;
    private static final int METHOD_createBufferStrategy12 = 12;
    private static final int METHOD_createImage13 = 13;
    private static final int METHOD_createImage14 = 14;
    private static final int METHOD_createVolatileImage15 = 15;
    private static final int METHOD_createVolatileImage16 = 16;
    private static final int METHOD_deliverEvent17 = 17;
    private static final int METHOD_disable18 = 18;
    private static final int METHOD_dispatchEvent19 = 19;
    private static final int METHOD_doLayout20 = 20;
    private static final int METHOD_enable21 = 21;
    private static final int METHOD_enable22 = 22;
    private static final int METHOD_enableInputMethods23 = 23;
    private static final int METHOD_firePropertyChange24 = 24;
    private static final int METHOD_firePropertyChange25 = 25;
    private static final int METHOD_firePropertyChange26 = 26;
    private static final int METHOD_firePropertyChange27 = 27;
    private static final int METHOD_firePropertyChange28 = 28;
    private static final int METHOD_firePropertyChange29 = 29;
    private static final int METHOD_getBaseline30 = 30;
    private static final int METHOD_getBounds31 = 31;
    private static final int METHOD_getComponentAt32 = 32;
    private static final int METHOD_getComponentAt33 = 33;
    private static final int METHOD_getFontMetrics34 = 34;
    private static final int METHOD_getListeners35 = 35;
    private static final int METHOD_getLocation36 = 36;
    private static final int METHOD_getPropertyChangeListeners37 = 37;
    private static final int METHOD_getSize38 = 38;
    private static final int METHOD_gotFocus39 = 39;
    private static final int METHOD_handleEvent40 = 40;
    private static final int METHOD_hasFocus41 = 41;
    private static final int METHOD_hide42 = 42;
    private static final int METHOD_imageUpdate43 = 43;
    private static final int METHOD_inside44 = 44;
    private static final int METHOD_invalidate45 = 45;
    private static final int METHOD_isFocusCycleRoot46 = 46;
    private static final int METHOD_keyDown47 = 47;
    private static final int METHOD_keyUp48 = 48;
    private static final int METHOD_layout49 = 49;
    private static final int METHOD_list50 = 50;
    private static final int METHOD_list51 = 51;
    private static final int METHOD_list52 = 52;
    private static final int METHOD_list53 = 53;
    private static final int METHOD_list54 = 54;
    private static final int METHOD_locate55 = 55;
    private static final int METHOD_location56 = 56;
    private static final int METHOD_lostFocus57 = 57;
    private static final int METHOD_minimumSize58 = 58;
    private static final int METHOD_mouseDown59 = 59;
    private static final int METHOD_mouseDrag60 = 60;
    private static final int METHOD_mouseEnter61 = 61;
    private static final int METHOD_mouseExit62 = 62;
    private static final int METHOD_mouseMove63 = 63;
    private static final int METHOD_mouseUp64 = 64;
    private static final int METHOD_move65 = 65;
    private static final int METHOD_nextFocus66 = 66;
    private static final int METHOD_paint67 = 67;
    private static final int METHOD_paintAll68 = 68;
    private static final int METHOD_postEvent69 = 69;
    private static final int METHOD_preferredSize70 = 70;
    private static final int METHOD_prepareImage71 = 71;
    private static final int METHOD_prepareImage72 = 72;
    private static final int METHOD_print73 = 73;
    private static final int METHOD_printAll74 = 74;
    private static final int METHOD_remove75 = 75;
    private static final int METHOD_removeNotify76 = 76;
    private static final int METHOD_removePropertyChangeListener77 = 77;
    private static final int METHOD_repaint78 = 78;
    private static final int METHOD_repaint79 = 79;
    private static final int METHOD_repaint80 = 80;
    private static final int METHOD_repaint81 = 81;
    private static final int METHOD_requestFocus82 = 82;
    private static final int METHOD_requestFocusInWindow83 = 83;
    private static final int METHOD_reshape84 = 84;
    private static final int METHOD_resize85 = 85;
    private static final int METHOD_resize86 = 86;
    private static final int METHOD_revalidate87 = 87;
    private static final int METHOD_setBounds88 = 88;
    private static final int METHOD_setFocusTraversalKeys89 = 89;
    private static final int METHOD_show90 = 90;
    private static final int METHOD_show91 = 91;
    private static final int METHOD_size92 = 92;
    private static final int METHOD_toString93 = 93;
    private static final int METHOD_transferFocus94 = 94;
    private static final int METHOD_transferFocusBackward95 = 95;
    private static final int METHOD_transferFocusUpCycle96 = 96;
    private static final int METHOD_update97 = 97;
    private static final int METHOD_validate98 = 98;

    // Method array 
    /*lazy MethodDescriptor*/
    private static MethodDescriptor[] getMdescriptor(){
        MethodDescriptor[] methods = new MethodDescriptor[99];
    
        try {
            methods[METHOD_action0] = new MethodDescriptor(java.awt.Component.class.getMethod("action", new Class[] {java.awt.Event.class, java.lang.Object.class})); // NOI18N
            methods[METHOD_action0].setDisplayName ( "" );
            methods[METHOD_add1] = new MethodDescriptor(java.awt.Component.class.getMethod("add", new Class[] {java.awt.PopupMenu.class})); // NOI18N
            methods[METHOD_add1].setDisplayName ( "" );
            methods[METHOD_addNotify2] = new MethodDescriptor(java.awt.Canvas.class.getMethod("addNotify", new Class[] {})); // NOI18N
            methods[METHOD_addNotify2].setDisplayName ( "" );
            methods[METHOD_addPropertyChangeListener3] = new MethodDescriptor(java.awt.Component.class.getMethod("addPropertyChangeListener", new Class[] {java.lang.String.class, java.beans.PropertyChangeListener.class})); // NOI18N
            methods[METHOD_addPropertyChangeListener3].setDisplayName ( "" );
            methods[METHOD_applyComponentOrientation4] = new MethodDescriptor(java.awt.Component.class.getMethod("applyComponentOrientation", new Class[] {java.awt.ComponentOrientation.class})); // NOI18N
            methods[METHOD_applyComponentOrientation4].setDisplayName ( "" );
            methods[METHOD_areFocusTraversalKeysSet5] = new MethodDescriptor(java.awt.Component.class.getMethod("areFocusTraversalKeysSet", new Class[] {int.class})); // NOI18N
            methods[METHOD_areFocusTraversalKeysSet5].setDisplayName ( "" );
            methods[METHOD_bounds6] = new MethodDescriptor(java.awt.Component.class.getMethod("bounds", new Class[] {})); // NOI18N
            methods[METHOD_bounds6].setDisplayName ( "" );
            methods[METHOD_checkImage7] = new MethodDescriptor(java.awt.Component.class.getMethod("checkImage", new Class[] {java.awt.Image.class, java.awt.image.ImageObserver.class})); // NOI18N
            methods[METHOD_checkImage7].setDisplayName ( "" );
            methods[METHOD_checkImage8] = new MethodDescriptor(java.awt.Component.class.getMethod("checkImage", new Class[] {java.awt.Image.class, int.class, int.class, java.awt.image.ImageObserver.class})); // NOI18N
            methods[METHOD_checkImage8].setDisplayName ( "" );
            methods[METHOD_contains9] = new MethodDescriptor(java.awt.Component.class.getMethod("contains", new Class[] {int.class, int.class})); // NOI18N
            methods[METHOD_contains9].setDisplayName ( "" );
            methods[METHOD_contains10] = new MethodDescriptor(java.awt.Component.class.getMethod("contains", new Class[] {java.awt.Point.class})); // NOI18N
            methods[METHOD_contains10].setDisplayName ( "" );
            methods[METHOD_createBufferStrategy11] = new MethodDescriptor(java.awt.Canvas.class.getMethod("createBufferStrategy", new Class[] {int.class})); // NOI18N
            methods[METHOD_createBufferStrategy11].setDisplayName ( "" );
            methods[METHOD_createBufferStrategy12] = new MethodDescriptor(java.awt.Canvas.class.getMethod("createBufferStrategy", new Class[] {int.class, java.awt.BufferCapabilities.class})); // NOI18N
            methods[METHOD_createBufferStrategy12].setDisplayName ( "" );
            methods[METHOD_createImage13] = new MethodDescriptor(java.awt.Component.class.getMethod("createImage", new Class[] {java.awt.image.ImageProducer.class})); // NOI18N
            methods[METHOD_createImage13].setDisplayName ( "" );
            methods[METHOD_createImage14] = new MethodDescriptor(java.awt.Component.class.getMethod("createImage", new Class[] {int.class, int.class})); // NOI18N
            methods[METHOD_createImage14].setDisplayName ( "" );
            methods[METHOD_createVolatileImage15] = new MethodDescriptor(java.awt.Component.class.getMethod("createVolatileImage", new Class[] {int.class, int.class})); // NOI18N
            methods[METHOD_createVolatileImage15].setDisplayName ( "" );
            methods[METHOD_createVolatileImage16] = new MethodDescriptor(java.awt.Component.class.getMethod("createVolatileImage", new Class[] {int.class, int.class, java.awt.ImageCapabilities.class})); // NOI18N
            methods[METHOD_createVolatileImage16].setDisplayName ( "" );
            methods[METHOD_deliverEvent17] = new MethodDescriptor(java.awt.Component.class.getMethod("deliverEvent", new Class[] {java.awt.Event.class})); // NOI18N
            methods[METHOD_deliverEvent17].setDisplayName ( "" );
            methods[METHOD_disable18] = new MethodDescriptor(java.awt.Component.class.getMethod("disable", new Class[] {})); // NOI18N
            methods[METHOD_disable18].setDisplayName ( "" );
            methods[METHOD_dispatchEvent19] = new MethodDescriptor(java.awt.Component.class.getMethod("dispatchEvent", new Class[] {java.awt.AWTEvent.class})); // NOI18N
            methods[METHOD_dispatchEvent19].setDisplayName ( "" );
            methods[METHOD_doLayout20] = new MethodDescriptor(java.awt.Component.class.getMethod("doLayout", new Class[] {})); // NOI18N
            methods[METHOD_doLayout20].setDisplayName ( "" );
            methods[METHOD_enable21] = new MethodDescriptor(java.awt.Component.class.getMethod("enable", new Class[] {})); // NOI18N
            methods[METHOD_enable21].setDisplayName ( "" );
            methods[METHOD_enable22] = new MethodDescriptor(java.awt.Component.class.getMethod("enable", new Class[] {boolean.class})); // NOI18N
            methods[METHOD_enable22].setDisplayName ( "" );
            methods[METHOD_enableInputMethods23] = new MethodDescriptor(java.awt.Component.class.getMethod("enableInputMethods", new Class[] {boolean.class})); // NOI18N
            methods[METHOD_enableInputMethods23].setDisplayName ( "" );
            methods[METHOD_firePropertyChange24] = new MethodDescriptor(java.awt.Component.class.getMethod("firePropertyChange", new Class[] {java.lang.String.class, byte.class, byte.class})); // NOI18N
            methods[METHOD_firePropertyChange24].setDisplayName ( "" );
            methods[METHOD_firePropertyChange25] = new MethodDescriptor(java.awt.Component.class.getMethod("firePropertyChange", new Class[] {java.lang.String.class, char.class, char.class})); // NOI18N
            methods[METHOD_firePropertyChange25].setDisplayName ( "" );
            methods[METHOD_firePropertyChange26] = new MethodDescriptor(java.awt.Component.class.getMethod("firePropertyChange", new Class[] {java.lang.String.class, short.class, short.class})); // NOI18N
            methods[METHOD_firePropertyChange26].setDisplayName ( "" );
            methods[METHOD_firePropertyChange27] = new MethodDescriptor(java.awt.Component.class.getMethod("firePropertyChange", new Class[] {java.lang.String.class, long.class, long.class})); // NOI18N
            methods[METHOD_firePropertyChange27].setDisplayName ( "" );
            methods[METHOD_firePropertyChange28] = new MethodDescriptor(java.awt.Component.class.getMethod("firePropertyChange", new Class[] {java.lang.String.class, float.class, float.class})); // NOI18N
            methods[METHOD_firePropertyChange28].setDisplayName ( "" );
            methods[METHOD_firePropertyChange29] = new MethodDescriptor(java.awt.Component.class.getMethod("firePropertyChange", new Class[] {java.lang.String.class, double.class, double.class})); // NOI18N
            methods[METHOD_firePropertyChange29].setDisplayName ( "" );
            methods[METHOD_getBaseline30] = new MethodDescriptor(java.awt.Component.class.getMethod("getBaseline", new Class[] {int.class, int.class})); // NOI18N
            methods[METHOD_getBaseline30].setDisplayName ( "" );
            methods[METHOD_getBounds31] = new MethodDescriptor(java.awt.Component.class.getMethod("getBounds", new Class[] {java.awt.Rectangle.class})); // NOI18N
            methods[METHOD_getBounds31].setDisplayName ( "" );
            methods[METHOD_getComponentAt32] = new MethodDescriptor(java.awt.Component.class.getMethod("getComponentAt", new Class[] {int.class, int.class})); // NOI18N
            methods[METHOD_getComponentAt32].setDisplayName ( "" );
            methods[METHOD_getComponentAt33] = new MethodDescriptor(java.awt.Component.class.getMethod("getComponentAt", new Class[] {java.awt.Point.class})); // NOI18N
            methods[METHOD_getComponentAt33].setDisplayName ( "" );
            methods[METHOD_getFontMetrics34] = new MethodDescriptor(java.awt.Component.class.getMethod("getFontMetrics", new Class[] {java.awt.Font.class})); // NOI18N
            methods[METHOD_getFontMetrics34].setDisplayName ( "" );
            methods[METHOD_getListeners35] = new MethodDescriptor(java.awt.Component.class.getMethod("getListeners", new Class[] {java.lang.Class.class})); // NOI18N
            methods[METHOD_getListeners35].setDisplayName ( "" );
            methods[METHOD_getLocation36] = new MethodDescriptor(java.awt.Component.class.getMethod("getLocation", new Class[] {java.awt.Point.class})); // NOI18N
            methods[METHOD_getLocation36].setDisplayName ( "" );
            methods[METHOD_getPropertyChangeListeners37] = new MethodDescriptor(java.awt.Component.class.getMethod("getPropertyChangeListeners", new Class[] {java.lang.String.class})); // NOI18N
            methods[METHOD_getPropertyChangeListeners37].setDisplayName ( "" );
            methods[METHOD_getSize38] = new MethodDescriptor(java.awt.Component.class.getMethod("getSize", new Class[] {java.awt.Dimension.class})); // NOI18N
            methods[METHOD_getSize38].setDisplayName ( "" );
            methods[METHOD_gotFocus39] = new MethodDescriptor(java.awt.Component.class.getMethod("gotFocus", new Class[] {java.awt.Event.class, java.lang.Object.class})); // NOI18N
            methods[METHOD_gotFocus39].setDisplayName ( "" );
            methods[METHOD_handleEvent40] = new MethodDescriptor(java.awt.Component.class.getMethod("handleEvent", new Class[] {java.awt.Event.class})); // NOI18N
            methods[METHOD_handleEvent40].setDisplayName ( "" );
            methods[METHOD_hasFocus41] = new MethodDescriptor(java.awt.Component.class.getMethod("hasFocus", new Class[] {})); // NOI18N
            methods[METHOD_hasFocus41].setDisplayName ( "" );
            methods[METHOD_hide42] = new MethodDescriptor(java.awt.Component.class.getMethod("hide", new Class[] {})); // NOI18N
            methods[METHOD_hide42].setDisplayName ( "" );
            methods[METHOD_imageUpdate43] = new MethodDescriptor(java.awt.Component.class.getMethod("imageUpdate", new Class[] {java.awt.Image.class, int.class, int.class, int.class, int.class, int.class})); // NOI18N
            methods[METHOD_imageUpdate43].setDisplayName ( "" );
            methods[METHOD_inside44] = new MethodDescriptor(java.awt.Component.class.getMethod("inside", new Class[] {int.class, int.class})); // NOI18N
            methods[METHOD_inside44].setDisplayName ( "" );
            methods[METHOD_invalidate45] = new MethodDescriptor(java.awt.Component.class.getMethod("invalidate", new Class[] {})); // NOI18N
            methods[METHOD_invalidate45].setDisplayName ( "" );
            methods[METHOD_isFocusCycleRoot46] = new MethodDescriptor(java.awt.Component.class.getMethod("isFocusCycleRoot", new Class[] {java.awt.Container.class})); // NOI18N
            methods[METHOD_isFocusCycleRoot46].setDisplayName ( "" );
            methods[METHOD_keyDown47] = new MethodDescriptor(java.awt.Component.class.getMethod("keyDown", new Class[] {java.awt.Event.class, int.class})); // NOI18N
            methods[METHOD_keyDown47].setDisplayName ( "" );
            methods[METHOD_keyUp48] = new MethodDescriptor(java.awt.Component.class.getMethod("keyUp", new Class[] {java.awt.Event.class, int.class})); // NOI18N
            methods[METHOD_keyUp48].setDisplayName ( "" );
            methods[METHOD_layout49] = new MethodDescriptor(java.awt.Component.class.getMethod("layout", new Class[] {})); // NOI18N
            methods[METHOD_layout49].setDisplayName ( "" );
            methods[METHOD_list50] = new MethodDescriptor(java.awt.Component.class.getMethod("list", new Class[] {})); // NOI18N
            methods[METHOD_list50].setDisplayName ( "" );
            methods[METHOD_list51] = new MethodDescriptor(java.awt.Component.class.getMethod("list", new Class[] {java.io.PrintStream.class})); // NOI18N
            methods[METHOD_list51].setDisplayName ( "" );
            methods[METHOD_list52] = new MethodDescriptor(java.awt.Component.class.getMethod("list", new Class[] {java.io.PrintStream.class, int.class})); // NOI18N
            methods[METHOD_list52].setDisplayName ( "" );
            methods[METHOD_list53] = new MethodDescriptor(java.awt.Component.class.getMethod("list", new Class[] {java.io.PrintWriter.class})); // NOI18N
            methods[METHOD_list53].setDisplayName ( "" );
            methods[METHOD_list54] = new MethodDescriptor(java.awt.Component.class.getMethod("list", new Class[] {java.io.PrintWriter.class, int.class})); // NOI18N
            methods[METHOD_list54].setDisplayName ( "" );
            methods[METHOD_locate55] = new MethodDescriptor(java.awt.Component.class.getMethod("locate", new Class[] {int.class, int.class})); // NOI18N
            methods[METHOD_locate55].setDisplayName ( "" );
            methods[METHOD_location56] = new MethodDescriptor(java.awt.Component.class.getMethod("location", new Class[] {})); // NOI18N
            methods[METHOD_location56].setDisplayName ( "" );
            methods[METHOD_lostFocus57] = new MethodDescriptor(java.awt.Component.class.getMethod("lostFocus", new Class[] {java.awt.Event.class, java.lang.Object.class})); // NOI18N
            methods[METHOD_lostFocus57].setDisplayName ( "" );
            methods[METHOD_minimumSize58] = new MethodDescriptor(java.awt.Component.class.getMethod("minimumSize", new Class[] {})); // NOI18N
            methods[METHOD_minimumSize58].setDisplayName ( "" );
            methods[METHOD_mouseDown59] = new MethodDescriptor(java.awt.Component.class.getMethod("mouseDown", new Class[] {java.awt.Event.class, int.class, int.class})); // NOI18N
            methods[METHOD_mouseDown59].setDisplayName ( "" );
            methods[METHOD_mouseDrag60] = new MethodDescriptor(java.awt.Component.class.getMethod("mouseDrag", new Class[] {java.awt.Event.class, int.class, int.class})); // NOI18N
            methods[METHOD_mouseDrag60].setDisplayName ( "" );
            methods[METHOD_mouseEnter61] = new MethodDescriptor(java.awt.Component.class.getMethod("mouseEnter", new Class[] {java.awt.Event.class, int.class, int.class})); // NOI18N
            methods[METHOD_mouseEnter61].setDisplayName ( "" );
            methods[METHOD_mouseExit62] = new MethodDescriptor(java.awt.Component.class.getMethod("mouseExit", new Class[] {java.awt.Event.class, int.class, int.class})); // NOI18N
            methods[METHOD_mouseExit62].setDisplayName ( "" );
            methods[METHOD_mouseMove63] = new MethodDescriptor(java.awt.Component.class.getMethod("mouseMove", new Class[] {java.awt.Event.class, int.class, int.class})); // NOI18N
            methods[METHOD_mouseMove63].setDisplayName ( "" );
            methods[METHOD_mouseUp64] = new MethodDescriptor(java.awt.Component.class.getMethod("mouseUp", new Class[] {java.awt.Event.class, int.class, int.class})); // NOI18N
            methods[METHOD_mouseUp64].setDisplayName ( "" );
            methods[METHOD_move65] = new MethodDescriptor(java.awt.Component.class.getMethod("move", new Class[] {int.class, int.class})); // NOI18N
            methods[METHOD_move65].setDisplayName ( "" );
            methods[METHOD_nextFocus66] = new MethodDescriptor(java.awt.Component.class.getMethod("nextFocus", new Class[] {})); // NOI18N
            methods[METHOD_nextFocus66].setDisplayName ( "" );
            methods[METHOD_paint67] = new MethodDescriptor(bsu.fpmi.educational_practice.MyBean.class.getMethod("paint", new Class[] {java.awt.Graphics.class})); // NOI18N
            methods[METHOD_paint67].setDisplayName ( "" );
            methods[METHOD_paintAll68] = new MethodDescriptor(java.awt.Component.class.getMethod("paintAll", new Class[] {java.awt.Graphics.class})); // NOI18N
            methods[METHOD_paintAll68].setDisplayName ( "" );
            methods[METHOD_postEvent69] = new MethodDescriptor(java.awt.Component.class.getMethod("postEvent", new Class[] {java.awt.Event.class})); // NOI18N
            methods[METHOD_postEvent69].setDisplayName ( "" );
            methods[METHOD_preferredSize70] = new MethodDescriptor(java.awt.Component.class.getMethod("preferredSize", new Class[] {})); // NOI18N
            methods[METHOD_preferredSize70].setDisplayName ( "" );
            methods[METHOD_prepareImage71] = new MethodDescriptor(java.awt.Component.class.getMethod("prepareImage", new Class[] {java.awt.Image.class, java.awt.image.ImageObserver.class})); // NOI18N
            methods[METHOD_prepareImage71].setDisplayName ( "" );
            methods[METHOD_prepareImage72] = new MethodDescriptor(java.awt.Component.class.getMethod("prepareImage", new Class[] {java.awt.Image.class, int.class, int.class, java.awt.image.ImageObserver.class})); // NOI18N
            methods[METHOD_prepareImage72].setDisplayName ( "" );
            methods[METHOD_print73] = new MethodDescriptor(java.awt.Component.class.getMethod("print", new Class[] {java.awt.Graphics.class})); // NOI18N
            methods[METHOD_print73].setDisplayName ( "" );
            methods[METHOD_printAll74] = new MethodDescriptor(java.awt.Component.class.getMethod("printAll", new Class[] {java.awt.Graphics.class})); // NOI18N
            methods[METHOD_printAll74].setDisplayName ( "" );
            methods[METHOD_remove75] = new MethodDescriptor(java.awt.Component.class.getMethod("remove", new Class[] {java.awt.MenuComponent.class})); // NOI18N
            methods[METHOD_remove75].setDisplayName ( "" );
            methods[METHOD_removeNotify76] = new MethodDescriptor(java.awt.Component.class.getMethod("removeNotify", new Class[] {})); // NOI18N
            methods[METHOD_removeNotify76].setDisplayName ( "" );
            methods[METHOD_removePropertyChangeListener77] = new MethodDescriptor(java.awt.Component.class.getMethod("removePropertyChangeListener", new Class[] {java.lang.String.class, java.beans.PropertyChangeListener.class})); // NOI18N
            methods[METHOD_removePropertyChangeListener77].setDisplayName ( "" );
            methods[METHOD_repaint78] = new MethodDescriptor(java.awt.Component.class.getMethod("repaint", new Class[] {})); // NOI18N
            methods[METHOD_repaint78].setPreferred ( true );
            methods[METHOD_repaint78].setDisplayName ( "" );
            methods[METHOD_repaint79] = new MethodDescriptor(java.awt.Component.class.getMethod("repaint", new Class[] {long.class})); // NOI18N
            methods[METHOD_repaint79].setDisplayName ( "" );
            methods[METHOD_repaint80] = new MethodDescriptor(java.awt.Component.class.getMethod("repaint", new Class[] {int.class, int.class, int.class, int.class})); // NOI18N
            methods[METHOD_repaint80].setDisplayName ( "" );
            methods[METHOD_repaint81] = new MethodDescriptor(java.awt.Component.class.getMethod("repaint", new Class[] {long.class, int.class, int.class, int.class, int.class})); // NOI18N
            methods[METHOD_repaint81].setDisplayName ( "" );
            methods[METHOD_requestFocus82] = new MethodDescriptor(java.awt.Component.class.getMethod("requestFocus", new Class[] {})); // NOI18N
            methods[METHOD_requestFocus82].setDisplayName ( "" );
            methods[METHOD_requestFocusInWindow83] = new MethodDescriptor(java.awt.Component.class.getMethod("requestFocusInWindow", new Class[] {})); // NOI18N
            methods[METHOD_requestFocusInWindow83].setDisplayName ( "" );
            methods[METHOD_reshape84] = new MethodDescriptor(java.awt.Component.class.getMethod("reshape", new Class[] {int.class, int.class, int.class, int.class})); // NOI18N
            methods[METHOD_reshape84].setDisplayName ( "" );
            methods[METHOD_resize85] = new MethodDescriptor(java.awt.Component.class.getMethod("resize", new Class[] {int.class, int.class})); // NOI18N
            methods[METHOD_resize85].setPreferred ( true );
            methods[METHOD_resize85].setDisplayName ( "" );
            methods[METHOD_resize86] = new MethodDescriptor(java.awt.Component.class.getMethod("resize", new Class[] {java.awt.Dimension.class})); // NOI18N
            methods[METHOD_resize86].setDisplayName ( "" );
            methods[METHOD_revalidate87] = new MethodDescriptor(java.awt.Component.class.getMethod("revalidate", new Class[] {})); // NOI18N
            methods[METHOD_revalidate87].setDisplayName ( "" );
            methods[METHOD_setBounds88] = new MethodDescriptor(java.awt.Component.class.getMethod("setBounds", new Class[] {int.class, int.class, int.class, int.class})); // NOI18N
            methods[METHOD_setBounds88].setDisplayName ( "" );
            methods[METHOD_setFocusTraversalKeys89] = new MethodDescriptor(java.awt.Component.class.getMethod("setFocusTraversalKeys", new Class[] {int.class, java.util.Set.class})); // NOI18N
            methods[METHOD_setFocusTraversalKeys89].setDisplayName ( "" );
            methods[METHOD_show90] = new MethodDescriptor(java.awt.Component.class.getMethod("show", new Class[] {})); // NOI18N
            methods[METHOD_show90].setDisplayName ( "" );
            methods[METHOD_show91] = new MethodDescriptor(java.awt.Component.class.getMethod("show", new Class[] {boolean.class})); // NOI18N
            methods[METHOD_show91].setDisplayName ( "" );
            methods[METHOD_size92] = new MethodDescriptor(java.awt.Component.class.getMethod("size", new Class[] {})); // NOI18N
            methods[METHOD_size92].setDisplayName ( "" );
            methods[METHOD_toString93] = new MethodDescriptor(java.awt.Component.class.getMethod("toString", new Class[] {})); // NOI18N
            methods[METHOD_toString93].setDisplayName ( "" );
            methods[METHOD_transferFocus94] = new MethodDescriptor(java.awt.Component.class.getMethod("transferFocus", new Class[] {})); // NOI18N
            methods[METHOD_transferFocus94].setDisplayName ( "" );
            methods[METHOD_transferFocusBackward95] = new MethodDescriptor(java.awt.Component.class.getMethod("transferFocusBackward", new Class[] {})); // NOI18N
            methods[METHOD_transferFocusBackward95].setDisplayName ( "" );
            methods[METHOD_transferFocusUpCycle96] = new MethodDescriptor(java.awt.Component.class.getMethod("transferFocusUpCycle", new Class[] {})); // NOI18N
            methods[METHOD_transferFocusUpCycle96].setDisplayName ( "" );
            methods[METHOD_update97] = new MethodDescriptor(java.awt.Canvas.class.getMethod("update", new Class[] {java.awt.Graphics.class})); // NOI18N
            methods[METHOD_update97].setDisplayName ( "" );
            methods[METHOD_validate98] = new MethodDescriptor(java.awt.Component.class.getMethod("validate", new Class[] {})); // NOI18N
            methods[METHOD_validate98].setDisplayName ( "" );
        }
        catch( Exception e) {}//GEN-HEADEREND:Methods
        // Here you can add code for customizing the methods array.

        return methods;     }//GEN-LAST:Methods

    private static java.awt.Image iconColor16 = null;//GEN-BEGIN:IconsDef
    private static java.awt.Image iconColor32 = null;
    private static java.awt.Image iconMono16 = null;
    private static java.awt.Image iconMono32 = null;//GEN-END:IconsDef
    private static String iconNameC16 = null;//GEN-BEGIN:Icons
    private static String iconNameC32 = null;
    private static String iconNameM16 = null;
    private static String iconNameM32 = null;//GEN-END:Icons

    private static final int defaultPropertyIndex = -1;//GEN-BEGIN:Idx
    private static final int defaultEventIndex = -1;//GEN-END:Idx


//GEN-FIRST:Superclass
    // Here you can add code for customizing the Superclass BeanInfo.

//GEN-LAST:Superclass
    /**
     * Gets the bean's <code>BeanDescriptor</code>s.
     *
     * @return BeanDescriptor describing the editable properties of this bean.
     * May return null if the information should be obtained by automatic
     * analysis.
     */
    @Override
    public BeanDescriptor getBeanDescriptor() {
        return getBdescriptor();
    }

    /**
     * Gets the bean's <code>PropertyDescriptor</code>s.
     *
     * @return An array of PropertyDescriptors describing the editable
     * properties supported by this bean. May return null if the information
     * should be obtained by automatic analysis.
     * <p>
     * If a property is indexed, then its entry in the result array will belong
     * to the IndexedPropertyDescriptor subclass of PropertyDescriptor. A client
     * of getPropertyDescriptors can use "instanceof" to check if a given
     * PropertyDescriptor is an IndexedPropertyDescriptor.
     */
    @Override
    public PropertyDescriptor[] getPropertyDescriptors() {
        return getPdescriptor();
    }

    /**
     * Gets the bean's <code>EventSetDescriptor</code>s.
     *
     * @return An array of EventSetDescriptors describing the kinds of events
     * fired by this bean. May return null if the information should be obtained
     * by automatic analysis.
     */
    @Override
    public EventSetDescriptor[] getEventSetDescriptors() {
        return getEdescriptor();
    }

    /**
     * Gets the bean's <code>MethodDescriptor</code>s.
     *
     * @return An array of MethodDescriptors describing the methods implemented
     * by this bean. May return null if the information should be obtained by
     * automatic analysis.
     */
    @Override
    public MethodDescriptor[] getMethodDescriptors() {
        return getMdescriptor();
    }

    /**
     * A bean may have a "default" property that is the property that will
     * mostly commonly be initially chosen for update by human's who are
     * customizing the bean.
     *
     * @return Index of default property in the PropertyDescriptor array
     * returned by getPropertyDescriptors.
     * <P>
     * Returns -1 if there is no default property.
     */
    @Override
    public int getDefaultPropertyIndex() {
        return defaultPropertyIndex;
    }

    /**
     * A bean may have a "default" event that is the event that will mostly
     * commonly be used by human's when using the bean.
     *
     * @return Index of default event in the EventSetDescriptor array returned
     * by getEventSetDescriptors.
     * <P>
     * Returns -1 if there is no default event.
     */
    @Override
    public int getDefaultEventIndex() {
        return defaultEventIndex;
    }

    /**
     * This method returns an image object that can be used to represent the
     * bean in toolboxes, toolbars, etc. Icon images will typically be GIFs, but
     * may in future include other formats.
     * <p>
     * Beans aren't required to provide icons and may return null from this
     * method.
     * <p>
     * There are four possible flavors of icons (16x16 color, 32x32 color, 16x16
     * mono, 32x32 mono). If a bean choses to only support a single icon we
     * recommend supporting 16x16 color.
     * <p>
     * We recommend that icons have a "transparent" background so they can be
     * rendered onto an existing background.
     *
     * @param iconKind The kind of icon requested. This should be one of the
     * constant values ICON_COLOR_16x16, ICON_COLOR_32x32, ICON_MONO_16x16, or
     * ICON_MONO_32x32.
     * @return An image object representing the requested icon. May return null
     * if no suitable icon is available.
     */
    @Override
    public java.awt.Image getIcon(int iconKind) {
        switch (iconKind) {
            case ICON_COLOR_16x16:
                if (iconNameC16 == null) {
                    return null;
                } else {
                    if (iconColor16 == null) {
                        iconColor16 = loadImage(iconNameC16);
                    }
                    return iconColor16;
                }
            case ICON_COLOR_32x32:
                if (iconNameC32 == null) {
                    return null;
                } else {
                    if (iconColor32 == null) {
                        iconColor32 = loadImage(iconNameC32);
                    }
                    return iconColor32;
                }
            case ICON_MONO_16x16:
                if (iconNameM16 == null) {
                    return null;
                } else {
                    if (iconMono16 == null) {
                        iconMono16 = loadImage(iconNameM16);
                    }
                    return iconMono16;
                }
            case ICON_MONO_32x32:
                if (iconNameM32 == null) {
                    return null;
                } else {
                    if (iconMono32 == null) {
                        iconMono32 = loadImage(iconNameM32);
                    }
                    return iconMono32;
                }
            default:
                return null;
        }
    }
    
}
