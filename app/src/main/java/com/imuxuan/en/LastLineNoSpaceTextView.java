package com.imuxuan.en;

import android.content.Context;
import android.graphics.Rect;
import android.support.v7.widget.AppCompatTextView;
import android.text.Layout;
import android.util.AttributeSet;

/**
 * @ClassName LastLineNoSpaceTextView
 * @Description 去除TextView设置lineSpacingExtra后，最后一行多出的空白
 * 发生版本：4.4以下 / 大多数国产ROM all安卓版本
 * 发生现象：TextView设置lineSpacingExtra后，单行文字底部不会有多余的空白，
 * 但多行文字在最后一行会出现多余的空白，影响below TextView 控件的布局美观
 * @Author Yunpeng Li
 * @Creation 2018/3/30 上午10:16
 * @Mender Yunpeng Li
 * @Modification 2018/3/30 上午10:16
 */
public class LastLineNoSpaceTextView extends AppCompatTextView {

    private Rect mRect;

    public LastLineNoSpaceTextView(Context context) {
        this(context, null);
    }

    public LastLineNoSpaceTextView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public LastLineNoSpaceTextView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        mRect = new Rect();
    }

    protected void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        int measuredHeight = getMeasuredHeight() - getLastLineSpace();
        setMeasuredDimension(getMeasuredWidth(), measuredHeight);
    }

    public int getLastLineSpace() {
        int lastLineIndex = getLineCount() - 1;
        if (lastLineIndex < 0) {
            return 0;
        }
        Layout layout = getLayout();
        int baseline = getLineBounds(lastLineIndex, mRect);
        if (getMeasuredHeight() != layout.getHeight()) {
            return 0;
        }
        int fontHeight = baseline + layout.getPaint().getFontMetricsInt().descent;
        int lineHeight = mRect.bottom;
        return lineHeight - fontHeight;
    }

}
