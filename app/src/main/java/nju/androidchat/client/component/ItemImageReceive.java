package nju.androidchat.client.component;

import android.content.Context;
import android.widget.ImageView;
import android.widget.LinearLayout;

import androidx.annotation.StyleableRes;

import java.util.UUID;

import nju.androidchat.client.R;

public class ItemImageReceive extends LinearLayout {
    @StyleableRes
    int index0 = 0;

    private ImageView imageView;
    private Context context;
    private UUID messageId;
    private OnRecallMessageRequested onRecallMessageRequested;

    public ItemImageReceive(Context context, String url, UUID messageId) {
        super(context);
        this.context = context;
        inflate(context, R.layout.item_image_receive, this);
        this.imageView = findViewById(R.id.chat_item_content_image);
        this.messageId = messageId;

        new ImageLoadTask(url, this.imageView).execute();
    }

    public void init(Context context) {
    }
}
