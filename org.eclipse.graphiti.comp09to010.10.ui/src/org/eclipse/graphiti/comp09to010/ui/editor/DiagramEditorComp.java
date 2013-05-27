package org.eclipse.graphiti.comp09to010.ui.editor;

import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.gef.GraphicalEditPart;
import org.eclipse.graphiti.comp09to010.platform.IDiagramEditorComp;
import org.eclipse.graphiti.comp09to010.ui.editor.internal.DiagramBehaviorComp;
import org.eclipse.graphiti.features.IFeature;
import org.eclipse.graphiti.features.context.IContext;
import org.eclipse.graphiti.mm.pictograms.PictogramElement;
import org.eclipse.graphiti.ui.editor.DefaultPersistencyBehavior;
import org.eclipse.graphiti.ui.editor.DiagramBehavior;
import org.eclipse.graphiti.ui.editor.DiagramEditor;

public class DiagramEditorComp extends DiagramEditor implements IDiagramEditorComp {

	public DiagramEditorComp() {
		super();
	}

	@Override
	protected DiagramBehavior createDiagramBehavior() {
		return new DiagramBehaviorComp(this);
	}
	
	protected DefaultPersistencyBehavior createPersistencyBehavior() {
		return ((DiagramBehaviorComp)getDiagramBehavior()).createPersistencyBehavior();
	}
	
	protected void migrateDiagramModelIfNecessary() {
		((DiagramBehaviorComp)getDiagramBehavior()).migrateDiagramModelIfNecessary();
	}
	
	public Object executeFeature(IFeature feature, IContext context) {
		return ((DiagramBehaviorComp)getDiagramBehavior()).executeFeature(feature, context);
	}
	
	public GraphicalEditPart getEditPartForPictogramElement(PictogramElement pe) {
		return ((DiagramBehaviorComp)getDiagramBehavior()).getEditPartForPictogramElement(pe);
	}

	@Override
	public ResourceSet getResourceSet() {
		return getDiagramBehavior().getResourceSet();
	}
	
	public double getZoomLevel() {
		return getDiagramBehavior().getZoomLevel();
	}

	@Override
	public void refresh() {
		getDiagramBehavior().refresh();
	}
}
