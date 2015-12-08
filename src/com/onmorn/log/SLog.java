/**
 * @author tan_zhenq E-mail: tan_zhenqi@163.com
 * @date 创建时间：2015-12-8 上午10:24:26 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 */
package com.onmorn.log;

import android.util.Log;

/**
 * @author lz100
 *
 */
public class SLog {

	public static boolean DEBUG = true;
	public static void d(String TAG, String msg)
	{
		if (DEBUG) {
			Log.d(TAG, msg);
		}
	}
	
	public static void e(String TAG, String msg)
	{
		if (DEBUG) {
			Log.e(TAG, msg);
		}
	}
	
	public static void i(String TAG, String msg)
	{
		if (DEBUG) {
			Log.i(TAG, msg);
		}
	}
}
