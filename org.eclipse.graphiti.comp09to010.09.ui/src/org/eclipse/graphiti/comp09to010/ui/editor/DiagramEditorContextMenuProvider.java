package org.eclipse.graphiti.comp09to010.ui.editor;

import org.eclipse.gef.EditPartViewer;
import org.eclipse.gef.ui.actions.ActionRegistry;
import org.eclipse.graphiti.ui.internal.config.IConfigurationProvider;

public class DiagramEditorContextMenuProvider extends
		org.eclipse.graphiti.ui.editor.DiagramEditorContextMenuProvider {

	public DiagramEditorContextMenuProvider(EditPartViewer viewer,
			ActionRegistry registry,
			IConfigurationProvider configurationProvider) {
		super(viewer, registry, configurationProvider.getDiagramTypeProvider());
	}
}
