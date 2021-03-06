package com.droidcoding.github.util;

import android.databinding.BindingAdapter;
import android.widget.ImageView;
import com.bumptech.glide.Glide;
import com.droidcoding.github.R;

/**
 * DataBinding数据绑定
 * Created by Donglua on 16/1/23.
 */
public class BindingUtil {

  @BindingAdapter("imageUrl")
  public static void loadAvatarImage(ImageView imageView, String url) {
    Glide.with(imageView.getContext())
        .load(url)
        .placeholder(R.drawable.avatar)
        .dontAnimate()
        .into(imageView);
  }

}
