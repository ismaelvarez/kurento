/**
 * This file is generated with Kurento-maven-plugin.
 * Please don't edit.
 */
package org.kurento.module.recordermodule;

import org.kurento.client.*;

/**
 *
 * Save frames into the filesystem.
 *
 **/
@org.kurento.client.internal.RemoteClass
public interface RecorderModule extends OpenCVFilter {

/**
 *
 * Get Path to the filesystem
 *
 **/
     String getPath();

/**
 *
 * Get Path to the filesystem
 *
 **/
     void getPath(Continuation<String> cont);

/**
 *
 * Get Path to the filesystem
 *
 **/
     TFuture<String> getPath(Transaction tx);

/**
 *
 * Set Path to the filesystem
 *
 **/
     void setPath(@org.kurento.client.internal.server.Param("path") String path);

/**
 *
 * Set Path to the filesystem
 *
 **/
     void setPath(@org.kurento.client.internal.server.Param("path") String path, Continuation<Void> cont);

/**
 *
 * Set Path to the filesystem
 *
 **/
     void setPath(@org.kurento.client.internal.server.Param("path") String path, Transaction tx);
/**
 *
 * Get Name of the file without extension
 *
 **/
     String getFilename();

/**
 *
 * Get Name of the file without extension
 *
 **/
     void getFilename(Continuation<String> cont);

/**
 *
 * Get Name of the file without extension
 *
 **/
     TFuture<String> getFilename(Transaction tx);

/**
 *
 * Set Name of the file without extension
 *
 **/
     void setFilename(@org.kurento.client.internal.server.Param("filename") String filename);

/**
 *
 * Set Name of the file without extension
 *
 **/
     void setFilename(@org.kurento.client.internal.server.Param("filename") String filename, Continuation<Void> cont);

/**
 *
 * Set Name of the file without extension
 *
 **/
     void setFilename(@org.kurento.client.internal.server.Param("filename") String filename, Transaction tx);

    /**
     * Add a {@link EventListener} for event {@link RecorderModuleFrameSavedEvent}. Synchronous call.
     *
     * @param  listener Listener to be called on RecorderModuleFrameSavedEvent
     * @return ListenerSubscription for the given Listener
     *
     **/
    @org.kurento.client.internal.server.EventSubscription(RecorderModuleFrameSavedEvent.class)
    ListenerSubscription addRecorderModuleFrameSavedListener(EventListener<RecorderModuleFrameSavedEvent> listener);
    /**
     * Add a {@link EventListener} for event {@link RecorderModuleFrameSavedEvent}. Asynchronous call.
     * Calls Continuation&lt;ListenerSubscription&gt; when it has been added.
     *
     * @param listener Listener to be called on RecorderModuleFrameSavedEvent
     * @param cont     Continuation to be called when the listener is registered
     *
     **/
    @org.kurento.client.internal.server.EventSubscription(RecorderModuleFrameSavedEvent.class)
    void addRecorderModuleFrameSavedListener(EventListener<RecorderModuleFrameSavedEvent> listener, Continuation<ListenerSubscription> cont);
    
	/**
     * Remove a {@link ListenerSubscription} for event {@link RecorderModuleFrameSavedEvent}. Synchronous call.
     *
     * @param listenerSubscription Listener subscription to be removed
     *
     **/
    @org.kurento.client.internal.server.EventSubscription(RecorderModuleFrameSavedEvent.class)
    void removeRecorderModuleFrameSavedListener(ListenerSubscription listenerSubscription);
    /**
     * Remove a {@link ListenerSubscription} for event {@link RecorderModuleFrameSavedEvent}. Asynchronous call.
     * Calls Continuation&lt;Void&gt; when it has been removed.
     *
     * @param listenerSubscription Listener subscription to be removed
     * @param cont                 Continuation to be called when the listener is removed
     *
     **/
    @org.kurento.client.internal.server.EventSubscription(RecorderModuleFrameSavedEvent.class)
    void removeRecorderModuleFrameSavedListener(ListenerSubscription listenerSubscription, Continuation<Void> cont);
    



    public class Builder extends AbstractBuilder<RecorderModule> {

/**
 *
 * Creates a Builder for RecorderModule
 *
 **/
    public Builder(org.kurento.client.MediaPipeline mediaPipeline, String path, String filename){

      super(RecorderModule.class,mediaPipeline);

      props.add("mediaPipeline",mediaPipeline);
      props.add("path",path);
      props.add("filename",filename);
    }

	public Builder withProperties(Properties properties) {
    	return (Builder)super.withProperties(properties);
  	}

	public Builder with(String name, Object value) {
		return (Builder)super.with(name, value);
	}
	
    }


}