﻿using Android.App;
using Android.Content;
using Android.OS;
using Android.Views;
using Android.Widget;

namespace SEARS_RAM_OS_V3
{
    [Activity(Label = "ActivityCreditos")]
    public class ActivityCreditos : Activity
    {
        protected override void OnCreate(Bundle savedInstanceState)
        {
            base.OnCreate(savedInstanceState);
            Xamarin.Essentials.Platform.Init(this, savedInstanceState);
            // Set our view from the "main" layout resource
            SetContentView(Resource.Layout.activity_creditos);

            var menuBtn = FindViewById<ImageButton>(Resource.Id.btnmenucreditos);

            menuBtn.Click += delegate
            {
                var MenuIntent = new Intent(this, typeof(ActivityMenu));
                StartActivity(MenuIntent);
            };
            if (Build.VERSION.SdkInt >= BuildVersionCodes.Kitkat)
            {
                Window window = Window;
                window.AddFlags(WindowManagerFlags.LayoutNoLimits);
                window.AddFlags(WindowManagerFlags.TranslucentNavigation);
            }
        }
    }
}