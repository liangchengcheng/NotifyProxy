package mddemo.library.com.notifiction;

import android.app.Notification;
import android.content.Context;
import android.widget.RemoteViews;

import mddemo.library.com.activityanimation_master.R;

/**
 * Author:  梁铖城
 * Email:   1038127753@qq.com
 * Date:    2015年11月28日14:38:26
 * Description:
 */
public class NotifyBig  extends Notify{

    public NotifyBig(Context context) {
        super(context);
    }

    @Override
    public void send() {
        Notification notification=builder.build();
        notification.contentView=new RemoteViews(context.getPackageName(), R.layout.activity_main);
        notification.bigContentView=new RemoteViews(context.getPackageName(),R.layout.activity_main);
        nm.notify(0,notification);

    }

    @Override
    public void cancel() {
        nm.cancel(0);
    }
}
