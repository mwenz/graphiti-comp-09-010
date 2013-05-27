package org.eclipse.graphiti.comp09to010.ui.editor.internal;

import org.eclipse.graphiti.ui.editor.DefaultPersistencyBehavior;
import org.eclipse.graphiti.ui.editor.DiagramBehavior;
import org.eclipse.graphiti.ui.editor.IDiagramContainerUI;

public class DiagramBehaviorComp extends DiagramBehavior {

	public DiagramBehaviorComp(IDiagramContainerUI diagramContainer) {
		super(diagramContainer);
	}

	/*
	 * Just a public re-write
	 * (non-Javadoc)
	 * @see org.eclipse.graphiti.ui.editor.DiagramBehavior#createPersistencyBehavior()
	 */
	@Override
	public DefaultPersistencyBehavior createPersistencyBehavior() {
		return super.createPersistencyBehavior();
	}
	
	/*
	 * Just a public re-write
	 * (non-Javadoc)
	 * @see org.eclipse.graphiti.ui.editor.DiagramBehavior#migrateDiagramModelIfNecessary()
	 */
	@Override
	public void migrateDiagramModelIfNecessary() {
		super.migrateDiagramModelIfNecessary();
	}
}
