/*
 * generated by Xtext 2.25.0
 */
package fr.ensma.ui;

import org.eclipse.ui.plugin.AbstractUIPlugin;
import org.eclipse.xtext.builder.IXtextBuilderParticipant;

/**
 * Use this class to register components to be used within the Eclipse IDE.
 */
public class GimpleDslUiModule extends AbstractGimpleDslUiModule {

	public GimpleDslUiModule(AbstractUIPlugin plugin) {
		super(plugin);
	}
	
	 @Override
	    public Class<? extends IXtextBuilderParticipant> bindIXtextBuilderParticipant() {
	        return GimpleBuilderParticipant.class;
	    }
	
	
}
