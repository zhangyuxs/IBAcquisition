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
 * @Description  TODO  IB���쳣�� 
 * @author       ZhangYu    Company:    LZAirport
 * @version      V0.9a CreateDate: 2017��6��30��
 * @ModificationHistory
 * Date         Author     Version   Description
 * <p>---------------------------------------------
 * <p>2017��6��30��      ZhangYu    1.0        1.0
 * <p>Why & What is modified: <�޸�ԭ������>
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
