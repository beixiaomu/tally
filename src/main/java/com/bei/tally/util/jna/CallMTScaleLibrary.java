package com.bei.tally.util.jna;



import com.sun.jna.Library;

public interface CallMTScaleLibrary extends Library { 
		public int XRWD_Open();
		public int XRWD_Beep();
}
