package com.dc.frescolian;

import android.graphics.Color;
import android.graphics.PointF;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.facebook.drawee.backends.pipeline.Fresco;
import com.facebook.drawee.controller.BaseControllerListener;
import com.facebook.drawee.controller.ControllerListener;
import com.facebook.drawee.generic.RoundingParams;
import com.facebook.drawee.interfaces.DraweeController;
import com.facebook.drawee.view.SimpleDraweeView;
import com.facebook.imagepipeline.core.ImagePipeline;
import com.facebook.imagepipeline.request.ImageRequest;
import com.facebook.imagepipeline.request.ImageRequestBuilder;

public class MainActivity extends AppCompatActivity {

    private SimpleDraweeView draweeView;
    private Uri uri;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        uri = Uri.parse("http://pics.sc.chinaz.com/files/pic/pic9/201901/zzpic16152.jpg");
        draweeView = (SimpleDraweeView) findViewById(R.id.my_image_view);
        draweeView.setImageURI(uri);
        initView();
        initData();
    }

    private void initData() {

    }

    private void initView() {

    }

    public void Yuanjiao(View view) {
        RoundingParams roundingParams = RoundingParams.fromCornersRadius(50f);
// alternatively use fromCornersRadii or asCircle
        roundingParams.setOverlayColor(Color.WHITE);
        draweeView.getHierarchy().setRoundingParams(roundingParams);
        draweeView.setImageURI(uri);
    }

    public void Yuanxing(View view) {
        RoundingParams roundingParams = RoundingParams.fromCornersRadius(5f);
        roundingParams.setBorderColor(Color.WHITE);
        roundingParams.setRoundAsCircle(true);
        draweeView.getHierarchy().setRoundingParams(roundingParams);
    }

    public void Bili(View view) {
        draweeView.setAspectRatio(2f);
    }

    public void Jianjin(View view) {
        ImageRequest request = ImageRequestBuilder.newBuilderWithSource(uri)
                .setProgressiveRenderingEnabled(true)
                .build();
        DraweeController controller = Fresco.newDraweeControllerBuilder()
                .setImageRequest(request)
                .setOldController(draweeView.getController())
                .build();
        draweeView.setController(controller);
    }

    public void Huancun(View view) {

    }

    public void Donghua(View view) {
    }

    public void JianTing(View view) {
    }

    public void PeiZhi(View view) {
    }

}
