package mddemo.library.com.notifiction;

import android.app.Notification;
import android.content.Context;
import android.widget.RemoteViews;

import mddemo.library.com.activityanimation_master.R;

/**
 * Author:  梁铖城
 * Email:   1038127753@qq.com
 * Date:  2015年11月28日15:08:23
 * Description:
 */
public class NotifyHeadsUp extends Notify{

    public NotifyHeadsUp(Context context) {
        super(context);
    }

    @Override
    public void send() {

        Notification notification=builder.build();
        notification.contentView=new RemoteViews(context.getPackageName(), R.layout.activity_main);
        notification.bigContentView=new RemoteViews(context.getPackageName(),R.layout.activity_main);
        notification.headsUpContentView=new RemoteViews(context.getPackageName(),R.layout.activity_main);
        nm.notify(0,builder.build());

    }

    @Override
    public void cancel() {

    }
}
