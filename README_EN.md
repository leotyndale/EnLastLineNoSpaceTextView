![Logo](https://raw.githubusercontent.com/leotyndale/EnFloatingView/master/preview/logo.png)

EnLastLineNoSpaceTextView
==========================
[![Muxuan](https://img.shields.io/badge/Powered_by-Muxuan-green.svg?style=flat)](http://www.imuxuan.com/)

After removing the TextView setting lineSpacingExtra, the last line is blank.

### Version

4.4 or less / Most domestic ROM all Android version.

### Occurrence

After TextView sets lineSpacingExtra:

* There will be no extra white space at the bottom of a single line of text
* Multi-line text will have extra white space on the last line, affecting the layout of the below TextView control

### Solution

Delete the extra blank from the last line of the TextView

### Instructions

```xml
<com.imuxuan.en.LastLineNoSpaceTextView
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:lineSpacingExtra="5dp"
        android:textSize="17sp" />
```

### Preview
![预览图](https://github.com/leotyndale/EnLastLineNoSpaceTextView/blob/master/test_img.png)
