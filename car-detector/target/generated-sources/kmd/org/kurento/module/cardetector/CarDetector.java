/**
 * This file is generated with Kurento-maven-plugin.
 * Please don't edit.
 */
package org.kurento.module.cardetector;

import org.kurento.client.*;

/**
 *
 * CarDetector interface. Documentation about the module
 *
 **/
@org.kurento.client.internal.RemoteClass
public interface CarDetector extends OpenCVFilter {

/**
 *
 * Get Path of the XML file
 *
 **/
     String getPath();

/**
 *
 * Get Path of the XML file
 *
 **/
     void getPath(Continuation<String> cont);

/**
 *
 * Get Path of the XML file
 *
 **/
     TFuture<String> getPath(Transaction tx);

/**
 *
 * Set Path of the XML file
 *
 **/
     void setPath(@org.kurento.client.internal.server.Param("path") String path);

/**
 *
 * Set Path of the XML file
 *
 **/
     void setPath(@org.kurento.client.internal.server.Param("path") String path, Continuation<Void> cont);

/**
 *
 * Set Path of the XML file
 *
 **/
     void setPath(@org.kurento.client.internal.server.Param("path") String path, Transaction tx);
/**
 *
 * Get Identifier of the camera
 *
 **/
     String getIdCam();

/**
 *
 * Get Identifier of the camera
 *
 **/
     void getIdCam(Continuation<String> cont);

/**
 *
 * Get Identifier of the camera
 *
 **/
     TFuture<String> getIdCam(Transaction tx);

/**
 *
 * Set Identifier of the camera
 *
 **/
     void setIdCam(@org.kurento.client.internal.server.Param("idCam") String idCam);

/**
 *
 * Set Identifier of the camera
 *
 **/
     void setIdCam(@org.kurento.client.internal.server.Param("idCam") String idCam, Continuation<Void> cont);

/**
 *
 * Set Identifier of the camera
 *
 **/
     void setIdCam(@org.kurento.client.internal.server.Param("idCam") String idCam, Transaction tx);
/**
 *
 * Get Scale factor
 *
 **/
     double getScaleFactor();

/**
 *
 * Get Scale factor
 *
 **/
     void getScaleFactor(Continuation<Double> cont);

/**
 *
 * Get Scale factor
 *
 **/
     TFuture<Double> getScaleFactor(Transaction tx);

/**
 *
 * Set Scale factor
 *
 **/
     void setScaleFactor(@org.kurento.client.internal.server.Param("scaleFactor") double scaleFactor);

/**
 *
 * Set Scale factor
 *
 **/
     void setScaleFactor(@org.kurento.client.internal.server.Param("scaleFactor") double scaleFactor, Continuation<Void> cont);

/**
 *
 * Set Scale factor
 *
 **/
     void setScaleFactor(@org.kurento.client.internal.server.Param("scaleFactor") double scaleFactor, Transaction tx);
/**
 *
 * Get minNeighbors
 *
 **/
     int getMinNeighbors();

/**
 *
 * Get minNeighbors
 *
 **/
     void getMinNeighbors(Continuation<Integer> cont);

/**
 *
 * Get minNeighbors
 *
 **/
     TFuture<Integer> getMinNeighbors(Transaction tx);

/**
 *
 * Set minNeighbors
 *
 **/
     void setMinNeighbors(@org.kurento.client.internal.server.Param("minNeighbors") int minNeighbors);

/**
 *
 * Set minNeighbors
 *
 **/
     void setMinNeighbors(@org.kurento.client.internal.server.Param("minNeighbors") int minNeighbors, Continuation<Void> cont);

/**
 *
 * Set minNeighbors
 *
 **/
     void setMinNeighbors(@org.kurento.client.internal.server.Param("minNeighbors") int minNeighbors, Transaction tx);
/**
 *
 * Get width
 *
 **/
     int getWidth();

/**
 *
 * Get width
 *
 **/
     void getWidth(Continuation<Integer> cont);

/**
 *
 * Get width
 *
 **/
     TFuture<Integer> getWidth(Transaction tx);

/**
 *
 * Set width
 *
 **/
     void setWidth(@org.kurento.client.internal.server.Param("width") int width);

/**
 *
 * Set width
 *
 **/
     void setWidth(@org.kurento.client.internal.server.Param("width") int width, Continuation<Void> cont);

/**
 *
 * Set width
 *
 **/
     void setWidth(@org.kurento.client.internal.server.Param("width") int width, Transaction tx);
/**
 *
 * Get height
 *
 **/
     int getHeight();

/**
 *
 * Get height
 *
 **/
     void getHeight(Continuation<Integer> cont);

/**
 *
 * Get height
 *
 **/
     TFuture<Integer> getHeight(Transaction tx);

/**
 *
 * Set height
 *
 **/
     void setHeight(@org.kurento.client.internal.server.Param("height") int height);

/**
 *
 * Set height
 *
 **/
     void setHeight(@org.kurento.client.internal.server.Param("height") int height, Continuation<Void> cont);

/**
 *
 * Set height
 *
 **/
     void setHeight(@org.kurento.client.internal.server.Param("height") int height, Transaction tx);

