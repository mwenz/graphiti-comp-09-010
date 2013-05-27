package org.eclipse.graphiti.comp09to10.tb;

import org.eclipse.graphiti.comp09to10.tb.internal.SelectionInfoImplComp;
import org.eclipse.graphiti.dt.IDiagramTypeProvider;
import org.eclipse.graphiti.mm.pictograms.Shape;
import org.eclipse.graphiti.tb.DefaultToolBehaviorProvider;
import org.eclipse.graphiti.tb.IShapeSelectionInfo;

public class DefaultToolBehaviorProviderComp extends
		DefaultToolBehaviorProvider {

	public DefaultToolBehaviorProviderComp(
			IDiagramTypeProvider diagramTypeProvider) {
		super(diagramTypeProvider);
	}

	@Override
	public ISelectionInfoComp getSelectionInfoForShape(Shape shape) {
		IShapeSelectionInfo selectionInfoForShape = super.getSelectionInfoForShape(shape);
		
		SelectionInfoImplComp selectionInfoImplComp = new SelectionInfoImplComp();
		selectionInfoImplComp.setColor(selectionInfoForShape.getColor());
		selectionInfoImplComp.setHoverColor(selectionInfoForShape.getHoverColor());
		selectionInfoImplComp.setHoverColorParentSelected(selectionInfoForShape.getHoverColorParentSelected());
		selectionInfoImplComp.setLineStyle(selectionInfoForShape.getLineStyle());
		
		return selectionInfoImplComp;
	}
}
