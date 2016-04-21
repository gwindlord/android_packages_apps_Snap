package com.android.camera.ui;

import com.devadvance.circularseekbar.CircularSeekBar;
import com.devadvance.circularseekbar.CircularSeekBar.OnCircularSeekBarChangeListener;
import android.widget.TextView;
import com.android.camera.PhotoModule;
import android.widget.Button;
import android.content.Context;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.hardware.Camera;
import org.codeaurora.snapcam.R;

public class ManualFocusController extends AbstractSettingPopup
{
    private TextView focusPositionText;
    private Button mConfirmButton;
    private CountdownTimerPopup.Listener mListener;
    private CircularSeekBar seekBar;
    
    public ManualFocusController(final Context context, final AttributeSet set) {
        super(context, set);
    }
    
    public void initialize() {
        mTitle.setText((CharSequence)getResources().getString(R.string.manual_focus_popup_title_text));
        focusPositionText = (TextView)findViewById(R.id.focusPositionTxt);
        final String param = PhotoModule.mParameters.get("current-focus-position");
        focusPositionText.setText((CharSequence)(getResources().getString(R.string.manual_focus_current_focus_pos) + " " + param));
        if (param != null) {
            param.split(".");
        }
        mConfirmButton = (Button)findViewById(R.id.manual_focus_scale_set_button);
        (seekBar = (CircularSeekBar)findViewById(R.id.seekBar1)).setMax(PhotoModule.mParameters.getInt("max-focus-pos-index"));
        seekBar.setProgress(0);
        seekBar.setOnSeekBarChangeListener((CircularSeekBar.OnCircularSeekBarChangeListener)new CircleSeekBarListener(focusPositionText));
        mConfirmButton.setOnClickListener((View.OnClickListener)new View.OnClickListener() {
            public void onClick(final View view) {
                PhotoModule.mManual3AEnabled |= 0x1;
                Log.v("CAM_PhotoModule", "Setting focus position : " + seekBar.getProgress());
                PhotoModule.updateCommonManual3ASettings();
                PhotoModule._this.onSharedPreferenceChanged();
                PhotoModule.mUI.dismissPopup();
            }
        });
    }
    
    @Override
    public void reloadPreference() {
    }
    
    public void setSettingChangedListener(final CountdownTimerPopup.Listener mListener) {
        this.mListener = mListener;
    }
    
    public class CircleSeekBarListener implements OnCircularSeekBarChangeListener
    {
        TextView focusPositionText;
        
        public CircleSeekBarListener(final TextView focusPositionText) {
            super();
            this.focusPositionText = focusPositionText;
        }
        
        @Override
        public void onProgressChanged(final CircularSeekBar circularSeekBar, final int n, final boolean b) {
            PhotoModule.mParameters.set("manual-focus-position", n);
            PhotoModule.updateAll();
            focusPositionText.setText((CharSequence)(getResources().getString(R.string.manual_focus_current_focus_pos) + " " + n));
        }
        
        @Override
        public void onStartTrackingTouch(final CircularSeekBar circularSeekBar) {
            PhotoModule.mParameters.set("focus-mode", "manual");
            PhotoModule.mParameters.set("pro_camera_enable", "on");
            PhotoModule.mParameters.set("manual-focus-pos-type", 0);
            PhotoModule.updateAll();
        }
        
        @Override
        public void onStopTrackingTouch(final CircularSeekBar circularSeekBar) {
        }
    }
}
