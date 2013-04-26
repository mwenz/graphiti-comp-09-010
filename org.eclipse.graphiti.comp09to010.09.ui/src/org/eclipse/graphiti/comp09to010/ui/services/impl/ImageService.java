package org.eclipse.graphiti.comp09to010.ui.services.impl;

import org.eclipse.graphiti.ui.services.GraphitiUi;
import org.eclipse.jface.resource.ImageDescriptor;

public class ImageService {

	public ImageDescriptor getImageDescriptorForId(String providerId, String imageId) {
		return GraphitiUi.getImageService().getImageDescriptorForId(imageId);
	}
}
