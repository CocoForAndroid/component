package component.djc.com.share;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.Toast;

import com.alibaba.android.arouter.facade.annotation.Route;

import component.djc.com.componentbase.ServiceFactory;

/**
 * @author dong
 * @date 2018/8/6 11:11
 * @description
 */
@Route(path = "/share/share")
public class ShareActivity extends AppCompatActivity{
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_share);
        String content = getIntent().getStringExtra("content");
        Log.d("djc","传递过来的内容"+content);
        share();
    }
    private void share(){
        if (ServiceFactory.getInstance().getAccountService().isLogin()){
            Toast.makeText(this, "分享成功", Toast.LENGTH_SHORT).show();
        }else {
            Toast.makeText(this,"分享失败",Toast.LENGTH_SHORT).show();
        }
    }
}
