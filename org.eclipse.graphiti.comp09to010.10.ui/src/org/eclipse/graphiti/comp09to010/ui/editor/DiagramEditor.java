package org.eclipse.graphiti.comp09to010.ui.editor;

public class DiagramEditor extends org.eclipse.graphiti.ui.editor.DiagramEditor implements IDiagramContainerUI {

	public DiagramEditor() {
		super();
	}

	@Override
	protected DiagramBehavior createDiagramBehavior() {
		return new DiagramBehavior(this);
	}
}
