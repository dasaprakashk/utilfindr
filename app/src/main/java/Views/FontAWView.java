package Views;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.util.Log;
import android.widget.TextView;

/**
 * Created by Das on 21/10/15.
 */
public class FontAWView extends TextView {

    private static Typeface font;
    private static final String TAG = FontAWView.class.getSimpleName();
    public static float radius = 18.0f;

    public FontAWView(Context context) {
        super(context);
        setFont(context);
    }

    public FontAWView(Context context, AttributeSet attrs) {
        super(context, attrs);
        setFont(context);
    }

    public FontAWView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        setFont(context);
    }

    private void setFont(Context context) {
        if(this.isInEditMode())
            return;

        if(font == null)
        {
            try {
                font = Typeface.createFromAsset(context.getResources().getAssets(), "fontawesome-webfont.ttf");
            } catch (RuntimeException e) {
                Log.e(TAG, e.getMessage());
            }
        }
        setTypeface(font);
    }
}
