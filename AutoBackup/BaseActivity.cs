using System;
using Android.App;
using Android.Content;
using Android.Runtime;
using Android.Views;
using System.Threading.Tasks;
using Android.Bluetooth;

namespace AndroidApp.Activities
{
	[Activity]
//	public class BaseActivity : Activity
	public class BaseActivity : Android.Support.V7.App.AppCompatActivity
	{

		protected override void OnDestroy ()
		{
			base.OnDestroy ();
		}
			
		protected override void OnResume()
		{
			base.OnResume();
		}

		protected override void OnStart()
		{
			base.OnStart();
		}
			

		protected override void OnPause()
		{
			base.OnPause();
		}
			

		protected override void OnActivityResult (int requestCode, Result resultCode, Intent data)
		{
//			if (requestCode == REQUEST_BT_ENABLE) {
//				if (resultCode != Result.Ok) {
//
//					Finish ();
//
//				}
//			}
		}
		/// <summary>
		/// Override if you want to handle this yourself (ie. setup activity has to initialize app first)
		/// </summary>
		/// <returns><c>true</c>, if for bluetooth on resume was checked, <c>false</c> otherwise.</returns>
	}
}

