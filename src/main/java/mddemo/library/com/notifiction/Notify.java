package mddemo.library.com.notifiction;

import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.support.v7.app.NotificationCompat;

import mddemo.library.com.activityanimation_master.MainActivity;
import mddemo.library.com.activityanimation_master.R;


/**
 * Author:  梁铖城
 * Email:   1038127753@qq.com
 * Date:   2015年11月28日14:15:55
 * Description:
 */


public abstract class Notify {
    protected Context context;

    protected NotificationManager nm;
    protected NotificationCompat.Builder builder;

    public Notify(Context context){
        this.context=context;
        nm= (NotificationManager) context.getSystemService(Context.NOTIFICATION_SERVICE);

        builder = new NotificationCompat.Builder(context);
        builder.setSmallIcon(R.mipmap.ic_launcher)
                .setContentIntent(PendingIntent.getActivity(context,0,new Intent(context, MainActivity.class),PendingIntent.FLAG_UPDATE_CURRENT));
    }

    //发送一个通知
    public abstract void send();

    //取消一个通知
    public abstract void cancel();
}
