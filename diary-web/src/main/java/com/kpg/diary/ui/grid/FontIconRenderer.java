package com.kpg.diary.ui.grid;

import com.google.gwt.user.client.ui.Button;
import com.vaadin.client.renderers.ButtonRenderer;
import com.vaadin.client.widget.grid.RendererCellReference;
import com.vaadin.ui.themes.ValoTheme;

public class FontIconRenderer extends ButtonRenderer {
    /**
     * 
     */
    private static final long serialVersionUID = -4020451471687711409L;

    @Override
    public void render(RendererCellReference cell, String text, Button button) {
	if (text != null)
	    button.setHTML(text);
	// this is to allow the button to disappear, if the text is null
	button.setVisible(text != null);
	button.setStyleName(ValoTheme.BUTTON_PRIMARY);
    }

}
