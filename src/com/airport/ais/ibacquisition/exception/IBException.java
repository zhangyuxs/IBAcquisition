/***********************************************************************
 *                                                                     *
 *         Copyright (c) Ultra Electronics Airport Systems 2010        *
 *                         All rights reserved                         *
 *                                                                     *
 ***********************************************************************
 *
 * Filename:           IBException.java
 * Module Name:        SampleAFDSClient
 * Originating Author: simon.souter
 *
 ***********************************************************************
 * Modification History
 *
 * $Log: IBException.java,v $
 * Revision 1.1  2010/09/28 03:43:37  simon.souter
 * Initial Checkin
 *
 *
 ***********************************************************************/

package com.airport.ais.ibacquisition.exception;

/**
 * 
 * 
 * FileName      IBException.java
 * @Description  TODO  IB的异常类 
 * @author       ZhangYu    Company:    LZAirport
 * @version      V0.9a CreateDate: 2017年6月30日
 * @ModificationHistory
 * Date         Author     Version   Description
 * <p>---------------------------------------------
 * <p>2017年6月30日      ZhangYu    1.0        1.0
 * <p>Why & What is modified: <修改原因描述>
 */


public class IBException extends Exception
{
   /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	

   public IBException(Exception e)
   {
      super(e);
   }
   
   public IBException(String message, Exception e)
   {
      super(message, e);
   }

   public IBException(String message)
   {
      super(message);
   }

   public IBException(StringBuffer message, Exception e)
   {
      super(message.toString(), e);
   }

   public IBException(StringBuffer message)
   {
      super(message.toString());
   }
}
