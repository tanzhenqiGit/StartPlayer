/**
 * @author tan_zhenq E-mail: tan_zhenqi@163.com
 * @date 创建时间：2015-12-8 上午10:24:26 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 */
package org.phlo.AirReceiver;

/**
 * Audio device clock
 */
public interface AudioClock {
	/**
	 * Returns the current playback time in seconds.
	 * 
	 * @return time of currently played sample
	 */
	double getNowSecondsTime();
	
	/**
	 * Returns the current playback time in frames
	 * 
	 * @return time of currently played sample
	 */
	//long getNowFrameTime();

	/**
	 * Returns the earliest time in samples for which data
	 * is still accepted
	 * 
	 * @return earliest playback time for new data
	 */
	double getNextSecondsTime();
	
	/**
	 * Returns the earliest time in frames for which data
	 * is still accepted
	 * 
	 * @return earliest playback time for new data
	 */
	long getNextFrameTime();

	/**
	 * Converts from frame time to seconds time
	 * 
	 * @param frameTime frame time to convert
	 * @return corresponding seconds time
	 */
	double convertFrameToSecondsTime(long frameTime);

	/**
	 * Adjusts the frame time so that the given frame time
	 * coindices with the given seconds time
	 * 
	 * @param frameTime frame time corresponding to seconds time
	 * @param secondsTime seconds time corresponding to frame time
	 */
	void setFrameTime(long frameTime, double secondsTime);
}
