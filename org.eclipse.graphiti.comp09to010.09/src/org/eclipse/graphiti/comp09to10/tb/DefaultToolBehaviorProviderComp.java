package org.eclipse.graphiti.comp09to10.tb;

import org.eclipse.graphiti.comp09to10.tb.internal.SelectionInfoImplComp;
import org.eclipse.graphiti.dt.IDiagramTypeProvider;
import org.eclipse.graphiti.mm.pictograms.Shape;
import org.eclipse.graphiti.tb.DefaultToolBehaviorProvider;
import org.eclipse.graphiti.tb.ISelectionInfo;

public class DefaultToolBehaviorProviderComp extends
		DefaultToolBehaviorProvider {

	public DefaultToolBehaviorProviderComp(
			IDiagramTypeProvider diagramTypeProvider) {
		super(diagramTypeProvider);
	}

	@Override
	public ISelectionInfoComp getSelectionInfoForShape(Shape shape) {
		ISelectionInfo selectionInfo = super.getSelectionInfoForShape(shape);
		
		SelectionInfoImplComp selectionInfoImplComp = new SelectionInfoImplComp();
		selectionInfoImplComp.setColor(selectionInfo.getColor());
		selectionInfoImplComp.setHandleBackgroundColor(selectionInfo.getHandleBackgroundColor());
		selectionInfoImplComp.setHandleForegroundColor(selectionInfo.getHandleForegroundColor());
		selectionInfoImplComp.setHoverColor(selectionInfo.getHoverColor());
		selectionInfoImplComp.setHoverColorParentSelected(selectionInfo.getHoverColorParentSelected());
		selectionInfoImplComp.setLineStyle(selectionInfo.getLineStyle());
		selectionInfoImplComp.setPrimarySelectionBackgroundColor(selectionInfo.getPrimarySelectionBackGroundColor());
		selectionInfoImplComp.setSecondarySelectionBackgroundColor(selectionInfo.getSecondarySelectionBackGroundColor());
		
		return selectionInfoImplComp;
	}
}
