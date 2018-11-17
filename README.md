![Logo](https://raw.githubusercontent.com/leotyndale/EnFloatingView/master/preview/logo.png)

EnLastLineNoSpaceTextView
==========================
[![Muxuan](https://img.shields.io/badge/Powered_by-Muxuan-green.svg?style=flat)](http://www.imuxuan.com/)

[English](/README_EN.md)

去除TextView设置lineSpacingExtra后，最后一行多出的空白

### 发生版本

4.4以下 / 大多数国产ROM all安卓版本

### 发生现象

TextView设置lineSpacingExtra后：

* 单行文字底部不会有多余的空白
* 多行文字在最后一行会出现多余的空白，影响 below TextView 控件的布局美观

### 解决方式

删除TextView最后一行多出来的空白

### 使用方法

```xml
<com.imuxuan.en.LastLineNoSpaceTextView
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:lineSpacingExtra="5dp"
        android:textSize="17sp" />
```

### 效果图
![预览图](https://github.com/leotyndale/EnLastLineNoSpaceTextView/blob/master/test_img.png)
