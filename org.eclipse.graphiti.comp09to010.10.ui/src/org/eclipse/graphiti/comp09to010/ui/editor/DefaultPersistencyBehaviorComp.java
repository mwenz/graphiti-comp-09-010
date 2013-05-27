package org.eclipse.graphiti.comp09to010.ui.editor;

import org.eclipse.graphiti.ui.editor.DefaultPersistencyBehavior;

public class DefaultPersistencyBehaviorComp extends DefaultPersistencyBehavior {

	protected DiagramEditorComp diagramEditor;
	
	public DefaultPersistencyBehaviorComp(DiagramEditorComp diagramEditor) {
		super(diagramEditor.getDiagramBehavior());
		this.diagramEditor = diagramEditor;
	}
}
