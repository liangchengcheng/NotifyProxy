package mddemo.library.com.notifiction;

import android.content.Context;
import android.os.Build;

/**
 * Author:  梁铖城
 * Email:   1038127753@qq.com
 * Date:    2015年11月28日15:19:25
 * Description:
 */
public class NotifyProxy extends Notify {

    private Notify notify;
    public NotifyProxy(Context context) {
        super(context);

        if (Build.VERSION.SDK_INT>=Build.VERSION_CODES.LOLLIPOP){
            notify=new NotifyHeadsUp(context);
        } else if (Build.VERSION.SDK_INT>=Build.VERSION_CODES.KITKAT){
            notify=new NotifyBig(context);
        } else{
            notify=new NotifyNormal(context);
        }
    }

    @Override
    public void send() {
        notify.send();
    }

    @Override
    public void cancel() {
        notify.cancel();
    }
}
