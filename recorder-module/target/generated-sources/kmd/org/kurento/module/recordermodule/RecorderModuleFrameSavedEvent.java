/**
 * This file is generated with Kurento ktool-rom-processor.
 * Please don't edit. Changes should go to kms-interface-rom and
 * ktool-rom-processor templates.
 */
package org.kurento.module.recordermodule;

import org.kurento.client.*;

/**
 *
 * Event raise when a frame is saved
 *
 **/
public class RecorderModuleFrameSavedEvent extends MediaEvent {

/**
 *
 * Path of the file
 *
 **/
	private String pathToFile;

/**
 *
 * Event raise when a frame is saved
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
 * @param pathToFile
 *       Path of the file
 *
 **/
  public RecorderModuleFrameSavedEvent(@org.kurento.client.internal.server.Param("source") org.kurento.client.MediaObject source, @org.kurento.client.internal.server.Param("timestamp") String timestamp, @org.kurento.client.internal.server.Param("timestampMillis") String timestampMillis, @org.kurento.client.internal.server.Param("tags") java.util.List<org.kurento.client.Tag> tags, @org.kurento.client.internal.server.Param("type") String type, @org.kurento.client.internal.server.Param("pathToFile") String pathToFile) {
    super(source, timestamp, timestampMillis, tags, type);
    this.pathToFile = pathToFile;
  }

/**
 *
 * Getter for the pathToFile property
 * @return Path of the file *
 **/
	public String getPathToFile() {
		return pathToFile;
	}

/**
 *
 * Setter for the pathToFile property
 *
 * @param pathToFile
 *       Path of the file
 *
 **/
	public void setPathToFile(String pathToFile) {
		this.pathToFile = pathToFile;
	}

}
