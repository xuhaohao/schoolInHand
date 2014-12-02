package com.goodman.schoolInHand;

import java.io.Serializable;

import com.goodman.schoolInHand.domain.App_NewsInfoModel;
import com.goodman.schoolInHand.util.ClassPathResource;
import com.goodman.schoolInHand.util.StaticRes;
import com.goodman.schooolInHand.R;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.webkit.WebView;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class NewsInfoActivity extends Activity implements android.view.View.OnClickListener {

	private TextView tv_top_title;
	private TextView btn_title_right;
	private TextView btn_title_left;
	
	private TextView tv_news_title;
	private TextView tv_news_publicman;
	private WebView wv_news_content;
	private TextView tv_news_publicTime;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		requestWindowFeature(Window.FEATURE_NO_TITLE);
		setContentView(R.layout.activity_newsinfo);
		
		initView();
	}
	
	private void initView(){
		tv_top_title = (TextView) findViewById(R.id.tv_top_title);
		tv_top_title.setText("公告详细");
		
		btn_title_right = (Button) findViewById(R.id.btn_title_right);
		btn_title_right.setVisibility(View.GONE);
		
		btn_title_left = (Button) findViewById(R.id.btn_title_left);
		btn_title_left.setOnClickListener(this);
		
		Intent intent = getIntent();

		App_NewsInfoModel app_NewsInfoModel = (App_NewsInfoModel)intent.getSerializableExtra("app_NewsInfoModel");
		tv_news_title = (TextView) findViewById(R.id.tv_news_title);
		tv_news_title.setText(app_NewsInfoModel.getTitle());
		
		tv_news_publicman = (TextView) findViewById(R.id.tv_news_publicman);
		tv_news_publicman.setText("发布人:"+app_NewsInfoModel.getPublicUserName());
		
		tv_news_publicTime = (TextView) findViewById(R.id.tv_news_publicTime);
		tv_news_publicTime.setText(app_NewsInfoModel.getStrPublicTime());
		
		wv_news_content = (WebView) findViewById(R.id.wv_news_content);
//		http://127.0.0.1/DMService/newsInfo/detail.html?pk=c06a0c04-703a-4e31-afb5-17d927317016
		String strUrl = StaticRes.baseUrl + "/newsInfo/detail.html?pk="+app_NewsInfoModel.getPk();
		wv_news_content.loadUrl(strUrl);
	}
	
	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		switch(v.getId()){
		
		case R.id.btn_title_left:
			NewsInfoActivity.this.finish();
			break;
		
		}
	}
	
}
