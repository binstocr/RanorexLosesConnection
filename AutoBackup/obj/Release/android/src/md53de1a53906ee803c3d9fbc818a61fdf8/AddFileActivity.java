package md53de1a53906ee803c3d9fbc818a61fdf8;


public class AddFileActivity
	extends md510cef67a84c3f078557921e3799552fb.BaseActivity
	implements
		mono.android.IGCUserPeer
{
	static final String __md_methods;
	static {
		__md_methods = 
			"n_onCreate:(Landroid/os/Bundle;)V:GetOnCreate_Landroid_os_Bundle_Handler\n" +
			"n_onResume:()V:GetOnResumeHandler\n" +
			"n_OnCreateFileButtonClick:(Landroid/view/View;)V:__export__\n" +
			"";
		mono.android.Runtime.register ("AutoBackup.AddFileActivity, AutoBackup, Version=1.0.0.0, Culture=neutral, PublicKeyToken=null", AddFileActivity.class, __md_methods);
	}


	public AddFileActivity () throws java.lang.Throwable
	{
		super ();
		if (getClass () == AddFileActivity.class)
			mono.android.TypeManager.Activate ("AutoBackup.AddFileActivity, AutoBackup, Version=1.0.0.0, Culture=neutral, PublicKeyToken=null", "", this, new java.lang.Object[] {  });
	}


	public void onCreate (android.os.Bundle p0)
	{
		n_onCreate (p0);
	}

	private native void n_onCreate (android.os.Bundle p0);


	public void onResume ()
	{
		n_onResume ();
	}

	private native void n_onResume ();


	public void OnCreateFileButtonClick (android.view.View p0)
	{
		n_OnCreateFileButtonClick (p0);
	}

	private native void n_OnCreateFileButtonClick (android.view.View p0);

	java.util.ArrayList refList;
	public void monodroidAddReference (java.lang.Object obj)
	{
		if (refList == null)
			refList = new java.util.ArrayList ();
		refList.add (obj);
	}

	public void monodroidClearReferences ()
	{
		if (refList != null)
			refList.clear ();
	}
}
