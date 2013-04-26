package org.eclipse.graphiti.comp09to010.ui.editor;

import java.util.EventObject;
import java.util.List;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.gef.ContextMenuProvider;
import org.eclipse.gef.DefaultEditDomain;
import org.eclipse.gef.GraphicalViewer;
import org.eclipse.gef.KeyHandler;
import org.eclipse.gef.editparts.ZoomManager;
import org.eclipse.gef.ui.actions.ActionRegistry;
import org.eclipse.graphiti.dt.IDiagramTypeProvider;
import org.eclipse.graphiti.mm.pictograms.PictogramElement;
import org.eclipse.graphiti.ui.editor.DefaultMarkerBehavior;
import org.eclipse.graphiti.ui.editor.DefaultPaletteBehavior;
import org.eclipse.graphiti.ui.editor.DefaultPersistencyBehavior;
import org.eclipse.graphiti.ui.editor.DefaultRefreshBehavior;
import org.eclipse.graphiti.ui.editor.DefaultUpdateBehavior;
import org.eclipse.graphiti.ui.editor.DiagramEditorInput;
import org.eclipse.graphiti.ui.editor.IDiagramEditorInput;
import org.eclipse.graphiti.ui.internal.config.IConfigurationProvider;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.ui.IEditorInput;
import org.eclipse.ui.IEditorSite;
import org.eclipse.ui.IWorkbenchPart;
import org.eclipse.ui.PartInitException;

public class DiagramEditor extends org.eclipse.graphiti.ui.editor.DiagramEditor implements IDiagramContainerUI {

	DiagramBehavior diagramBehavior = null;
	
	public DiagramEditor() {
		super();
	}


	protected DiagramBehavior createDiagramBehavior() {
		return new DiagramBehavior(this);
	}

	@Override
	public DiagramBehavior getDiagramBehavior() {
		return diagramBehavior;
	}

	@Override
	public void init(IEditorSite site, IEditorInput input)
			throws PartInitException {
		super.init(site, input);
		diagramBehavior = createDiagramBehavior();
	}

	@Override
	protected DiagramEditorInput convertToDiagramEditorInput(IEditorInput input)
			throws PartInitException {
		return super.convertToDiagramEditorInput(input);
	}

	@Override
	protected void setInput(IEditorInput input) {
		super.setInput(input);
	}

	@Override
	public void createPartControl(Composite parent) {
		super.createPartControl(parent);
	}

	@Override
	protected void createGraphicalViewer(Composite parent) {
		super.createGraphicalViewer(parent);
	}

	@Override
	public void initializeGraphicalViewer() {
		super.initializeGraphicalViewer();
	}

	@Override
	protected void configureGraphicalViewer() {
		super.configureGraphicalViewer();
	}

	@Override
	public void updateDirtyState() {
		super.updateDirtyState();
	}

	@Override
	public void doSave(IProgressMonitor monitor) {
		super.doSave(monitor);
	}

	@Override
	public boolean isDirty() {
		return super.isDirty();
	}

	@Override
	public void refreshTitle() {
		super.refreshTitle();
	}

	@Override
	public void refreshTitleToolTip() {
		super.refreshTitleToolTip();
	}

	@Override
	public Object getAdapter(Class type) {
		return super.getAdapter(type);
	}

	@Override
	public void dispose() {
		super.dispose();
	}

	@Override
	public void setFocus() {
		super.setFocus();
	}

	@Override
	public PictogramElement[] getSelectedPictogramElements() {
		return super.getSelectedPictogramElements();
	}

	@Override
	public void selectionChanged(IWorkbenchPart part, ISelection selection) {
		super.selectionChanged(part, selection);
	}

	@Override
	public void selectPictogramElements(PictogramElement[] pictogramElements) {
		super.selectPictogramElements(pictogramElements);
	}

	@Override
	public void setPictogramElementForSelection(
			PictogramElement pictogramElement) {
		super.setPictogramElementForSelection(pictogramElement);
	}

	@Override
	public void setPictogramElementsForSelection(
			PictogramElement[] pictogramElements) {
		super.setPictogramElementsForSelection(pictogramElements);
	}

