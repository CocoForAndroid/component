package component.djc.com

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.alibaba.android.arouter.launcher.ARouter
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        login.setOnClickListener {
            ARouter.getInstance().build("/account/login").navigation(this)
        }
        share.setOnClickListener {
            ARouter.getInstance().build("/share/share").withString("content", "分享内容到微博")
                    .navigation(this)
        }
    }
}
