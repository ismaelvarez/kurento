/**
 * This file is generated with Kurento ktool-rom-processor.
 * Please don't edit. Changes should go to kms-interface-rom and
 * ktool-rom-processor templates.
 */
package org.kurento.module.cardetector;

import org.kurento.client.*;

/**
 *
 * Event raise when cars are detected
 *
 **/
public class CarsDetectedEvent extends MediaEvent {

/**
 *
 * Num of cars detected
 *
 **/
	private int carsDetected;
/**
 *
 * Identifier of the camera
 *
 **/
	private String idCam;

/**
 *
 * Event raise when cars are detected
 *
 * @param source
 *       Object that raised the event
 * @param timestamp
 *       [DEPRECATED: Use timestampMillis] The timestamp associated with this object: Seconds elapsed since the UNIX Epoch (Jan 1, 1970, UTC).
 * @param timestampMillis
 *       The timestamp associated with this event: Milliseconds elapsed since the UNIX Epoch (Jan 1, 1970, UTC).
 * @param tags
 *       
 * @param type
 *       Type of event that was raised
 * @param carsDetected
 *       Num of cars detected
 * @param idCam
 *       Identifier of the camera
 *
 **/
  public CarsDetectedEvent(@org.kurento.client.internal.server.Param("source") org.kurento.client.MediaObject source, @org.kurento.client.internal.server.Param("timestamp") String timestamp, @org.kurento.client.internal.server.Param("timestampMillis") String timestampMillis, @org.kurento.client.internal.server.Param("tags") java.util.List<org.kurento.client.Tag> tags, @org.kurento.client.internal.server.Param("type") String type, @org.kurento.client.internal.server.Param("carsDetected") int carsDetected, @org.kurento.client.internal.server.Param("idCam") String idCam) {
    super(source, timestamp, timestampMillis, tags, type);
    this.carsDetected = carsDetected;
    this.idCam = idCam;
  }

/**
 *
 * Getter for the carsDetected property
 * @return Num of cars detected *
 **/
	public int getCarsDetected() {
		return carsDetected;
	}

/**
 *
 * Setter for the carsDetected property
 *
 * @param carsDetected
 *       Num of cars detected
 *
 **/
	public void setCarsDetected(int carsDetected) {
		this.carsDetected = carsDetected;
	}

/**
 *
 * Getter for the idCam property
 * @return Identifier of the camera *
 **/
	public String getIdCam() {
		return idCam;
	}

/**
 *
 * Setter for the idCam property
 *
 * @param idCam
 *       Identifier of the camera
 *
 **/
	public void setIdCam(String idCam) {
		this.idCam = idCam;
	}

}