	@Override
	public String getContributorId() {
		return super.getContributorId();
	}

	@Override
	public IDiagramTypeProvider getDiagramTypeProvider() {
		return super.getDiagramTypeProvider();
	}

	@Override
	public DefaultEditDomain getEditDomain() {
		return super.getEditDomain();
	}

	@Override
	public GraphicalViewer getGraphicalViewer() {
		return super.getGraphicalViewer();
	}

	@Override
	public String getTitleToolTip() {
		return super.getTitleToolTip();
	}

	@Override
	public TransactionalEditingDomain getEditingDomain() {
		return super.getEditingDomain();
	}

	@Override
	public IDiagramEditorInput getDiagramEditorInput() {
		return (IDiagramEditorInput) super.getEditorInput();
	}

	@Override
	public IWorkbenchPart getWorkbenchPart() {
		return getWorkbenchPart();
	}

	@Override
	public void close() {
		close();
	}

	@Override
	public void setEditDomain(DefaultEditDomain editDomain) {
		super.setEditDomain(editDomain);
	}

	@Override
	public ActionRegistry getActionRegistry() {
		return super.getActionRegistry();
	}

	@Override
	public List getSelectionActions() {
		return super.getSelectionActions();
	}

	@Override
	public void commandStackChanged(EventObject event) {
		super.commandStackChanged(event);
	}

	@Override
	public void setGraphicalViewer(GraphicalViewer viewer) {
		super.setGraphicalViewer(viewer);
	}

	@Override
	public void hookGraphicalViewer() {
		super.hookGraphicalViewer();
	}
	
	/*
	 * Added additional methods that simply delegate to super class and are needed for access from behavior
	 */
	
	@Override
	public DefaultMarkerBehavior createMarkerBehavior() {
		// simply visibility
		return super.createMarkerBehavior();
	}
	
	@Override
	public DefaultUpdateBehavior createUpdateBehavior() {
		// simply visibility
		return super.createUpdateBehavior();
	}
	
	@Override
	public DefaultPaletteBehavior createPaletteBehaviour() {
		// simply visibility
		return super.createPaletteBehaviour();
	}
	
	@Override
	public DefaultPersistencyBehavior createPersistencyBehavior() {
		// simply visibility
		return super.createPersistencyBehavior();
	}
	
	@Override
	public DefaultRefreshBehavior createRefreshBehavior() {
		// simply visibility
		return super.createRefreshBehavior();
	}

	@Override
	public PictogramElement[] getPictogramElementsForSelection() {
		// simply visibility
		return super.getPictogramElementsForSelection();
	}
	
	@Override
	public IConfigurationProvider getConfigurationProvider() {
		// simply visibility
		return super.getConfigurationProvider();
	}
	
	@Override
	public ContextMenuProvider createContextMenuProvider() {
		// simply visibility
		return super.createContextMenuProvider();
	}
	
	@Override
	public boolean shouldRegisterContextMenu() {
		// simply visibility
		return super.shouldRegisterContextMenu();
	}
	
	@Override
	public void registerAction(IAction action) {
		// simply visibility
		super.registerAction(action);
	}
	
	@Override
	public void initActionRegistry(ZoomManager zoomManager) {
		// simply visibility
		super.initActionRegistry(zoomManager);
	}
	
	@Override
	public KeyHandler getCommonKeyHandler() {
		// simply visibility
		return super.getCommonKeyHandler();
	}
	
	@Override
	public void unregisterDiagramResourceSetListener() {
		// simply visibility
		super.unregisterDiagramResourceSetListener();
	}
	
	@Override
	public void unregisterBusinessObjectsListener() {
		// simply visibility
		super.unregisterBusinessObjectsListener();
	}
	
	@Override
	public void registerDiagramResourceSetListener() {
		// simply visibility
		super.registerDiagramResourceSetListener();
	}
	
	@Override
	public void registerBusinessObjectsListener() {
		// simply visibility
		super.registerBusinessObjectsListener();
	}
	
	@Override
	public void migrateDiagramModelIfNecessary() {
		// simply visibility
		super.migrateDiagramModelIfNecessary();
	}
}
