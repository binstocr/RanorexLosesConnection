using System;

using Android.App;
using Android.Content;
using Android.Runtime;
using Android.Views;
using Android.Widget;
using Android.OS;
using AndroidApp.Activities;

namespace AutoBackup
{
	[Activity (Label = "@string/app_name", MainLauncher = true, Theme = "@style/AppTheme")]
	public class MainActivity : BaseActivity
	{
		protected override void OnCreate (Bundle bundle)
		{
			base.OnCreate (bundle);
			SetContentView (Resource.Layout.activity_main);
//			SharedPreferences settings = getSharedPreferences(PREFS_NAME, 0);
//			SharedPreferences.Editor editor = settings.edit();
//			editor.putBoolean("silentMode", mSilentMode);
		}
	}
}


