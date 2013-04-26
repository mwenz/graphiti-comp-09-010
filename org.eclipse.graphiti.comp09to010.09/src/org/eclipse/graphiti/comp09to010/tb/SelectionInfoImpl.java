package org.eclipse.graphiti.comp09to010.tb;

import org.eclipse.graphiti.mm.algorithms.styles.LineStyle;
import org.eclipse.graphiti.util.IColorConstant;


public class SelectionInfoImpl extends org.eclipse.graphiti.tb.SelectionInfoImpl {

	public SelectionInfoImpl() {
		super();
	}

	public SelectionInfoImpl(IColorConstant color, IColorConstant handleForegroundColor, IColorConstant handleBackgroundColor,
			LineStyle lineStyle) {
		super(color, handleForegroundColor, handleBackgroundColor, lineStyle);
	}
	
	public SelectionInfoImpl(IColorConstant color, IColorConstant handleForegroundColor, IColorConstant handleBackgroundColor,
			IColorConstant hoverColor, LineStyle lineStyle) {
		super(color, handleForegroundColor, handleBackgroundColor, hoverColor, lineStyle);
	}
}
