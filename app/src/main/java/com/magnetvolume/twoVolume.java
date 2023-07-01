package com.magnetvolume;
import android.content.Context;
import android.media.AudioManager;
import android.service.quicksettings.TileService;

public class twoVolume extends TileService
	{
		/**
		作者：Zero
		联系：2767832980@qq.com
		*/
		@Override
		public void onClick ( )
			{
				super.onClick ( );
				
				//媒体静音
				AudioManager audioManager = (AudioManager) getSystemService(Context.AUDIO_SERVICE);
				audioManager.setStreamVolume(AudioManager.STREAM_MUSIC,0 , 0);
				
				//铃声静音
				audioManager.setStreamVolume(AudioManager.STREAM_RING,0, 0);
			}
	
}
