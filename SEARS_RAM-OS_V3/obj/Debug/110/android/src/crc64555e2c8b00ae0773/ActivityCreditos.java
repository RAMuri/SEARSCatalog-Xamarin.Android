package crc64555e2c8b00ae0773;


public class ActivityCreditos
	extends android.app.Activity
	implements
		mono.android.IGCUserPeer
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_onCreate:(Landroid/os/Bundle;)V:GetOnCreate_Landroid_os_Bundle_Handler\n" +
			"";
		mono.android.Runtime.register ("SEARS_RAM_OS_V3.ActivityCreditos, SEARS_RAM-OS_V3", ActivityCreditos.class, __md_methods);
	}


	public ActivityCreditos ()
	{
		super ();
		if (getClass () == ActivityCreditos.class)
			mono.android.TypeManager.Activate ("SEARS_RAM_OS_V3.ActivityCreditos, SEARS_RAM-OS_V3", "", this, new java.lang.Object[] {  });
	}


	public void onCreate (android.os.Bundle p0)
	{
		n_onCreate (p0);
	}

	private native void n_onCreate (android.os.Bundle p0);

	private java.util.ArrayList refList;
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
