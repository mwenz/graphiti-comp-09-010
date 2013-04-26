package org.eclipse.graphiti.comp09to010.ui.editor;

import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.geometry.Point;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.gef.ContextMenuProvider;
import org.eclipse.gef.DefaultEditDomain;
import org.eclipse.gef.EditPart;
import org.eclipse.gef.GraphicalEditPart;
import org.eclipse.gef.KeyHandler;
import org.eclipse.gef.editparts.ZoomManager;
import org.eclipse.graphiti.dt.IDiagramTypeProvider;
import org.eclipse.graphiti.features.IFeature;
import org.eclipse.graphiti.features.context.IContext;
import org.eclipse.graphiti.mm.pictograms.PictogramElement;
import org.eclipse.graphiti.ui.editor.DefaultMarkerBehavior;
import org.eclipse.graphiti.ui.editor.DefaultPaletteBehavior;
import org.eclipse.graphiti.ui.editor.DefaultPersistencyBehavior;
import org.eclipse.graphiti.ui.editor.DefaultRefreshBehavior;
import org.eclipse.graphiti.ui.editor.DefaultUpdateBehavior;
import org.eclipse.graphiti.ui.editor.IDiagramEditorInput;
import org.eclipse.graphiti.ui.internal.config.IConfigurationProvider;
import org.eclipse.jface.action.IAction;
import org.eclipse.swt.widgets.Composite;

public class DiagramBehavior implements IDiagramBehaviorUI {

	private DiagramEditor diagramEditor;

	public DiagramBehavior(IDiagramContainerUI diagramContainer) {
		super();
		this.diagramEditor = (DiagramEditor) diagramContainer;
	}

	public IDiagramContainerUI getDiagramContainer() {
		return diagramEditor;
	}

	protected DefaultMarkerBehavior createMarkerBehavior() {
		return diagramEditor.createMarkerBehavior();
	}

	protected DefaultUpdateBehavior createUpdateBehavior() {
		return diagramEditor.createUpdateBehavior();
	}

	public DefaultUpdateBehavior getUpdateBehavior() {
		return diagramEditor.getUpdateBehavior();
	}

	protected DefaultPaletteBehavior createPaletteBehaviour() {
		return diagramEditor.createPaletteBehaviour();
	}

	protected DefaultPersistencyBehavior createPersistencyBehavior() {
		return diagramEditor.createPersistencyBehavior();
	}

	protected DefaultRefreshBehavior createRefreshBehavior() {
		return diagramEditor.createRefreshBehavior();
	}

	protected void initDefaultBehaviors() {
		// TODO
	}

	protected void setInput(IDiagramEditorInput input) {
		// ok, do nothing
	}

	protected void createGraphicalViewer(Composite parent) {
		diagramEditor.createGraphicalViewer(parent);
	}

	protected void configureGraphicalViewer() {
		diagramEditor.configureGraphicalViewer();
	}

	protected void initializeGraphicalViewer() {
		diagramEditor.initializeGraphicalViewer();
	}

	protected boolean isDirty() {
		return diagramEditor.isDirty();
	}

	public void refresh() {
		diagramEditor.refresh();
	}

	public void refreshPalette() {
		diagramEditor.refreshPalette();
	}

	public void refreshContent() {
		diagramEditor.refreshContent();
	}
	
	public void refreshRenderingDecorators(PictogramElement pe) {
		diagramEditor.refreshRenderingDecorators(pe);
	}

	protected void selectPictogramElements(PictogramElement[] pictogramElements) {
		diagramEditor.selectPictogramElements(pictogramElements);
	}

	public PictogramElement[] getSelectedPictogramElements() {
		return diagramEditor.getSelectedPictogramElements();
	}

	public void setPictogramElementForSelection(
			PictogramElement pictogramElement) {
		diagramEditor.setPictogramElementForSelection(pictogramElement);
	}

	protected void setPictogramElementsForSelection(
			PictogramElement[] pictogramElements) {
		diagramEditor.setPictogramElementsForSelection(pictogramElements);
	}

	public void selectBufferedPictogramElements() {
		diagramEditor.selectBufferedPictogramElements();
	}

	protected PictogramElement[] getPictogramElementsForSelection() {
		return diagramEditor.getPictogramElementsForSelection();
	}

	public TransactionalEditingDomain getEditingDomain() {
		return diagramEditor.getEditingDomain();
	}

	public ResourceSet getResourceSet() {
		return diagramEditor.getResourceSet();
	}

	public IDiagramTypeProvider getDiagramTypeProvider() {
		return diagramEditor.getDiagramTypeProvider();
	}

	public Object executeFeature(IFeature feature, IContext context) {
		return diagramEditor.executeFeature(feature, context);
	}

	protected void disableAdapters() {
		diagramEditor.disableAdapters();
	}

	protected void enableAdapters() {
		diagramEditor.enableAdapters();
	}

	public boolean isAlive() {
		return diagramEditor.isAlive();
	}

	protected void editingDomainInitialized() {
		diagramEditor.editingDomainInitialized();
	}

	public Object getAdapter(Class type) {
		return diagramEditor.getAdapter(type);
	}

	protected IConfigurationProvider getConfigurationProvider() {
		return diagramEditor.getConfigurationProvider();
	}

	public EditPart getContentEditPart() {
		return diagramEditor.getContentEditPart();
	}

	public GraphicalEditPart getEditPartForPictogramElement(PictogramElement pe) {
		return diagramEditor.getEditPartForPictogramElement(pe);
	}

	public Point getMouseLocation() {
		return diagramEditor.getMouseLocation();
	}

	public Point calculateRealMouseLocation(Point nativeLocation) {
		return diagramEditor.calculateRealMouseLocation(nativeLocation);
	}

	public boolean isDirectEditingActive() {
		return diagramEditor.isDirectEditingActive();
	}

	public void setDirectEditingActive(boolean directEditingActive) {
		diagramEditor.setDirectEditingActive(directEditingActive);
	}

	public double getZoomLevel() {
		return diagramEditor.getZoomLevel();
	}

	public IFigure getFigureForPictogramElement(PictogramElement pe) {
		return diagramEditor.getFigureForPictogramElement(pe);
	}

	protected ContextMenuProvider createContextMenuProvider() {
		return diagramEditor.createContextMenuProvider();
	}

	protected boolean shouldRegisterContextMenu() {
		return diagramEditor.shouldRegisterContextMenu();
	}

	protected void registerAction(IAction action) {
		diagramEditor.registerAction(action);
	}

	protected void initActionRegistry(ZoomManager zoomManager) {
		diagramEditor.initActionRegistry(zoomManager);
	}

	protected KeyHandler getCommonKeyHandler() {
		return diagramEditor.getCommonKeyHandler();
	}

	protected void unregisterDiagramResourceSetListener() {
		diagramEditor.unregisterDiagramResourceSetListener();
	}

	protected void unregisterBusinessObjectsListener() {
		diagramEditor.unregisterBusinessObjectsListener();
	}

	protected void registerDiagramResourceSetListener() {
		diagramEditor.registerDiagramResourceSetListener();
	}

	protected void registerBusinessObjectsListener() {
		diagramEditor.registerBusinessObjectsListener();
	}

	protected void disposeBeforeGefDispose() {
		diagramEditor.dispose();
	}

	protected void disposeAfterGefDispose() {
		// ok, nothing to do
	}

	protected void migrateDiagramModelIfNecessary() {
		diagramEditor.migrateDiagramModelIfNecessary();
	}

	public DefaultEditDomain getEditDomain() {
		return diagramEditor.getEditDomain();
	}
}