    /**
     * Add a {@link EventListener} for event {@link CarsDetectedEvent}. Synchronous call.
     *
     * @param  listener Listener to be called on CarsDetectedEvent
     * @return ListenerSubscription for the given Listener
     *
     **/
    @org.kurento.client.internal.server.EventSubscription(CarsDetectedEvent.class)
    ListenerSubscription addCarsDetectedListener(EventListener<CarsDetectedEvent> listener);
    /**
     * Add a {@link EventListener} for event {@link CarsDetectedEvent}. Asynchronous call.
     * Calls Continuation&lt;ListenerSubscription&gt; when it has been added.
     *
     * @param listener Listener to be called on CarsDetectedEvent
     * @param cont     Continuation to be called when the listener is registered
     *
     **/
    @org.kurento.client.internal.server.EventSubscription(CarsDetectedEvent.class)
    void addCarsDetectedListener(EventListener<CarsDetectedEvent> listener, Continuation<ListenerSubscription> cont);
    
	/**
     * Remove a {@link ListenerSubscription} for event {@link CarsDetectedEvent}. Synchronous call.
     *
     * @param listenerSubscription Listener subscription to be removed
     *
     **/
    @org.kurento.client.internal.server.EventSubscription(CarsDetectedEvent.class)
    void removeCarsDetectedListener(ListenerSubscription listenerSubscription);
    /**
     * Remove a {@link ListenerSubscription} for event {@link CarsDetectedEvent}. Asynchronous call.
     * Calls Continuation&lt;Void&gt; when it has been removed.
     *
     * @param listenerSubscription Listener subscription to be removed
     * @param cont                 Continuation to be called when the listener is removed
     *
     **/
    @org.kurento.client.internal.server.EventSubscription(CarsDetectedEvent.class)
    void removeCarsDetectedListener(ListenerSubscription listenerSubscription, Continuation<Void> cont);
    



    public class Builder extends AbstractBuilder<CarDetector> {

/**
 *
 * Creates a Builder for CarDetector
 *
 **/
    public Builder(org.kurento.client.MediaPipeline mediaPipeline, String path, String idCam, double scaleFactor, int minNeighbors, int width, int height){

      super(CarDetector.class,mediaPipeline);

      props.add("mediaPipeline",mediaPipeline);
      props.add("path",path);
      props.add("idCam",idCam);
      props.add("scaleFactor",scaleFactor);
      props.add("minNeighbors",minNeighbors);
      props.add("width",width);
      props.add("height",height);
    }

	public Builder withProperties(Properties properties) {
    	return (Builder)super.withProperties(properties);
  	}

	public Builder with(String name, Object value) {
		return (Builder)super.with(name, value);
	}
	
    }


}