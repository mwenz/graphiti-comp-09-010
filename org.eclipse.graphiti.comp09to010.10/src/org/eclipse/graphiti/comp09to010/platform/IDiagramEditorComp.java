package org.eclipse.graphiti.comp09to010.platform;

import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.graphiti.platform.IDiagramEditor;

public interface IDiagramEditorComp extends IDiagramEditor {

	public ResourceSet getResourceSet();
	
	public void refresh();
}
