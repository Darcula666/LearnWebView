package net.gfdz.com.learnwebview;

import android.content.Context;
import android.content.pm.PackageManager;

/**
 * Created by Administrator on 2015/11/19.
 */
public class Hello {
    public static final String  PERMISSION_SAY_HELLO="net.gfdz.com.learnwebview.pression.SAY_HELLO";
    public static void sayHelllo(Context context){
      int checkResult=context.checkCallingPermission(PERMISSION_SAY_HELLO);
        if (checkResult!= PackageManager.PERMISSION_GRANTED){
            throw new SecurityException("执行sayHello方法需要有net.gfdz.com.learnwebview.pression.SAY_HELLO权限");
        }
        System.out.println("hello jikexueyuan");
    }
}
